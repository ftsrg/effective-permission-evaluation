package org.mondo.collaboration.security.eval;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.RuleManager;

public class BatchEvaluation extends AbstractEvaluation {
	private static Logger LOGGER = Logger.getLogger(BatchEvaluation.class);

	public static void main(String[] args) throws ViatraQueryException {
		BatchEvaluation evaluation = new BatchEvaluation();
		evaluation.evaluate(args);
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		RuleManager ruleManager = new RuleManager(getInstanceModelResource(), getAccessControlModel());
		ruleManager.initialize();

		Runtime runtime = Runtime.getRuntime();

		LOGGER.info("User;Time;Memory");
		for (User user : getCollaborators()) {
			for (int i = 0; i < getRepeatNumber(); i++) {
				long startUser = System.nanoTime();
				System.gc();
				long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();

				List<Judgement> permissions = ruleManager.calculateEffectivePermissions(user);

				long endUser = System.nanoTime();
				long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();

				LOGGER.info(user.getName() + ";" + (endUser - startUser) + ";" + (usedMemoryAfter - usedMemoryBefore));
			}
		}
	}

}
