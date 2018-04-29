package org.mondo.collaboration.security.eval;

import java.util.List;

import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.RuleManager;

public class BatchEvaluation extends AbstractEvaluation {

	public static void main(String[] args) throws ViatraQueryException {
		BatchEvaluation evaluation = new BatchEvaluation();
		
		for (int modelSize : MODEL_SIZES) {
			for (int limitSize : LIMIT_SIZES) {
				for (int userSize : USER_SIZES) {
					if (userSize > limitSize) {
						break;
					}
					String[] arguments = evaluation.getArguments(modelSize, limitSize, userSize, REPEAT, args);
					evaluation.evaluate(arguments);
				}
			}
		}
		
		// evaluation.evaluate(args);
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		RuleManager ruleManager = new RuleManager(getInstanceModelResource(), getAccessControlModel());
		ruleManager.initialize();

		System.gc();
		System.gc();
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		long startMemory = runtime.totalMemory() - runtime.freeMemory();
		long startTime = System.nanoTime();

		for (User user : getCollaborators()) {
			List<Judgement> permissions = ruleManager.calculateEffectivePermissions(user);
			break;
		}
		
		long endMemory = runtime.totalMemory() - runtime.freeMemory();
		long endTime = System.nanoTime();
		
		double time = Math.round((endTime - startTime) * Math.pow(10, -6) * 100.0) / 100.0;
		double memory = Math.round((endMemory - startMemory) * Math.pow(10, -6) * 100.0) / 100.0;
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + time + ";" + memory);
		
	}

}
