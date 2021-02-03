package prompto.debug.response;

import prompto.debug.IStack;
import prompto.debug.LeanStack;

public class GetWorkerStackDebugResponse implements IDebugResponse {

	LeanStack stack;
	
	public GetWorkerStackDebugResponse() {
		this.stack = new LeanStack();
	}

	public GetWorkerStackDebugResponse(IStack<?> stack) {
		this.stack = new LeanStack(stack);
	}
	
	public LeanStack getStack() {
		return stack;
	}
	
	public void setStack(LeanStack stack) {
		this.stack = stack;
	}

}