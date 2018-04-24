package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.mondo.collaboration.policy.rules.User;

import wt.Composite;
import wt.WtFactory;
import wt.WtPackage;

public abstract class AbstractChangeApplier implements IChangeApplier {

	protected int limit = 0;
	protected Composite rootComposite;
	protected WtPackage wtPackage = WtPackage.eINSTANCE;
	protected WtFactory wtFactory = WtFactory.eINSTANCE;
	
	public AbstractChangeApplier(Resource model, int limit) {
		this.limit = limit;
		this.rootComposite = (Composite) model.getContents().get(0);
	}

	/**
	 * Collects the relevant objects on which the changes will be applied. This
	 * method needs to be excluded from the measurement.
	 * 
	 * @param collaborators
	 */
	public abstract void collect(Collection<User> collaborators);
	
}
