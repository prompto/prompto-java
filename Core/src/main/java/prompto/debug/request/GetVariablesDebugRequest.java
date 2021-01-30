package prompto.debug.request;

import java.util.Collection;

import prompto.debug.IDebugger;
import prompto.debug.IStackFrame;
import prompto.debug.IVariable;
import prompto.debug.IWorker;
import prompto.debug.LeanStackFrame;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetVariablesDebugResponse;

public class GetVariablesDebugRequest extends WorkerRequest {

	LeanStackFrame stackFrame;
	
	public GetVariablesDebugRequest() {
	}

	public GetVariablesDebugRequest(IWorker worker, IStackFrame stackFrame) {
		super(worker);
		this.stackFrame = new LeanStackFrame(stackFrame);
	}

	public void setStackFrame(LeanStackFrame stackFrame) {
		this.stackFrame = stackFrame;
	}
	
	public LeanStackFrame getStackFrame() {
		return stackFrame;
	}

	@Override
	public GetVariablesDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before variables");
		Collection<? extends IVariable> variables = debugger.getVariables(DebuggedWorker.parse(workerId), stackFrame);
		logger.debug(()->"after variables");
		return new GetVariablesDebugResponse(variables);
	}
	
}