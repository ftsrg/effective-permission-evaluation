package org.mondo.collaboration.security.eval.util;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.AccessControlModel;

import com.google.common.collect.Maps;

public class Parameters {

	private HashMap<String, String> mainArgs;
	private EObject instanceModel;
	private AccessControlModel acModel;
	
	public Parameters(HashMap<String, String> mainArgs) {
		this.mainArgs = mainArgs;
	}
	
	public Parameters(String[] args) {
		
		mainArgs = Maps.newHashMap();
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].trim().startsWith(Constants.MODEL_SIZE_ARG))
				mainArgs.put(Constants.MODEL_SIZE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(Constants.USER_SIZE_ARG))
				mainArgs.put(Constants.USER_SIZE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(Constants.REPEAT_ARG))
				mainArgs.put(Constants.REPEAT_ARG, args[i + 1]);
			if (args[i].trim().startsWith(Constants.WARMUP_ARG))
				mainArgs.put(Constants.WARMUP_ARG, args[i + 1]);
			if (args[i].trim().startsWith(Constants.MODIFICATION_SIZE_ARG))
				mainArgs.put(Constants.MODIFICATION_SIZE_ARG, args[i + 1]);
			if (args[i].trim().startsWith(Constants.ADDITIONAL_INFO_ARG))
				mainArgs.put(Constants.ADDITIONAL_INFO_ARG, "true");
			if (args[i].trim().startsWith(Constants.TEST_EVALUATION_ARG))
				mainArgs.put(Constants.TEST_EVALUATION_ARG, "true");
		}
		
	}
	
	public void setAcModel(AccessControlModel acModel) {
		this.acModel = acModel;
	}
	
	public AccessControlModel getAcModel() {
		return acModel;
	}
	
	public void setInstanceModel(EObject instanceModel) {
		this.instanceModel = instanceModel;
	}
	
	public EObject getInstanceModel() {
		return instanceModel;
	}
	
	public int getRepeatNumber() {
		if (mainArgs.get(Constants.REPEAT_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(Constants.REPEAT_ARG));
	}
	
	public int getWarmupNumber() {
		if (mainArgs.get(Constants.WARMUP_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(Constants.WARMUP_ARG));
	}

	public int getModelSize() {
		if (mainArgs.get(Constants.MODEL_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(Constants.MODEL_SIZE_ARG));
	}

	public int getUserSize() {
		if (mainArgs.get(Constants.USER_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(Constants.USER_SIZE_ARG));
	}

	public boolean printAdditionalInfo() {
		if (mainArgs.containsKey(Constants.ADDITIONAL_INFO_ARG))
			return true;
		return false;
	}

	public boolean isTestEvaluation() {
		if (mainArgs.containsKey(Constants.TEST_EVALUATION_ARG))
			return true;
		return false;
	}

	public int getModificationSize() {
		if (mainArgs.get(Constants.MODIFICATION_SIZE_ARG) == null)
			throw new IllegalArgumentException();

		return Integer.valueOf(mainArgs.get(Constants.MODIFICATION_SIZE_ARG));
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private HashMap<String, String> mainArgs = Maps.newHashMap();
		
		public Parameters build() {
			return new Parameters(mainArgs);
		}
		
		public Builder setModificationSize(int modificationSize) {
			mainArgs.put(Constants.MODIFICATION_SIZE_ARG, String.valueOf(modificationSize));
			return this;
		}
		
		public Builder setTestEvaluation() {
			mainArgs.put(Constants.TEST_EVALUATION_ARG, "true");
			return this;
		}
		
		public Builder setPrintAdditionalInfo() {
			mainArgs.put(Constants.ADDITIONAL_INFO_ARG, "true");
			return this;
		}
		
		public Builder setUserSize(int userSize) {
			mainArgs.put(Constants.USER_SIZE_ARG, String.valueOf(userSize));
			return this;
		}
		
		public Builder setModelSize(int modelSize) {
			mainArgs.put(Constants.MODEL_SIZE_ARG, String.valueOf(modelSize));
			return this;
		}
		
		public Builder setWarmupNumber(int warmup) {
			mainArgs.put(Constants.WARMUP_ARG, String.valueOf(warmup));
			return this;
		}
		
		public Builder setRepeatNumber(int repeat) {
			mainArgs.put(Constants.REPEAT_ARG, String.valueOf(repeat));
			return this;
		}
	}
}
