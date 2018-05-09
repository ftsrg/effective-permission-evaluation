package org.mondo.collaboration.security.batch;

import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;

public class Judgement {
	
	private Asset asset;
	private AccessibilityLevel access;
	private OperationType operation;
	private int priority;
	
	public Judgement(AccessibilityLevel access, OperationType operation, Asset asset) {
		this(access, operation, asset, -1);
	}

	public Judgement(AccessibilityLevel access, OperationType operation, Asset asset, int priority) {
		this.access = access;
		this.operation = operation;
		this.asset = asset;
		this.priority = priority;
	}

	public OperationType getOperation() {
		return operation;
	}

	public AccessibilityLevel getAccess() {
		return access;
	}

	public Asset getAsset() {
		return asset;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Judgement [" + access + ", " + operation + ", " + asset + ", " + priority + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + asset.hashCode();
		result = prime * result + operation.hashCode();
		result = prime * result + access.hashCode();
		result = prime * result + priority;
		
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Judgement) {
			Judgement other = (Judgement) obj;
			if(other.asset.equals(asset)
			&& other.access.equals(access)
			&& other.operation.equals(operation)
			&& other.priority == priority)
				return true;
		}
		
		return super.equals(obj);
	}
}
