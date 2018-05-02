package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.mondo.collaboration.policy.rules.User;

import com.google.common.collect.Sets;

import wt.Signal;

public class CreationDeletionChange extends AbstractChangeApplier {

	private Collection<Signal> signals = Sets.newHashSet();
	
	public CreationDeletionChange(Resource model, int limit) {
		super(model, limit);
	}

	@Override
	public void apply() {
		for (Signal signal : signals) {
			rootComposite.getProvides().add(signal);			
		}

	}

	@Override
	public void revert() {
		for (Signal signal : signals) {
			rootComposite.getProvides().remove(signal);			
		}
	}

	@Override
	public void collect(Collection<User> collaborators) {
		for (int i = 0; i < limit; i++) {
			signals.add(wtFactory.createSignal());
		}
	}
	
	@Override
	public String getType() {
		return "CreateDel";
	}

}
