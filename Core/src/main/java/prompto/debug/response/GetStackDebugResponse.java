package prompto.debug.response;

import prompto.debug.IStack;
import prompto.debug.LeanStack;

public class GetStackDebugResponse implements IDebugResponse {

	LeanStack stack;
	
	public GetStackDebugResponse() {
		this.stack = new LeanStack();
	}

	public GetStackDebugResponse(IStack<?> stack) {
		this.stack = new LeanStack(stack);
	}
	
	public LeanStack getStack() {
		return stack;
	}
	
	public void setStack(LeanStack stack) {
		this.stack = stack;
	}

}