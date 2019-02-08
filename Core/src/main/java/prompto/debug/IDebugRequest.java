package prompto.debug;

import static prompto.debug.IDebugResponse.*;
import static prompto.debug.IDebugRequest.Type.*;

import java.util.Collection;

import prompto.debug.ProcessDebugger.DebuggedThread;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.utils.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IDebugRequest {

	static Logger logger = new Logger();

	@JsonIgnore
	Type getType();
	IDebugResponse execute(IDebugger debugger);

	
	public static class GetThreadsRequest implements IDebugRequest {

		public GetThreadsRequest() {
		}

		@Override
		public GetThreadsResponse execute(IDebugger debugger) {
			Collection<? extends IThread> threads = debugger.getThreads();
			return new GetThreadsResponse(threads);
		}
		
		@Override
		public Type getType() {
			return GET_PROCESS_STATUS;
		}
	}

	
	public static class GetProcessStatusRequest implements IDebugRequest {

		public GetProcessStatusRequest() {
		}

		@Override
		public GetStatusResponse execute(IDebugger debugger) {
			Status status = debugger.getProcessStatus();
			return new GetStatusResponse(status);
		}
		
		@Override
		public Type getType() {
			return GET_PROCESS_STATUS;
		}
	}
	
	static abstract class ThreadRequest implements IDebugRequest {
		
		IThread thread;
		String threadId;
		
		ThreadRequest() {
		}
		
		ThreadRequest(IThread thread) {
			this.thread = thread;
			this.threadId = thread.toString();
		}
		
		public String getThreadId() {
			return threadId;
		}
		
		public void setThreadId(String threadId) {
			this.threadId = threadId;
			this.thread = DebuggedThread.parse(threadId);
		}
		
	}
	
	public static class GetThreadStatusRequest extends ThreadRequest {

		public GetThreadStatusRequest() {
		}

		public GetThreadStatusRequest(IThread thread) {
			super(thread);
		}

		@Override
		public GetStatusResponse execute(IDebugger debugger) {
			Status status = debugger.getThreadStatus(thread);
			return new GetStatusResponse(status);
		}
		
		@Override
		public Type getType() {
			return GET_THREAD_STATUS;
		}
	}

	public static class GetLineRequest extends ThreadRequest {

		public GetLineRequest() {
		}

		public GetLineRequest(IThread thread) {
			super(thread);
		}

		@Override
		public GetLineResponse execute(IDebugger debugger) {
			logger.debug(()->"before line");
			int line = debugger.getLine(thread);
			logger.debug(()->"after line:" + line);
			return new GetLineResponse(line);
		}
		
		@Override
		public Type getType() {
			return GET_LINE;
		}
	}

	public static class GetStackRequest extends ThreadRequest {

		public GetStackRequest() {
		}

		public GetStackRequest(IThread thread) {
			super(thread);
		}

		@Override
		public GetStackResponse execute(IDebugger debugger) {
			logger.debug(()->"before stack");
			IStack<?> stack = debugger.getStack(thread);
			logger.debug(()->"after stack");
			return new GetStackResponse(stack);
		}
		
		@Override
		public Type getType() {
			return GET_STACK;
		}
	}

	public static class GetVariablesRequest extends ThreadRequest {

		LeanStackFrame frame;
		
		public GetVariablesRequest() {
		}

		public GetVariablesRequest(IThread thread, IStackFrame frame) {
			super(thread);
			this.frame = new LeanStackFrame(frame);
		}

		public void setFrame(LeanStackFrame frame) {
			this.frame = frame;
		}
		
		public LeanStackFrame getFrame() {
			return frame;
		}

		@Override
		public GetVariablesResponse execute(IDebugger debugger) {
			logger.debug(()->"before variables");
			Collection<? extends IVariable> variables = debugger.getVariables(thread, frame);
			logger.debug(()->"after variables");
			return new GetVariablesResponse(variables);
		}
		
		@Override
		public Type getType() {
			return GET_VARIABLES;
		}
	}

	public static class InstallBreakpointRequest implements IDebugRequest {
		
		Section section;
		
		public InstallBreakpointRequest() {
		}
		
		public InstallBreakpointRequest(ISection section) {
			this.section = section.getClass()==Section.class ? (Section)section : new Section(section);
		}
		
		public Section getSection() {
			return section;
		}
		
		public void setSection(Section section) {
			this.section = section;
		}

		@Override
		public IDebugResponse execute(IDebugger debugger) {
			debugger.installBreakpoint(section);
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return INSTALL_BREAKPOINT;
		}
	}
	
	
	public static class SuspendRequest extends ThreadRequest {

		public SuspendRequest() {
		}

		public SuspendRequest(IThread thread) {
			super(thread);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before suspend");
			debugger.suspend(thread);
			logger.debug(()->"after suspend");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return SUSPEND;
		}
	}

	public static class ResumeRequest extends ThreadRequest {

		public ResumeRequest() {
		}

		public ResumeRequest(IThread thread) {
			super(thread);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before resume");
			debugger.resume(thread);
			logger.debug(()->"after resume");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return RESUME;
		}
	}

	public static class IsSteppingRequest extends ThreadRequest {

		public IsSteppingRequest() {
		}

		public IsSteppingRequest(IThread thread) {
			super(thread);
		}

		@Override
		public IsSteppingResponse execute(IDebugger debugger) {
			logger.debug(()->"before is stepping");
			boolean stepping = debugger.isStepping(thread);
			logger.debug(()->"after is stepping");
			return new IsSteppingResponse(stepping);
		}
		
		@Override
		public Type getType() {
			return IS_STEPPING;
		}
	}

	public static class StepOverRequest extends ThreadRequest {

		public StepOverRequest() {
		}

		public StepOverRequest(IThread thread) {
			super(thread);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before step over");
			debugger.stepOver(thread);
			logger.debug(()->"after step over");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OVER;
		}
	}

	public static class StepIntoRequest extends ThreadRequest {

		public StepIntoRequest() {
		}

		public StepIntoRequest(IThread thread) {
			super(thread);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before step into");
			debugger.stepInto(thread);
			logger.debug(()->"after step into");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_INTO;
		}
	}

	public static class StepOutRequest extends ThreadRequest {

		public StepOutRequest() {
		}

		public StepOutRequest(IThread thread) {
			super(thread);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before step out");
			debugger.stepOut(thread);
			logger.debug(()->"after step out");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OUT;
		}
	}

	public enum Type {
		GET_THREADS(GetThreadsRequest.class),
		GET_PROCESS_STATUS(GetProcessStatusRequest.class),
		GET_THREAD_STATUS(GetThreadStatusRequest.class),
		GET_LINE(GetLineRequest.class),
		GET_STACK(GetStackRequest.class),
		GET_VARIABLES(GetVariablesRequest.class),
		INSTALL_BREAKPOINT(InstallBreakpointRequest.class),
		SUSPEND(SuspendRequest.class),
		RESUME(ResumeRequest.class),
		IS_STEPPING(IsSteppingRequest.class),
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
