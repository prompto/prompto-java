package prompto.debug.value;

import com.fasterxml.jackson.databind.JsonNode;

public interface IValue {

	String getTypeName();
	String getValueString();
	JsonNode getValueData();

}
