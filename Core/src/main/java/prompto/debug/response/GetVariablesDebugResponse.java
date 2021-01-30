package prompto.debug.response;

import java.util.Collection;
import java.util.stream.Collectors;

import prompto.debug.IVariable;
import prompto.debug.LeanVariable;
import prompto.debug.LeanVariableList;

public class GetVariablesDebugResponse implements IDebugResponse {

	LeanVariableList variables;
	
	public GetVariablesDebugResponse() {
		this.variables = new LeanVariableList();
	}

	public GetVariablesDebugResponse(Collection<? extends IVariable> variables) {
		this.variables = new LeanVariableList();
		this.variables.addAll(variables.stream()
				.map(LeanVariable::new)
				.collect(Collectors.toList()));
	}
	
	public LeanVariableList getVariables() {
		return variables;
	}
	
	public void setVariables(LeanVariableList variables) {
		this.variables = variables;
	}

}