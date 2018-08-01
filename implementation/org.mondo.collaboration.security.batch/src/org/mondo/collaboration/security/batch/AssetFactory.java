package org.mondo.collaboration.security.batch;

import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.mondo.collaboration.policy.delegation.delegation.Delegation;
import org.mondo.collaboration.policy.rules.AttributeFact;
import org.mondo.collaboration.policy.rules.ModelFact;
import org.mondo.collaboration.policy.rules.ObjectFact;
import org.mondo.collaboration.policy.rules.ReferenceFact;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.Factory;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;

public class AssetFactory {

	public static Factory factoryFrom(Rule rule) {
		return factoryFrom(rule.getAsset(), rule.getPattern());
	}
	
	public static Factory factoryFrom(Delegation delegation) {
		return factoryFrom(delegation.getAsset(), delegation.getPattern());
	}
	
	private static Factory factoryFrom (ModelFact asset, Pattern pattern) {
		if(asset instanceof ObjectFact){
			ObjectFact objFact = (ObjectFact) asset;
			int objectPos = pattern.getParameters().indexOf(objFact.getVariable());
			return ObjectAsset.factory(objectPos);
		}
			
		if(asset instanceof ReferenceFact){
			ReferenceFact refFact = (ReferenceFact) asset;
			int srcPos = pattern.getParameters().indexOf(refFact.getSourceVar());
			String featureName = refFact.getReference().getName();
			int trgPos = pattern.getParameters().indexOf(refFact.getTargetVar());
			return ReferenceAsset.factory(srcPos, featureName, trgPos);
		}
			
		if(asset instanceof AttributeFact){
			AttributeFact attrFact = (AttributeFact) asset;
			int srcPos = pattern.getParameters().indexOf(attrFact.getVariable());
			String featureName = attrFact.getAttribute().getName();
			return AttributeAsset.factory(srcPos, featureName);
		}
		
		throw new IllegalArgumentException();
	}
	
}
