package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.function.Consumer;

import prompto.debug.IDebugRequest.ConnectRequest;
import prompto.debug.IDebugRequest.LineRequest;
import prompto.debug.IDebugRequest.InstallBreakpointRequest;
import prompto.debug.IDebugRequest.ResumeRequest;
import prompto.debug.IDebugRequest.StatusRequest;
import prompto.debug.IDebugRequest.StepIntoRequest;
import prompto.debug.IDebugRequest.StepOutRequest;
import prompto.debug.IDebugRequest.StepOverRequest;
import prompto.debug.IDebugResponse.LineResponse;
import prompto.debug.IDebugResponse.StatusResponse;
import prompto.parser.ISection;

public class DebugRequestClient implements IDebugger {

	DebugEventServer listener;
	IRemote remote;
	String host;
	int port;
	
	public DebugRequestClient(IRemote remote, String host, int port, IDebugEventListener listener) {
		this.listener = new DebugEventServer(listener);
		this.remote = remote;
		this.host = host;
		this.port = port;
	}

	@Override
	public void connect() {
		listener.startListening();
		ConnectRequest request = new ConnectRequest();
		request.setPort(listener.port);
		int count = 0;
		while(remote.isAlive() && ++count<=100) try {
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
		if(!remote.isAlive())
			return Status.TERMINATED;
		else
			return fetchStatus();
	}

	private Status fetchStatus() {
		IDebugRequest request = new StatusRequest();
		IDebugResponse response = send(request) ;
		if(response instanceof StatusResponse)
			return ((StatusResponse)response).getStatus();
		else 
			return Status.UNREACHABLE;
	}

	@Override
	public Stack getStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLine() {
		IDebugRequest request = new LineRequest();
		IDebugResponse response = send(request) ;
		if(response instanceof LineResponse)
			return ((LineResponse)response).getLine();
		else 
			throw new UnreachableException();
	}

	@Override
	public boolean isStepping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSuspended() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTerminated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void notifyTerminated() {
		if(listener!=null)
			listener.stopListening();
	}

	@Override
	public boolean canResume() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canSuspend() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepInto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepOut() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void suspend() {
		// TODO Auto-generated method stub
		
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
