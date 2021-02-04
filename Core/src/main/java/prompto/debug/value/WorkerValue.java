package prompto.debug.value;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.grammar.INamed;
import prompto.runtime.Context;

public class WorkerValue implements IValue {
	
	Context context;
	prompto.value.IValue value;

	public WorkerValue(Context context, INamed named) {
		this.context = context;
		this.value = context.getValue(named.getId());
	}
	
	@Override
	public String getTypeName() {
		return value.getType().getTypeName();
	}
	
	@Override
	public String getValueString() {
		return value.toString();
	}
	
	@Override
	public JsonNode getValueData() {
		return value.toTypedJsonNode(context);
	}

}