package prompto.debug;

import static org.junit.Assert.*;

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
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.debug.IAcknowledgement.Acknowledgement;
import prompto.debug.Serializer.AcknowledgementMessage;
import prompto.debug.Serializer.DebugResponseMessage;
import prompto.debug.Serializer.DebugRequestMessage;
import prompto.debug.IDebugResponse.GetStatusResponse;
import prompto.debug.IDebugRequest.GetStatusRequest;
import prompto.debug.IDebugRequest.InstallBreakpointRequest;
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
	public void testJsonStatusRequest() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		GetStatusRequest o = new GetStatusRequest();
		JsonNode json = mapper.valueToTree(o);
		o = mapper.treeToValue(json, GetStatusRequest.class);
	}
	
	@Test
	public void testStatusRequestMessage() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		DebugRequestMessage message = new DebugRequestMessage();
		message.object = new GetStatusRequest();
		message.type = message.object.getType();
		JsonNode json = mapper.valueToTree(message);
		assertEquals(IDebugRequest.Type.GET_STATUS.name(), json.get("type").asText());
		assertNull(json.get("object").get("type"));
		String s = json.toString();
		JsonNode content = mapper.readTree(s);
		String typeName = content.get("type").asText();
		IDebugRequest.Type type = IDebugRequest.Type.valueOf(typeName);
		JsonNode object = content.get("object");
		assertTrue(object instanceof ObjectNode);
		IDebugRequest request = mapper.treeToValue(object, type.getKlass());
		assertTrue(request instanceof GetStatusRequest);
	}
	
	@Test
	public void testBreakpointRequestMessage() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		DebugRequestMessage message = new DebugRequestMessage();
		message.object = new InstallBreakpointRequest(new Section("n/a", new Location(12, 18, 22), new Location(12, 22, 14), Dialect.E, true));
		message.type = message.object.getType();
		JsonNode json = mapper.valueToTree(message);
		assertEquals(IDebugRequest.Type.INSTALL_BREAKPOINT.name(), json.get("type").asText());
		assertNull(json.get("object").get("type"));
		String s = json.toString();
		JsonNode content = mapper.readTree(s);
		String typeName = content.get("type").asText();
		IDebugRequest.Type type = IDebugRequest.Type.valueOf(typeName);
		JsonNode object = content.get("object");
		assertTrue(object instanceof ObjectNode);
		IDebugRequest request = mapper.treeToValue(object, type.getKlass());
		assertTrue(request instanceof InstallBreakpointRequest);
	}

	@Test
	public void testStatusResponseMessage() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		DebugResponseMessage message = new DebugResponseMessage();
		message.object = new GetStatusResponse(Status.SUSPENDED);
		message.type = message.object.getType();
		JsonNode json = mapper.valueToTree(message);
		assertEquals(IDebugResponse.Type.GET_STATUS.name(), json.get("type").asText());
		assertNull(json.get("object").get("type"));
		String s = json.toString();
		JsonNode content = mapper.readTree(s);
		String typeName = content.get("type").asText();
		IDebugResponse.Type type = IDebugResponse.Type.valueOf(typeName);
		JsonNode object = content.get("object");
		assertTrue(object instanceof ObjectNode);
		IDebugResponse response = mapper.treeToValue(object, type.getKlass());
		assertTrue(response instanceof GetStatusResponse);
		assertEquals(Status.SUSPENDED, ((GetStatusResponse)response).getStatus());
	}
	
	
	@Test
	public void testOpenStream() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
		mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
		DebugRequestMessage message = new DebugRequestMessage();
		message.object = new GetStatusRequest();
		message.type = message.object.getType();
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
	
	@Test
	public void testAcknowledgementMessage() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		AcknowledgementMessage message = new AcknowledgementMessage();
		message.type = IAcknowledgement.Type.RECEIVED;
		JsonNode json = mapper.valueToTree(message);
		assertEquals(IAcknowledgement.Type.RECEIVED.name(), json.get("type").asText());
		String s = json.toString();
		JsonNode content = mapper.readTree(s);
		String typeName = content.get("type").asText();
		IAcknowledgement.Type type = IAcknowledgement.Type.valueOf(typeName);
		IAcknowledgement ack = type.getKlass().newInstance();
		assertTrue(ack instanceof Acknowledgement);
	}

}
