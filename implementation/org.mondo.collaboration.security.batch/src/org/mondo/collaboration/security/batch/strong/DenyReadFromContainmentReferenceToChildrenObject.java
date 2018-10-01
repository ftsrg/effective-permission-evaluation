package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class DenyReadFromContainmentReferenceToChildrenObject extends Consequence {
	private DenyReadFromContainmentReferenceToChildrenObject() {
	}

	public static Consequence instance = new DenyReadFromContainmentReferenceToChildrenObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ReferenceAsset) {
			EReference reference = ((ReferenceAsset) judgement.getAsset()).getReference();
			if (reference.isContainment()) {
				if (judgement.getAccess() == AccessibilityLevel.DENY) {
					if (judgement.getOperation() == OperationType.READ) {
						if (judgement.getBound() == BoundType.UPPER) {
							EObject target = ((ReferenceAsset) judgement.getAsset()).getTarget();
							ObjectAsset objAsset = new Asset.ObjectAsset(target);
							consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset,
									judgement.getPriority(), judgement.getBound()));
						}
					}
				}
			}
		}

		return consequences;
	}

}
