package org.mondo.collaboration.security.eval;

import java.util.List;

import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.RuleManager;

public class BatchEvaluation extends AbstractEvaluation {

	public static void main(String[] args) throws ViatraQueryException {
		BatchEvaluation evaluation = new BatchEvaluation();
		evaluation.evaluate(args);		
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		RuleManager ruleManager = new RuleManager(getInstanceModelResource(), getAccessControlModel());
		ruleManager.initialize();
		for (User user : getCollaborators()) {
			List<Judgement> permissions = ruleManager.getEffectivePermissions(user);
		}
	}
	
}
