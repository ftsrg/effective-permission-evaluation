package org.mondo.collaboration.security.batch;

import java.util.ArrayList;
import java.util.Set;

import org.mondo.collaboration.security.batch.strong.AllowReadFromAttributeToContainerObject;
import org.mondo.collaboration.security.batch.strong.AllowReadFromObjectToContainer;
import org.mondo.collaboration.security.batch.strong.AllowReadFromObjectToIDAttribute;
import org.mondo.collaboration.security.batch.strong.AllowReadFromReferenceToSourceTargetObject;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromIDAttributeToObject;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromObjectToAllReferences;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromObjectToAttributes;
import org.mondo.collaboration.security.batch.strong.AllowWriteFromObjectToContainerReference;
import org.mondo.collaboration.security.batch.strong.DenyReadFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.security.batch.strong.DenyReadFromIDAttributeToContainerObject;
import org.mondo.collaboration.security.batch.strong.DenyReadFromObjectToAttribute;
import org.mondo.collaboration.security.batch.strong.DenyReadFromObjectToReference;
import org.mondo.collaboration.security.batch.strong.DenyWriteFromAttributeToObject;
import org.mondo.collaboration.security.batch.strong.DenyWriteFromContainerReferenceToChildrenObject;
import org.mondo.collaboration.security.batch.strong.DenyWriteFromObjectToContainerReference;
import org.mondo.collaboration.security.batch.strong.DenyWriteFromObjectToIDAttribute;
import org.mondo.collaboration.security.batch.strong.DenyWriteReferenceToSourceTargetObject;
import org.mondo.collaboration.security.batch.strong.FromAllowWriteToAllowRead;
import org.mondo.collaboration.security.batch.strong.FromDenyReadToDenyWrite;
import org.mondo.collaboration.security.batch.weak.FromObjectToAttribute;
import org.mondo.collaboration.security.batch.weak.FromObjectToContainedObject;
import org.mondo.collaboration.security.batch.weak.FromObjectToReference;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public abstract class Consequence {

	public abstract Set<Judgement> propagate(Judgement judgement);
	public void setRuleManager(RuleManager manager) {}
	
	public static final class DefaultConsequenceTypes {
		
		public static final ArrayList<Consequence> strongConsequences = Lists.newArrayList(
				AllowReadFromAttributeToContainerObject.instance,
				AllowReadFromObjectToContainer.instance,
				AllowReadFromObjectToIDAttribute.instance,
				AllowReadFromReferenceToSourceTargetObject.instance,
				AllowWriteFromContainmentReferenceToChildrenObject.instance,
				AllowWriteFromIDAttributeToObject.instance,
                AllowWriteFromObjectToContainerReference.instance,
                AllowWriteFromObjectToAttributes.instance,
                AllowWriteFromObjectToAllReferences.instance,
				DenyReadFromContainmentReferenceToChildrenObject.instance,
				DenyReadFromIDAttributeToContainerObject.instance,
                DenyReadFromObjectToReference.instance,
                DenyReadFromObjectToAttribute.instance,
                DenyWriteFromObjectToContainerReference.instance,
				DenyWriteFromObjectToIDAttribute.instance,
				DenyWriteFromContainerReferenceToChildrenObject.instance,
				DenyWriteFromAttributeToObject.instance,
				DenyWriteReferenceToSourceTargetObject.instance,
			    FromAllowWriteToAllowRead.instance,
			    FromDenyReadToDenyWrite.instance
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
