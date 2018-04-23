//package org.mondo.collaboration.security.batch;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
//import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;
//import org.eclipse.xtext.resource.XtextResource;
//import org.eclipse.xtext.resource.XtextResourceSet;
//import org.mondo.collaboration.policy.RulesStandaloneSetup;
//import org.mondo.collaboration.policy.rules.Model;
//
//import com.google.inject.Injector;
//
//import WTSpec4M.WT;
//import WTSpec4M.WTSpec4MFactory;
//import WTSpec4M.WTSpec4MPackage;
//
//public class ModelClass {
//    private static final String QUERIES_PATH = "C:\\Sulibuli\\7\\Szakdoga\\git\\Szakdoga\\Runtime\\WindTurbine.demo\\src\\windturbine\\demo\\example.vql";
//	private static final String RULES_PATH = "C:\\Sulibuli\\7\\Szakdoga\\git\\Szakdoga\\Runtime\\WindTurbine.demo\\src\\windturbine\\demo\\example.rules";
//	private static final String MODELS_PATH = "C:\\Sulibuli\\7\\Szakdoga\\git\\Szakdoga\\Runtime\\WindTurbine.demo\\src\\windturbine\\demo\\exampleXS.wtspec4m";
//	
//	private XtextResourceSet resourceSet;
//	private Model ruleModel;
//	private Resource queryResource;
//	private PatternModel queriesModel;
//	private Resource modelResource;
//	private WT model;
//    
//    public ModelClass(){
//    	WTSpec4MFactory.eINSTANCE.eClass();
//    	WTSpec4MPackage.eINSTANCE.eClass();
//    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wtspec4m", new XMIResourceFactoryImpl());
//    	
//    	Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
//   	    new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
//    	
//    	resourceSet = injector.getInstance(XtextResourceSet.class);
//    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//
//    	queryResource = resourceSet.getResource(URI.createFileURI(QUERIES_PATH), true);
//    	queriesModel = (PatternModel) queryResource.getContents().get(0);
//    	
//    	Resource ruleResource = resourceSet.getResource(URI.createFileURI(RULES_PATH), true);
//    	ruleModel = (Model) ruleResource.getContents().get(0);
//    	
//    	modelResource = resourceSet.getResource(URI.createFileURI(MODELS_PATH), true);
//    	model = (WT) modelResource.getContents().get(0);
//    	
//    }
//
//	public Model getRuleModel() {
//		return ruleModel;
//	}
//
//	public void setRuleModel(Model ruleModel) {
//		this.ruleModel = ruleModel;
//	}
//
//	public Resource getModelResource() {
//		return modelResource;
//	}
//
//	public void setModelResource(Resource modelResource) {
//		this.modelResource = modelResource;
//	}
//}