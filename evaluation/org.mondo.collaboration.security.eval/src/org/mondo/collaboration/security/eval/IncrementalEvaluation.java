package org.mondo.collaboration.security.eval;

import java.util.Collection;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.addon.databinding.runtime.api.ViatraObservables;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.eval.change.AbstractChangeApplier;
import org.mondo.collaboration.security.eval.change.AttributeSetChange;
import org.mondo.collaboration.security.eval.change.CreationDeletionChange;
import org.mondo.collaboration.security.eval.change.ReferenceSetChange;
import org.mondo.collaboration.security.increment.RulesGenerator;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class IncrementalEvaluation extends AbstractEvaluation {

	private static final int MODIFICATIONS = 20;

	public static void main(String[] args) throws ViatraQueryException {
		IncrementalEvaluation evaluation = new IncrementalEvaluation();
		evaluation.evaluate(args);
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(getInstanceModelResource()));
		AdvancedViatraQueryEngine advancedQueryEngine = AdvancedViatraQueryEngine.from(queryEngine);
		
		// Load Patterns from helper files and collect object, attribute and reference related effective permission patterns
		Iterable<Pattern> effectivePermissionPatterns = null;
		for(String queryFiles : RulesGenerator.collectVQLFiles(getAccessControlModel(), getInstanceModelResource())) {
			String path = String.format(Generator.INCREMENTAL_RULE_BASE_PATH + queryFiles, getLimitSize(), getLimitSize());
			Resource model = getResourceSet().getResource(URI.createURI(path), true);
			if(path.equals(RulesGenerator.mainVQLFile(getAccessControlModel()))) {
				effectivePermissionPatterns = RulesGenerator.mainQuerySpecification((PatternModel)model.getContents().get(0));
			}
		}
		
		// Initiate matchers on the engine and get observable lists
		Collection<IObservableList<?>> observables = Lists.newArrayList();
		for (Pattern effectivePermissionPattern : effectivePermissionPatterns) {
			SpecificationBuilder builder = new SpecificationBuilder();
			@SuppressWarnings("unchecked")
			IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = ((IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) builder
					.getOrCreateSpecification(effectivePermissionPattern));
			for(User user : getCollaborators()) {
				IPatternMatch filter = querySpecification.newEmptyMatch();
				filter.set(0, user.getName());
				observables.add(ViatraObservables.observeMatchesAsList(querySpecification, advancedQueryEngine, filter));
			}
				
		}
		
		Collection<AbstractChangeApplier> appliers = Sets.newHashSet(
				new AttributeSetChange(getInstanceModelResource(), MODIFICATIONS),
				new CreationDeletionChange(getInstanceModelResource(), MODIFICATIONS),
				new ReferenceSetChange(getInstanceModelResource(), MODIFICATIONS));
		
		for (AbstractChangeApplier applier : appliers) {applier.collect(getCollaborators());
			applier.apply();
			applier.revert();
		}
		
	}
	
}
