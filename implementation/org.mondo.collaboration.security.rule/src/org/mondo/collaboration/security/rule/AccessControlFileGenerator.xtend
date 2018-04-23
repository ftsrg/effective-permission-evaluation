package org.mondo.collaboration.security.rule

class AccessControlFileGenerator {
	def static generate(int numberOfUsers, String queryURI) {
		'''
		«generateImports(queryURI)»
		«generateUserHeader(numberOfUsers)»
		«generateGroupHeader(numberOfUsers)»
		«generatePolicy(numberOfUsers)»
		'''
	}
	
	def static generateImports(String queryURI) {
		'''import "«queryURI.replace("\\", "\\\\")»"'''
	}
	
	def static generateUserHeader(int numberOfUsers) '''
	user superuser
	«FOR user : 1..numberOfUsers»
		user user_«user»
	«ENDFOR»
	'''
	
	def static generateGroupHeader(int numberOfUsers) '''
	group restrictedGroup {
		«FOR user : 1..numberOfUsers SEPARATOR ','»user_«user»«ENDFOR»
	}'''
	
	def static generatePolicy(int numberOfUsers) '''
	policy GeneratedWTPolicy_«numberOfUsers» deny RW by default {
		«FOR user : 1..numberOfUsers SEPARATOR '''
		'''»
		«generateUserSpecificRules(user)»
		«ENDFOR»
		
		«generateDefaultRules»
	} with restrictive resolution'''
	
	def static generateUserSpecificRules(int userId) '''
	// Rules specific to user «userId»
	
		//Grant RW for user specific control units
		rule permitUserSpecificControlUnit_«userId» allow RW to user_«userId» {
			from query "objectControlWithType"
			select obj (control)
			where type is bound to "«userId»"
		}
		//Grant R for user specific composite hierarchy
		rule permitUserRelatedCompositeModules_«userId» allow R to user_«userId» {
			from query "objectCompositeWithType"
			select obj (composite)
			where type is bound to "«userId»"
		}	
	'''
	
	def static generateDefaultRules() '''
	// IP protected modules
	rule denyProtectedSignalRead deny RW to restrictedGroup {
		from query "protectedModuleReadsSignal"
		select attr (module : protectedIP)
	}		
	rule denyProtectedVendor deny RW to restrictedGroup {
		from query "protectedModuleVendor"
		select attr (module : vendor)
	}		
	'''
	
}