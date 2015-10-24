package prompto.server;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import prompto.error.PromptoError;
import prompto.remoting.Parameter;
import prompto.remoting.ParameterList;
import prompto.runtime.Context;
import prompto.server.AppServer;
import prompto.store.MemStore;
import prompto.store.Version;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.value.IValue;
import prompto.value.Text;

public class TestConnect {

	@Before
	public void before() throws Exception {
		// bootstrap
		AppServer.bootstrap(new MemStore(), null, "test", Version.parse("1.0.0"));
		// adjust handler path for junit and cobertura context
		Handler rh1 = AppServer.prepareResourceHandler("/");
		Handler rh2 = AppServer.prepareResourceHandler("../classes/");
		Handler rh3 = AppServer.prepareResourceHandler("../test-classes/");
		Handler rh4 = AppServer.prepareResourceHandler("../generated-classes/cobertura/");
		// a bit more tricky for WebAppContext
		String thisPath = TestConnect.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		System.out.println(thisPath);
		Handler ws = AppServer.prepareServiceHandler("/ws", thisPath);
		HandlerList list = new HandlerList();
		list.addHandler(rh1);
		list.addHandler(rh2);
		list.addHandler(rh3);
		list.addHandler(rh4);
		list.addHandler(ws);
		list.addHandler(new DefaultHandler());
		// start server
		AppServer.startServer(8888, list);
		assertTrue(AppServer.isStarted());
	}
	
	@After
	public void after() throws Exception {
		if(AppServer.isStarted())
			AppServer.stop();
	}
	
	@Test
	public void testStartAndStop() throws Exception {
		AppServer.stop();
		assertFalse(AppServer.isStarted());
		AppServer.start();
		assertTrue(AppServer.isStarted());
		AppServer.stop();
	}

	@Test
	public void testResource() throws Exception {
		URL url = new URL("http://localhost:8888/js/lib/require.js");
		URLConnection cnx = url.openConnection();
		InputStream input = cnx.getInputStream();
		assertNotNull(input);
		input.close();
	}
	
	@Test
	public void testServiceNoParam() throws Exception {
		Context context = Context.newGlobalContext();
		ParameterList params = createParameterList();
		URL url = new URL("http://localhost:8888/ws/getAllAttributes?params=" + params.toURLEncodedString(context));
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
		URL url = new URL("http://localhost:8888/ws/findAttribute?params=" + params.toURLEncodedString(context));
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
