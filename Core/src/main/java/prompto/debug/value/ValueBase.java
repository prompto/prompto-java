package prompto.debug.value;

import java.util.Objects;

@SuppressWarnings("unchecked")
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
	
	public <T extends ValueBase> T withTypeName(String typeName) {
		this.typeName = typeName;
		return (T)this;
	}
	
	public <T extends ValueBase> T withValueString(String valueString) {
		this.valueString = valueString;
		return (T)this;
	}

	public boolean equals(ValueBase other) {
		return Objects.equals(typeName, other.typeName) && Objects.equals(valueString, other.valueString);
	}


}
