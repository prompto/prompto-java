package prompto.compiler;

import java.lang.reflect.Type;

/* need this so we can hold types which do not yet exist in compiled form */
/* scenario is class A has member B, and class B has member A */
public class NamedType implements Type {

	String name;
	
	public NamedType(String name) {
		this.name = name;
	}

	@Override
	public String getTypeName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
