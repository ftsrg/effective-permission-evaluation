package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Sets;

import wt.Signal;

public class ReferenceChange extends AbstractChange {

	Collection<Signal> signals = Sets.newHashSet();
	public static final ReferenceChange instance = new ReferenceChange();
	
	private ReferenceChange() {}

	@Override
	public void apply() {
		for (Signal signal : signals) {
			rootComposite.getConsumes().add(signal);
		}
	}

	@Override
	public void collect() {
		signals.clear();
		TreeIterator<EObject> iterator = rootComposite.eAllContents();
		while (signals.size() < limit) {
			EObject object = iterator.next();
			if (object instanceof Signal) {
				Signal signal = (Signal) object;
				signals.add(signal);			
			}
		}
	}

}
