package prompto.debug;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

import prompto.debug.request.GetLineDebugRequest;
import prompto.debug.request.GetVariableDebugRequest;
import prompto.debug.request.GetVariablesDebugRequest;
import prompto.debug.request.GetWorkerStackDebugRequest;
import prompto.debug.request.GetWorkerStatusDebugRequest;
import prompto.debug.request.IDebugRequest;
import prompto.debug.request.InstallBreakpointDebugRequest;
import prompto.debug.request.IsSteppingDebugRequest;
import prompto.debug.request.ResumeDebugRequest;
import prompto.debug.request.StepIntoDebugRequest;
import prompto.debug.request.StepOutDebugRequest;
import prompto.debug.request.StepOverDebugRequest;
import prompto.debug.request.SuspendDebugRequest;
import prompto.debug.request.TerminateDebugRequest;
import prompto.debug.response.GetLineDebugResponse;
import prompto.debug.response.GetVariableDebugResponse;
import prompto.debug.response.GetVariablesDebugResponse;
import prompto.debug.response.GetWorkerStackDebugResponse;
import prompto.debug.response.GetWorkerStatusDebugResponse;
import prompto.debug.response.IDebugResponse;
import prompto.debug.response.IsSteppingDebugResponse;
import prompto.debug.stack.ClientStack;
import prompto.debug.stack.IStack;
import prompto.debug.stack.IStackFrame;
import prompto.debug.stack.LeanStack;
import prompto.debug.variable.IVariable;
import prompto.debug.worker.IWorker;
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
	public WorkerStatus getWorkerStatus(IWorker worker) {
		if(!isRemoteAlive())
			return WorkerStatus.WORKER_TERMINATED;
		else
			return fetchWorkerStatus(worker);
	}

	private WorkerStatus fetchWorkerStatus(IWorker worker) {
		if(!connected)
			return WorkerStatus.WORKER_UNREACHABLE;
		IDebugRequest request = new GetWorkerStatusDebugRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetWorkerStatusDebugResponse)
			return ((GetWorkerStatusDebugResponse)response).getWorkerStatus();
		else 
			return WorkerStatus.WORKER_UNREACHABLE;
	}

	@Override
	public IStack<?> getWorkerStack(IWorker worker) {
		IDebugRequest request = new GetWorkerStackDebugRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetWorkerStackDebugResponse) {
			LeanStack stack = ((GetWorkerStackDebugResponse)response).getStack();
			return new ClientStack(this, worker, stack);
		} else 
			throw new UnreachableException();
	}
	
	@Override
	public Collection<? extends IVariable> getVariables(IWorker worker, IStackFrame frame) {
		IDebugRequest request = new GetVariablesDebugRequest(worker, frame);
		IDebugResponse response = send(request) ;
		if(response instanceof GetVariablesDebugResponse)
			return ((GetVariablesDebugResponse)response).getVariables();
		else 
			throw new UnreachableException();
	}
	
	@Override
	public IVariable getVariable(IWorker worker, IStackFrame frame, String name) {
		IDebugRequest request = new GetVariableDebugRequest(worker, frame, name);
		IDebugResponse response = send(request) ;
		if(response instanceof GetVariableDebugResponse)
			return ((GetVariableDebugResponse)response).getVariable();
		else 
			throw new UnreachableException();
	}

	@Override
	public int getLineInFile(IWorker worker) {
		IDebugRequest request = new GetLineDebugRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetLineDebugResponse)
			return ((GetLineDebugResponse)response).getLineInFile();
		else 
			throw new UnreachableException();
	}
	
	@Override
	public int getLineInMethod(IWorker worker) {
		IDebugRequest request = new GetLineDebugRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof GetLineDebugResponse)
			return ((GetLineDebugResponse)response).getLineInMethod();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isStepping(IWorker worker) {
		if(!connected)
			return false;
		IDebugRequest request = new IsSteppingDebugRequest(worker);
		IDebugResponse response = send(request) ;
		if(response instanceof IsSteppingDebugResponse)
			return ((IsSteppingDebugResponse)response).isStepping();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isSuspended(IWorker worker) {
		if(!connected || isTerminated())
			return false;
		return fetchWorkerStatus(worker)==WorkerStatus.WORKER_SUSPENDED;
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
		IDebugRequest request = new SuspendDebugRequest(worker);
		send(request);
	}

	@Override
	public void resume(IWorker worker) {
		IDebugRequest request = new ResumeDebugRequest(worker);
		send(request);
	}
	
	@Override
	public void terminate(IWorker worker) {
		IDebugRequest request = new TerminateDebugRequest(worker);
		send(request);
	}

	@Override
	public void stepInto(IWorker worker) {
		IDebugRequest request = new StepIntoDebugRequest(worker);
		send(request);
	}

	@Override
	public void stepOut(IWorker worker) {
		IDebugRequest request = new StepOutDebugRequest(worker);
		send(request);
	}

	@Override
	public void stepOver(IWorker worker) {
		IDebugRequest request = new StepOverDebugRequest(worker);
		send(request);
	}
	
	@Override
	public void installBreakpoint(ISection section) {
		IDebugRequest request = new InstallBreakpointDebugRequest(section);
		send(request);
	}

}
