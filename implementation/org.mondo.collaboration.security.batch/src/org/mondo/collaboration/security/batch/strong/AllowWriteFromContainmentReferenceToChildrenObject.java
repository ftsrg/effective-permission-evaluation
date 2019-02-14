package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowWriteFromContainmentReferenceToChildrenObject extends Consequence {
	private AllowWriteFromContainmentReferenceToChildrenObject() {
	}

	public static Consequence instance = new AllowWriteFromContainmentReferenceToChildrenObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ReferenceAsset) {
		    final ReferenceAsset asset = (ReferenceAsset) judgement.getAsset();
		    if (asset.getReference().isContainment()) {		        
		        if (judgement.getAccess() == AccessibilityLevel.ALLOW) {
		            if (judgement.getOperation() == OperationType.WRITE) {
		                if (judgement.getBound() == BoundType.LOWER) {
		                    EObject target = asset.getTarget();
		                    ObjectAsset objAsset = new Asset.ObjectAsset(target);
		                    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset,
		                            judgement.getPriority(), judgement.getBound()));
		                }
		            }
		        }
		    }
		}

		return consequences;
	}

}
