/*
 * generated by Xtext 2.12.0
 */
package org.mondo.collaboration.policy.scoping

import com.google.common.collect.Lists
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.ClassType
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.mondo.collaboration.policy.rules.AccessControlModel
import org.mondo.collaboration.policy.rules.AttributeFact
import org.mondo.collaboration.policy.rules.Binding
import org.mondo.collaboration.policy.rules.Import
import org.mondo.collaboration.policy.rules.ObjectFact
import org.mondo.collaboration.policy.rules.OperationType
import org.mondo.collaboration.policy.rules.ReferenceFact
import org.mondo.collaboration.policy.rules.Rule
import org.mondo.collaboration.policy.rules.RulesPackage

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class RulesScopeProvider extends AbstractRulesScopeProvider {

	override IScope getScope(EObject context, EReference reference) {
		if (reference == RulesPackage.eINSTANCE.getRule_Operation()) {
			if (context instanceof Rule) {
				val literals = Lists.newArrayList()
				for (EEnumLiteral literal : RulesPackage.eINSTANCE.getOperationType().getELiterals()) {
					if(!literal.getLiteral().equals(OperationType.UNSET)) literals.add(literal)
				}
				return Scopes.scopeFor(literals)
			}
		}
		if (reference == RulesPackage.eINSTANCE.getRule_Pattern() && context instanceof Rule) {
			return context.scopeRule_Pattern(reference)
		}
		if ((reference == RulesPackage.eINSTANCE.getBinding_Variable() && context instanceof Binding) ||
			(reference == RulesPackage.eINSTANCE.getObjectFact_Variable() && context instanceof ObjectFact) ||
			(reference == RulesPackage.eINSTANCE.getReferenceFact_SourceVar() && context instanceof ReferenceFact) ||
			(reference == RulesPackage.eINSTANCE.getReferenceFact_TargetVar() && context instanceof ReferenceFact) ||
			(reference == RulesPackage.eINSTANCE.getAttributeFact_Variable() && context instanceof AttributeFact)) {
			return context.scopeVariable(reference)
		}
		if (reference == RulesPackage.eINSTANCE.getReferenceFact_Reference() && context instanceof ReferenceFact) {
			return context.scopeReferenceFact_Reference(reference)
		}
		if (reference == RulesPackage.eINSTANCE.getAttributeFact_Attribute() && context instanceof AttributeFact) {
			return context.scopeAttributeFact_Attribute(reference)
		}
		return super.getScope(context, reference)
	}

	def TreeIterator<Notifier> queries(EObject context){
		val model = context.eResource().contents.get(0) as AccessControlModel
		val resourceSet = context.eResource.resourceSet
		for(Import im : model.imports) {
			resourceSet.getResource(URI.createFileURI(im.importURI), true)
		}
		return resourceSet.allContents
	}

	
	def IScope scopeRule_Pattern(EObject context, EReference reference) {
	    return Scopes.scopeFor(context.queries.filter(Pattern).toList)
	}
	
	def IScope scopeVariable(EObject context, EReference reference){
		val rule = context.eContainer() as Rule
		return Scopes.scopeFor(rule.pattern.parameters)
	}
	
	def IScope scopeReferenceFact_Reference(EObject context, EReference reference){
	    val refFact = context as ReferenceFact
	    val sourceClassType = refFact.getSourceVar().getType() as ClassType
	    val targetClassType =  refFact.getTargetVar().getType() as ClassType
	    val sourceParamClass = sourceClassType.getClassname() as EClass
	    val targetParamClassifier = targetClassType.getClassname() as EClassifier
	    val refs = Lists.newArrayList()
	    for(EReference ref : sourceParamClass.EAllReferences) {
	    	if(ref.getEType() == targetParamClassifier){
	    		refs.add(ref)
	    	}
	    }
	    return Scopes.scopeFor(refs)
	}
	
	def IScope scopeAttributeFact_Attribute(EObject context, EReference reference){
		val attrFact = context as AttributeFact
	    val varClassType = attrFact.getVariable().getType() as ClassType
	    val varClass = varClassType.getClassname() as EClass
	    return Scopes.scopeFor(varClass.EAllAttributes)
	}

}
