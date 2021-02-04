package prompto.debug.variable;

import java.util.Objects;

import prompto.debug.value.LeanValue;

public class LeanVariable extends VariableBase {

	LeanValue value;
	
	public LeanVariable() {
	}
	
	public LeanVariable(IVariable variable) {
		super(variable);
		this.value = new LeanValue(variable.getValue());
	}

	public void setValue(LeanValue value) {
		this.value = value;
	}
	
	@Override
	public LeanValue getValue() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof LeanVariable && ((LeanVariable)other).equals(this));
	}
	
	public boolean equals(LeanVariable other) {
		return Objects.equals(value, other.value) && super.equals(other);
	}

}
