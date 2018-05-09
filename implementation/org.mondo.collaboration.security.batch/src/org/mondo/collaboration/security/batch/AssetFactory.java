package org.mondo.collaboration.security.batch;

import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.AttributeAsset;
import org.mondo.collaboration.security.batch.Asset.Factory;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.policy.rules.AttributeFact;
import org.mondo.collaboration.policy.rules.ModelFact;
import org.mondo.collaboration.policy.rules.ObjectFact;
import org.mondo.collaboration.policy.rules.ReferenceFact;
import org.mondo.collaboration.policy.rules.Rule;

public class AssetFactory {

	public static Factory factoryFrom(Rule rule) {
		ModelFact asset = rule.getAsset();
		if(asset instanceof ObjectFact){
			ObjectFact objFact = (ObjectFact) asset;
			int objectPos = rule.getPattern().getParameters().indexOf(objFact.getVariable());
			return ObjectAsset.factory(objectPos);
		}
			
		if(asset instanceof ReferenceFact){
			ReferenceFact refFact = (ReferenceFact) asset;
			int srcPos = rule.getPattern().getParameters().indexOf(refFact.getSourceVar());
			String featureName = refFact.getReference().getName();
			int trgPos = rule.getPattern().getParameters().indexOf(refFact.getTargetVar());
			return ReferenceAsset.factory(srcPos, featureName, trgPos);
		}
			
		if(asset instanceof AttributeFact){
			AttributeFact attrFact = (AttributeFact) asset;
			int srcPos = rule.getPattern().getParameters().indexOf(attrFact.getVariable());
			String featureName = attrFact.getAttribute().getName();
			return AttributeAsset.factory(srcPos, featureName);
		}
		
		throw new IllegalArgumentException();
	}
	
}
