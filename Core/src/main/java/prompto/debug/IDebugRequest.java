package prompto.debug;

import static prompto.debug.IDebugResponse.*;
import static prompto.debug.IDebugRequest.Type.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IDebugRequest {

	@JsonIgnore
	Type getType();
	IDebugResponse execute(IDebugger debugger);

	public static class StatusRequest implements IDebugRequest {

		@Override
		public StatusResponse execute(IDebugger debugger) {
			Status status = debugger.getStatus();
			return new StatusResponse(status);
		}
		
		@Override
		public Type getType() {
			return STATUS;
		}
	}
	
	public static class LineRequest implements IDebugRequest {

		@Override
		public LineResponse execute(IDebugger debugger) {
			int line = debugger.getLine();
			System.err.println("line:" + line);
			return new LineResponse(line);
		}
		
		@Override
		public Type getType() {
			return LINE;
		}
	}

	public static class ResumeRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			debugger.resume();
			System.err.println("resume");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return RESUME;
		}
	}

	public static class StepOverRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			debugger.stepOver();
			System.err.println("step over");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OVER;
		}
	}

	public static class StepIntoRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			debugger.stepInto();
			System.err.println("step into");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_INTO;
		}
	}

	public static class StepOutRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			debugger.stepOut();
			System.err.println("step out");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OUT;
		}
	}

	public enum Type {
		STATUS(StatusRequest.class),
		LINE(LineRequest.class),
		RESUME(ResumeRequest.class),
		STEP_INTO(StepIntoRequest.class),
		STEP_OUT(StepOutRequest.class),
		STEP_OVER(StepOverRequest.class)
		;
		
		Class<? extends IDebugRequest> klass;
		
		Type(Class<? extends IDebugRequest> klass) {
			this.klass = klass;
		}
		
		public Class<? extends IDebugRequest> getKlass() {
			return klass;
		}
	}

}
