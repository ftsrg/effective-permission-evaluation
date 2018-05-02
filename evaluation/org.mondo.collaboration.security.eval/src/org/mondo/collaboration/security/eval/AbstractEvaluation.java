package org.mondo.collaboration.security.eval;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

import com.google.common.collect.Sets;
import com.google.inject.Injector;

import wt.WtFactory;
import wt.WtPackage;

public abstract class AbstractEvaluation {
	
	public static final int[] MODEL_SIZES = { 25, 50, 100, 200, 300 };
	public static final int[] LIMIT_SIZES = { 30 };
	public static final int[] USER_SIZES = { 20 };
	public static final int REPEAT = 10;
	public static final int MODIFICATIONS = 20;
	
	
	private static final String ECORE_ARG = "-ecore";
	private static final String REPEAT_ARG = "-repeat";
	private static final String LIMIT_SIZE_ARG = "-limit-user";
	private static final String USER_SIZE_ARG = "-user-size";
	private static final String MODEL_SIZE_ARG = "-model-size";
	private static final String TEST_EVALUATION_ARG = "-test-evaluate";
	private static final String ADDITIONAL_INFO_ARG = "-more-info";
	protected HashMap<String, String> mainArgs;

	private ResourceSet modelResourceSet;
	private XtextResourceSet helperResourceSet;
	private Resource instanceModel;
	private Resource accessControlModel;

	protected void processArgs(String[] args) {
		if (args.length % 2 != 0) {
			throw new IllegalArgumentException("Missing argument parameter!");
		}
		mainArgs = new HashMap<String, String>();

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
		
		initialize();
		loadResources();
		
		if(!isTestEvaluation()) {
			for (int i = 0; i < getRepeatNumber(); i++) {
				prepareEvaluation();
				doEvaluation();
				printResults();
			}
		}
	}

	protected void printResults() { }

