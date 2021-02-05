package prompto.debug.request;

import java.util.Objects;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetVariableDebugResponse;
import prompto.debug.stack.IStackFrame;
import prompto.debug.stack.LeanStackFrame;
import prompto.debug.variable.IVariable;
import prompto.debug.worker.IWorker;

public class GetVariableDebugRequest extends WorkerRequest {

	LeanStackFrame stackFrame;
	String name;
	
	public GetVariableDebugRequest() {
	}

	public GetVariableDebugRequest(IWorker worker, IStackFrame stackFrame, String variableName) {
		super(worker);
		this.stackFrame = new LeanStackFrame(stackFrame);
		this.name = variableName;
	}

	public void setStackFrame(LeanStackFrame stackFrame) {
		this.stackFrame = stackFrame;
	}
	
	public LeanStackFrame getStackFrame() {
		return stackFrame;
	}

	public void setName(String variableName) {
		this.name = variableName;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public GetVariableDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before variable");
		IVariable variable = debugger.getVariable(DebuggedWorker.parse(workerId), stackFrame, name);
		logger.debug(()->"after variables");
		return new GetVariableDebugResponse(variable);
	}
	
	public GetVariableDebugRequest withName(String variableName) {
		this.name = variableName;
		return this;
	}
	
	public GetVariableDebugRequest withStackFrame(LeanStackFrame stackFrame) {
		this.stackFrame = stackFrame;
		return this;
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof GetVariableDebugRequest && ((GetVariableDebugRequest)other).equals(this));
	}
	
	public boolean equals(GetVariableDebugRequest other) {
		return Objects.equals(stackFrame, other.stackFrame) && Objects.equals(name, other.name) && super.equals(other);
	}
	
}