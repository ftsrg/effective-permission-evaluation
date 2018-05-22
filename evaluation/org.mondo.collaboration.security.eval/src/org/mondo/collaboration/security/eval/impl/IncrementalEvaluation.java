package org.mondo.collaboration.security.eval.impl;

import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryHintOption;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.util.ReteHintOptions;
import org.eclipse.xtext.common.types.access.impl.DeclaredTypeFactory;
import org.mondo.collaboration.security.eval.DefaultRealm;
import org.mondo.collaboration.security.eval.Evaluation;
import org.mondo.collaboration.security.eval.EvaluationSetup;
import org.mondo.collaboration.security.eval.IChange;
import org.mondo.collaboration.security.eval.util.Defaults;
import org.mondo.collaboration.security.eval.util.EvaluationUtil;
import org.mondo.collaboration.security.eval.util.MatchUpdateListener;
import org.mondo.collaboration.security.eval.util.Parameters;

import com.google.common.collect.Maps;

@SuppressWarnings("restriction")
public class IncrementalEvaluation extends Evaluation {

	private AdvancedViatraQueryEngine queryEngine;
	
	public static void main(String[] args) throws Exception {
		Logger.getLogger(DeclaredTypeFactory.class).setLevel(Level.OFF);
		
		new DefaultRealm();
		EvaluationSetup setup = new EvaluationSetup();
		Evaluation evaluation = new IncrementalEvaluation();
		if(args.length == 0) {
			setup.internalEvaluation(evaluation); return;
		}
		setup.externalEvaluation(evaluation, new Parameters(args));
	}
	
	@Override
	public void evaluate(Parameters args, boolean warmup) throws ViatraQueryException {
		initialization(args);
		change(args);
		dispose();
	}

	private void initialization(Parameters args) throws ViatraQueryException {
		long time = EvaluationUtil.currentTime();

		initializeQueryEngine(args);
		//initializeQueryEngineDRED(args);
		
		for (int i = 1; i <= args.getUserSize(); i++) {
			for (IQuerySpecification<?> specification : Defaults.QUERIES().get(args.getUserSize())) {
				registerUser("user_" + i, specification);
			}
		}
		
		time = EvaluationUtil.currentTime() - time;
		EvaluationUtil.printTime(args, time, "Init");
	}

	public void initializeQueryEngine(Parameters args) throws ViatraQueryException {
		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(args.getInstanceModel()));
	}
	
	@SuppressWarnings("rawtypes")
	public void initializeQueryEngineDRED(Parameters args) throws ViatraQueryException {
		QueryHintOption<Boolean> option = ReteHintOptions.deleteRederiveEvaluation;
		Map<QueryHintOption, Object> optionMap = Maps.newHashMap();
		optionMap.put(option, true);
		QueryEvaluationHint hint = new QueryEvaluationHint(optionMap, new ReteBackendFactory());
		ViatraQueryEngineOptions engineOptions = ViatraQueryEngineOptions.defineOptions().withDefaultHint(hint).build();
		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(args.getInstanceModel()), engineOptions);
	}

	private void change(Parameters args) throws ViatraQueryException {
		for(IChange change : Defaults.CHANGES) {
			change.initialize(args.getInstanceModel(), args.getModificationSize());
		}
		
		long time = EvaluationUtil.currentTime();
		for(IChange change : Defaults.CHANGES) {
			change.apply();
		}
		time = EvaluationUtil.currentTime() - time;
		EvaluationUtil.printTime(args, time, "Change");
	}
	
	private void registerUser(String user, IQuerySpecification<?> specification) throws ViatraQueryException {
		IPatternMatch filterMatch = (IPatternMatch)specification.newEmptyMatch();
		filterMatch.set("user", user);
		ViatraQueryMatcher<?> matcher = queryEngine.getMatcher(specification);
		queryEngine.addMatchUpdateListener(matcher, new MatchUpdateListener(user), true);
	}
	
	protected void dispose() {
		queryEngine.dispose();
	}
}
