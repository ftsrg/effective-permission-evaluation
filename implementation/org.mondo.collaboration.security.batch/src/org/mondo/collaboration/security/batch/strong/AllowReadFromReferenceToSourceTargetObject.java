package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowReadFromReferenceToSourceTargetObject extends Consequence {
	private AllowReadFromReferenceToSourceTargetObject() {
	}

	public static Consequence instance = new AllowReadFromReferenceToSourceTargetObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement, ResolutionType resolution) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ReferenceAsset) {
			if (judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if (judgement.getOperation() == OperationType.READ) {
					if (judgement.getBound() == BoundType.LOWER) {
						EObject source = ((ReferenceAsset) judgement.getAsset()).getSource();
						EObject target = ((ReferenceAsset) judgement.getAsset()).getTarget();
						int priority = judgement.getPriority();
						if (resolution.equals(ResolutionType.PERMISSIVE)) {
							priority -= 1;
						} else if (resolution.equals(ResolutionType.RESTRICTIVE)) {
							priority += 1;
						}
						consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(),
								new Asset.ObjectAsset(source), priority, judgement.getBound()));
						consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(),
								new Asset.ObjectAsset(target), priority, judgement.getBound()));
					}
				}
			}
		}

		return consequences;
	}

}
