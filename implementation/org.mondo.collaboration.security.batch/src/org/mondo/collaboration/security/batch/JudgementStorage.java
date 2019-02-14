package org.mondo.collaboration.security.batch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class JudgementStorage {
	private Logger LOGGER = Logger.getLogger(JudgementStorage.class);

	private Map<Asset, Map<OperationType, Multimap<BoundType, Judgement>>> permissionSet;
	private Map<Asset, Map<OperationType, Multimap<BoundType, Judgement>>> processed;
	private Multimap<Integer, Judgement> unprocessed;
	private ResolutionType resolution;

	public JudgementStorage(ResolutionType resolution) {
		this.resolution = resolution;
		permissionSet = Maps.newHashMap();
		processed = Maps.newHashMap();
		unprocessed = HashMultimap.create();
	}
	
	public boolean allJudgementProcessed() {
		return unprocessed.isEmpty();
	}

	public void add(Judgement judgement) {
		if (permissionSetContains(judgement)) {
			return;
		}
		addToPermissionSet(judgement);
		addToUnprocessed(judgement);
	}
	
	private void remove(Judgement judgement) {
		removeFromPermissionSet(judgement);
		removeFromUnprocessed(judgement);
	}
	
	public Judgement chooseDominant() {
		int priority = unprocessed.keySet().stream().max(Comparator.naturalOrder()).get();
		Judgement dominant = unprocessed.get(priority).iterator().next();
		process(dominant);
		return dominant;
	}
	
	private void process(Judgement judgement) {
		removeFromUnprocessed(judgement);
		addToProcessed(judgement);
	}
	
	public void resolveConflict(Judgement judgement) {
		Collection<Judgement> conflicts = getConflicts(judgement, permissionSet);
		for (Judgement other : Lists.newArrayList(conflicts)) {
			if (dominate(judgement, other)) {
				resolutionStep(judgement, other);
			} else {
			    final String msg = String.format(
			            "Resolution impossible: selected dominant judgement %s cannot overrule contradicting judgment %s", 
			            judgement, other);
                LOGGER.error(msg);
                throw new IllegalStateException(msg);
			}
		}
	}
	
	private Collection<Judgement> getConflicts(Judgement judgement,
			Map<Asset, Map<OperationType, Multimap<BoundType, Judgement>>> judgementMap) {
		Collection<Judgement> conflicts = new ArrayList<>();
		Map<OperationType, Multimap<BoundType, Judgement>> assetMap = judgementMap.get(judgement.getAsset());
		if (assetMap != null) {
			Multimap<BoundType, Judgement> operationMap = assetMap.get(judgement.getOperation());
			if (operationMap != null) {
				if (judgement.getBound().equals(BoundType.LOWER)) {
					conflicts = operationMap.values().stream()
							.filter(j -> j.getBound().equals(BoundType.UPPER)
									&& j.getAccess().getValue() < judgement.getAccess().getValue())
							.collect(Collectors.toList());
				} else {
					conflicts = operationMap.values().stream()
							.filter(j -> j.getBound().equals(BoundType.LOWER)
									&& j.getAccess().getValue() > judgement.getAccess().getValue())
							.collect(Collectors.toList());
				}
			}
		}
		return conflicts;
	}

	private boolean dominate(Judgement dominant, Judgement dominated) {
		if (dominant.getPriority() < dominated.getPriority())
			return false;
		if (dominant.getPriority() > dominated.getPriority())
			return true;

		if (resolution.equals(ResolutionType.PERMISSIVE))
			return dominant.getAccess().getValue() > dominated.getAccess().getValue();
		if (resolution.equals(ResolutionType.RESTRICTIVE))
			return dominant.getAccess().getValue() < dominated.getAccess().getValue();

		throw new IllegalArgumentException();
	}

	private void resolutionStep(Judgement dominant, Judgement dominated) {
		remove(dominated);
		int newPriority = dominated.getPriority();
		if (newPriority > Constants.WEAK_PRIORITY)
			newPriority = getNewPriority(dominant, dominated);
		Judgement newOther = new Judgement(dominant.getAccess(), dominated.getOperation(), dominated.getAsset(),
				newPriority, dominated.getBound());
		add(newOther);
	}
	
	// TODO diff is a bug 
	private int getNewPriority(Judgement dominant, Judgement dominated) {
		int oldPriority = dominated.getPriority();
		int diff = dominant.getAccess().getValue() - dominated.getAccess().getValue();

		if (resolution.equals(ResolutionType.PERMISSIVE)) {
			return oldPriority + diff;
		} else {
			return oldPriority - diff;
		}
	}
	
	public boolean conflictWithProcessed(Judgement judgement) {
		return !getConflicts(judgement, processed).isEmpty();
	}
	
	public List<Judgement> getEffectiveJudgements() {
		List<Judgement> effectiveJudgements = Lists.newArrayList();
		for (Map.Entry<Asset, Map<OperationType, Multimap<BoundType, Judgement>>> assetEntry : permissionSet
				.entrySet()) {
			Asset asset = assetEntry.getKey();
			for (Map.Entry<OperationType, Multimap<BoundType, Judgement>> operationEntry : assetEntry.getValue()
					.entrySet()) {
				OperationType operation = operationEntry.getKey();
				AccessibilityLevel highestLowerBound = getHighestLowerBound(
						operationEntry.getValue().get(BoundType.LOWER));
				AccessibilityLevel lowestUpperBound = getLowestUpperBound(
						operationEntry.getValue().get(BoundType.UPPER));
				if (highestLowerBound.equals(lowestUpperBound)) {
					effectiveJudgements.add(new Judgement(highestLowerBound, operation, asset));
				} else {
					final String msg = "Highest lower bound is not equal to the lowest upper bound: " + asset;
                    LOGGER.error(msg);
                    throw new IllegalStateException(msg);
				}
			}
		}
		return effectiveJudgements;
	}

	private AccessibilityLevel getHighestLowerBound(Collection<Judgement> judgements) {
		return judgements.stream().map(j -> j.getAccess()).max(Comparator.comparing(AccessibilityLevel::getValue))
				.get();
	}

	private AccessibilityLevel getLowestUpperBound(Collection<Judgement> judgements) {
		return judgements.stream().map(j -> j.getAccess()).min(Comparator.comparing(AccessibilityLevel::getValue))
				.get();
	}
	
	private boolean permissionSetContains(Judgement judgement) {
		return mapByAttributesContains(judgement, permissionSet);
	}

	private void addToPermissionSet(Judgement judgement) {
		addToMapByAttributes(judgement, permissionSet);
	}

	private void addToProcessed(Judgement judgement) {
		addToMapByAttributes(judgement, processed);
	}

	private void addToUnprocessed(Judgement judgement) {
		addToMapByDominance(judgement, unprocessed);
	}

	private boolean mapByAttributesContains(Judgement judgement,
			Map<Asset, Map<OperationType, Multimap<BoundType, Judgement>>> map) {
		if (map.containsKey(judgement.getAsset())) {
			Map<OperationType, Multimap<BoundType, Judgement>> assetMap = map.get(judgement.getAsset());
			if (assetMap.containsKey(judgement.getOperation())) {
				Multimap<BoundType, Judgement> operationMap = assetMap.get(judgement.getOperation());
				if (operationMap.containsKey(judgement.getBound())) {
					Collection<Judgement> judgements = operationMap.get(judgement.getBound());
					return judgements.contains(judgement);
				}
			}
		}
		return false;
	}

	private void addToMapByAttributes(Judgement judgement,
			Map<Asset, Map<OperationType, Multimap<BoundType, Judgement>>> map) {
		Map<OperationType, Multimap<BoundType, Judgement>> assetMap;
		if (map.containsKey(judgement.getAsset())) {
			assetMap = map.get(judgement.getAsset());
		} else {
			assetMap = new HashMap<>();
			map.put(judgement.getAsset(), assetMap);
		}

		Multimap<BoundType, Judgement> operationMap;
		if (assetMap.containsKey(judgement.getOperation())) {
			operationMap = assetMap.get(judgement.getOperation());
		} else {
			operationMap = HashMultimap.create();
			assetMap.put(judgement.getOperation(), operationMap);
		}

		operationMap.put(judgement.getBound(), judgement);
	}

	private void addToMapByDominance(Judgement judgement, Multimap<Integer, Judgement> map) {
		map.get(judgement.getPriority()).add(judgement);
	}

	private void removeFromPermissionSet(Judgement j) {
		if (!permissionSet.get(j.getAsset()).get(j.getOperation()).get(j.getBound()).remove(j)) {
		    final String msg = "Error removing from permissionSet";
            LOGGER.error(msg);
            throw new IllegalStateException(msg);
		    
		}
	}

	private void removeFromUnprocessed(Judgement judgement) {
		Collection<Judgement> judgements = unprocessed.get(judgement.getPriority());
		if (!judgements.remove(judgement)) {
			final String msg = "Error removing from unprocessed: " + judgement;
            LOGGER.error(msg);
            throw new IllegalStateException(msg);
		}
	}

	public int size() {
		int size = 0;
		for (Asset asset : permissionSet.keySet()) {
			Map<OperationType, Multimap<BoundType, Judgement>> assetMap = permissionSet.get(asset);
			for (OperationType operation : assetMap.keySet()) {
				Multimap<BoundType, Judgement> operationMap = assetMap.get(operation);
				size += operationMap.values().size();
			}
		}
		return size;
	}
	
	public void dispose() {
		permissionSet.clear();
		unprocessed.clear();
		processed.clear();
	}
}
