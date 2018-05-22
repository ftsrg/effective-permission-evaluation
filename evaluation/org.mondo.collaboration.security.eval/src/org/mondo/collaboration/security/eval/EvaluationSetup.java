package org.mondo.collaboration.security.eval;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.mondo.collaboration.security.eval.util.Defaults;
import org.mondo.collaboration.security.eval.util.Parameters;

import com.google.inject.Injector;

import wt.WtPackage;

public class EvaluationSetup {
	
	private ResourceSet modelResourceSet;
	private XtextResourceSet helperResourceSet;
	private Injector injector;
	private AccessControlModel acModel;
	
	public void externalEvaluation(Evaluation evaluation, Parameters args) throws Exception {
		for (int i = 0; i < args.getRepeatNumber() + args.getWarmupNumber(); i++) {
			initialize(args);
			loadResources(args);
			evaluation.evaluate(args, args.getWarmupNumber() < i);
		}
	}
	
	public void internalEvaluation(Evaluation evaluation) throws Exception {
		evaluation.printHeader();
		
		for (int modelSize : Defaults.MODEL_SIZES) {
			for (int userSize : Defaults.USER_SIZES) {
				for (int modifications : Defaults.MODIFICATION_SIZES) {
					
					Parameters args = Parameters.builder()
					 .setModelSize(modelSize)
					 .setUserSize(userSize)
					 .setModificationSize(modifications)
					 .setRepeatNumber(Defaults.REPEAT)
					 .setWarmupNumber(Defaults.WARMUP)
					 .build();
					
					externalEvaluation(evaluation, args);
				}
			}
		}
	}


	protected void initialize(Parameters args) throws ViatraQueryException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		WtPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		
		injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		helperResourceSet = injector.getInstance(XtextResourceSet.class);
		helperResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE); 
	
		URI accessUri = URI.createURI(String.format(Generator.RULE_PATH, args.getUserSize()));
		Resource accessResource = helperResourceSet.getResource(accessUri, true);
		acModel = (AccessControlModel) accessResource.getContents().get(0);
	}
	
	protected void loadResources(Parameters args) throws IOException {
		URI instanceUri = URI.createURI(String.format(Generator.MODEL_PATH, args.getModelSize(), 30));
		modelResourceSet = new ResourceSetImpl();
		args.setAcModel(acModel);
		
		Resource instanceResource = modelResourceSet.getResource(instanceUri, true);
		args.setInstanceModel(instanceResource.getContents().get(0));
	}
	
	protected void unloadResource(Parameters args) {		
		modelResourceSet.getResources().clear();
		modelResourceSet = null;
	}
	
}
