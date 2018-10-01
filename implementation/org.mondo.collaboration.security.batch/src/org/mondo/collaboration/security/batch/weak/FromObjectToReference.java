package org.mondo.collaboration.security.batch.weak;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Constants;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.RuleManager;

import com.google.common.collect.Sets;

public class FromObjectToReference extends Consequence {
	private FromObjectToReference() {
	}

	public static Consequence instance = new FromObjectToReference();
	private RuleManager manager;

	@Override
	public void setRuleManager(RuleManager manager) {
		this.manager = manager;
		super.setRuleManager(manager);
	}

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newLinkedHashSet();

		if (judgement.getAsset() instanceof ObjectAsset) {
			if (judgement.getAccess() == AccessibilityLevel.ALLOW) {
				EObject source = ((ObjectAsset) judgement.getAsset()).getObject();
				
				Collection<ReferenceAsset> outgoingReferences = manager.getOutgoingReferences(source);
				for (ReferenceAsset referenceAsset : outgoingReferences) {
					consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(),
							referenceAsset, Constants.WEAK_PRIORITY, judgement.getBound()));
				}
			}
		}

		return consequences;
	}
}
