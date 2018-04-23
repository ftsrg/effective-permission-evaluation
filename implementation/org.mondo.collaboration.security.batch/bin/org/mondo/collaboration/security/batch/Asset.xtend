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
	def abstract Tuple toTuple();
	def abstract void WriteOut();
	
    @Data public static class ObjectAsset extends Asset {
		EObject object
		
		override toTuple() {
			new FlatTuple(object)
		}
		def static Factory factory(int objectPos) {
			[#{new ObjectAsset(get(objectPos) as EObject)}] 
		}
		override WriteOut(){
			println(object.toString);
		}
		override equals(Object o){
			if(!(o instanceof ObjectAsset)){
				return false;
			} else {
				val objAsset = o as ObjectAsset;
				hashCode == objAsset.hashCode;
			}
			
		}
		override hashCode(){
			val prime = 31;
			var result = 1;
			result = prime * result + object.hashCode();
		}
	}
    
    @Data public static class ReferenceAsset extends Asset {
		EObject source
		EReference reference
		EObject target
		
		override toTuple() {
			new FlatTuple(source, reference, target)
		}
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
		override WriteOut(){
			println(source.toString + " -> " + target.toString + ": " + reference.name);
		}
		
		override equals(Object o){
			if(!(o instanceof ReferenceAsset)){
				return false;
			} else {
				val refAsset = o as ReferenceAsset;
				hashCode == refAsset.hashCode;
			}
			hashCode == o.hashCode;
		}
		
		override hashCode(){
			val prime = 31;
			var result = 1;
			result = prime * result + source.hashCode();
			result = prime * result + reference.hashCode();
			result = prime * result + target.hashCode();
		}
    }
    @Data public static class AttributeAsset extends Asset {
		EObject source
		EAttribute attribute
		
		override toTuple() {
			new FlatTuple(source, attribute)
		}	
		def static Factory factory(int sourcePos, EAttribute attribute) {
			[#{new AttributeAsset(get(sourcePos) as EObject, attribute)}] 
		}	
		def static Factory factory(int sourcePos, String attributeName) {
			[
				val src = get(sourcePos) as EObject
				val feature = src.eClass.getEStructuralFeature(attributeName)
				if (feature == null || !(feature instanceof EAttribute))
					throw new IllegalArgumentException('''Security Policy parsing error: No EAttribute of name «attributeName» found in EClass «src.eClass» of object «src»''')
				val attribute = feature as EAttribute
				#{new AttributeAsset(src, attribute)}
			] 
		}
		override WriteOut(){
			println(source.toString + ": " + attribute.name);
		}
		
		override equals(Object o){
			if(!(o instanceof AttributeAsset)){
				return false;
			} else {
				val attrAsset = o as AttributeAsset;
				hashCode == attrAsset.hashCode;
			}
		}
		
		override hashCode(){
			val prime = 31;
			var result = 1;
			result = prime * result + source.hashCode();
			result = prime * result + attribute.hashCode();
		}
    }
    
   public def static getKinds() {
		Asset.classes.filter[Asset.isAssignableFrom(it)].map[it as Class<? extends Asset>]
   }
    
   public static interface Factory extends Function<IPatternMatch, Set<? extends Asset>> {}
   
   def static Factory factoryFrom(IQuerySpecification<?> query) {
   		val objAnnotation = query.allAnnotations.findFirst[name == "SecurityObject"]
   		if (objAnnotation != null) {
			val objectPos = getParameterIndexFromAnnotationValue(objAnnotation, "object", query) 
			return ObjectAsset.factory(objectPos) 					
   		}
   		
   		val refAnnotation = query.allAnnotations.findFirst[name == "SecurityReference"]
   		if (refAnnotation != null) {
			val srcPos = getParameterIndexFromAnnotationValue(refAnnotation, "src", query) 
			val trgPos = getParameterIndexFromAnnotationValue(refAnnotation, "trg", query) 
			val featureName = refAnnotation.getFirstValue("feature") as String
			// TODO attempt to statically resolve EStructuralFeature instead for better performance?
			return ReferenceAsset.factory(srcPos, featureName, trgPos)  					
   		}
   		
   		val attrAnnotation = query.allAnnotations.findFirst[name == "SecurityAttribute"]
   		if (attrAnnotation != null) {
			val srcPos = getParameterIndexFromAnnotationValue(attrAnnotation, "src", query) 
			val featureName = attrAnnotation.getFirstValue("feature") as String
			// TODO attempt to statically resolve EStructuralFeature instead for better performance?
			return AttributeAsset.factory(srcPos, featureName)  					
   		}
   		
   		val simpleName = Splitter.on('.').split(query.fullyQualifiedName).last
   		if (simpleName.startsWith("object")) {
			return ObjectAsset.factory(0 /* first parameter is position */) 					
   		} else if (simpleName.startsWith("reference")) {
			// TODO attempt to statically resolve EStructuralFeature instead for better performance?
			return ReferenceAsset.factory(0, simpleName.substring("reference".length), 1)  					
   		} else if (simpleName.startsWith("attribute")) {
			// TODO attempt to statically resolve EStructuralFeature instead for better performance?
			return AttributeAsset.factory(0, simpleName.substring("attribute".length))  					
   		}

		throw new IllegalArgumentException(
		'''Pattern «query.fullyQualifiedName» unrecognizable as security asset specification without annotations or naming convention.''');
   	}
				
	private def static getParameterIndexFromAnnotationValue(PAnnotation annotation, String annotationValueName, IQuerySpecification<?> query) {
		val annotationValue = annotation.getFirstValue(annotationValueName)
		val paramName = switch annotationValue {
			ParameterReference : annotationValue.name
			String: annotationValue
			default : 
				throw new IllegalArgumentException(
					'''Annotation parameter '«annotationValueName»' not found for annotation @«annotation.name» on query «query.fullyQualifiedName».''')   					
		}
		if (paramName == null) 
			throw new IllegalArgumentException(
				'''Parameter name not given for annotation parameter '«annotationValueName»' of @«annotation.name» on query «query.fullyQualifiedName».''')   					
		val pos = query.getPositionOfParameter(paramName)
		if (pos == null)
			throw new IllegalArgumentException(
			'''Parameter name «paramName» (as indicated by annotation @«annotation.name») not found for query «query.fullyQualifiedName».''')
		pos
	}
}