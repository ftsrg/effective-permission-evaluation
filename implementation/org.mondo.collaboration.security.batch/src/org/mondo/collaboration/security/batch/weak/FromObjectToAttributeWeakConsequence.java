package org.mondo.collaboration.security.batch.weak;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.IConsequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class FromObjectToAttributeWeakConsequence implements IConsequence {

	private FromObjectToAttributeWeakConsequence() {
	}
	
	public static IConsequence instance = new FromObjectToAttributeWeakConsequence();
	
	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ObjectAsset) {
			if(judgement.getAccess() != AccessibilityLevel.OBFUSCATE) {
				EObject source = ((ObjectAsset)judgement.getAsset()).getObject();
			    EList<EAttribute> eAllAttributes = source.eClass().getEAllAttributes();
		        for (EAttribute eAttribute : eAllAttributes) {
		    	    AttributeAsset attrAsset = new Asset.AttributeAsset(source, eAttribute);
		    	    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), attrAsset, 0));
		        }
		    }
		}
		
		return consequences;
	}

}
