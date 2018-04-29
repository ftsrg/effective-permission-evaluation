package org.mondo.collaboration.security.eval;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
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
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;

import com.google.inject.Injector;

import wt.WtFactory;
import wt.WtPackage;

public abstract class AbstractEvaluation {
	private static final String ECORE_ARG = "-ecore";
	private static final String REPEAT_ARG = "-repeat";
	private static final String LIMIT_SIZE_ARG = "-limit-user";
	private static final String USER_SIZE_ARG = "-user-size";
	private static final String MODEL_SIZE_ARG = "-model-size";
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
		}
	}

	public void evaluate(String[] args) throws ViatraQueryException {
		processArgs(args);
		initialize();
		
		System.out.println("Model_size;Limit_size;User_size;Instance;AccessControl");
		for (int i = 0; i < getRepeatNumber(); i++) {
			loadResources();
		}
		
//		countAssetsOfModel();
		
//		System.out.println("Model_size;Limit_size;User_size;Eval_type;Time;Memory");
//		for (int i = 0; i < getRepeatNumber(); i++) {
//			doEvaluation();
//		}
	}

	protected void loadResources() {
		URI instanceUri = URI.createURI(String.format(Generator.MODEL_PATH, getModelSize(), getLimitSize()));
		URI ecoreUri = URI.createFileURI(getEcoreFilePath());
		URI accessUri = URI.createURI(String.format(Generator.RULE_PATH, getLimitSize()));
		
		instanceModel = null;
		accessControlModel = null;
		
		for(int i = modelResourceSet.getResources().size() - 1; i >=0; i--) {
			modelResourceSet.getResources().remove(i);
		}
		
		for(int i = helperResourceSet.getResources().size() - 1; i >=0; i--) {
			helperResourceSet.getResources().remove(i);
		}
		
		Runtime runtime = Runtime.getRuntime();
		
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();

		
		
		modelResourceSet.getResource(ecoreUri, true);
		long first = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		instanceModel = modelResourceSet.getResource(instanceUri, true);
		long second = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		accessControlModel = helperResourceSet.getResource(accessUri, true);
		long third = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		double instanceMem = (Math.round((second - first) * Math.pow(10, -6) * 100.0) / 100.0);
		double accessMem = (Math.round((third - second) * Math.pow(10, -6) * 100.0) / 100.0);

		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize()  + ";" + instanceMem + ";" + accessMem);
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
		return getAccessControlModel().getRoles().stream().filter(x -> x instanceof User).map(x -> (User) x)
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

	public String[] getArguments(int modelSize, int limitSize, int userSize, int repeat, String[] args) {
		String[] arguments = new String[10];
		arguments[0] = "-model-size";
		arguments[1] = String.valueOf(modelSize);
		arguments[2] = "-limit-user";
		arguments[3] = String.valueOf(limitSize);
		arguments[4] = "-user-size" + String.valueOf(3);
		arguments[5] = String.valueOf(userSize);
		arguments[6] = "-repeat";
		arguments[7] = String.valueOf(repeat);
		arguments[8] = "-ecore";
		arguments[9] = getEcorePath(args);
		return arguments;
	}

	private String getEcorePath(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if (args[i].trim().startsWith(ECORE_ARG))
				return args[i + 1];
		}
		return null;
	}
}
