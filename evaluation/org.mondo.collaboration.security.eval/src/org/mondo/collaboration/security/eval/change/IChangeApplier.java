package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import org.mondo.collaboration.policy.rules.User;

public interface IChangeApplier {
	
	/**
	 * Collects the relevant composites on which the changes will be applied. This
	 * method needs to be excluded from the measurement.
	 * 
	 * @param collaborators
	 */
	public void collect(Collection<User> collaborators);
	
	public void apply();
	
	public void revert();
	
}
