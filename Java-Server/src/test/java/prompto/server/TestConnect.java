package prompto.server;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

import prompto.error.PromptoError;
import prompto.remoting.Parameter;
import prompto.remoting.ParameterList;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.value.IValue;
import prompto.value.Text;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestConnect extends BaseServerTest {
	
	@Test
	public void testStartAndStop() throws Throwable {
		AppServer.stop();
		assertFalse(AppServer.isStarted());
		AppServer.start();
		assertTrue(AppServer.isStarted());
		AppServer.stop();
		assertFalse(AppServer.isStarted());
	}

	@Test
	public void testResource() throws Exception {
		URL url = new URL("http://localhost:" + port + "/js/lib/require.js");
		URLConnection cnx = url.openConnection();
		InputStream input = cnx.getInputStream();
		assertNotNull(input);
		input.close();
	}
	
	@Test
	public void testServiceNoParam() throws Exception {
		Context context = Context.newGlobalContext();
		ParameterList params = createParameterList();
		URL url = new URL("http://localhost:" + port + "/ws/run/getAllAttributes?params=" + params.toURLEncodedString(context));
		URLConnection cnx = url.openConnection();
		InputStream input = cnx.getInputStream();
		assertNotNull(input);
		JsonNode json = parseJSON(input);
		assertNotNull(json);
		input.close();
		System.out.println(json.toString());
	}

	@Test
	public void testService1TextParam() throws Exception {
		Context context = Context.newGlobalContext();
		ParameterList params = createParameterList("name", TextType.instance(), new Text("id"));
		URL url = new URL("http://localhost:" + port + "/ws/run/findAttribute?params=" + params.toURLEncodedString(context));
		URLConnection cnx = url.openConnection();
		InputStream input = cnx.getInputStream();
		assertNotNull(input);
		JsonNode json = parseJSON(input);
		assertNotNull(json);
		input.close();
		System.out.println(json.toString());
	}
	
	private ParameterList createParameterList(Object ... params) throws IOException, PromptoError {
		ParameterList list = new ParameterList();
		for(int i=0;i<params.length;i+=3) {
			Parameter param = new Parameter();
			param.setName(params[i].toString());
			param.setType((IType)params[i+1]);
			param.setValue((IValue)params[i+2]);
			list.add(param);
		}
		return list;
	}

	private JsonNode parseJSON(InputStream input) throws Exception {
		JsonParser parser = new ObjectMapper().getFactory().createParser(input);
		return parser.readValueAsTree();
	}

}
