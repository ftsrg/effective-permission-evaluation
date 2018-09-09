package org.mondo.collaboration.security.batch;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class JudgementStorage {

	Map<Asset, Map<OperationType, Multimap<AccessibilityLevel, Judgement>>> judgementsByAttributes;
	Multimap<Integer, Judgement> judgementsByPriorities;
	ResolutionType resolution;
	
	public JudgementStorage(ResolutionType resolution) {
		this.resolution = resolution;
		judgementsByAttributes = Maps.newHashMap();
		judgementsByPriorities = LinkedListMultimap.create();
	}
	
	public boolean isEmpty() {
		return judgementsByPriorities.isEmpty();
	}
	
	public void add(Judgement j) {
		if(judgementsByPriorities.containsValue(j))
			return;
		
		Map<OperationType, Multimap<AccessibilityLevel, Judgement>> assetMap;
		if(judgementsByAttributes.containsKey(j.getAsset())) {
			assetMap = judgementsByAttributes.get(j.getAsset());
		} else {
			assetMap = new HashMap<>();
			judgementsByAttributes.put(j.getAsset(), assetMap);
		}
		
		Multimap<AccessibilityLevel, Judgement> operationMap;
		if(assetMap.containsKey(j.getOperation())) {
			operationMap = assetMap.get(j.getOperation());
		} else {
			operationMap = ArrayListMultimap.create();
			assetMap.put(j.getOperation(), operationMap);
		}
		operationMap.put(j.getAccess(), j);
		
		List<Judgement> judgements = (List<Judgement>) judgementsByPriorities.get(j.getPriority());
		judgements.add(0, j);
	}
	
	public void remove(Judgement j) {
		if(!judgementsByAttributes
					.get(j.getAsset())
					.get(j.getOperation())
					.get(j.getAccess())
					.remove(j)) 
			System.out.println("Error removing from Map");
		if(!judgementsByPriorities.get(j.getPriority()).remove(j)) {
			System.out.println("Error removing from Prio");
		}
	}
	
	public void removeInternal(Judgement j) {
		if(!judgementsByAttributes
					.get(j.getAsset())
					.get(j.getOperation())
					.get(j.getAccess())
					.remove(j)) 
			System.out.println("Error internal removing from Map");
		if(!judgementsByPriorities.get(j.getPriority()).remove(j)) {
			System.out.println("Error internal removing from Prio");
		}
	}
	
	public Collection<Judgement> getJudgements() {
		return judgementsByPriorities.values();
	}
	
	public Judgement last() {
		Integer priority = judgementsByPriorities.keySet().stream().max(Comparator.naturalOrder()).get();
		return judgementsByPriorities.get(priority).iterator().next();
	}
	
	public int size() {
		return judgementsByPriorities.size();
	}
	
	public Judgement resolveConflict(Judgement judgement) {
		Judgement dominator = judgement;
		Collection<Judgement> conflicts = judgementsByAttributes.get(judgement.getAsset())
																.get(judgement.getOperation())
																.values();
		for (Judgement other : Lists.newArrayList(conflicts)) {
			if(dominate(other, dominator)) { 
				dominator = other;
			}	
			removeInternal(other);
		}
		return dominator;
	}
	
	private boolean dominate(Judgement o1, Judgement o2) {
		if(o1.getPriority() != o2.getPriority())
			return false;
		
		if(resolution == ResolutionType.PERMISSIVE)
			return o1.getAccess().getValue() < o2.getAccess().getValue();
		if(resolution == ResolutionType.RESTRICTIVE)
			return o1.getAccess().getValue() > o2.getAccess().getValue();
			
		throw new IllegalArgumentException();
	}

	public void dispose() {
		judgementsByAttributes.clear();
		judgementsByPriorities.clear();
	}
	
}
