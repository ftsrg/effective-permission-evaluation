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
public class DenyWriteFromAttributeToObject extends Consequence {

    private DenyWriteFromAttributeToObject() {
    }

    public static Consequence instance = new DenyWriteFromAttributeToObject();

    @Override
    public Set<Judgement> propagate(Judgement judgement) {
        HashSet<Judgement> consequences = Sets.newLinkedHashSet();

        if (judgement.getAsset() instanceof AttributeAsset) {
            if (judgement.getAccess() == AccessibilityLevel.DENY) {
                if (judgement.getOperation() == OperationType.WRITE) {
                    if (judgement.getBound() == BoundType.UPPER) {
                        ObjectAsset objAsset = new Asset.ObjectAsset(
                                ((AttributeAsset) judgement.getAsset()).getSource());
                        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset,
                                judgement.getPriority(), judgement.getBound()));
                    }
                }
            }
        }

        return consequences;
    }

}
