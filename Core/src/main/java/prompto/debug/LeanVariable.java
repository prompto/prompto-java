package prompto.debug;


public class LeanVariable implements IVariable {

	String name;
	String typeName;
	IValue value;
	
	public LeanVariable(String name, String typeName) {
		this.name = name;
		this.typeName = typeName;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}
	
	@Override
	public IValue getValue() {
		return value;
	}

}
