package prompto.debug.response;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import prompto.debug.variable.IVariable;
import prompto.debug.variable.LeanVariable;
import prompto.debug.variable.LeanVariableList;

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
	
	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetVariablesDebugResponse && ((GetVariablesDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetVariablesDebugResponse other) {
		return Objects.equals(variables, other.variables);
	}


}