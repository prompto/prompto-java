package prompto.debug;

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
}
