package org.mondo.collaboration.security.eval;

import java.util.Collection;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.viatra.addon.databinding.runtime.api.ViatraObservables;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.query.generated.EffectiveJudgementOnAttributeMatch;
import org.mondo.collaboration.security.query.generated.EffectiveJudgementOnObjectMatch;
import org.mondo.collaboration.security.query.generated.EffectiveJudgementOnReferenceMatch;
import org.mondo.collaboration.security.query.generated.util.EffectiveJudgementOnAttributeQuerySpecification;
import org.mondo.collaboration.security.query.generated.util.EffectiveJudgementOnObjectQuerySpecification;
import org.mondo.collaboration.security.query.generated.util.EffectiveJudgementOnReferenceQuerySpecification;

import com.google.common.collect.Lists;

public class IncrementalEvaluation extends AbstractEvaluation {

	private long changeMemoryUsage;
	private long changeTime;

	private long initMemoryUsage;
	private long initTime;
	private Collection<IObservableList<?>> observables;
	private AdvancedViatraQueryEngine queryEngine;
//	private Collection<ViatraQueryMatcher<IPatternMatch>> matchers;

	public static void main(String[] args) throws ViatraQueryException {
		new DefaultRealm();
		AbstractEvaluation evaluation = new IncrementalEvaluation();

		for (int modelSize : MODEL_SIZES) {
			for (int limitSize : LIMIT_SIZES) {
				for (int userSize : USER_SIZES) {
					if (userSize > limitSize) {
						break;
					}
					String[] arguments = evaluation.emulateArguments(modelSize, limitSize, userSize, REPEAT, false, false,
							args);
					evaluation.evaluate(arguments);
				}
			}
		}
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		initMemoryUsage = currentMemoryUsage();
		initTime = currentTime();

		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(getModelResourceSet()));
		observables = Lists.newArrayList();
		
		for (int i = 1; i <= getUserSize(); i++) {
			observableObjects(queryEngine, i);
			observableAttributes(queryEngine, i);
			observableReferences(queryEngine, i);
		}
		
		initMemoryUsage = changeMemoryUsage - initMemoryUsage;
		initTime = currentTime() - initTime;
	}

	private void observableAttributes(ViatraQueryEngine queryEngine, int i) throws ViatraQueryException {
		EffectiveJudgementOnAttributeQuerySpecification attributeQuerySpecification = EffectiveJudgementOnAttributeQuerySpecification.instance();
		EffectiveJudgementOnAttributeMatch attributeFilterMatch = attributeQuerySpecification.newEmptyMatch();
		attributeFilterMatch.set("user", "user_" + i);
		
		observables.add(ViatraObservables.observeMatchesAsList(attributeQuerySpecification, queryEngine,
				attributeFilterMatch.toImmutable()));
	}
	
	private void observableObjects(ViatraQueryEngine queryEngine, int i) throws ViatraQueryException {
		EffectiveJudgementOnObjectQuerySpecification objectQuerySpecification = EffectiveJudgementOnObjectQuerySpecification.instance();
		EffectiveJudgementOnObjectMatch objectFilterMatch = objectQuerySpecification.newEmptyMatch();
		objectFilterMatch.set("user", "user_" + i);
		
		observables.add(ViatraObservables.observeMatchesAsList(objectQuerySpecification, queryEngine,
				objectFilterMatch.toImmutable()));
	}
	
	private void observableReferences(ViatraQueryEngine queryEngine, int i) throws ViatraQueryException {
		EffectiveJudgementOnReferenceQuerySpecification referenceQuerySpecification = EffectiveJudgementOnReferenceQuerySpecification.instance();
		EffectiveJudgementOnReferenceMatch referenceFilterMatch = referenceQuerySpecification.newEmptyMatch();
		referenceFilterMatch.set("user", "user_" + i);
		
		observables.add(ViatraObservables.observeMatchesAsList(referenceQuerySpecification, queryEngine,
				referenceFilterMatch.toImmutable()));
	}

//	private Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> loadQuerySpecifications()
//			throws ViatraQueryException {
//		Iterable<Pattern> effectivePermissionPatterns = null;
//		for (String queryFile : RulesGenerator.collectVQLFiles(getAccessControlModel(), getInstanceModelResource())) {
//			String path = String.format(Generator.INCREMENTAL_RULE_BASE_PATH + queryFile, getLimitSize(),
//					getLimitSize());
//			Resource model = getHelperResourceSet().getResource(URI.createURI(path), true);
//			if (queryFile.equals(RulesGenerator.mainVQLFile(getAccessControlModel()))) {
//				effectivePermissionPatterns = RulesGenerator
//						.mainQuerySpecification((PatternModel) model.getContents().get(0));
//			}
//		}
//
//		Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications = Lists.newArrayList();
//		for (Pattern effectivePermissionPattern : effectivePermissionPatterns) {
//			SpecificationBuilder builder = new SpecificationBuilder();
//			@SuppressWarnings("unchecked")
//			IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = ((IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) builder
//					.getOrCreateSpecification(effectivePermissionPattern));
//			querySpecifications.add(querySpecification);
//		}
//		return querySpecifications;
//	}

	@Override
	protected void beforeChangeExecution() {
		//changeMemoryUsage = currentMemoryUsage();
		changeTime = currentTime();
	}

	@Override
	protected void afterChangeExecution() {
		changeTime = currentTime() - changeTime;
		//changeMemoryUsage = currentMemoryUsage() - changeMemoryUsage;
	}

	@Override
	protected void printResults() {
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Init" + ";" + initTime
				+ ";" + initMemoryUsage);
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Change" + ";" + changeTime
				+ ";" + changeMemoryUsage);
	}
	
	@Override
	protected void dispose() {
		super.dispose();
		observables.forEach(x -> x.dispose());
		observables.clear();
		queryEngine.dispose();
//		matchers.forEach(x -> x.dispose());
	}
}
