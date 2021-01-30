package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IStackFrame;
import prompto.debug.IVariable;
import prompto.debug.IWorker;
import prompto.debug.LeanStackFrame;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetVariableDebugResponse;

public class GetVariableDebugRequest extends WorkerRequest {

	LeanStackFrame stackFrame;
	String variableName;
	
	public GetVariableDebugRequest() {
	}

	public GetVariableDebugRequest(IWorker worker, IStackFrame stackFrame, String variableName) {
		super(worker);
		this.stackFrame = new LeanStackFrame(stackFrame);
		this.variableName = variableName;
	}

	public void setStackFrame(LeanStackFrame stackFrame) {
		this.stackFrame = stackFrame;
	}
	
	public LeanStackFrame getStackFrame() {
		return stackFrame;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	
	public String getVariableName() {
		return variableName;
	}
	
	@Override
	public GetVariableDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before variable");
		IVariable variable = debugger.getVariable(DebuggedWorker.parse(workerId), stackFrame, variableName);
		logger.debug(()->"after variables");
		return new GetVariableDebugResponse(variable);
	}
	
}