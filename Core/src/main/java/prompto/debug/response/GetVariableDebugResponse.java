package prompto.debug.response;

import java.util.Objects;

import prompto.debug.variable.FatVariable;
import prompto.debug.variable.IVariable;

public class GetVariableDebugResponse implements IDebugResponse {

	FatVariable variable;
	
	public GetVariableDebugResponse() {
	}

	public GetVariableDebugResponse(IVariable variable) {
		this.variable = new FatVariable(variable);
	}
	
	public FatVariable getVariable() {
		return variable;
	}
	
	public void setVariable(FatVariable variable) {
		this.variable = variable;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(variable);
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetVariableDebugResponse && ((GetVariableDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetVariableDebugResponse other) {
		return Objects.equals(variable, other.variable);
	}


}