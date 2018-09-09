package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.weak.FromObjectToAttribute;

import com.google.common.collect.Sets;

public class FromObfuscateReadToDenyWrite extends Consequence{
	
	private FromObfuscateReadToDenyWrite() {
	}
	
	public static Consequence instance = new FromObfuscateReadToDenyWrite();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getAccess() == AccessibilityLevel.OBFUSCATE){
			consequences.add(new Judgement(AccessibilityLevel.DENY, OperationType.WRITE, judgement.getAsset(),
					         judgement.getPriority()));
		}
		
		return consequences;
	}

}
