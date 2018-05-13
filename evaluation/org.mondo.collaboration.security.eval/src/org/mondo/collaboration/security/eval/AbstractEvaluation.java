package org.mondo.collaboration.security.eval;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.policy.rules.AccessControlModel;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.eval.change.AbstractChangeApplier;
import org.mondo.collaboration.security.eval.change.AttributeSetChange;
import org.mondo.collaboration.security.eval.change.CreationDeletionChange;
import org.mondo.collaboration.security.eval.change.ReferenceSetChange;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Injector;

import wt.WtFactory;
import wt.WtPackage;

public abstract class AbstractEvaluation {
	
	public static final int[] MODEL_SIZES = { 50, 100, 150, 200, 250, 300, 350};
	public static final int[] LIMIT_SIZES = { 30 };
	public static final int[] USER_SIZES = { 1, 10, 20 };
	public static final int[] MODIFICATION_SIZES = { 5, 10, 20 };
	public static final int REPEAT = 10;
	
	
	private static final String ECORE_ARG = "-ecore";
	private static final String REPEAT_ARG = "-repeat";
	private static final String LIMIT_SIZE_ARG = "-limit-user";
	private static final String MODIFICATION_SIZE_ARG = "-modifications";
	private static final String USER_SIZE_ARG = "-user-size";
	private static final String MODEL_SIZE_ARG = "-model-size";
	private static final String TEST_EVALUATION_ARG = "-test-evaluate";
	private static final String ADDITIONAL_INFO_ARG = "-more-info";
	
	protected static void internalEvaluation(String[] args, AbstractEvaluation evaluation) throws ViatraQueryException {
		for (int modelSize : MODEL_SIZES) {
			for (int limitSize : LIMIT_SIZES) {
				for (int userSize : USER_SIZES) {
					if (userSize > limitSize) {
						break;
					}
					for (int modifications : MODIFICATION_SIZES) {
						evaluation.setModelSize(modelSize)
								  .setLimitSize(limitSize)
								  .setUserSize(userSize)
								  .setEcoreFilePath(args[1])
								  .setModificationSize(modifications)
								  .setRepeatNumber(REPEAT);
						
						evaluation.evaluate();
					}
				}
			}
		}
	}

	protected static void evaluate(String[] args, AbstractEvaluation evaluation) throws ViatraQueryException {
		if(args.length > 2) {
			evaluation.evaluate(args);
		} else {
			internalEvaluation(args, evaluation);
		}
	}

	protected HashMap<String, String> mainArgs = Maps.newHashMap();

	private boolean firstTime = true;
	
	private ResourceSet modelResourceSet;
	private XtextResourceSet helperResourceSet;
	private Resource instanceModel;
	private Resource accessControlModel;
	private Set<User> users;

