package org.mondo.collaboration.security.batch;

import org.eclipse.emf.common.util.Enumerator;

public enum BoundType implements Enumerator {
	UPPER(0, "UPPER", "U"),
	LOWER(1, "LOWER", "L");
	
	private final int value;
	private final String name;
	private final String literal;

	private BoundType(int value, String name, String literal)
	  {
	    this.value = value;
	    this.name = name;
	    this.literal = literal;
	  }

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getLiteral() {
		return literal;
	}
}
