package org.mondo.collaboration.security.eval;

import java.util.Collection;

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
import org.mondo.collaboration.security.increment.RulesGenerator;

import com.google.common.collect.Lists;

public class IncrementalEvaluation extends AbstractEvaluation {

	private long changeMemoryUsage;
	private long changeTime;

	private long initMemoryUsage;
	private long initTime;

	public static void main(String[] args) throws ViatraQueryException {
		new DefaultRealm();
		AbstractEvaluation evaluation = new IncrementalEvaluation();

		for (int modelSize : MODEL_SIZES) {
			for (int limitSize : LIMIT_SIZES) {
				for (int userSize : USER_SIZES) {
					if (userSize > limitSize) {
						break;
					}
					String[] arguments = evaluation.emulateArguments(modelSize, limitSize, userSize, REPEAT, true, true,
							args);
					evaluation.evaluate(arguments);
				}
			}
		}
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		initMemoryUsage = currentMemoryUsage();
		initTime = currentTime();

		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(getModelResourceSet()));
		AdvancedViatraQueryEngine advancedQueryEngine = AdvancedViatraQueryEngine.from(queryEngine);

		Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications = loadQuerySpecifications();
		Collection<IObservableList<?>> observables = Lists.newArrayList();
		for (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification : querySpecifications) {
			for (int i = 1; i <= getUserSize(); i++) {
				IPatternMatch filter = querySpecification.newEmptyMatch();
				filter.set("user", "user_" + i);
				observables.add(ViatraObservables.observeMatchesAsList(querySpecification, advancedQueryEngine,
						filter.toImmutable()));
			}
		}

		initMemoryUsage = changeMemoryUsage - initMemoryUsage;
		initTime = currentTime() - initTime;

		advancedQueryEngine.dispose();
	}

	private Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> loadQuerySpecifications()
			throws ViatraQueryException {
		Iterable<Pattern> effectivePermissionPatterns = null;
		for (String queryFile : RulesGenerator.collectVQLFiles(getAccessControlModel(), getInstanceModelResource())) {
			String path = String.format(Generator.INCREMENTAL_RULE_BASE_PATH + queryFile, getLimitSize(),
					getLimitSize());
			Resource model = getHelperResourceSet().getResource(URI.createURI(path), true);
			if (queryFile.equals(RulesGenerator.mainVQLFile(getAccessControlModel()))) {
				effectivePermissionPatterns = RulesGenerator
						.mainQuerySpecification((PatternModel) model.getContents().get(0));
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

	@Override
	protected void beforeChangeExecution() {
		changeMemoryUsage = currentMemoryUsage();
		changeTime = currentTime();
	}

	@Override
	protected void afterChangeExecution() {
		changeTime = currentTime() - changeTime;
		changeMemoryUsage = currentMemoryUsage() - changeMemoryUsage;
	}

	@Override
	protected void printResults() {
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Init" + ";" + initTime
				+ ";" + initMemoryUsage);
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Change" + ";" + changeTime
				+ ";" + changeMemoryUsage);
	}
}
