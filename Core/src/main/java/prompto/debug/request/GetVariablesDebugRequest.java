package prompto.debug.request;

import java.util.Collection;
import java.util.Objects;

import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetVariablesDebugResponse;
import prompto.debug.stack.IStackFrame;
import prompto.debug.stack.LeanStackFrame;
import prompto.debug.variable.IVariable;
import prompto.debug.worker.IWorker;

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
	
	public GetVariablesDebugRequest withStackFrame(LeanStackFrame stackFrame) {
		this.stackFrame = stackFrame;
		return this;
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof GetVariablesDebugRequest && ((GetVariablesDebugRequest)other).equals(this));
	}
	
	public boolean equals(GetVariablesDebugRequest other) {
		return Objects.equals(stackFrame, other.stackFrame) && super.equals(other);
	}

}