	protected void processArgs(String[] args) {
		if (args.length % 2 != 0) {
			throw new IllegalArgumentException("Missing argument parameter!");
		}
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].trim().startsWith(MODEL_SIZE_ARG))
				mainArgs.put(MODEL_SIZE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(USER_SIZE_ARG))
				mainArgs.put(USER_SIZE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(LIMIT_SIZE_ARG))
				mainArgs.put(LIMIT_SIZE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(REPEAT_ARG))
				mainArgs.put(REPEAT_ARG, args[i + 1]);
			if (args[i].trim().startsWith(ECORE_ARG))
				mainArgs.put(ECORE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(ADDITIONAL_INFO_ARG))
				mainArgs.put(ADDITIONAL_INFO_ARG, "true");
			if (args[i].trim().startsWith(TEST_EVALUATION_ARG))
				mainArgs.put(TEST_EVALUATION_ARG, "true");
		}
	}

	public void evaluate(String[] args) throws ViatraQueryException {
		processArgs(args);
		evaluate();
	}

	public void evaluate() throws ViatraQueryException {
		
		if(!isTestEvaluation()) {
			if(firstTime) {
				System.out.println("Model;Limit;User;Type;Time;Memory");
				firstTime = false;
			}
			for (int i = 0; i < getRepeatNumber(); i++) {
				initialize();
				loadResources();
				prepareEvaluation();
				doEvaluation();
				applyChanges();
				doEvaluationAgain();
				printResults();
				dispose();
			}
		} else {
			if(firstTime) {
				System.out.println("Model;MemoryUsage");
				firstTime = false;
			}
			for (int i = 0; i < getRepeatNumber(); i++) {
				long initialMemory = beforeMemoryUsage();
				initialize();
				loadResources();
				long memoryUsage = afterMemoryUsage() - initialMemory;
				
				if(printAdditionalInfo()) {
					System.out.println(getModelSize() + ";" + memoryUsage);
				}
			}
		}
	}

	protected void doEvaluationAgain() throws ViatraQueryException { }

	protected void printResults() { }

	protected void loadResources() {
		URI instanceUri = URI.createURI(String.format(Generator.MODEL_PATH, getModelSize(), getLimitSize()));
		URI ecoreUri = URI.createFileURI(getEcoreFilePath());
		URI accessUri = URI.createURI(String.format(Generator.RULE_PATH, getLimitSize()));
		
		instanceModel = null;
		accessControlModel = null;
		
		modelResourceSet.getResources().clear();
		helperResourceSet.getResources().clear();
		
		modelResourceSet.getResource(ecoreUri, true);
		accessControlModel = helperResourceSet.getResource(accessUri, true);
		instanceModel = modelResourceSet.getResource(instanceUri, true);
		if(printAdditionalInfo()) {
			EcoreUtil.resolveAll(modelResourceSet);
			EcoreUtil.resolveAll(helperResourceSet);
		}
	}

	protected long beforeMemoryUsage() {
		System.gc();		
		System.gc();
		System.gc();		
		System.gc();
		System.gc();		
		
		return afterMemoryUsage();
	}

	protected long afterMemoryUsage() {
		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	}

	protected abstract void doEvaluation() throws ViatraQueryException;

	protected void initialize() throws ViatraQueryException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		WtPackage.eINSTANCE.eClass();
		WtFactory.eINSTANCE.eClass();

		Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();

		helperResourceSet = injector.getInstance(XtextResourceSet.class);
		helperResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		modelResourceSet = new ResourceSetImpl();
	}

	protected Resource getInstanceModelResource() {
		return instanceModel;
	}

	protected AccessControlModel getAccessControlModel() {
		
		return (AccessControlModel) accessControlModel.getContents().get(0);
	}

	protected Collection<User> getCollaborators() {
		return users;
	}

	public XtextResourceSet getHelperResourceSet() {
		return helperResourceSet;
	}

	public ResourceSet getModelResourceSet() {
		return modelResourceSet;
	}

	protected int getRepeatNumber() {
		if (mainArgs.get(REPEAT_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(REPEAT_ARG));
	}

	protected AbstractEvaluation setRepeatNumber(int repeat) {
		mainArgs.put(REPEAT_ARG, String.valueOf(repeat));
		return this;
	}
	
	protected int getModelSize() {
		if (mainArgs.get(MODEL_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(MODEL_SIZE_ARG));
	}

	protected AbstractEvaluation setModelSize(int modelSize) {
		mainArgs.put(MODEL_SIZE_ARG, String.valueOf(modelSize));
		return this;
	}
	
	protected int getUserSize() {
		if (mainArgs.get(USER_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(USER_SIZE_ARG));
	}

	protected AbstractEvaluation setUserSize(int userSize) {
		mainArgs.put(USER_SIZE_ARG, String.valueOf(userSize));
		return this;
	}
	
	protected boolean printAdditionalInfo() {
		if (mainArgs.containsKey(ADDITIONAL_INFO_ARG))
			return true;
		return false;
	}

	protected AbstractEvaluation setPrintAdditionalInfo() {
		mainArgs.put(ADDITIONAL_INFO_ARG, "true");
		return this;
	}
	
	protected boolean isTestEvaluation() {
		if (mainArgs.containsKey(TEST_EVALUATION_ARG))
			return true;
		return false;
	}
	
	protected AbstractEvaluation setTestEvaluation() {
		mainArgs.put(TEST_EVALUATION_ARG, "true");
		return this;
	}
	
	protected String getEcoreFilePath() {
		if (mainArgs.get(ECORE_ARG) == null)
			throw new IllegalArgumentException();

		return mainArgs.get(ECORE_ARG);
	}

	protected AbstractEvaluation setEcoreFilePath(String path) {
		mainArgs.put(ECORE_ARG, path);
		return this;
	}
	
	protected int getLimitSize() {
		if (mainArgs.get(LIMIT_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(LIMIT_SIZE_ARG));
	}

	protected AbstractEvaluation setLimitSize(int limitSize) {
		mainArgs.put(LIMIT_SIZE_ARG, String.valueOf(limitSize));
		return this;
	}

	protected int getModificationSize() {
		if (mainArgs.get(MODIFICATION_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(MODIFICATION_SIZE_ARG));
	}

	protected AbstractEvaluation setModificationSize(int modificationSize) {
		mainArgs.put(MODIFICATION_SIZE_ARG, String.valueOf(modificationSize));
		return this;
	}

	protected long currentTime() {
		return System.nanoTime();
	}

	protected void applyChanges() throws ViatraQueryException {
		Collection<AbstractChangeApplier> appliers = Sets.newHashSet(
				//new AttributeSetChange(getInstanceModelResource(), getModificationSize()),
				new CreationDeletionChange(getInstanceModelResource(), getModificationSize()*3),
				new ReferenceSetChange(getInstanceModelResource(), getModificationSize()*3)
				);
	
		for (AbstractChangeApplier applier : appliers) {
			applier.collect(getCollaborators());
		}
		
		beforeChangeExecution();
		for (AbstractChangeApplier applier : appliers) {
			beforeChangeExecution(applier);
			applier.apply();
			//applier.revert();
			afterChangeExecution(applier);
		}
		afterChangeExecution();
	}
	
	protected void prepareEvaluation() throws ViatraQueryException {
		users = getAccessControlModel().getRoles().stream()
				.filter(x -> x instanceof User)
				.filter(x -> x.getName().startsWith("user_"))
				.map(x -> (User) x)
				.sorted((x,y) -> x.getName().compareTo(y.getName()))
				.limit(getUserSize()).collect(toSet());
	}

	protected void beforeChangeExecution(AbstractChangeApplier applier) {}

	protected void beforeChangeExecution() {}

	protected void afterChangeExecution(AbstractChangeApplier applier) {}

	protected void afterChangeExecution() {}

	protected void dispose() {}
	
	protected void printTime(long time, long memory, String type, Object... additionals) {
		System.out.print(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + (getModificationSize() * 3) + ";" + type + ";");
		System.out.format("%,d", time);
		System.out.print(";");
		System.out.format("%,d", memory);
		for (int i = 0; i < additionals.length; i++) {
			System.out.print(";");
			System.out.print(additionals[i]);
		}
		System.out.println();
	}
}
