package org.mondo.collaboration.security.eval.change;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.security.eval.IChange;

import wt.Composite;
import wt.WtFactory;

public abstract class AbstractChange implements IChange {

	protected int limit = 0;
	protected Composite rootComposite = null;
	protected WtFactory wtFactory = WtFactory.eINSTANCE;
	
	@Override
	public void initialize(EObject model, int limit) {
		this.limit = limit;
		this.rootComposite = (Composite) model;
		collect();
	}
	
	protected abstract void collect();
	
}
