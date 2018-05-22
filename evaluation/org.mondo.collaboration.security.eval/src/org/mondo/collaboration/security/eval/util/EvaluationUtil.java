package org.mondo.collaboration.security.eval.util;

public class EvaluationUtil {

	private EvaluationUtil() {
		//Disabled constructor
	}
	
	public static void printDefaultHeader() {
		System.out.println("Model\tUser\tMod\tType\tTime");
	}
	
	public static void printTime(Parameters args, long time, String type, Object... additionals) {
		printDefaultInformation(args, type);
		System.out.format("%d", time);
		for (int i = 0; i < additionals.length; i++) {
			System.out.print("\t");
			System.out.print(additionals[i]);
		}
		System.out.println();
	}

	private static void printDefaultInformation(Parameters args, String type) {
		System.out.print(args.getModelSize() + "\t");
		System.out.print(args.getUserSize() + "\t");
		System.out.print((args.getModificationSize() * 3) + "\t");
		System.out.print(type + "\t");
	}
	
	public static long beforeMemoryUsage() {
		System.gc();		
		System.gc();
		System.gc();		
		System.gc();
		System.gc();		
		
		return afterMemoryUsage();
	}

	public static  long afterMemoryUsage() {
		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	}
	
	public static long currentTime() {
		return System.nanoTime();
	}
}
