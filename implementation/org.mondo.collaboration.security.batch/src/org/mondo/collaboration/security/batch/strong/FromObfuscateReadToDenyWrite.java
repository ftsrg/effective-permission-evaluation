package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.weak.FromObjectToAttribute;

import com.google.common.collect.Sets;

public class FromObfuscateReadToDenyWrite extends Consequence {

	private FromObfuscateReadToDenyWrite() {
	}

	public static Consequence instance = new FromObfuscateReadToDenyWrite();

	@Override
	public Set<Judgement> propagate(Judgement judgement, ResolutionType resolution) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAccess() == AccessibilityLevel.OBFUSCATE) {
			int priority = judgement.getPriority();
			if (resolution.equals(ResolutionType.PERMISSIVE)) {
				priority -= 1;
			} else if (resolution.equals(ResolutionType.RESTRICTIVE)) {
				priority += 1;
			}
			consequences.add(new Judgement(AccessibilityLevel.DENY, OperationType.WRITE, judgement.getAsset(), priority,
					judgement.getBound()));
		}

		return consequences;
	}

}
