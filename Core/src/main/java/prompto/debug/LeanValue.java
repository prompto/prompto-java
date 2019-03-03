package prompto.debug;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class LeanValue extends ValueBase {

	public LeanValue() {
	}
	
	public LeanValue(IValue value) {
		this.typeName = value.getTypeName();
		this.valueString = value.getValueString();
	}

	@JsonIgnore
	@Override
	public JsonNode getValueData() {
		return JsonNodeFactory.instance.nullNode();
	}

}
