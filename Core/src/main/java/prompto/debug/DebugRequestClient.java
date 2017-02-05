package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.function.Consumer;
import java.util.function.Supplier;

import prompto.debug.IDebugRequest.ConnectRequest;
import prompto.debug.IDebugRequest.GetLineRequest;
import prompto.debug.IDebugRequest.InstallBreakpointRequest;
import prompto.debug.IDebugRequest.SuspendRequest;
import prompto.debug.IDebugRequest.ResumeRequest;
import prompto.debug.IDebugRequest.GetStatusRequest;
import prompto.debug.IDebugRequest.GetStackRequest;
import prompto.debug.IDebugRequest.StepIntoRequest;
import prompto.debug.IDebugRequest.IsSteppingRequest;
import prompto.debug.IDebugRequest.StepOutRequest;
import prompto.debug.IDebugRequest.StepOverRequest;
import prompto.debug.IDebugResponse.GetLineResponse;
import prompto.debug.IDebugResponse.GetStatusResponse;
import prompto.debug.IDebugResponse.GetStackResponse;
import prompto.debug.IDebugResponse.IsSteppingResponse;
import prompto.parser.ISection;

public class DebugRequestClient implements IDebugger {

	DebugEventServer listener;
	Supplier<Boolean> remote;
	String host;
	int port;
	
	public DebugRequestClient(Thread thread, String host, int port, IDebugEventListener listener) {
		this.listener = new DebugEventServer(listener);
		this.remote = ()->thread.isAlive();
		this.host = host;
		this.port = port;
	}

	public DebugRequestClient(Process process, String host, int port, IDebugEventListener listener) {
		this.listener = new DebugEventServer(listener);
		this.remote = ()->process.isAlive();
		this.host = host;
		this.port = port;
	}

	@Override
	public void connect() {
		listener.startListening();
		ConnectRequest request = new ConnectRequest();
		request.setPort(listener.port);
		int count = 0;
		while(remote.get() && ++count<=100) try {
			IDebugResponse ack = send(request, (e)->{});
			if(ack!=null)
				return;
			Thread.sleep(100);
		} catch(InterruptedException e) {
			break;
		}
		throw new UnreachableException();
	}
	
	private IDebugResponse send(IDebugRequest request) {
		return send(request, null);
	}
	
	private IDebugResponse send(IDebugRequest request, Consumer<Exception> errorHandler) {
		LocalDebugger.showEvent("DebugRequestClient sends " + request.getType());
		try(Socket client = new Socket(host, port)) {
			try(OutputStream output = client.getOutputStream()) {
				sendRequest(output, request);
				try(InputStream input = client.getInputStream()) {
					IDebugResponse response = readResponse(input);
					LocalDebugger.showEvent("DebugRequestClient receives " + response.getType());
					return response;
				}
			}
		} catch(Exception e) {
			if(errorHandler!=null)
				errorHandler.accept(e);
			else
				e.printStackTrace(System.err);
			return null;
		}
	}


	private void sendRequest(OutputStream output, IDebugRequest request) throws Exception {
		Serializer.writeDebugRequest(output, request);
	}


	private IDebugResponse readResponse(InputStream input) throws Exception {
		return Serializer.readDebugResponse(input);
	}


	@Override
	public void setListener(IDebugEventListener listener) {
		this.listener.listener = listener;
	}
	

	@Override
	public Status getStatus() {
		if(!remote.get())
			return Status.TERMINATED;
		else
			return fetchStatus();
	}

	private Status fetchStatus() {
		IDebugRequest request = new GetStatusRequest();
		IDebugResponse response = send(request) ;
		if(response instanceof GetStatusResponse)
			return ((GetStatusResponse)response).getStatus();
		else 
			return Status.UNREACHABLE;
	}

	@Override
	public IStack<?> getStack() {
		IDebugRequest request = new GetStackRequest();
		IDebugResponse response = send(request) ;
		if(response instanceof GetStackResponse)
			return ((GetStackResponse)response).getStack();
		else 
			throw new UnreachableException();
	}

	@Override
	public int getLine() {
		IDebugRequest request = new GetLineRequest();
		IDebugResponse response = send(request) ;
		if(response instanceof GetLineResponse)
			return ((GetLineResponse)response).getLine();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isStepping() {
		IDebugRequest request = new IsSteppingRequest();
		IDebugResponse response = send(request) ;
		if(response instanceof IsSteppingResponse)
			return ((IsSteppingResponse)response).isStepping();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isSuspended() {
		return fetchStatus()==Status.SUSPENDED;
	}

	@Override
	public boolean canTerminate() {
		return !isTerminated();
	}
	
	@Override
	public boolean isTerminated() {
		return listener!=null && !listener.isListening();
	}

	@Override
	public void notifyTerminated() {
		if(listener!=null)
			listener.stopListening();
	}

	@Override
	public boolean canResume() {
		return isSuspended();
	}

	@Override
	public boolean canSuspend() {
		return !isSuspended();
	}

	@Override
	public boolean canStepInto() {
		return isSuspended();
	}

	@Override
	public boolean canStepOver() {
		return isSuspended();
	}

	@Override
	public boolean canStepOut() {
		return isSuspended();
	}

	@Override
	public void suspend() {
		IDebugRequest request = new SuspendRequest();
		send(request);
	}

	@Override
	public void resume() {
		IDebugRequest request = new ResumeRequest();
		send(request);
	}

	@Override
	public void terminate() {
		listener.stopListening();
	}

	@Override
	public void stepInto() {
		IDebugRequest request = new StepIntoRequest();
		send(request);
	}

	@Override
	public void stepOut() {
		IDebugRequest request = new StepOutRequest();
		send(request);
	}

	@Override
	public void stepOver() {
		IDebugRequest request = new StepOverRequest();
		send(request);
	}
	
	@Override
	public void installBreakpoint(ISection section) {
		IDebugRequest request = new InstallBreakpointRequest(section);
		send(request);
	}

}
