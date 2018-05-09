/*******************************************************************************
 * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.batch

import com.google.common.base.Function
import com.google.common.base.Splitter
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple

/**
 * An asset represents something that policy rules can permit/deny access to.
 * @author Bergmann Gabor
 *
 */
abstract class Asset {	
	
	@Data public static class ObjectAsset extends Asset {
		EObject object
		
		def static Factory factory(int objectPos) {
			[#{new ObjectAsset(get(objectPos) as EObject)}] 
		}
	
		override equals(Object o){
			if(!(o instanceof ObjectAsset)){
				return false;
			} else {
				val objAsset = o as ObjectAsset;
				return hashCode == objAsset.hashCode;
			}
			
		}
		override hashCode(){
			val prime = 31;
			var result = 1;
			result = prime * result + object.hashCode();
			return result
		}
	}
    
    @Data public static class ReferenceAsset extends Asset {
		EObject source
		EReference reference
		EObject target
		
		def static Factory factory(int sourcePos, EReference reference, int targetPos) {
			val opposite = reference.EOpposite
			if (opposite == null)
				[#{new ReferenceAsset(get(sourcePos) as EObject, reference, get(targetPos) as EObject)}] 
			else
				[
					val src = get(sourcePos) as EObject
					val trg = get(targetPos) as EObject
					#{new ReferenceAsset(src, reference, trg), new ReferenceAsset(trg, opposite, src)}
				]  
		}
		def static Factory factory(int sourcePos, String referenceName, int targetPos) {
			[
				val src = get(sourcePos) as EObject
				val trg = get(targetPos) as EObject
				val feature = src.eClass.getEStructuralFeature(referenceName)
				if (feature == null || !(feature instanceof EReference))
					throw new IllegalArgumentException('''Security Policy parsing error: No EReference of name «referenceName» found in EClass «src.eClass» of object «src»''')
				val reference = feature as EReference
				val opposite = reference.EOpposite
				if (opposite == null)
					#{new ReferenceAsset(src, reference, trg)}
				else
					#{new ReferenceAsset(src, reference, trg), new ReferenceAsset(trg, opposite, src)}
			]
		}
		
		override equals(Object o){
			if(!(o instanceof ReferenceAsset)){
				return false;
			} else {
				val refAsset = o as ReferenceAsset;
				return hashCode == refAsset.hashCode;
			}
		}
		
		override hashCode(){
			val prime = 31;
			var result = 1;
			result = prime * result + source.hashCode();
			result = prime * result + reference.hashCode();
			result = prime * result + target.hashCode();
			return result
		}
    }
    @Data public static class AttributeAsset extends Asset {
		EObject source
		EAttribute attribute
		
		def static Factory factory(int sourcePos, EAttribute attribute) {
			[#{new AttributeAsset(get(sourcePos) as EObject, attribute)}] 
		}	
		def static Factory factory(int sourcePos, String attributeName) {
			[
				val src = get(sourcePos) as EObject
				val feature = src.eClass.getEStructuralFeature(attributeName)
				if (feature === null || !(feature instanceof EAttribute))
					throw new IllegalArgumentException('''Security Policy parsing error: No EAttribute of name «attributeName» found in EClass «src.eClass» of object «src»''')
				val attribute = feature as EAttribute
				#{new AttributeAsset(src, attribute)}
			] 
		}
	
		override equals(Object o){
			if(!(o instanceof AttributeAsset)){
				return false;
			} else {
				val attrAsset = o as AttributeAsset;
				return hashCode == attrAsset.hashCode;
			}
		}
		
		override hashCode(){
			val prime = 31;
			var result = 1;
			result = prime * result + source.hashCode();
			result = prime * result + attribute.hashCode();
			return result
		}
    }
    
   public static interface Factory extends Function<IPatternMatch, Set<? extends Asset>> {}

}