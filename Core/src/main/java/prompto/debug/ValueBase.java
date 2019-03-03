package prompto.debug;

public abstract class ValueBase implements IValue {

	String typeName;
	String valueString;
	
	public ValueBase() {
	}
	
	public ValueBase(IValue value) {
		this.typeName = value.getTypeName();
		this.valueString = value.getValueString();
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	@Override
	public String getTypeName() {
		return typeName;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
	
	@Override
	public String getValueString() {
		return valueString;
	}
	

}
