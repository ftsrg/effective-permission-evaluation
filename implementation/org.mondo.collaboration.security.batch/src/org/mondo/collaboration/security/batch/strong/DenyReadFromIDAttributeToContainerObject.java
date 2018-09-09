package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class DenyReadFromIDAttributeToContainerObject extends Consequence{
	private DenyReadFromIDAttributeToContainerObject() {
	}
	
	public static Consequence instance = new DenyReadFromIDAttributeToContainerObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if(judgement.getAsset() instanceof AttributeAsset) {
			if(judgement.getAccess() == AccessibilityLevel.DENY) {
				if(judgement.getOperation() == OperationType.READ) {
					EAttribute attribute = ((AttributeAsset) judgement.getAsset()).getAttribute();
		        	EObject object = ((AttributeAsset) judgement.getAsset()).getSource();
		    		if(attribute.isID()){
		    			ObjectAsset objAsset = new Asset.ObjectAsset(object);
		    			consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset, judgement.getPriority()));
		    		}
			    }
		    }
		}
		
		return consequences;
	}
}
