package org.mondo.collaboration.security.eval;

import java.util.Collection;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.addon.databinding.runtime.api.ViatraObservables;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.eval.change.AbstractChangeApplier;
import org.mondo.collaboration.security.eval.change.AttributeSetChange;
import org.mondo.collaboration.security.eval.change.CreationDeletionChange;
import org.mondo.collaboration.security.eval.change.ReferenceSetChange;
import org.mondo.collaboration.security.increment.RulesGenerator;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class IncrementalEvaluation extends AbstractEvaluation {

	private static final int MODIFICATIONS = 20;
	private static final Realm realm = new DefaultRealm();
	
	public static void main(String[] args) throws ViatraQueryException {
		IncrementalEvaluation evaluation = new IncrementalEvaluation();
		evaluation.evaluate(args);
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(getModelResourceSet()));
		AdvancedViatraQueryEngine advancedQueryEngine = AdvancedViatraQueryEngine.from(queryEngine);
		
		Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications = loadQuerySpecifications();
		Collection<IObservableList<?>> observables = Lists.newArrayList();
		for (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification : querySpecifications) {
			observables.add(ViatraObservables.observeMatchesAsList(querySpecification, advancedQueryEngine));
		}
		
		Collection<AbstractChangeApplier> appliers = Sets.newHashSet(
				new AttributeSetChange(getInstanceModelResource(), MODIFICATIONS),
				new CreationDeletionChange(getInstanceModelResource(), MODIFICATIONS),
				new ReferenceSetChange(getInstanceModelResource(), MODIFICATIONS));

		for (IObservableList<?> observable : observables) {
			for (Object object : observable) {
				System.out.println(object);
			}
		}
		
		for (AbstractChangeApplier applier : appliers) {
			applier.collect(getCollaborators());
			applier.apply();
			applier.revert();
		}

	}

	private Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> loadQuerySpecifications() throws ViatraQueryException {
		Iterable<Pattern> effectivePermissionPatterns = null;
		for (String queryFile : RulesGenerator.collectVQLFiles(getAccessControlModel(), getInstanceModelResource())) {
			String path = String.format(Generator.INCREMENTAL_RULE_BASE_PATH + queryFile, getLimitSize(), getLimitSize());
			Resource model = getHelperResourceSet().getResource(URI.createURI(path), true);
			if (queryFile.equals(RulesGenerator.mainVQLFile(getAccessControlModel()))) {
				effectivePermissionPatterns = RulesGenerator.mainQuerySpecification((PatternModel) model.getContents().get(0));
			}
		}
		
		Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications = Lists.newArrayList();
		for (Pattern effectivePermissionPattern : effectivePermissionPatterns) {
			SpecificationBuilder builder = new SpecificationBuilder();
			@SuppressWarnings("unchecked")
			IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification = ((IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) builder
					.getOrCreateSpecification(effectivePermissionPattern));
			querySpecifications.add(querySpecification);
		}
		return querySpecifications;
	}

}
