package org.mondo.collaboration.security.application;

import org.mondo.collaboration.security.increment.StandaloneRulesGenerator;

import WTSpec4M.WTSpec4MPackage;


public class IncrementGenerator {
	private static final String RULES_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/policy/policy.rules";
	private static final String DELEGATION_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/policy/policy.delegation";
	private static final String BASE_PATH = "../org.mondo.collaboration.security.application/src/org/mondo/collaboration/security/application/query/";
	
	public static void main(String[] args) {
		StandaloneRulesGenerator generator = new StandaloneRulesGenerator();
	    generator.generateAllInOne("", RULES_PATH, DELEGATION_PATH, WTSpec4MPackage.eINSTANCE, BASE_PATH);
	}
}
