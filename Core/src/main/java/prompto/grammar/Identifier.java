package prompto.grammar;

import java.util.Objects;

import prompto.parser.CodeSection;

public class Identifier extends CodeSection {

	String value;
	
	public Identifier(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		return other== this || (other instanceof Identifier && ((Identifier)other).equals(this));
	}
	
	public boolean equals(Identifier other) {
		return other==this || (other!=null && Objects.equals(value, other.value));
	}
}
