package org.mondo.collaboration.security.batch;

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

public class Judgement {
	
	private Asset asset;
	private AccessibilityLevel access;
	private OperationType operation;
	private int priority;
	private BoundType bound;
	
	public Judgement(AccessibilityLevel access, OperationType operation, Asset asset) {
		this(access, operation, asset, -1, null);
	}

	public Judgement(AccessibilityLevel access, OperationType operation, Asset asset, int priority, BoundType bound) {
		this.access = access;
		this.operation = operation;
		this.asset = asset;
		this.priority = priority;
		this.bound = bound;
	}

	public OperationType getOperation() {
		return operation;
	}

	public AccessibilityLevel getAccess() {
		return access;
	}
	
	public void setAccess(AccessibilityLevel access) {
		this.access = access;
	}

	public Asset getAsset() {
		return asset;
	}

	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public BoundType getBound() {
		return this.bound;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + asset.hashCode();
		result = prime * result + operation.hashCode();
		result = prime * result + access.hashCode();
		result = prime * result + priority;
		result = prime * result + bound.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Judgement) {
			Judgement other = (Judgement) obj;
			if(!other.asset.equals(asset)) {
				return false;
			}
			if(!other.access.equals(access)) {
				return false;
			}
			if(!other.operation.equals(operation)) {
				return false;
			}
			if(other.priority != priority) {
				return false;
			}
			if(!other.bound.equals(bound)) {
				return false;
			}
		}
		return true;
	}

//	@Override
//	public int compareTo(Judgement other) {
//		int hashCode = hashCode();
//		int otherHashCode = other.hashCode();
//		return hashCode - otherHashCode;
//	}

	@Override
	public String toString() {
		return "Judgement [asset=" + asset + ", access=" + access + ", operation=" + operation + ", priority="
				+ priority + ", bound=" + bound + "]";
	}
	
	
}
