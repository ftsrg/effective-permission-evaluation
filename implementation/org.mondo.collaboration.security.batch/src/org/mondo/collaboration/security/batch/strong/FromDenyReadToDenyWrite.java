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

public class FromDenyReadToDenyWrite extends Consequence{
	
	private FromDenyReadToDenyWrite() {
	}
	
	public static Consequence instance = new FromDenyReadToDenyWrite();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getOperation() == OperationType.READ) {
			if(judgement.getAccess() == AccessibilityLevel.DENY) {
				if (judgement.getBound() == BoundType.UPPER) {
				consequences.add(new Judgement(judgement.getAccess(), OperationType.WRITE, judgement.getAsset(),
				         judgement.getPriority(), judgement.getBound()));
				}
		    }
		}
		
		return consequences;
	}

}
