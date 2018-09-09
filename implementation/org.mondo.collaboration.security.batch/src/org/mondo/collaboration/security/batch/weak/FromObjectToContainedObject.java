package org.mondo.collaboration.security.batch.weak;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;

import com.google.common.collect.Sets;

public class FromObjectToContainedObject extends Consequence {
	private FromObjectToContainedObject() {
	}

	public static Consequence instance = new FromObjectToContainedObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ObjectAsset) {
			if (judgement.getAccess() != AccessibilityLevel.OBFUSCATE) {
				EObject source = ((ObjectAsset) judgement.getAsset()).getObject();
				EList<EReference> eReferences = source.eClass().getEAllReferences();
				for (EReference reference : eReferences) {
					if(reference.isMany()) {
					    @SuppressWarnings("unchecked")
					    EList<EObject> targets = (EList<EObject>) source.eGet(reference);
					    for (EObject target : targets) {
					    	ObjectAsset objAsset = new Asset.ObjectAsset(target);
						    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset, 0));
					    }
				    }
				}
			}
		}

		return consequences;
	}
}
