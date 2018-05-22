package org.mondo.collaboration.security.eval.impl;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.RulesPackage;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.batch.RuleManager;
import org.mondo.collaboration.security.eval.Evaluation;
import org.mondo.collaboration.security.eval.EvaluationSetup;
import org.mondo.collaboration.security.eval.IChange;
import org.mondo.collaboration.security.eval.util.Defaults;
import org.mondo.collaboration.security.eval.util.EvaluationUtil;
import org.mondo.collaboration.security.eval.util.Parameters;
import org.mondo.collaboration.security.query.util.ObjectCompositeWithTypeQuerySpecification;
import org.mondo.collaboration.security.query.util.ObjectControlWithTypeQuerySpecification;
import org.mondo.collaboration.security.query.util.ObjectModuleQuerySpecification;
import org.mondo.collaboration.security.query.util.ProtectedModuleReadsSignalQuerySpecification;
import org.mondo.collaboration.security.query.util.ProtectedModuleVendorQuerySpecification;

import com.google.common.collect.Sets;

import wt.WtPackage;

public class BatchEvaluation extends Evaluation {

	static Set<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications;
	private RuleManager ruleManager;
	
	
	@SuppressWarnings("unchecked")
	static final IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> cast(IQuerySpecification<?> spec) {
		return (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) spec;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Logger.getLogger(RuleManager.class).setLevel(Level.OFF);
		
		Evaluation evaluation = new BatchEvaluation();
		EvaluationSetup setup = new EvaluationSetup();
		
		WtPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		RulesPackage.eINSTANCE.eClass();
		
		querySpecifications = Sets.<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>>newHashSet(
				cast(ObjectCompositeWithTypeQuerySpecification.instance()),
				cast(ObjectControlWithTypeQuerySpecification.instance()),
				cast(ObjectModuleQuerySpecification.instance()),
				cast(ProtectedModuleReadsSignalQuerySpecification.instance()),
				cast(ProtectedModuleVendorQuerySpecification.instance()));
		
		if(args.length == 0) {
			setup.internalEvaluation(evaluation); return;
		}
		setup.externalEvaluation(evaluation, new Parameters(args));
	}

	@Override
	public void evaluate(Parameters args, boolean warmup) throws ViatraQueryException {
		
		Collection<User> users = args.getAcModel().getRoles().stream()
												.filter(x -> x instanceof User)
												.map(x -> (User)x)
												.collect(Collectors.toSet());
		
		execute(args, users, "Init");
		change(args);
		execute(args, users, "Change");
	}

	private void change(Parameters args) throws ViatraQueryException {
		for(IChange change : Defaults.CHANGES) {
			change.initialize(args.getInstanceModel(), args.getModificationSize());
			change.apply();
		}
	}
	
	private void execute(Parameters args, Collection<User> users, String type) throws ViatraQueryException {
		long time = EvaluationUtil.currentTime();
		for (User user : users) {
			ruleManager = new RuleManager(args.getInstanceModel().eResource(), args.getAcModel());
			ruleManager.setQuerySpecifications(querySpecifications);
			ruleManager.initialize();
			ruleManager.calculateEffectivePermissions(user);
			ruleManager.dispose();
		}
		time = EvaluationUtil.currentTime() - time;
		EvaluationUtil.printTime(args, time, type);
	}

}