	protected void loadResources() {
		URI instanceUri = URI.createURI(String.format(Generator.MODEL_PATH, getModelSize(), getLimitSize()));
		URI ecoreUri = URI.createFileURI(getEcoreFilePath());
		URI accessUri = URI.createURI(String.format(Generator.RULE_PATH, getLimitSize()));
		
		instanceModel = null;
		accessControlModel = null;
		
		modelResourceSet.getResources().clear();
		helperResourceSet.getResources().clear();
		
		long initialMemory = currentMemoryUsage();
		modelResourceSet.getResource(ecoreUri, true);
		long metamodelMemory = currentMemoryUsage() - initialMemory;
		instanceModel = modelResourceSet.getResource(instanceUri, true);
		long instanceModelMemory = currentMemoryUsage() - metamodelMemory;
		accessControlModel = helperResourceSet.getResource(accessUri, true);
		long accessControlModelMemory = currentMemoryUsage() - instanceModelMemory;

		if(printAdditionalInfo()) {
			countAssetsOfModel();
			System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize()  + ";" + instanceModelMemory + ";" + accessControlModelMemory);
		}
	}
	
	protected long currentMemoryUsage() {
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();		
		
		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	}

	protected void countAssetsOfModel() {
		// int[numOfObj, numOfAttr, numOfRef]
		int[] numOfAssets = { 0, 0, 0 };
		if (instanceModel != null) {
			EObject rootObject = instanceModel.getContents().get(0);
			numOfAssets = countAssetsOfObject(rootObject);
		}
		System.out.println("Number of all assets: " + (numOfAssets[0] + numOfAssets[1] + numOfAssets[2]));
		System.out.println("Number of object assets: " + numOfAssets[0]);
		System.out.println("Number of attribute assets: " + numOfAssets[1]);
		System.out.println("Number of reference assets: " + numOfAssets[2]);
	}

	@SuppressWarnings("unchecked")
	protected int[] countAssetsOfObject(EObject object) {
		int[] numOfAssets = { 1, 0, 0 };

		numOfAssets[1] += object.eClass().getEAllAttributes().stream().filter(a -> a != null)
				.collect(Collectors.toList()).size();

		for (EReference ref : object.eClass().getEAllReferences().stream().filter(r -> !r.isContainment())
				.collect(Collectors.toList())) {
			numOfAssets[2] += ((EList<EObject>) object.eGet(ref)).size();
		}

		for (EReference contRef : object.eClass().getEAllReferences().stream().filter(r -> r.isContainment())
				.collect(Collectors.toList())) {
			for (EObject contObj : (EList<EObject>) object.eGet(contRef)) {
				numOfAssets[2]++;
				int[] numOfContAssets = countAssetsOfObject(contObj);
				numOfAssets[0] += numOfContAssets[0];
				numOfAssets[1] += numOfContAssets[1];
				numOfAssets[2] += numOfContAssets[2];
			}
		}
		return numOfAssets;
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
		return getAccessControlModel().getRoles().stream()
				.filter(x -> x instanceof User)
				.filter(x -> x.getName().startsWith("user_"))
				.map(x -> (User) x)
				.sorted((x,y) -> x.getName().compareTo(y.getName()))
				.limit(getUserSize()).collect(toSet());
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

	protected int getModelSize() {
		if (mainArgs.get(MODEL_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(MODEL_SIZE_ARG));
	}

	protected int getUserSize() {
		if (mainArgs.get(USER_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(USER_SIZE_ARG));
	}

	protected boolean printAdditionalInfo() {
		if (mainArgs.containsKey(ADDITIONAL_INFO_ARG))
			return true;
		return false;
	}

	
	protected boolean isTestEvaluation() {
		if (mainArgs.containsKey(TEST_EVALUATION_ARG))
			return true;
		return false;
	}
	
	protected String getEcoreFilePath() {
		if (mainArgs.get(ECORE_ARG) == null)
			throw new IllegalArgumentException();

		return mainArgs.get(ECORE_ARG);
	}

	protected int getLimitSize() {
		if (mainArgs.get(LIMIT_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(LIMIT_SIZE_ARG));
	}

	public String[] emulateArguments(int modelSize, int limitSize, int userSize, int repeat, boolean additionalInfo, boolean testEvaluation, String[] args) {
		String[] arguments = new String[12];
		arguments[0] = MODEL_SIZE_ARG;
		arguments[1] = String.valueOf(modelSize);
		arguments[2] = LIMIT_SIZE_ARG;
		arguments[3] = String.valueOf(limitSize);
		arguments[4] = USER_SIZE_ARG;
		arguments[5] = String.valueOf(userSize);
		arguments[6] = REPEAT_ARG;
		arguments[7] = String.valueOf(repeat);
		arguments[8] = ECORE_ARG;
		arguments[9] = getEcorePath(args);
		arguments[10] = additionalInfo ? ADDITIONAL_INFO_ARG : "";
		arguments[11] = testEvaluation ? TEST_EVALUATION_ARG : "";
		
		return arguments;
	}

	private String getEcorePath(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].trim().startsWith(ECORE_ARG))
				return args[i + 1];
		}
		return null;
	}

	protected long currentTime() {
		return System.nanoTime();
	}

	protected void applyChanges() {
		Collection<AbstractChangeApplier> appliers = Sets.newHashSet(
				new AttributeSetChange(getInstanceModelResource(), MODIFICATIONS),
				new CreationDeletionChange(getInstanceModelResource(), MODIFICATIONS),
				new ReferenceSetChange(getInstanceModelResource(), MODIFICATIONS));
	
		for (AbstractChangeApplier applier : appliers) {
			applier.collect(getCollaborators());
		}
		
		beforeChangeExecution();
		for (AbstractChangeApplier applier : appliers) {
			beforeChangeExecution(applier);
			applier.apply();
			applier.revert();
			afterChangeExecution(applier);
		}
		afterChangeExecution();
	}
	
	protected void prepareEvaluation() throws ViatraQueryException {}

	protected void beforeChangeExecution(AbstractChangeApplier applier) {}

	protected void beforeChangeExecution() {}

	protected void afterChangeExecution(AbstractChangeApplier applier) {}

	protected void afterChangeExecution() {}

	protected void dispose() {}
}
