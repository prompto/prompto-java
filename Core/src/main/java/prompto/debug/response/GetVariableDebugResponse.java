package prompto.debug.response;

import prompto.debug.FatVariable;
import prompto.debug.IVariable;

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

}