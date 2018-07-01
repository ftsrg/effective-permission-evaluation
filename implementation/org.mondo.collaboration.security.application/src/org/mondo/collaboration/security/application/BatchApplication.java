package org.mondo.collaboration.security.application;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.User;
import org.mondo.collaboration.security.application.query.util.FindObjectAssetWithoutRootQuerySpecification;
import org.mondo.collaboration.security.application.query.util.FindRootQuerySpecification;
import org.mondo.collaboration.security.application.query.util.InputOutputQuerySpecification;
import org.mondo.collaboration.security.application.query.util.NonInputOutputQuerySpecification;
import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.security.batch.Judgement;
import org.mondo.collaboration.security.batch.RuleManager;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class BatchApplication {
	private static Logger LOGGER = Logger.getLogger(BatchApplication.class);
	
	static Set<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>> querySpecifications;
	
	@SuppressWarnings("unchecked")
	static final IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> cast(IQuerySpecification<?> spec) {
		return (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) spec;
	}

	public static void main(String[] args) throws ViatraQueryException, IOException {
        ModelClass modelClass = new ModelClass();
        
		RuleManager ruleManager = new RuleManager(modelClass.getModelResource(), modelClass.getRuleModel(), modelClass.getDelegationModel());
		
		querySpecifications = Sets.<IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>>newHashSet(
				cast(FindRootQuerySpecification.instance()),
				cast(FindObjectAssetWithoutRootQuerySpecification.instance()),
				cast(InputOutputQuerySpecification.instance()),
				cast(NonInputOutputQuerySpecification.instance()));
		
		ruleManager.setQuerySpecifications(querySpecifications);
		
		ruleManager.initialize();
		

        // PrincipalEngineer: 0, SubsystemManager: 1, IOManager: 2
		Collection<Judgement> judgements = ruleManager
				.calculateEffectivePermissions((User) modelClass.getRuleModel().getRoles().get(2));
		
		LOGGER.info(String.format("Number of effective judgements: %d", judgements.size()));
		
		writeOutJudgements(judgements);
		
		ruleManager.dispose();
	}
	
	public static void writeOutJudgements(Collection<Judgement> judgements) {
		Map<Asset, Map<OperationType, AccessibilityLevel>> permissions = Maps.newHashMap();
		for (Judgement judgement : judgements) {
			Map<OperationType, AccessibilityLevel> operationMap = permissions.get(judgement.getAsset());
			if (operationMap == null) {
				operationMap = Maps.newHashMap();
				permissions.put(judgement.getAsset(), operationMap);
			}
			if (!operationMap.containsKey(judgement.getOperation())) {
				operationMap.put(judgement.getOperation(), judgement.getAccess());
			}
		}
		System.out.println(permissions);
	}
}
