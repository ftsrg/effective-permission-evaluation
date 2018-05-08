package org.mondo.collaboration.security.batch.strong;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ObjectAsset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.IConsequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

public class DenyReadFromObjectToReference implements IConsequence{
	private DenyReadFromObjectToReference() {
	}
	
	public static IConsequence instance = new DenyReadFromObjectToReference();


	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ObjectAsset) {
			if(judgement.getAccess() == AccessibilityLevel.DENY) {
				if(judgement.getOperation() == OperationType.READ) {
					EObject object = ((ObjectAsset)judgement.getAsset()).getObject();
				    
				    //incoming references
				    Collection<Setting> settings = EcoreUtil.CrossReferencer.find(Sets.newHashSet(object)).get(object);
				    //association
				    if(settings != null){
				        for (Setting setting : settings) {
					        EObject source = setting.getEObject();
					        EReference reference = (EReference) setting.getEStructuralFeature();
					        ReferenceAsset refAsset = new Asset.ReferenceAsset(source, reference, object);
					        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority()));
				        }
				    }
				    //containment reference
				    if(object.eContainer() != null){
					    ReferenceAsset refAsset = new Asset.ReferenceAsset(object.eContainer(), object.eContainmentFeature(), object);
				        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority()));
				    }
				    
				    // outgoing references
				    EList<EReference> eReferences = object.eClass().getEAllReferences();
				    for (EReference reference : eReferences) {
					    //containment
					    if(reference.isMany()) {
						    @SuppressWarnings("unchecked")
						    EList<EObject> targets = (EList<EObject>) object.eGet(reference);
						    for (EObject target : targets) {
							    ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
						        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority()));
						    }
				        //association
					    } else {
						    EObject target = (EObject) object.eGet(reference);
						    if(target != null){
						        ReferenceAsset refAsset = new Asset.ReferenceAsset(object, reference, target);
						        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority()));
						    }
					    }
				    }
				}
			}
		}
		    
		return consequences;
	}

}
