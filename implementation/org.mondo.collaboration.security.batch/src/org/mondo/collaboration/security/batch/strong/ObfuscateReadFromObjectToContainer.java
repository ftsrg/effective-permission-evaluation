package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.BoundType;

import com.google.common.collect.Sets;

public class ObfuscateReadFromObjectToContainer extends Consequence {

	private ObfuscateReadFromObjectToContainer() {
	}

	public static Consequence instance = new ObfuscateReadFromObjectToContainer();

	@Override
	public Set<Judgement> propagate(Judgement judgement, ResolutionType resolution) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ObjectAsset) {
			if (judgement.getAccess() == AccessibilityLevel.OBFUSCATE) {
				EObject object = ((ObjectAsset) judgement.getAsset()).getObject();
				if (object.eContainer() != null) {
					ObjectAsset objAsset = new Asset.ObjectAsset(object.eContainer());
					consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset,
							judgement.getPriority(), judgement.getBound()));
					ReferenceAsset refAsset = new Asset.ReferenceAsset(object.eContainer(),
							object.eContainmentFeature(), object);
					int priority = judgement.getPriority();
					if (resolution.equals(ResolutionType.PERMISSIVE)) {
						priority += 1;
					} else if (resolution.equals(ResolutionType.RESTRICTIVE)) {
						priority -= 1;
					}
					consequences.add(new Judgement(AccessibilityLevel.ALLOW, judgement.getOperation(), refAsset,
							priority, judgement.getBound()));
				}
			}
		}

		return consequences;
	}
}
