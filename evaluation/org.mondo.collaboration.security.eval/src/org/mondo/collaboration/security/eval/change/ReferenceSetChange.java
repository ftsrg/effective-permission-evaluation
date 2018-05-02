package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.mondo.collaboration.policy.rules.User;

import com.google.common.collect.Sets;

import wt.Signal;

public class ReferenceSetChange extends AbstractChangeApplier {

	Collection<Signal> signals = Sets.newHashSet();
	
	public ReferenceSetChange(Resource model, int limit) {
		super(model, limit);
	}

	@Override
	public void apply() {
		for (Signal signal : signals) {
			rootComposite.getConsumes().add(signal);
		}
	}

	@Override
	public void revert() {
		for (Signal signal : signals) {
			rootComposite.getConsumes().remove(signal);
		}
	}

	@Override
	public void collect(Collection<User> collaborators) {
		TreeIterator<EObject> iterator = rootComposite.eAllContents();
		while (iterator.hasNext() && signals.size() < limit) {
			EObject object = iterator.next();
			if (object instanceof Signal) {
				Signal signal = (Signal) object;
				if (signal.eContainer() != rootComposite) {
					signals.add(signal);
				}
			}
		}
	}

	@Override
	public String getType() {
		return "SetRef";
	}

}
