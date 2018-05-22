package org.mondo.collaboration.security.eval;

import org.eclipse.emf.ecore.EObject;

public interface IChange {
	
	public void initialize(EObject model, int limit);

	public void apply();	
	
}
