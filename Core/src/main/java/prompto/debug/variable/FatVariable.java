package prompto.debug.variable;

import java.util.Objects;

import prompto.debug.value.FatValue;

public class FatVariable extends VariableBase {

	FatValue value;
	
	public FatVariable() {
	}
	
	public FatVariable(IVariable variable) {
		super(variable);
		this.value = new FatValue(variable.getValue());
	}

	public void setValue(FatValue value) {
		this.value = value;
	}
	
	@Override
	public FatValue getValue() {
		return value;
	}
	
	public FatVariable withValue(FatValue value) {
		this.value = value;
		return this;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	public boolean equals(Object other) {
		return this == other || (other instanceof FatVariable && ((FatVariable)other).equals(this));
	}
	
	public boolean equals(FatVariable other) {
		return Objects.equals(value, other.value) && super.equals(other);
	}


}
