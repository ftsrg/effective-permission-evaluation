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
	public static final int[] MODEL_SIZES = { 25, 50, 100, 200, 300 };
	public static final int[] LIMIT_SIZES = { 30 };
	public static final int[] USER_SIZES = { 5, 10, 30 };
	public static final int REPEAT = 10;

	public static void main(String[] args) throws ViatraQueryException {
		IncrementalEvaluation evaluation = new IncrementalEvaluation();

		System.out.println("Model_size;Limit_size;User_size;Eval_type;Time;Memory");
		for (int modelSize : MODEL_SIZES) {
			for (int limitSize : LIMIT_SIZES) {
				for (int userSize : USER_SIZES) {
					if (userSize > limitSize) {
						break;
					}
					String[] arguments = evaluation.getArguments(modelSize, limitSize, userSize, REPEAT, args);
					evaluation.evaluate(arguments);
				}
			}
		}

		// evaluation.evaluate(args);
	}

	@Override
	protected void doEvaluation() throws ViatraQueryException {
		System.gc();
		System.gc();
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		long startMemoryInit = runtime.totalMemory() - runtime.freeMemory();
		long startTimeInit = System.nanoTime();

		ViatraQueryEngine queryEngine = ViatraQueryEngine.on(new EMFScope(getModelResourceSet()));
		AdvancedViatraQueryEngine advancedQueryEngine = AdvancedViatraQueryEngine.from(queryEngine);

		Collection<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications = loadQuerySpecifications();
		Collection<IObservableList<?>> observables = Lists.newArrayList();
		for (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> querySpecification : querySpecifications) {
			observables.add(ViatraObservables.observeMatchesAsList(querySpecification, advancedQueryEngine));
		}

		long endTimeInit = System.nanoTime();
		long endMemoryInit = runtime.totalMemory() - runtime.freeMemory();
		double initTime = Math.round((endTimeInit - startTimeInit) * Math.pow(10, -6) * 100.0) / 100.0;
		double initMemory = Math.round((endMemoryInit - startMemoryInit) * Math.pow(10, -6) * 100.0) / 100.0;
		System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Init" + ";" + initTime
				+ ";" + initMemory);

		Collection<AbstractChangeApplier> appliers = Sets.newHashSet(
				new AttributeSetChange(getInstanceModelResource(), MODIFICATIONS),
				new CreationDeletionChange(getInstanceModelResource(), MODIFICATIONS),
				new ReferenceSetChange(getInstanceModelResource(), MODIFICATIONS));

		// for (IObservableList<?> observable : observables) {
		// for (Object object : observable) {
		// System.out.println(object);
		// }
		// }

		for (AbstractChangeApplier applier : appliers) {
			applier.collect(getCollaborators());

			System.gc();
			System.gc();
			System.gc();
			long startMemory = runtime.totalMemory() - runtime.freeMemory();
			long startTime = System.nanoTime();

			applier.apply();

			long midTime = System.nanoTime();
			long midMemory = runtime.totalMemory() - runtime.freeMemory();
			double applyTime = Math.round((midTime - startTime) * Math.pow(10, -6) * 100.0) / 100.0;
			double applyMemory = Math.round((midMemory - startMemory) * Math.pow(10, -6) * 100.0) / 100.0;
			System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Apply"
					+ getEvalType(applier) + ";" + applyTime + ";" + applyMemory);

			applier.revert();

			long endTime = System.nanoTime();
			long endMemory = runtime.totalMemory() - runtime.freeMemory();
			double revertTime = Math.round((endTime - midTime) * Math.pow(10, -6) * 100.0) / 100.0;
			double revertMemory = Math.round((endMemory - midMemory) * Math.pow(10, -6) * 100.0) / 100.0;
			System.out.println(getModelSize() + ";" + getLimitSize() + ";" + getUserSize() + ";" + "Revert"
					+ getEvalType(applier) + ";" + revertTime + ";" + revertMemory);
		}

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

	private String getEvalType(AbstractChangeApplier applier) {
		if (applier instanceof AttributeSetChange) {
			return "SetAttr";
		} else if (applier instanceof CreationDeletionChange) {
			return "CreateDel";
		} else if (applier instanceof ReferenceSetChange) {
			return "SetRef";
		}
		return null;
	}
}
