package org.mondo.collaboration.security.eval.change;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.mondo.collaboration.policy.rules.User;

import com.google.common.collect.Sets;

import wt.Composite;
import wt.Control;

public class AttributeSetChange extends AbstractChangeApplier {

	private Collection<Composite> composites = Sets.newHashSet();

	public AttributeSetChange(Resource model, int limit) {
		super(model, limit/2);
	}

	@Override
	public void collect(Collection<User> collaborators) {
		Set<String> ids = collaborators.stream().map(x -> x.getName().replace("user", "")).collect(toSet());

		TreeIterator<EObject> iterator = rootComposite.eAllContents();
		while (iterator.hasNext() && composites.size() < limit) {
			EObject object = iterator.next();
			if (object instanceof Control) {
				Control control = (Control) object;
				if (ids.contains(control.getType())) {
					composites.add((Composite) control.eContainer());
				}
			}
		}
	}

	@Override
	public void apply() {
		for (Composite composite : composites) {
			composite.setProtectedIP(!composite.isProtectedIP());
		}
	}

	@Override
	public void revert() {
		for (Composite composite : composites) {
			composite.setProtectedIP(!composite.isProtectedIP());
		}
	}

}
