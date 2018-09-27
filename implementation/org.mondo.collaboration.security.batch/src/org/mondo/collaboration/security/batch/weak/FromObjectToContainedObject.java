package org.mondo.collaboration.security.batch.weak;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Constants;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.BoundType;

import com.google.common.collect.Sets;

public class FromObjectToContainedObject extends Consequence {
	private FromObjectToContainedObject() {
	}

	public static Consequence instance = new FromObjectToContainedObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement, ResolutionType resolution) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ObjectAsset) {
			if (judgement.getAccess() == AccessibilityLevel.ALLOW) {
				EObject source = ((ObjectAsset) judgement.getAsset()).getObject();
				EList<EReference> eReferences = source.eClass().getEAllReferences();
				for (EReference reference : eReferences) {
					if (reference.isContainment()) {
						if (reference.isMany()) {
							@SuppressWarnings("unchecked")
							EList<EObject> targets = (EList<EObject>) source.eGet(reference);
							for (EObject target : targets) {
								ObjectAsset objAsset = new Asset.ObjectAsset(target);
								consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset,
										Constants.WEAK_PRIORITY, judgement.getBound()));
							}
						} else {
							EObject target = (EObject) source.eGet(reference);
							if (target != null) {
								ObjectAsset objAsset = new Asset.ObjectAsset(target);
								consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset,
										Constants.WEAK_PRIORITY, judgement.getBound()));
							}
						}
						
					}
				}
			}
		}

		return consequences;
	}
}
