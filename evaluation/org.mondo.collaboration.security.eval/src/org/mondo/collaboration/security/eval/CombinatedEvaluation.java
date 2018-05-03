package org.mondo.collaboration.security.eval;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.batch.RuleManager;

import com.google.common.collect.Lists;

public class CombinatedEvaluation extends AbstractEvaluation {

	List<Entry<Long, Long>> results = Lists.newArrayList();
	private RuleManager ruleManager;

	public static void main(String[] args) throws ViatraQueryException {
		AbstractEvaluation evaluation = new BatchEvaluation();

		for (int modelSize : MODEL_SIZES) {
			for (int limitSize : LIMIT_SIZES) {
				for (int userSize : USER_SIZES) {
					if (userSize > limitSize) {
						break;
					}
					String[] arguments = evaluation.emulateArguments(modelSize, limitSize, userSize, REPEAT, true, true,
							args);
					evaluation.evaluate(arguments);
				}
			}
		}
	}

	@Override
	protected void prepareEvaluation() throws ViatraQueryException {
		ruleManager = new RuleManager(getInstanceModelResource(), getAccessControlModel());
		ruleManager.initialize();
	}
	
	@Override
	protected void doEvaluation() throws ViatraQueryException {
		long memory = currentMemoryUsage();
		long time = currentTime();

		for (User user : getCollaborators()) {
			ruleManager.calculateEffectivePermissions(user);
			break;
		}

		time = currentTime() - time;
		memory = currentMemoryUsage() - memory;

		results.add(new AbstractMap.SimpleEntry<Long, Long>(time, memory));
	}

	@Override
	protected void doEvaluationAgain() throws ViatraQueryException {
		doEvaluation();
	}
	
	@Override
	protected void printResults() {
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Original" + ";"
				+ results.get(0).getKey() + ";" + results.get(0).getValue());
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Changed" + ";"
				+ results.get(1).getKey() + ";" + results.get(1).getValue());
	}
	
	@Override
	protected void dispose() {
		ruleManager.dispose();
	}

}
