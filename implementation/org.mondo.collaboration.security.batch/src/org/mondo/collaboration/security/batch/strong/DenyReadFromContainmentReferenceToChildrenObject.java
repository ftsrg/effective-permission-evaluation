package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.IConsequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class DenyReadFromContainmentReferenceToChildrenObject implements IConsequence{
	private DenyReadFromContainmentReferenceToChildrenObject() {
	}
	
	public static IConsequence instance = new DenyReadFromContainmentReferenceToChildrenObject();
	
	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ReferenceAsset) {
			if(judgement.getAccess() == AccessibilityLevel.DENY) {
				if(judgement.getOperation() == OperationType.READ) {
					EObject source = ((ReferenceAsset) judgement.getAsset()).getSource();
					EReference reference = ((ReferenceAsset) judgement.getAsset()).getReference();
					if(reference.isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> targets = (EList<EObject>) source.eGet(reference);
						for (EObject target : targets) {
							ObjectAsset objAsset = new Asset.ObjectAsset(target);
							consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset, judgement.getPriority()));
						}
					}
			    }
		    }
		}
		
		return consequences;
	}

}
