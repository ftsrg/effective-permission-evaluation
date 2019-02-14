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

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Asset.ReferenceAsset;
import org.mondo.collaboration.security.batch.BoundType;
import org.mondo.collaboration.security.batch.Consequence;
import org.mondo.collaboration.security.batch.Judgement;

import com.google.common.collect.Sets;

/**
 * @author Gabor Bergmann
 *
 */
public class DenyWriteReferenceToSourceTargetObject extends Consequence {
    private DenyWriteReferenceToSourceTargetObject() {
    }

    public static Consequence instance = new DenyWriteReferenceToSourceTargetObject();

    @Override
    public Set<Judgement> propagate(Judgement judgement) {
        HashSet<Judgement> consequences = Sets.newLinkedHashSet();

        if (judgement.getAsset() instanceof ReferenceAsset) {
            if (judgement.getAccess() == AccessibilityLevel.DENY) {
                if (judgement.getOperation() == OperationType.WRITE) {
                    if (judgement.getBound() == BoundType.UPPER) {
                        EObject source = ((ReferenceAsset) judgement.getAsset()).getSource();
                        EObject target = ((ReferenceAsset) judgement.getAsset()).getTarget();
                        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(),
                                new Asset.ObjectAsset(source), judgement.getPriority(), judgement.getBound()));
                        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(),
                                new Asset.ObjectAsset(target), judgement.getPriority(), judgement.getBound()));
                    }
                }
            }
        }

        return consequences;
    }

}
