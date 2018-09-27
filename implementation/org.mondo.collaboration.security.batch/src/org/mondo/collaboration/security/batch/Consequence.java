package org.mondo.collaboration.security.batch;

import java.util.ArrayList;
import java.util.Set;

import org.mondo.collaboration.policy.rules.ResolutionType;
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
import org.mondo.collaboration.security.batch.strong.ObfuscateReadFromObjectToContainer;
import org.mondo.collaboration.security.batch.weak.FromObjectToAttribute;
import org.mondo.collaboration.security.batch.weak.FromObjectToContainedObject;
import org.mondo.collaboration.security.batch.weak.FromObjectToReference;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public abstract class Consequence {

	public abstract Set<Judgement> propagate(Judgement judgement, ResolutionType reoslution);
	public void setRuleManager(RuleManager manager) {}
	
	public static final class DefaultConsequenceTypes {
		
		public static final ArrayList<Consequence> strongConsequences = Lists.newArrayList(
				AllowReadFromAttributeToContainerObject.instance,
				AllowReadFromObjectToContainer.instance,
				AllowReadFromObjectToIDAttribute.instance,
				AllowReadFromReferenceToSourceTargetObject.instance,
				AllowWriteFromContainmentReferenceToChildrenObject.instance,
				AllowWriteFromIDAttributeToContainerReference.instance,
				AllowWriteFromObjectToContainerReference.instance,
				DenyReadFromContainmentReferenceToChildrenObject.instance,
				DenyReadFromIDAttributeToContainerObject.instance,
				DenyReadFromObjectToReference.instance,
				DenyWriteFromContainerReferenceToChildrenIDAttribute.instance,
			    FromAllowWriteToAllowRead.instance,
			    FromDenyReadToDenyWrite.instance,
			    FromObfuscateReadToDenyWrite.instance,
			    ObfuscateReadFromObjectToAttribute.instance,
			    ObfuscateReadFromObjectToContainer.instance
			);
		
		public static final Set<Consequence> DefaultStrongConsequences = Sets.newLinkedHashSet(strongConsequences);
		
		public static final ArrayList<Consequence> weakConsequences = Lists.newArrayList(
			    FromObjectToAttribute.instance,
			    FromObjectToContainedObject.instance,
			    FromObjectToReference.instance
			);
		
		public static final Set<Consequence> DefaultWeakConsequences = Sets.newLinkedHashSet(weakConsequences);
	}
}
