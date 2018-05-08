package org.mondo.collaboration.security.eval;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.mondo.collaboration.security.increment.StandaloneRulesGenerator;
import org.mondo.collaboration.security.model.ModelGenerator;
import org.mondo.collaboration.security.rule.AccessControlRuleGenerator;

import wt.WtPackage;

public class Generator {

	public static final String MODEL_PATH = "../org.mondo.collaboration.security.eval.generated.artifacts/instances/model-%04d-%04d.xmi";
	public static final String RULE_PATH = "../org.mondo.collaboration.security.eval.generated.artifacts/rules/rules_%04d.rules";
	public static final String INCREMENTAL_RULE_BASE_PATH = "../org.mondo.collaboration.security.eval.generated.artifacts/rules/incremental-%04d/";
	
	public static class ExecuteModeGeneration {
		
		public static final int[] MODEL_SIZES = {13, 25, 38, 50, 63, 75, 88, 100, 150, 200, 250, 300, 350};
		public static final int[] CTRL_TYPE_SIZES = {30};
		
		public static void main(String[] args) throws Exception {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			ModelGenerator generator = new ModelGenerator();
			generator.generate(MODEL_SIZES, CTRL_TYPE_SIZES, MODEL_PATH);
		}		
		
	}
	
	public static class ExecuteRuleGeneration {
		
		public static final int[] USER_SIZES = {2,5,10,20,30,40,50,60,70,80,90,100};

		
		public static void main(String[] args) throws Exception {
			argumentCheck(args);
			String QUERY_URI = args[0]; // The exact system path to queries.vql
			AccessControlRuleGenerator generator = new AccessControlRuleGenerator();
			generator.generate(USER_SIZES, RULE_PATH, QUERY_URI);
		}		
	}
	
	public static class ExecuteIncrementalRuleGeneration {
		
		public static final int[] USER_SIZES = {2,5,10,20,30,40,50,60,70,80,90,100};

		public static void main(String[] args) {
			StandaloneRulesGenerator generator = new StandaloneRulesGenerator();
			for (int user : USER_SIZES) {
				generator.generateAllInOne(String.format(RULE_PATH, user), WtPackage.eINSTANCE, String.format(INCREMENTAL_RULE_BASE_PATH, user));
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		argumentCheck(args);
		
		ExecuteModeGeneration.main(args);
		ExecuteRuleGeneration.main(args);
		ExecuteIncrementalRuleGeneration.main(args);
		
	}

	private static void argumentCheck(String[] args) {
		if(args.length == 0)
			throw new IllegalArgumentException("At least one parameter needs to be passed!");
		
		File file = new File(args[0]);
		if(!file.exists())
			throw new IllegalArgumentException("The first arguments points to a non-existing file!");
		
		if(file.isDirectory())
			throw new IllegalArgumentException("The first arguments points to a directory instead of a file!");
	}
	
}
