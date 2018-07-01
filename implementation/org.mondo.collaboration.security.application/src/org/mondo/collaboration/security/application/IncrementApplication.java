package org.mondo.collaboration.security.application;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;
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
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_attributeMatch;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_attributeMatcher;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_objectMatch;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_objectMatcher;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_referenceMatch;
import org.mondo.collaboration.security.application.query.EffectiveJudgement_referenceMatcher;
import org.mondo.collaboration.security.application.query.util.EffectiveJudgement_attributeQuerySpecification;
import org.mondo.collaboration.security.application.query.util.EffectiveJudgement_objectQuerySpecification;
import org.mondo.collaboration.security.application.query.util.EffectiveJudgement_referenceQuerySpecification;

import com.google.common.collect.Lists;

import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

public class IncrementApplication {
	private final static Logger logger = Logger.getLogger(IncrementApplication.class);

    private static final String MODEL_PATH = "C:\\Bulisuli\\1\\Onlab1\\Evaluation\\effective-permission-evaluation\\implementation\\org.mondo.collaboration.security.application\\src\\org\\mondo\\collaboration\\security\\application\\model\\windturbineXS.wtspec4m";
    private static final String METAMODEL_PATH = "C:\\Bulisuli\\1\\Onlab1\\Onlab1\\org.mondo.wt.cstudy.metamodel\\WTSpec4M.ecore";
	
	public static void main(String[] args) throws ViatraQueryException, IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wtspec4m", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		WTSpec4MFactory.eINSTANCE.eClass();
		WTSpec4MPackage.eINSTANCE.eClass();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource model = resourceSet.getResource(URI.createFileURI(MODEL_PATH), true);
		Resource metamodel = resourceSet.getResource(URI.createFileURI(METAMODEL_PATH), true);
		
		countAssets(model);
		
		ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(new EMFScope(resourceSet));
		
//		String user = "PrincipalEngineer";
//		String user = "SubsystemManager";
		String user = "IOManager";
		
		int numOfEff = 0;
		numOfEff += listEffectiveJudgementsOnObjects(engine, user);
		numOfEff += listEffectiveJudgementsOnAttributes(engine, user);
		numOfEff += listEffectiveJudgementsOnReferences(engine, user);
		logger.info("All judgements: " + numOfEff);
	}
	
	private static int listEffectiveJudgementsOnObjects(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		EffectiveJudgement_objectQuerySpecification querySpecification = EffectiveJudgement_objectQuerySpecification.instance();
		EffectiveJudgement_objectMatcher matcher = engine.getMatcher(querySpecification);
		EffectiveJudgement_objectMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("Object judgements: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgement_objectMatch>() {
			@Override
			public void process(EffectiveJudgement_objectMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
		return numOfEff;
	}
	
	private static int listEffectiveJudgementsOnAttributes(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		EffectiveJudgement_attributeQuerySpecification querySpecification = EffectiveJudgement_attributeQuerySpecification.instance();
		EffectiveJudgement_attributeMatcher matcher = engine.getMatcher(querySpecification);
		EffectiveJudgement_attributeMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
	    int numOfEff = matcher.countMatches(filter);
		logger.info("Attribute judgements: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgement_attributeMatch>() {
			@Override
			public void process(EffectiveJudgement_attributeMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
		return numOfEff;
	}
	
	private static int listEffectiveJudgementsOnReferences(ViatraQueryEngine engine, String user) throws ViatraQueryException {
		EffectiveJudgement_referenceQuerySpecification querySpecification = EffectiveJudgement_referenceQuerySpecification.instance();
		EffectiveJudgement_referenceMatcher matcher = engine.getMatcher(querySpecification);
		EffectiveJudgement_referenceMatch filter = matcher.newEmptyMatch();
		filter.setUser(user);
		int numOfEff = matcher.countMatches(filter);
		logger.info("Reference judgements: " + numOfEff);
		
		final List<IPatternMatch> matches = Lists.newArrayList();
		matcher.forEachMatch(filter, new IMatchProcessor<EffectiveJudgement_referenceMatch>() {
			@Override
			public void process(EffectiveJudgement_referenceMatch match) {
				matches.add(match);
			}
		});
		sortAndPrintMatches(matches);
		return numOfEff;
	}

	private static void sortAndPrintMatches(List<IPatternMatch> matches) {
		matches.sort(new Comparator<IPatternMatch>() {

			@Override
			public int compare(IPatternMatch o1, IPatternMatch o2) {
				return o1.get(1).toString().compareTo(o2.get(1).toString());
			}
		});
		
		for (IPatternMatch match : matches) {
			logger.info(match);
		}
	}

	private static void countAssets(Resource model) {
		int numOfAssets = 0, numOfRef = 0, numOfAttr = 0, numOfObj = 0;
		
		TreeIterator<EObject> allContents = model.getAllContents();
		while(allContents.hasNext()){
			EObject object = allContents.next();
			
			// object
			numOfObj++;
			
//			// attributes
			for(EAttribute attribute : object.eClass().getEAllAttributes()) {
//				logger.info(object.eClass().getName() + "." + attribute.getName());
				numOfAttr++;
			}
//			
//			// references
			for(EReference reference : object.eClass().getEAllReferences()) {
				// containment reference
				if(reference.isMany()) {
    				@SuppressWarnings("unchecked")
					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
    				for (EObject target : targets) {
    					numOfRef++;
					}
    			// association
    			} else {
    				EObject target = (EObject) object.eGet(reference);
    				if(target != null){
    				numOfRef++;
    				}
    			}
			}
		}
		logger.info("Objects: " + numOfObj);
		logger.info("Attributes: " + numOfAttr);
		logger.info("References: " + numOfRef);
		logger.info("All assets: " + (numOfObj + numOfAttr + numOfRef));
	}
}
