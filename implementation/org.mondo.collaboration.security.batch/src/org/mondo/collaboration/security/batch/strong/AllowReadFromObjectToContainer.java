package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowReadFromObjectToContainer extends Consequence {

	private AllowReadFromObjectToContainer() {
	}

	public static Consequence instance = new AllowReadFromObjectToContainer();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ObjectAsset) {
			if (judgement.getAccess() != AccessibilityLevel.DENY) {
				if (judgement.getOperation() == OperationType.READ) {
					if (judgement.getBound() == BoundType.LOWER) {
						EObject object = ((ObjectAsset) judgement.getAsset()).getObject();
						if (object.eContainer() != null) {
							ObjectAsset objAsset = new Asset.ObjectAsset(object.eContainer());
							consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(),
									objAsset, judgement.getPriority(), judgement.getBound()));
							ReferenceAsset refAsset = new Asset.ReferenceAsset(object.eContainer(),
									object.eContainmentFeature(), object);
							consequences.add(new Judgement(AccessibilityLevel.ALLOW, judgement.getOperation(), refAsset,
									judgement.getPriority(), judgement.getBound()));
						}
					}
				}
			}
		}

		return consequences;
	}

}
