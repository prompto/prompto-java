package prompto.debug;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import prompto.debug.IDebugRequest.StatusRequest;
import prompto.debug.IDebugResponse.StatusResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RemoteDebugger implements IDebugger {

	IDebugEventListener listener;
	IRemote remote;
	String host;
	int port;
	
	public RemoteDebugger(IRemote remote, String host, int port) {
		this.remote = remote;
		this.host = host;
		this.port = port;
	}

	static class RequestMessage {
		IDebugRequest.Type type;
		IDebugRequest object;
	}
	
	private void sendRequest(Socket client, IDebugRequest request) throws Exception {
		RequestMessage message = new RequestMessage();
		message.type = request.getType();
		message.object = request;
		new ObjectMapper().writeValue(client.getOutputStream(), message);
	}


	private IDebugResponse send(IDebugRequest request) {
		try(Socket client = new Socket(host, port)) {
			sendRequest(client, request);
			return readResponse(client);
		} catch(Exception e) {
			return null;
		}
	}


	private IDebugResponse readResponse(Socket client) throws IOException {
		try(InputStream input = client.getInputStream()) {
			JsonNode content = new ObjectMapper().readTree(input);
			String typeName = content.get("type").asText();
			IDebugRequest.Type type = IDebugRequest.Type.valueOf(typeName);
			return (IDebugResponse)(Object)new ObjectMapper().convertValue(content.get("object"), type.getClass());
		}
	}


	@Override
	public void setListener(IDebugEventListener listener) {
		this.listener = listener;
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
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepInto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepOver() {
		// TODO Auto-generated method stub
		
	}
	
	

}
