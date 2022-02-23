package prompto.debug.response;

import java.util.Objects;

import prompto.debug.stack.IStack;
import prompto.debug.stack.LeanStack;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(stack);
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetWorkerStackDebugResponse && ((GetWorkerStackDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetWorkerStackDebugResponse other) {
		return Objects.equals(stack, other.stack);
	}


}