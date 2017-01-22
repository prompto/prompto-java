package prompto.debug;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import prompto.parser.ISection;
import prompto.runtime.IContext;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DebuggerServer implements IDebugEventListener {

	LocalDebugger debugger;
	int port;
	boolean loop;
	
	public DebuggerServer(LocalDebugger debugger, int port) {
		this.debugger = debugger;
		this.port = port;
	}

	public void loop() throws Exception {
		loop = true;
		try(ServerSocket server = new ServerSocket(port)) {
			server.setSoTimeout(100);
			while(loop) {
				try {
					Socket client = server.accept();
					handleRequest(client);
				} catch(SocketTimeoutException e) {
					// nothing to do, just helps exit the loop
				}
			}
		}
	}

	private IDebugRequest readRequest(Socket client) throws Exception {
		try(InputStream input = client.getInputStream()) {
			JsonNode content = new ObjectMapper().readTree(input);
			String typeName = content.get("type").asText();
			IDebugRequest.Type type = IDebugRequest.Type.valueOf(typeName);
			return (IDebugRequest)(Object)new ObjectMapper().convertValue(content.get("object"), type.getClass());
		}
	}

	private void handleRequest(Socket client) throws Exception {
		IDebugRequest request = readRequest(client);
		IDebugResponse response = request.execute(debugger);
		sendResponse(client, response);
	}

	static class ResponseMessage {
		IDebugResponse.Type type;
		IDebugResponse object;
	}
	
	private void sendResponse(Socket client, IDebugResponse response) throws Exception {
		ResponseMessage message = new ResponseMessage();
		message.type = response.getType();
		message.object = response;
		new ObjectMapper().writeValue(client.getOutputStream(), message);
	}

	@Override
	public void handleSuspendEvent(SuspendReason reason, IContext context, ISection section) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleResumeEvent(ResumeReason reason, IContext context, ISection section) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleTerminateEvent() {
		// TODO Auto-generated method stub
		
	}


}
