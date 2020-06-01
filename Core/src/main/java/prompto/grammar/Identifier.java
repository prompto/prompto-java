package prompto.grammar;

import prompto.parser.Section;

public class Identifier extends Section {

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
	public boolean equals(Object obj) {
		return obj instanceof Identifier && value.equals(((Identifier)obj).value);
	}
}
