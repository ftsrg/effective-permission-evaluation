package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowWriteFromIDAttributeToContainerReference extends Consequence{
	private AllowWriteFromIDAttributeToContainerReference() {
	}
	
	public static Consequence instance = new AllowWriteFromIDAttributeToContainerReference();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getAsset() instanceof AttributeAsset) {
			if(judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if(judgement.getOperation() == OperationType.WRITE) {
					EAttribute attribute = ((AttributeAsset) judgement.getAsset()).getAttribute();
		        	EObject object = ((AttributeAsset) judgement.getAsset()).getSource();
		    		if(attribute.isID() && object.eContainmentFeature() != null){
		    			ReferenceAsset refAsset = new Asset.ReferenceAsset(object.eContainer(), object.eContainmentFeature(), object);
		    			consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority()));
		    		}
			    }
		    }
		}
		
		return consequences;
	}

}
