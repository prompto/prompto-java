package prompto.debug;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import prompto.debug.Serializer.DebugRequestMessage;
import prompto.debug.ack.Acknowledged;
import prompto.debug.request.GetProcessStatusDebugRequest;
import prompto.debug.request.GetWorkerStatusDebugRequest;
import prompto.debug.request.InstallBreakpointDebugRequest;
import prompto.debug.response.GetProcessStatusDebugResponse;
import prompto.parser.Dialect;
import prompto.parser.Location;
import prompto.parser.Section;

public class TestDebugMessage {

	static class EmptyClass {
	}
	
	static class NonEmptyClass {
		
		String field;
		
		public String getField() {
			return field;
		}
		
		public void setField(String field) {
			this.field = field;
		}
	}
	
	@Test
	public void testJsonNonEmpty() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		NonEmptyClass o = new NonEmptyClass();
		o.field = "test";
		JsonNode json = mapper.valueToTree(o);
		o = mapper.treeToValue(json, NonEmptyClass.class);
	}
	
	
	@Test
	public void testJsonEmpty() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		EmptyClass o = new EmptyClass();
		JsonNode json = mapper.valueToTree(o);
		o = mapper.treeToValue(json, EmptyClass.class);
	}

	@Test
	public void testJsonProcessStatusRequest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		GetProcessStatusDebugRequest o = new GetProcessStatusDebugRequest();
		JsonNode json = mapper.valueToTree(o);
		o = mapper.treeToValue(json, GetProcessStatusDebugRequest.class);
	}
	
	@Test
	public void testProcessStatusRequestMessage() throws Exception {
		Object value = new GetProcessStatusDebugRequest();
		String message = Serializer.writeMessage(value);
		Object request = Serializer.readDebugRequest(message);
		assertTrue(request instanceof GetProcessStatusDebugRequest);
	}
	
	@Test
	public void testJsonThreadStatusRequest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		GetWorkerStatusDebugRequest o = new GetWorkerStatusDebugRequest();
		JsonNode json = mapper.valueToTree(o);
		o = mapper.treeToValue(json, GetWorkerStatusDebugRequest.class);
	}
	
	@Test
	public void testThreadStatusRequestMessage() throws Exception {
		Object value = new GetWorkerStatusDebugRequest();
		String message = Serializer.writeMessage(value);
		Object request = Serializer.readDebugRequest(message);
		assertTrue(request instanceof GetWorkerStatusDebugRequest);
	}

	@Test
	public void testBreakpointRequestMessage() throws Exception {
		Object value = new InstallBreakpointDebugRequest(new Section("n/a", new Location(12, 18, 22), new Location(12, 22, 14), Dialect.E, true));
		String message = Serializer.writeMessage(value);
		Object request = Serializer.readDebugRequest(message);
		assertTrue(request instanceof InstallBreakpointDebugRequest);
	}

	@Test
	public void testStatusResponseMessage() throws Exception {
		Object value = new GetProcessStatusDebugResponse(ProcessStatus.PROCESS_STARTING);
		String message = Serializer.writeMessage(value);
		Object response = Serializer.readDebugResponse(message);
		assertTrue(response instanceof GetProcessStatusDebugResponse);
		assertEquals(ProcessStatus.PROCESS_STARTING, ((GetProcessStatusDebugResponse)response).getProcessStatus());
	}
	
	
	@Test
	public void testAcknowledgementMessage() throws Exception {
		Object value = new Acknowledged();
		String message = Serializer.writeMessage(value);
		Object response = Serializer.readAcknowledgement(message);
		assertTrue(response instanceof Acknowledged);
	}

	@Test
	public void testOpenStream() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
		mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
		DebugRequestMessage message = new DebugRequestMessage();
		message.value = new GetProcessStatusDebugRequest();
		message.type = message.value.getClass().getSimpleName();
		JsonNode json = mapper.valueToTree(message);
		String s = json.toString();
		try(InputStream input = new ByteArrayInputStream(s.getBytes())) {
			/* JsonNode node = */ mapper.readTree(input);
			int read = input.read();
			assertEquals(-1, read);
			try(OutputStream output = new ByteArrayOutputStream()) {
				mapper.writeValue(output, message);
				output.flush();
				output.write(33);
			}
		}
	}
	

}
