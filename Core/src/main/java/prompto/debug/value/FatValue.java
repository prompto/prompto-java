package prompto.debug.value;

import java.util.Objects;

import com.fasterxml.jackson.databind.JsonNode;

public class FatValue extends ValueBase {

	JsonNode valueData;
	
	public FatValue() {
	}
	
	public FatValue(IValue value) {
		super(value);
		this.valueData = value.getValueData();
	}
	
	@Override
	public JsonNode getValueData() {
		return valueData;
	}

	public void setValueData(JsonNode valueData) {
		this.valueData = valueData;
	}
	
	public FatValue withValueData(JsonNode valueData) {
		this.valueData = valueData;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valueData);
	}

	public boolean equals(Object other) {
		return this == other || (other instanceof FatValue && ((FatValue)other).equals(this));
	}
	
	public boolean equals(FatValue other) {
		return Objects.equals(valueData, other.valueData) && super.equals(other);
	}


}
