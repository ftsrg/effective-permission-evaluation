package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowReadFromAttributeToContainerObject extends Consequence{
	private AllowReadFromAttributeToContainerObject() {
	}
	
	public static Consequence instance = new AllowReadFromAttributeToContainerObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getAsset() instanceof AttributeAsset){
			if(judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if(judgement.getOperation() == OperationType.READ) {
					ObjectAsset objAsset = new Asset.ObjectAsset(((AttributeAsset) judgement.getAsset()).getSource());
					consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), objAsset, judgement.getPriority()));
			    }
		    }
		}
		
		return consequences;
	}

}
