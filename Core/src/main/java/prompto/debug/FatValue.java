package prompto.debug;

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

}
