package org.mondo.collaboration.security.eval.change;

import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Sets;

import wt.Composite;

public class AttributeChange extends AbstractChange {

	private Collection<Composite> composites = Sets.newHashSet();
	public static final AttributeChange instance = new AttributeChange();
	
	
	private AttributeChange() {}
	

	@Override
	public void apply() {
		for (Composite composite : composites) {
			composite.setProtectedIP(!composite.isProtectedIP());
		}
	}
	
	@Override
	public void collect() {	
		composites.clear();
		TreeIterator<EObject> iterator = rootComposite.eAllContents();
		while (composites.size() < limit) {
			EObject object = iterator.next();
			if (object instanceof Composite) {
				composites.add((Composite) object);
			}
		}
	}

}
