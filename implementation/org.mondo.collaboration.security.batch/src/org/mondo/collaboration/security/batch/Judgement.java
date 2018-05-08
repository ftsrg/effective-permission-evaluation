package org.mondo.collaboration.security.batch;

import org.mondo.collaboration.security.batch.Asset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.ResolutionType;

public class Judgement implements Comparable<Judgement> {
	private AccessibilityLevel access;
	private OperationType operation;
	private Asset asset; // ez a lens-es asset
	private Integer priority;
	private ResolutionType resolution;
	private Boolean isDominant;
	private int hash;
	
	public Judgement(AccessibilityLevel access, OperationType operation, Asset asset, ResolutionType resolution) {
		this(access, operation, asset, -1, resolution);
	}

	public Judgement(AccessibilityLevel access, OperationType operation, Asset asset, Integer priority, ResolutionType resolution) {
		this.access = access;
		this.operation = operation;
		this.asset = asset;
		this.priority = priority;
		this.resolution = resolution;
		this.isDominant = ((access == AccessibilityLevel.ALLOW && resolution == ResolutionType.PERMISSIVE) ||
				           (access == AccessibilityLevel.DENY && resolution == ResolutionType.RESTRICTIVE)) ? true : false; 
		
		hash = hashCode();
	}

	public OperationType getOperation() {
		return operation;
	}

	public void setOperation(OperationType operation) {
		this.operation = operation;
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

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	public ResolutionType getResolution() {
		return resolution;
	}
	
	public void setResolution(ResolutionType resolution) {
		this.resolution = resolution;
	}
	
	public Boolean isDominant() {
		return isDominant;
	}

	public void setDominant(Boolean isDominant) {
		this.isDominant = isDominant;
	}

	@Override
	public String toString() {
		return "Judgement [" + access + ", " + operation + ", " + asset + ", " + priority + ", " + resolution + ", " + isDominant + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((access == null) ? 0 : access.hashCode());
		result = prime * result + ((asset == null) ? 0 : asset.hashCode());
//		result = prime * result + ((isDominant == null) ? 0 : isDominant.hashCode());
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
//		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
//		result = prime * result + ((resolution == null) ? 0 : resolution.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return hash == ((Judgement) obj).hash;
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Judgement other = (Judgement) obj;
//		if (asset == null) {
//			if (other.asset != null)
//				return false;
//		} else if (!asset.equals(other.asset))
//			return false;
//		if (access != other.access)
//			return false;
//		if (operation != other.operation)
//			return false;
////		if (isDominant == null) {
////			if (other.isDominant != null)
////				return false;
////		} else if (!isDominant.equals(other.isDominant))
////			return false;
////		if (priority == null) {
////			if (other.priority != null)
////				return false;
////		} else if (!priority.equals(other.priority))
////			return false;
////		if (resolution != other.resolution)
////			return false;
//		return true;
	}

	@Override
	public int compareTo(Judgement other) {
		if(other.getAccess() == this.access){
			if(other.getAsset().equals(this.asset)){
				if(other.getOperation() == this.operation){
					if(other.getPriority() == this.priority) return 0;
				}
			}
		}
		int result = other.getPriority() - this.priority;
		if(result == 0) {
			result = other.isDominant().compareTo(this.isDominant());
		}
		if(result == 0){
			if(!(other.getAccess() == this.access && other.getOperation() == this.operation && other.getAsset().equals(this.asset))){
				result = 1;
			}
		}
		return result;
	}
	
	public class JudgementKey {
		Integer priority;
		Boolean isDominant;
		int hash;
		
		public JudgementKey(Integer priority, Boolean isDominant) {
			super();
			this.priority = priority;
			this.isDominant = isDominant;
			hash = hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			return hash == ((JudgementKey) obj).hash;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((priority == null) ? 0 : priority.hashCode());
			result = prime * result + ((isDominant == null) ? 0 : isDominant.hashCode());
			return result;
		}
	}
}
