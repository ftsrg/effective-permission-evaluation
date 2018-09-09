package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class FromAllowWriteToAllowRead extends Consequence{
	
	private FromAllowWriteToAllowRead() {
	}
	
	public static Consequence instance = new FromAllowWriteToAllowRead();


	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getOperation() == OperationType.WRITE) {
			if(judgement.getAccess() == AccessibilityLevel.ALLOW) {
				consequences.add(new Judgement(judgement.getAccess(), OperationType.READ, judgement.getAsset(),
				         judgement.getPriority()));
		    }
		}
		
		return consequences;
	}

}
