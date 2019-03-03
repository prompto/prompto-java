package prompto.debug;

import static prompto.debug.IDebugResponse.*;
import static prompto.debug.IDebugRequest.Type.*;

import java.util.Collection;

import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.utils.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IDebugRequest {

	static Logger logger = new Logger();

	@JsonIgnore
	Type getType();
	IDebugResponse execute(IDebugger debugger);

	
	public static class GetWorkersRequest implements IDebugRequest {

		public GetWorkersRequest() {
		}

		@Override
		public GetWorkersResponse execute(IDebugger debugger) {
			Collection<? extends IWorker> workers = debugger.getWorkers();
			return new GetWorkersResponse(workers);
		}
		
		@Override
		public Type getType() {
			return Type.GET_WORKERS;
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
	
	static abstract class WorkerRequest implements IDebugRequest {
		
		String workerId;
		
		WorkerRequest() {
		}
		
		WorkerRequest(IWorker worker) {
			this.workerId = worker.getWorkerId();
		}
		
		public String getWorkerId() {
			return workerId;
		}
		
		public void setWorkerId(String workerId) {
			this.workerId = workerId;
		}
		
		
	}
	
	public static class GetWorkerStatusRequest extends WorkerRequest {

		public GetWorkerStatusRequest() {
		}

		public GetWorkerStatusRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public GetStatusResponse execute(IDebugger debugger) {
			Status status = debugger.getWorkerStatus(DebuggedWorker.parse(workerId));
			return new GetStatusResponse(status);
		}
		
		@Override
		public Type getType() {
			return GET_WORKER_STATUS;
		}
	}

	public static class GetLineRequest extends WorkerRequest {

		public GetLineRequest() {
		}

		public GetLineRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public GetLineResponse execute(IDebugger debugger) {
			logger.debug(()->"before line");
			IWorker worker = DebuggedWorker.parse(workerId);
			int lineInFile = debugger.getLineInFile(worker);
			int lineInMethod = debugger.getLineInMethod(worker);
			logger.debug(()->"after line:" + lineInFile + ", " + lineInMethod);
			return new GetLineResponse(lineInFile, lineInMethod);
		}
		
		@Override
		public Type getType() {
			return GET_LINE;
		}
	}

	public static class GetStackRequest extends WorkerRequest {

		public GetStackRequest() {
		}

		public GetStackRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public GetStackResponse execute(IDebugger debugger) {
			logger.debug(()->"before stack");
			IStack<?> stack = debugger.getStack(DebuggedWorker.parse(workerId));
			logger.debug(()->"after stack");
			return new GetStackResponse(stack);
		}
		
		@Override
		public Type getType() {
			return GET_STACK;
		}
	}

	public static class GetVariablesRequest extends WorkerRequest {

		LeanStackFrame stackFrame;
		
		public GetVariablesRequest() {
		}

		public GetVariablesRequest(IWorker worker, IStackFrame stackFrame) {
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
		public GetVariablesResponse execute(IDebugger debugger) {
			logger.debug(()->"before variables");
			Collection<? extends IVariable> variables = debugger.getVariables(DebuggedWorker.parse(workerId), stackFrame);
			logger.debug(()->"after variables");
			return new GetVariablesResponse(variables);
		}
		
		@Override
		public Type getType() {
			return GET_VARIABLES;
		}
	}
	
	
	public static class GetVariableRequest extends WorkerRequest {

		LeanStackFrame stackFrame;
		String variableName;
		
		public GetVariableRequest() {
		}

		public GetVariableRequest(IWorker worker, IStackFrame stackFrame, String variableName) {
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
		public GetVariableResponse execute(IDebugger debugger) {
			logger.debug(()->"before variable");
			IVariable variable = debugger.getVariable(DebuggedWorker.parse(workerId), stackFrame, variableName);
			logger.debug(()->"after variables");
			return new GetVariableResponse(variable);
		}
		
		@Override
		public Type getType() {
			return GET_VARIABLE;
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
	
	
	public static class SuspendRequest extends WorkerRequest {

		public SuspendRequest() {
		}

		public SuspendRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before suspend");
			debugger.suspend(DebuggedWorker.parse(workerId));
			logger.debug(()->"after suspend");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return SUSPEND;
		}
	}

	public static class ResumeRequest extends WorkerRequest {

		public ResumeRequest() {
		}

		public ResumeRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before resume");
			debugger.resume(DebuggedWorker.parse(workerId));
			logger.debug(()->"after resume");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return RESUME;
		}
	}

	public static class TerminateRequest extends WorkerRequest {

		public TerminateRequest() {
		}

		public TerminateRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before terminate");
			debugger.terminate(DebuggedWorker.parse(workerId));
			logger.debug(()->"after terminate");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return TERMINATE;
		}
	}

	public static class IsSteppingRequest extends WorkerRequest {

		public IsSteppingRequest() {
		}

		public IsSteppingRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public IsSteppingResponse execute(IDebugger debugger) {
			logger.debug(()->"before is stepping");
			boolean stepping = debugger.isStepping(DebuggedWorker.parse(workerId));
			logger.debug(()->"after is stepping");
			return new IsSteppingResponse(stepping);
		}
		
		@Override
		public Type getType() {
			return IS_STEPPING;
		}
	}

	public static class StepOverRequest extends WorkerRequest {

		public StepOverRequest() {
		}

		public StepOverRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before step over");
			debugger.stepOver(DebuggedWorker.parse(workerId));
			logger.debug(()->"after step over");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OVER;
		}
	}

	public static class StepIntoRequest extends WorkerRequest {

		public StepIntoRequest() {
		}

		public StepIntoRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before step into");
			debugger.stepInto(DebuggedWorker.parse(workerId));
			logger.debug(()->"after step into");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_INTO;
		}
	}

	public static class StepOutRequest extends WorkerRequest {

		public StepOutRequest() {
		}

		public StepOutRequest(IWorker worker) {
			super(worker);
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			logger.debug(()->"before step out");
			debugger.stepOut(DebuggedWorker.parse(workerId));
			logger.debug(()->"after step out");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OUT;
		}
	}

	public enum Type {
		GET_WORKERS(GetWorkersRequest.class),
		GET_PROCESS_STATUS(GetProcessStatusRequest.class),
		GET_WORKER_STATUS(GetWorkerStatusRequest.class),
		GET_LINE(GetLineRequest.class),
		GET_STACK(GetStackRequest.class),
		GET_VARIABLES(GetVariablesRequest.class),
		GET_VARIABLE(GetVariableRequest.class),
		INSTALL_BREAKPOINT(InstallBreakpointRequest.class),
		SUSPEND(SuspendRequest.class),
		RESUME(ResumeRequest.class),
		TERMINATE(TerminateRequest.class),
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
