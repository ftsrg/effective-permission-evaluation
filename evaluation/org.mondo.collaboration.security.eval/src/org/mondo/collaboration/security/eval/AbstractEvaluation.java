package org.mondo.collaboration.security.eval;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.policy.rules.AccessControlModel;
import org.mondo.collaboration.policy.rules.User;

import com.google.inject.Injector;

import wt.WtFactory;
import wt.WtPackage;

public abstract class AbstractEvaluation {

	private static final String REPEAT_ARG = "-repeat";
	private static final String LIMIT_SIZE_ARG = "-limit_size";
	private static final String USER_SIZE_ARG = "-user_size";
	private static final String MODEL_SIZE_ARG = "-model_size";
	protected HashMap<String, String> mainArgs;

	private XtextResourceSet resourceSet;
	private Resource instanceModel;
	private Resource accessControlModel;

	protected void processArgs(String[] args) {
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
		}
	}

	public void evaluate(String[] args) throws ViatraQueryException {
		processArgs(args);
		initialize();
		loadResources();
		doEvaluation();
	}

	protected void loadResources() {
		URI instanceUri = URI.createURI(String.format(Generator.MODEL_PATH, getModelSize(), getLimitSize()));
		URI accessUri = URI.createURI(String.format(Generator.RULE_PATH, getLimitSize()));

		instanceModel = resourceSet.getResource(instanceUri, true);
		accessControlModel = resourceSet.getResource(accessUri, true);
	}

	protected abstract void doEvaluation() throws ViatraQueryException;

	protected void initialize() throws ViatraQueryException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		WtPackage.eINSTANCE.eClass();
		WtFactory.eINSTANCE.eClass();

		Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();

		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
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

	protected XtextResourceSet getResourceSet() {
		return resourceSet;
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

	protected int getLimitSize() {
		if (mainArgs.get(LIMIT_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(LIMIT_SIZE_ARG));
	}
}
