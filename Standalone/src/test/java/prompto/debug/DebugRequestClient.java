package prompto.debug;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

import static prompto.debug.IDebugRequest.*;
import static prompto.debug.IDebugResponse.*;
import prompto.parser.ISection;

/* a client which is able to send debug requests (such as step, get stack frames...) to a debug request server */
public abstract class DebugRequestClient implements IDebugger {

	String remoteHost;
	int remotePort;
	boolean connected = false;
	
	public void setRemote(String host, int port) {
		this.remoteHost = host;
		this.remotePort = port;
		this.connected = true;
	}
	
	public void setConnected(boolean set) {
		this.connected = set;
	}
	
	protected IDebugResponse send(IDebugRequest request) {
		return sendRequest(request, null);
	}
	
	protected abstract boolean isRemoteAlive();
	protected abstract IDebugResponse sendRequest(IDebugRequest request, Consumer<Exception> errorHandler);
	
	@Override
	public Collection<? extends IWorker> getWorkers() {
		return Collections.emptyList(); // unused in tests
	}
	
	
	@Override
	public Status getWorkerStatus(IWorker worker) {
		if(!isRemoteAlive())
			return Status.TERMINATED;
		else
			return fetchWorkerStatus(worker);
	}

	private Status fetchWorkerStatus(IWorker worker) {
		if(!connected)
			return Status.UNREACHABLE;
		IDebugRequest request = new GetWorkerStatusRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetStatusResponse)
			return ((GetStatusResponse)response).getStatus();
		else 
			return Status.UNREACHABLE;
	}

	@Override
	public IStack<?> getStack(IWorker worker) {
		IDebugRequest request = new GetStackRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetStackResponse) {
			LeanStack stack = ((GetStackResponse)response).getStack();
			return new ClientStack(this, worker, stack);
		} else 
			throw new UnreachableException();
	}
	
	@Override
	public Collection<? extends IVariable> getVariables(IWorker worker, IStackFrame frame) {
		IDebugRequest request = new GetVariablesRequest(worker, frame);
		IDebugResponse response = send(request) ;
		if(response instanceof GetVariablesResponse)
			return ((GetVariablesResponse)response).getVariables();
		else 
			throw new UnreachableException();
	}
	
	@Override
	public IVariable getVariable(IWorker worker, IStackFrame frame, String name) {
		IDebugRequest request = new GetVariableRequest(worker, frame, name);
		IDebugResponse response = send(request) ;
		if(response instanceof GetVariableResponse)
			return ((GetVariableResponse)response).getVariable();
		else 
			throw new UnreachableException();
	}

	@Override
	public int getLineInFile(IWorker worker) {
		IDebugRequest request = new GetLineRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetLineResponse)
			return ((GetLineResponse)response).getLineInFile();
		else 
			throw new UnreachableException();
	}
	
	@Override
	public int getLineInMethod(IWorker worker) {
		IDebugRequest request = new GetLineRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetLineResponse)
			return ((GetLineResponse)response).getLineInMethod();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isStepping(IWorker worker) {
		if(!connected)
			return false;
		IDebugRequest request = new IsSteppingRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof IsSteppingResponse)
			return ((IsSteppingResponse)response).isStepping();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isSuspended(IWorker worker) {
		if(!connected || isTerminated())
			return false;
		return fetchWorkerStatus(worker)==Status.SUSPENDED;
	}

	@Override
	public boolean canTerminate() {
		return !isTerminated();
	}
	
	@Override
	public boolean canResume(IWorker worker) {
		return !isTerminated() && isSuspended(worker);
	}

	@Override
	public boolean canSuspend(IWorker worker) {
		return !isTerminated() && !isSuspended(worker);
	}

	@Override
	public boolean canStepInto(IWorker worker) {
		return isSuspended(worker);
	}

	@Override
	public boolean canStepOver(IWorker worker) {
		return isSuspended(worker);
	}

	@Override
	public boolean canStepOut(IWorker worker) {
		return isSuspended(worker);
	}

	@Override
	public void suspend(IWorker worker) {
		IDebugRequest request = new SuspendRequest(worker);
		send(request);
	}

	@Override
	public void resume(IWorker worker) {
		IDebugRequest request = new ResumeRequest(worker);
		send(request);
	}
	
	@Override
	public void terminate(IWorker worker) {
		IDebugRequest request = new TerminateRequest(worker);
		send(request);
	}

	@Override
	public void stepInto(IWorker worker) {
		IDebugRequest request = new StepIntoRequest(worker);
		send(request);
	}

	@Override
	public void stepOut(IWorker worker) {
		IDebugRequest request = new StepOutRequest(worker);
		send(request);
	}

	@Override
	public void stepOver(IWorker worker) {
		IDebugRequest request = new StepOverRequest(worker);
		send(request);
	}
	
	@Override
	public void installBreakpoint(ISection worker) {
		IDebugRequest request = new InstallBreakpointRequest(worker);
		send(request);
	}

}
