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
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class AllowWriteFromIDAttributeToObject extends Consequence {
	private AllowWriteFromIDAttributeToObject() {
	}

	public static Consequence instance = new AllowWriteFromIDAttributeToObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof AttributeAsset) {
			if (judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if (judgement.getOperation() == OperationType.WRITE) {
					if (judgement.getBound() == BoundType.LOWER) {
						EAttribute attribute = ((AttributeAsset) judgement.getAsset()).getAttribute();
						if (attribute.isID()) {
						    EObject object = ((AttributeAsset) judgement.getAsset()).getSource();
						    ObjectAsset objAsset = new Asset.ObjectAsset(object);
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
