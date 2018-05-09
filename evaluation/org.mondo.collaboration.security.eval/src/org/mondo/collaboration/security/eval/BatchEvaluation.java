package org.mondo.collaboration.security.eval;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.policy.rules.impl.RulesPackageImpl;
import org.mondo.collaboration.security.batch.RuleManager;
import org.mondo.collaboration.security.query.util.ObjectCompositeWithTypeQuerySpecification;
import org.mondo.collaboration.security.query.util.ObjectControlWithTypeQuerySpecification;
import org.mondo.collaboration.security.query.util.ObjectModuleQuerySpecification;
import org.mondo.collaboration.security.query.util.ProtectedModuleReadsSignalQuerySpecification;
import org.mondo.collaboration.security.query.util.ProtectedModuleVendorQuerySpecification;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import wt.impl.WtPackageImpl;

public class BatchEvaluation extends AbstractEvaluation {

	List<Entry<Long,Long>> results =  Lists.newArrayList();
	List<Object[]> additional =  Lists.newArrayList();
	static Set<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications;
	private RuleManager ruleManager;
	
	
	@SuppressWarnings("unchecked")
	static final IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> cast(IQuerySpecification<?> spec) {
		return (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) spec;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ViatraQueryException {
		AbstractEvaluation evaluation = new BatchEvaluation();
		Logger.getLogger(RuleManager.class).setLevel(Level.OFF);
		
		RulesPackageImpl.init();
		WtPackageImpl.init();
		
		querySpecifications = Sets.<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>>newHashSet(
				cast(ObjectCompositeWithTypeQuerySpecification.instance()),
				cast(ObjectControlWithTypeQuerySpecification.instance()),
				cast(ObjectModuleQuerySpecification.instance()),
				cast(ProtectedModuleReadsSignalQuerySpecification.instance()),
				cast(ProtectedModuleVendorQuerySpecification.instance()));
		
		evaluate(args, evaluation);
	}

	@Override
	protected void prepareEvaluation() throws ViatraQueryException {
		super.prepareEvaluation();
		results.clear();
		additional.clear();
	}
	
	@Override
	protected void doEvaluation() throws ViatraQueryException {
		
		long memory = beforeMemoryUsage();
		long time = currentTime();

		Collection<User> collaborators = getCollaborators();
		for (User user : collaborators) {
			ruleManager = new RuleManager(getInstanceModelResource(), getAccessControlModel());
			ruleManager.setQuerySpecifications(querySpecifications);
			ruleManager.initialize();
			ruleManager.calculateEffectivePermissions(user);
			ruleManager.dispose();
		}
		
		time = currentTime() - time;
		memory = afterMemoryUsage() - memory;
		
		ruleManager.dispose();
		results.add(new AbstractMap.SimpleEntry<Long, Long>(time, memory));
	}
	
	@Override
	protected void doEvaluationAgain() throws ViatraQueryException {
		doEvaluation();
	}
	
	@Override
	protected void printResults() {
		printTime(results.get(0).getKey(), results.get(0).getValue(), "Original");
		printTime(results.get(1).getKey(), results.get(1).getValue(), "Modified");
	}

}
