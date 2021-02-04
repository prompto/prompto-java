package prompto.debug.variable;

import java.util.Objects;

@SuppressWarnings("unchecked")
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
	
	public <T extends VariableBase> T withName(String name) {
		this.name = name;
		return (T)this;
	}
	
	public <T extends VariableBase> T withTypeName(String typeName) {
		this.typeName = typeName;
		return (T)this;
	}
	
	public boolean equals(VariableBase other) {
		return Objects.equals(name, other.name) && Objects.equals(typeName, other.typeName);
	}

	

}
