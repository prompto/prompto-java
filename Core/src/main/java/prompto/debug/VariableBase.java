package prompto.debug;


public abstract class VariableBase implements IVariable {

	String name;
	String typeName;
	
	public VariableBase() {
	}
	
	public VariableBase(String name, String typeName) {
		this.name = name;
		this.typeName = typeName;
	}
	
	public VariableBase(IVariable variable) {
		this.name = variable.getName();
		this.typeName = variable.getTypeName();
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}
	
}
