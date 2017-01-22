package prompto.debug;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import prompto.parser.ISection;
import prompto.runtime.IContext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DebuggerServer implements IDebugEventListener {

	LocalDebugger debugger;
	ObjectMapper mapper;
	int port;
	boolean loop;
	
	public DebuggerServer(LocalDebugger debugger, int port) {
		this.debugger = debugger;
		this.port = port;
		this.mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
		mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
	}

	public void acceptLoop() throws Exception {
		loop = true;
		try(ServerSocket server = new ServerSocket(port)) {
			server.setSoTimeout(1000);
			while(loop) {
				try {
					Socket client = server.accept();
					handleRequest(client);
					System.err.println("looping");
				} catch(SocketTimeoutException e) {
					// nothing to do, just helps exit the loop
				}
			}
		}
	}

	private void handleRequest(Socket client) throws Exception {
		// don't close these streams since that would close the underlying socket
		System.err.println("opening server InputStream");
		InputStream input = client.getInputStream();
		System.err.println("opening server OutputStream");
		OutputStream output = client.getOutputStream();
		System.err.println("reading server request");
		IDebugRequest request = readRequest(input);
		System.err.println("handling server request");
		IDebugResponse response = request.execute(debugger);
		System.err.println("sending server response");
		sendResponse(output, response);
		System.err.println("flushing server response");
		output.flush();
	}

	private IDebugRequest readRequest(InputStream input) throws Exception {
		JsonNode content = mapper.readTree(input);
		String typeName = content.get("type").asText();
		IDebugRequest.Type type = IDebugRequest.Type.valueOf(typeName);
		return mapper.convertValue(content.get("object"), type.getKlass());
	}


	static class ResponseMessage {
		IDebugResponse.Type type;
		IDebugResponse object;
		
		public IDebugResponse.Type getType() {
			return type;
		}
		
		public IDebugResponse getObject() {
			return object;
		}
	}
	
	private void sendResponse(OutputStream output, IDebugResponse response) throws Exception {
		ResponseMessage message = new ResponseMessage();
		message.type = response.getType();
		message.object = response;
		mapper.writeValue(output, message);
	}

	@Override
	public void handleSuspendEvent(SuspendReason reason, IContext context, ISection section) {
		System.err.println("handleSuspendEvent");
	}

	@Override
	public void handleResumeEvent(ResumeReason reason, IContext context, ISection section) {
		System.err.println("handleResumeEvent");
	}

	@Override
	public void handleTerminateEvent() {
		System.err.println("handleTerminateEvent");
		loop = false;
	}


}
