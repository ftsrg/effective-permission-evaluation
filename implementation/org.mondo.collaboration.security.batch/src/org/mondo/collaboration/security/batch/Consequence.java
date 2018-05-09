package org.mondo.collaboration.security.batch;

import java.util.Set;

import org.mondo.collaboration.security.batch.strong.AllowReadFromAttributeToContainerObject;
import org.mondo.collaboration.security.batch.strong.AllowReadFromObjectToContainer;
import org.mondo.collaboration.security.batch.strong.AllowReadFromObjectToIDAttribute;
import org.mondo.collaboration.security.batch.strong.AllowReadFromReferenceToSourceTargetObject;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromIDAttributeToContainerReference;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromObjectToContainerReference;
import org.mondo.collaboration.security.batch.strong.DenyReadFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.security.batch.strong.DenyReadFromIDAttributeToContainerObject;
import org.mondo.collaboration.security.batch.strong.DenyReadFromObjectToReference;
import org.mondo.collaboration.security.batch.strong.DenyWriteFromContainerReferenceToChildrenIDAttribute;
import org.mondo.collaboration.security.batch.strong.FromAllowWriteToAllowRead;
import org.mondo.collaboration.security.batch.strong.FromDenyReadToDenyWrite;
import org.mondo.collaboration.security.batch.strong.FromObfuscateReadToDenyWrite;
import org.mondo.collaboration.security.batch.strong.ObfuscateReadFromObjectToAttribute;
import org.mondo.collaboration.security.batch.weak.FromObjectToAttributeWeakConsequence;
import org.mondo.collaboration.security.batch.weak.FromObjectToReferenceWeakConsequence;

import com.google.common.collect.Sets;

public abstract class Consequence {

	public abstract Set<Judgement> propagate(Judgement judgement);
	public void setRuleManager(RuleManager manager) {}
	
	public static final class DefaultConsequenceTypes {
		
		public static final Set<Consequence> DefaultStrongConsequences = Sets.newHashSet(
			    FromAllowWriteToAllowRead.instance,
			    FromDenyReadToDenyWrite.instance,
			    FromObfuscateReadToDenyWrite.instance,
			    ObfuscateReadFromObjectToAttribute.instance,
				AllowReadFromObjectToContainer.instance,
				AllowReadFromObjectToIDAttribute.instance,
				AllowWriteFromObjectToContainerReference.instance,
				//DenyReadFromObjectToReference.instance,
				AllowReadFromReferenceToSourceTargetObject.instance,
				DenyReadFromContainmentReferenceToChildrenObject.instance,
				DenyWriteFromContainerReferenceToChildrenIDAttribute.instance,
				AllowWriteFromContainmentReferenceToChildrenObject.instance,
				AllowReadFromAttributeToContainerObject.instance,
			    AllowWriteFromIDAttributeToContainerReference.instance,
			    DenyReadFromIDAttributeToContainerObject.instance
			);
		
		public static final Set<Consequence> DefaultWeakConsequences = Sets.newHashSet(
			    FromObjectToAttributeWeakConsequence.instance,
			    FromObjectToReferenceWeakConsequence.instance
			);
		
	}
}
