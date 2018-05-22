package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import com.google.common.collect.Sets;

import wt.Signal;

public class ObjectChange extends AbstractChange {

	private Collection<Signal> signals = Sets.newHashSet();
	
	public static final ObjectChange instance = new ObjectChange();
	
	private ObjectChange() {}

	@Override
	public void apply() {
		for (Signal signal : signals) {
			rootComposite.getProvides().add(signal);			
		}
	}

	@Override
	public void collect() {
		signals.clear();
		for (int i = 0; i < limit; i++) {
			signals.add(wtFactory.createSignal());
		}
	}
}
