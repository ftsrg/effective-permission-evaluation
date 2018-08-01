package org.mondo.collaboration.security.application;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.policy.delegation.DelegationStandaloneSetup;
import org.mondo.collaboration.policy.delegation.delegation.DelegationFactory;
import org.mondo.collaboration.policy.delegation.delegation.DelegationModel;
import org.mondo.collaboration.policy.rules.AccessControlModel;

import com.google.inject.Injector;

import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

public class ModelClass {
    // default values for the experiments
    private static final String QUERIES_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/query/policy.vql";
	private static final String RULES_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/policy/policy.rules";
	private static final String MODELS_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/model/windturbineXS.wtspec4m";
	private static final String DELEGATION_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/policy/policy.delegation";

	private XtextResourceSet resourceSet;
	private AccessControlModel ruleModel;
	private Resource queryResource;
	private PatternModel queriesModel;
	private Resource modelResource;
	private EObject model;
	private DelegationModel delegationModel;
    
	
    public ModelClass() {
        this(QUERIES_PATH, RULES_PATH, MODELS_PATH, DELEGATION_PATH);
    }

	
    public ModelClass(String queriesPath, String rulesPath, String modelsPath, String delegationPath){
    	WTSpec4MFactory.eINSTANCE.eClass();
    	WTSpec4MPackage.eINSTANCE.eClass();
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wtspec4m", new XMIResourceFactoryImpl());
    	
    	Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
    	new DelegationStandaloneSetup().createInjectorAndDoEMFRegistration();
   	    new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
   	    
    	resourceSet = injector.getInstance(XtextResourceSet.class);
    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    	
    	queryResource = resourceSet.getResource(URI.createFileURI(queriesPath), true);
    	queriesModel = (PatternModel) queryResource.getContents().get(0);
    	
    	Resource ruleResource = resourceSet.getResource(URI.createFileURI(rulesPath), true);
    	ruleModel = (AccessControlModel) ruleResource.getContents().get(0);
    	
    	if (delegationPath != null) {
    	    Resource delegationResource = resourceSet.getResource(URI.createFileURI(delegationPath), true);
    	    delegationModel = (DelegationModel) delegationResource.getContents().get(0);    	    
    	} else {
    	    delegationModel = DelegationFactory.eINSTANCE.createDelegationModel();
    	}
    	
    	modelResource = resourceSet.getResource(URI.createFileURI(modelsPath), true);
    	model = modelResource.getContents().get(0);
    	
    }

	public AccessControlModel getRuleModel() {
		return ruleModel;
	}

	public void setRuleModel(AccessControlModel ruleModel) {
		this.ruleModel = ruleModel;
	}

	public Resource getModelResource() {
		return modelResource;
	}

	public void setModelResource(Resource modelResource) {
		this.modelResource = modelResource;
	}

	public DelegationModel getDelegationModel() {
		return delegationModel;
	}

	public void setDelegationModel(DelegationModel delegationModel) {
		this.delegationModel = delegationModel;
	}
}