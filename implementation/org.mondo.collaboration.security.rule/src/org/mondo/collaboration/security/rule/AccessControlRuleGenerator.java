package org.mondo.collaboration.security.rule;

import java.io.File;
import java.io.FileOutputStream;

public class AccessControlRuleGenerator {

	public void generate(int[] USER_SIZES, String RULES_URI, String QUERY_URI) throws Exception {
		for (int size : USER_SIZES) {
			CharSequence model = AccessControlFileGenerator.generate(size, QUERY_URI);
			save(String.format(RULES_URI, size), model);
		}
	}

	public static void save(String path, CharSequence sequence) throws Exception {
		File file = new File(path);
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}
		try (FileOutputStream stream = new FileOutputStream(path)) {
			stream.write(sequence.toString().getBytes());
		}
	}
}
