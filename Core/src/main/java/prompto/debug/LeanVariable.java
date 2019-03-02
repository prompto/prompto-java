package prompto.debug;


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

}
