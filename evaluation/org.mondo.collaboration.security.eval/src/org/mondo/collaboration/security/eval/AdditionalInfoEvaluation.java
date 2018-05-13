package org.mondo.collaboration.security.eval;

import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

public class AdditionalInfoEvaluation extends AbstractEvaluation {

	public static void main(String[] args) throws ViatraQueryException {
		AdditionalInfoEvaluation evaluation = new AdditionalInfoEvaluation();
		internalEvaluation(args, evaluation);
	}

	protected static void internalEvaluation(String[] args, AbstractEvaluation evaluation) throws ViatraQueryException {
		for (int modelSize : MODEL_SIZES) {
			evaluation.setModelSize(modelSize)
					  .setLimitSize(30)
					  .setUserSize(1)
					  .setEcoreFilePath(args[1])
					  .setModificationSize(1)
					  .setRepeatNumber(REPEAT)
					  .setTestEvaluation()
					  .setPrintAdditionalInfo();

			evaluation.evaluate();
		}
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
	}

}
