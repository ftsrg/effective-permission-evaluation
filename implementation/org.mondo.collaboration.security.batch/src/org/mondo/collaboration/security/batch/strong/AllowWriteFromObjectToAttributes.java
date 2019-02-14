/*******************************************************************************
 * Copyright (c) 2010-2019, Gabor Bergmann, IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabor Bergmann - initial API and implementation
 *******************************************************************************/
package org.mondo.collaboration.security.batch.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
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

/**
 * @author Gabor Bergmann
 *
 */
public class AllowWriteFromObjectToAttributes extends Consequence {
    private AllowWriteFromObjectToAttributes() {
    }

    public static Consequence instance = new AllowWriteFromObjectToAttributes();

    @Override
    public Set<Judgement> propagate(Judgement judgement) {
        HashSet<Judgement> consequences = Sets.newLinkedHashSet();

        if (judgement.getAsset() instanceof ObjectAsset) {
            if (judgement.getAccess() == AccessibilityLevel.ALLOW) {
                if (judgement.getOperation() == OperationType.WRITE) {
                    if (judgement.getBound() == BoundType.LOWER) {
                        EObject object = ((ObjectAsset) judgement.getAsset()).getObject();
                        EList<EAttribute> eAllAttributes = object.eClass().getEAllAttributes();
                        for (EAttribute eAttribute : eAllAttributes) {
                            AttributeAsset attrAsset = new Asset.AttributeAsset(object, eAttribute);
                            consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(),
                                    attrAsset, judgement.getPriority(), judgement.getBound()));
                        }
                    }
                }
            }
        }

        return consequences;
    }
}
