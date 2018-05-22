package org.mondo.collaboration.security.eval;

import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.eval.util.EvaluationUtil;
import org.mondo.collaboration.security.eval.util.Parameters;

public abstract class Evaluation {

	public void printHeader() {
		EvaluationUtil.printDefaultHeader();
	}
	
	public abstract void evaluate(Parameters args, boolean warmup) throws ViatraQueryException;
	
}
