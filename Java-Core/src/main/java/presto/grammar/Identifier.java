package presto.grammar;

import presto.parser.Section;

public class Identifier extends Section {

	String name;
	
	public Identifier(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Identifier)
			return name.equals(((Identifier)obj).name);
		else
			return false;
	}
}
