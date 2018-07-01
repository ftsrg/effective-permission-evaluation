package org.mondo.collaboration.security.increment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.xtext.generator.AbstractFileSystemAccess2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.RuntimeIOException;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.policy.delegation.DelegationStandaloneSetup;

import com.google.inject.Injector;

public class StandaloneRulesGenerator {

	public void generate(String path, String basePath) {
		
		Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
		new DelegationStandaloneSetup().createInjectorAndDoEMFRegistration();
   	    new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
    	
    	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	
    	Resource resource = resourceSet.getResource(URI.createURI(path), true);
		
		RulesGenerator generator = new RulesGenerator();
		generator.doGenerate(resource, new JavaFileSystemAccess(basePath), null);
	}

	public void generateAllInOne(String pack, String acPath, String delegationPath, EPackage ePackage, String basePath) {
		Injector injector = new RulesStandaloneSetup().createInjectorAndDoEMFRegistration();
		new DelegationStandaloneSetup().createInjectorAndDoEMFRegistration();
   	    new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
    	
    	XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
    	resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	
    	Resource acResource = resourceSet.getResource(URI.createURI(acPath), true);
    	Resource delegationResource = resourceSet.getResource(URI.createFileURI(delegationPath), true);
		
		RulesGenerator generator = new RulesGenerator();
		generator.doGenerateAllInOne(pack, acResource, delegationResource, ePackage, new JavaFileSystemAccess(basePath), null);
	}
	
	public void generate(EPackage ePackage, String basePath) {
		RulesGenerator generator = new RulesGenerator();
		generator.doGenerate(ePackage, new JavaFileSystemAccess(basePath), null);
	}
	
	static class JavaFileSystemAccess extends AbstractFileSystemAccess2 {

		private String basePath;

		public JavaFileSystemAccess(String basePath) {
			this.basePath = basePath;
		}

		public void setBasePath(String basePath) {
			this.basePath = basePath;
		}

		@Override
		public void generateFile(String fileName, CharSequence contents) {
			File directory = new File(basePath);
			if(!directory.exists()) {
				directory.mkdir();
			}
			
			try(FileOutputStream stream = new FileOutputStream(basePath + fileName)) {					
				stream.write(contents.toString().getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void generateFile(String fileName, String outputConfigurationName, CharSequence contents) {
			throw new UnsupportedOperationException();
		}

		@Override
		public URI getURI(String path, String outputConfiguration) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void generateFile(String fileName, String outputCfgName, InputStream content) throws RuntimeIOException {
			throw new UnsupportedOperationException();

		}

		@Override
		public InputStream readBinaryFile(String fileName, String outputCfgName) throws RuntimeIOException {
			throw new UnsupportedOperationException();
		}

		@Override
		public CharSequence readTextFile(String fileName, String outputCfgName) throws RuntimeIOException {
			throw new UnsupportedOperationException();
		}
	}
}
