package org.mondo.collaboration.security.batch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.AccessControlModel;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.Binding;
import org.mondo.collaboration.policy.rules.Group;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.Factory;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.util.AssetFactory;
import org.mondo.collaboration.security.batch.util.JudgementStorage;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class RuleManager {
	private Logger LOGGER = Logger.getLogger(RuleManager.class);

	private JudgementStorage permissionStorage;
	private Set<Judgement> processedSet;

	private Collection<Consequence> weakConsequences = Consequence.DefaultConsequenceTypes.DefaultWeakConsequences;
	private Collection<Consequence> strongConsequences = Consequence.DefaultConsequenceTypes.DefaultStrongConsequences;

	private Resource instanceModel;
	private AccessControlModel accessControlModel;

	private AdvancedViatraQueryEngine advancedQueryEngine;
	private Map<Pattern, ViatraQueryMatcher<IPatternMatch>> matchers = Maps.newHashMap();
	private Map<String, IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications;

	private Multimap<EObject, ReferenceAsset> incomingReferenceMap = ArrayListMultimap.create();
	
	private int numOfConsequences;
	private int numOfAssets;
	
	public RuleManager(Resource model, AccessControlModel rules) {
		this.instanceModel = model;
		this.accessControlModel = rules;
	}

	public void setQuerySpecifications(
			Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> specifications) {
		
		querySpecifications = Maps.newHashMap();
		for (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> specification : specifications) {
			querySpecifications.put(specification.getFullyQualifiedName(), specification);
		}
		
	}
	
	public void dispose() {
		advancedQueryEngine.dispose();
	}
	
	public void setWeakConsequences(Collection<Consequence> weakConsequences) {
		this.weakConsequences = weakConsequences;
	}

	public void setStrongConsequences(Collection<Consequence> strongConsequences) {
		this.strongConsequences = strongConsequences;
	}

	public void initialize() throws ViatraQueryException {
		LOGGER.info("Inizialize ViatraQueryEngine with Rules on the Model");
		long start = System.nanoTime();
		advancedQueryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(instanceModel));

		for (Rule rule : accessControlModel.getPolicy().getRules()) {
			IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = querySpecifications.get(patternQualifiedName(rule.getPattern()));
			ViatraQueryMatcher<IPatternMatch> queryMatcher = advancedQueryEngine.getMatcher(querySpecification);
			matchers.put(rule.getPattern(), queryMatcher);
		}
		
		for (Consequence consequence : weakConsequences) {
			consequence.setRuleManager(this);
		}
		for (Consequence consequence : strongConsequences) {
			consequence.setRuleManager(this);
		}
		
		long end = System.nanoTime();
		LOGGER.info(String.format("ViatraQueryEngine is initialized in %d nanosec", end - start));
	}

	public Set<Judgement> calculateEffectivePermissions(User user) throws ViatraQueryException {
		ResolutionType resolution = accessControlModel.getPolicy().getResolution();
		permissionStorage = new JudgementStorage(resolution);
		processedSet = Sets.newHashSet();

		addInitialPermissions(user);
		LOGGER.info("Number of initial permissions: " + permissionStorage.size());
		LOGGER.info("Calculating effective permissions");
		long start = System.nanoTime();

		numOfConsequences = 0;
		for (Judgement dominant = null; !permissionStorage.isEmpty();) {
			dominant = permissionStorage.last(); 
			processedSet.add(dominant);
			permissionStorage.remove(dominant);
			if (dominant.getPriority() > -1) {
				permissionStorage.resolveConflict(dominant);
				propagateStrongConsequences(dominant);
				propagateWeakConsequences(dominant);
			}
		}
		long end = System.nanoTime();
		LOGGER.info(String.format("Effective Permissions are calculated in %d nanosec", end - start));
		LOGGER.info(String.format("Number of propagated consequences: %d", numOfConsequences));
		return processedSet;
	}

	private void addInitialPermissions(User user) throws ViatraQueryException {
		addExplicitPermissions(user);
		addDefaultPermissions();
	}

	private void addExplicitPermissions(User user) throws ViatraQueryException {
		for (Rule rule : accessControlModel.getPolicy().getRules()) {
			int numOfExplicits = 0;
			for (Role role : rule.getRoles()) {
				if (getRolesOfUser(accessControlModel, user).contains(role)) {
					Collection<? extends IPatternMatch> matches = getPatternMatches(advancedQueryEngine, rule);
					for (IPatternMatch match : matches) {
						Factory factory = AssetFactory.factoryFrom(rule);
						Set<? extends Asset> assetSet = factory.apply(match);
						for (Asset asset : assetSet) {
							addExplicitPermission(rule, asset);
							numOfExplicits++;
						}
					}
					LOGGER.info(String.format("Number of explicit judgements: %s", numOfExplicits));

					break;
				}
			}
		}
	}

	private void addExplicitPermission(Rule rule, Asset asset) {
		AccessibilityLevel access = rule.getAccess();
		int priority = rule.getPriority();
		if (access == AccessibilityLevel.OBFUSCATE) {
			permissionStorage.add(new Judgement(access, OperationType.READ, asset, priority));
		} else {
			OperationType operation = rule.getOperation();
			if (operation == OperationType.READWRITE) {
				permissionStorage.add(new Judgement(access, OperationType.READ, asset, priority));
				permissionStorage.add(new Judgement(access, OperationType.WRITE, asset, priority));
			} else if (operation == OperationType.READ || operation == OperationType.WRITE) {
				permissionStorage.add(new Judgement(access, operation, asset, priority));
			}
		}
	}
	
	private void addDefaultPermissions() {
		numOfAssets = 0;
		TreeIterator<EObject> allContents = instanceModel.getAllContents();
		while (allContents.hasNext()) {
			EObject object = allContents.next();

			// object
			ObjectAsset objAsset = new Asset.ObjectAsset(object);
			numOfAssets++;
			addDefaultPermission(objAsset);

			// attributes
			for (EAttribute attribute : object.eClass().getEAllAttributes()) {
				AttributeAsset attrAsset = new Asset.AttributeAsset(object, attribute);
				numOfAssets++;
				addDefaultPermission(attrAsset);
			}

			// references
			for (EReference reference : object.eClass().getEAllReferences()) {
				// containment reference
				if (reference.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
					for (EObject target : targets) {
						ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
						numOfAssets++;
						addDefaultPermission(refAsset);
					}
					// association
				} else {
					EObject target = (EObject) object.eGet(reference);
					if (target != null) {
						ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
						numOfAssets++;
						addDefaultPermission(refAsset);
					}
				}
			}
		}
		LOGGER.info(String.format("Number of assets: %d", numOfAssets));
	}

	private void addDefaultPermission(Asset asset) {
		AccessibilityLevel access = accessControlModel.getPolicy().getAccess();
		OperationType operation = accessControlModel.getPolicy().getOperation();
		if (operation == OperationType.READWRITE) {
			permissionStorage.add(new Judgement(access, OperationType.READ, asset, -1));
			permissionStorage.add(new Judgement(access, OperationType.WRITE, asset, -1));
		} else if (operation == OperationType.READ || operation == OperationType.WRITE) {
			permissionStorage.add(new Judgement(access, operation, asset, -1));
		}
		
		if(asset instanceof ReferenceAsset) {
			ReferenceAsset referenceAsset = (ReferenceAsset) asset;
			if(!referenceAsset.getReference().isContainment())
				incomingReferenceMap.put(referenceAsset.getTarget(), referenceAsset);
		}
	}

	private void propagateWeakConsequences(Judgement judgement) {
		for (Consequence weakConsequence : weakConsequences) {
			Set<Judgement> consequences = weakConsequence.propagate(judgement);
			for (Judgement j : consequences) {
				permissionStorage.add(j);
				numOfConsequences++;
			}
		}
	}

	private void propagateStrongConsequences(Judgement judgement) {
		for (Consequence strongConsequence : strongConsequences) {
			Set<Judgement> consequences = strongConsequence.propagate(judgement);
			for (Judgement j : consequences) {
				permissionStorage.add(j);
				numOfConsequences++;
			}
		}
	}

	private List<Role> getRolesOfUser(AccessControlModel rules, User user) {
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(user);
		for (Role role : rules.getRoles()) {
			if (role instanceof Group) {
				for (User u : getUsersOfGroup((Group) role)) {
					if (u.equals(user)) {
						roleList.add(role);
					}
				}
			}
		}
		return roleList;
	}

	public List<User> getUsersOfGroup(Group group) {
		List<User> userList = new ArrayList<User>();
		for (Role role : group.getRoles()) {
			if (role instanceof User) {
				userList.add((User) role);
			} else {
				userList.addAll(getUsersOfGroup((Group) role));
			}
		}
		return userList;
	}

	public Collection<? extends IPatternMatch> getPatternMatches(AdvancedViatraQueryEngine advancedQueryEngine,
			Rule rule) throws ViatraQueryException {
		Collection<? extends IPatternMatch> matches = null;
		ViatraQueryMatcher<IPatternMatch> queryMatcher = matchers.get(rule.getPattern());
		if (queryMatcher != null) {
			if (!rule.getBindings().isEmpty()) {
				List<Object> bindList = getBindList(rule.getPattern(), rule);
				IPatternMatch filterMatch = queryMatcher.newMatch(bindList.toArray(new Object[bindList.size()]));
				matches = queryMatcher.getAllMatches(filterMatch);
			} else {
				matches = queryMatcher.getAllMatches();
			}
		}
		return matches;
	}

	public List<Object> getBindList(Pattern pattern, Rule rule) {
		List<Object> bindList = new ArrayList<Object>();
		EList<Variable> parameterList = pattern.getParameters();
		for (Variable parameter : parameterList) {
			bindList.add(getBoundValue(parameter, rule));
		}
		return bindList;
	}

	public Object getBoundValue(Variable parameter, Rule rule) {
		for (Binding binding : rule.getBindings()) {
			if (binding.getVariable().equals(parameter)) {
				String bind = binding.getBind().getValueString();
				return bind;
			}
		}
		return null;
	}
	
	public static String patternQualifiedName(Pattern pattern) {
		PatternModel patternModel = (PatternModel) pattern.eContainer();
		return patternModel.getPackageName() + "." + pattern.getName();
	}

	public Collection<ReferenceAsset> getIncomingReferences(EObject obj) {
		return incomingReferenceMap.get(obj);
	}
}
