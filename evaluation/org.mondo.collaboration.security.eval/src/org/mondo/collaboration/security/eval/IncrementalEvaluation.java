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

	public static void main(String[] args) throws ViatraQueryException {
		new DefaultRealm();
		AbstractEvaluation evaluation = new IncrementalEvaluation();
		evaluate(args, evaluation);
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		initMemoryUsage = beforeMemoryUsage();
		initTime = currentTime();

		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(getModelResourceSet()));
		observables = Lists.newArrayList();
		
		for (int i = 1; i <= getUserSize(); i++) {
			observableObjects(queryEngine, i);
			observableAttributes(queryEngine, i);
			observableReferences(queryEngine, i);
		}
		
		initTime = currentTime() - initTime;
		initMemoryUsage = afterMemoryUsage() - initMemoryUsage;
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

	@Override
	protected void beforeChangeExecution() {
		changeMemoryUsage = beforeMemoryUsage();
		changeTime = currentTime();
	}

	@Override
	protected void afterChangeExecution() {
		changeTime = currentTime() - changeTime;
		changeMemoryUsage = afterMemoryUsage() - changeMemoryUsage;
	}

	@Override
	protected void printResults() {
		printTime(initTime, initMemoryUsage, "Init");
		printTime(changeTime, changeMemoryUsage, "Change");
	}
	
	@Override
	protected void dispose() {
		super.dispose();
		observables.forEach(x -> x.dispose());
		observables.clear();
		queryEngine.dispose();
	}
}
