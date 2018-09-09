package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowReadFromReferenceToSourceTargetObject extends Consequence{
	private AllowReadFromReferenceToSourceTargetObject() {
	}
	
	public static Consequence instance = new AllowReadFromReferenceToSourceTargetObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getAsset() instanceof ReferenceAsset) {
			if(judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if(judgement.getOperation() == OperationType.READ){
					EObject source = ((ReferenceAsset) judgement.getAsset()).getSource();
		        	EObject target= ((ReferenceAsset) judgement.getAsset()).getTarget();
		        	consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), new Asset.ObjectAsset(source), judgement.getPriority()));
		        	consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), new Asset.ObjectAsset(target), judgement.getPriority()));
			    }
		    }
		}
		
		return consequences;
	}

}
