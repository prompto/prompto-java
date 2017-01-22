package prompto.debug;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import prompto.debug.IDebugRequest.StatusRequest;
import prompto.debug.IDebugResponse.StatusResponse;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RemoteDebugger implements IDebugger {

	IDebugEventListener listener;
	ObjectMapper mapper;
	IRemote remote;
	String host;
	int port;
	
	public RemoteDebugger(IRemote remote, String host, int port) {
		this.remote = remote;
		this.host = host;
		this.port = port;
		mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
		mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
	}

	private IDebugResponse send(IDebugRequest request) {
		System.err.println("opening client Socket");
		try(Socket client = new Socket(host, port)) {
			System.err.println("opening client OutputStream");
			try(OutputStream output = client.getOutputStream()) {
				System.err.println("sending client request");
				sendRequest(output, request);
				System.err.println("opening client InputStream");
				try(InputStream input = client.getInputStream()) {
					System.err.println("reading client response");
					return readResponse(input);
				}
			}
		} catch(Exception e) {
			e.printStackTrace(System.err);
			return null;
		}
	}


	static class RequestMessage {
		IDebugRequest.Type type;
		IDebugRequest object;
		
		public IDebugRequest.Type getType() {
			return type;
		}
		
		public IDebugRequest getObject() {
			return object;
		}
	}
	
	private void sendRequest(OutputStream output, IDebugRequest request) throws Exception {
		RequestMessage message = new RequestMessage();
		message.type = request.getType();
		message.object = request;
		mapper.writeValue(output, message);
		System.err.println("flushing client request");
		output.flush();
	}


	private IDebugResponse readResponse(InputStream input) throws IOException {
		JsonNode content = mapper.readTree(input);
		String typeName = content.get("type").asText();
		IDebugResponse.Type type = IDebugResponse.Type.valueOf(typeName);
		return mapper.convertValue(content.get("object"), type.getKlass());
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
