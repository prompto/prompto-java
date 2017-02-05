package prompto.debug;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;


public interface IDebugResponse {
	
	@JsonIgnore
	Type getType();

	public static class VoidResponse implements IDebugResponse {

		public VoidResponse() {
		}

		@Override
		public Type getType() {
			return Type.VOID;
		}

	}

	public static class GetStatusResponse implements IDebugResponse {

		Status status;
		
		public GetStatusResponse() {
		}

		public GetStatusResponse(Status status) {
			this.status = status;
		}
		
		@Override
		public Type getType() {
			return Type.GET_STATUS;
		}

		public Status getStatus() {
			return status;
		}
		
		public void setStatus(Status status) {
			this.status = status;
		}

	}
	
	public static class GetLineResponse implements IDebugResponse {

		int line;
		
		public GetLineResponse() {
		}

		public GetLineResponse(int line) {
			this.line = line;
		}
		
		@Override
		public Type getType() {
			return Type.GET_LINE;
		}

		public int getLine() {
			return line;
		}
		
		public void setLine(int line) {
			this.line = line;
		}

	}
	
	@SuppressWarnings("serial")
	static class ArrayStack extends ArrayList<StackFrame> implements IStack<StackFrame> {
		
	}
	
	public static class GetStackResponse implements IDebugResponse {

		ArrayStack stack;
		
		public GetStackResponse() {
			this.stack = new ArrayStack();
		}

		public GetStackResponse(IStack<?> stack) {
			this.stack = new ArrayStack();
			stack.forEach((f)->this.stack.add(new StackFrame(f)));
		}
		
		@Override
		public Type getType() {
			return Type.GET_STACK;
		}

		public ArrayStack getStack() {
			return stack;
		}
		
		public void setStack(ArrayStack stack) {
			this.stack = stack;
		}

	}
	
	public static class IsSteppingResponse implements IDebugResponse {

		boolean stepping;
		
		public IsSteppingResponse() {
		}

		public IsSteppingResponse(boolean stepping) {
			this.stepping = stepping;
		}
		
		@Override
		public Type getType() {
			return Type.IS_STEPPING;
		}

		public boolean isStepping() {
			return stepping;
		}
		
		public void setStepping(boolean stepping) {
			this.stepping = stepping;
		}

	}
	

	public enum Type {
		VOID(VoidResponse.class),
		GET_STATUS(GetStatusResponse.class),
		GET_LINE(GetLineResponse.class),
		GET_STACK(GetStackResponse.class),
		IS_STEPPING(IsSteppingResponse.class)
		;
		
		Class<? extends IDebugResponse> klass;
		
		Type(Class<? extends IDebugResponse> klass) {
			this.klass = klass;
		}
		
		public Class<? extends IDebugResponse> getKlass() {
			return klass;
		}
	}

}
