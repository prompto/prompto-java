package prompto.server;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.server.CodeServer;

public class TestConnect {

	@Before
	public void before() throws Exception {
		// adjust handler path for junit and cobertura context
		Handler rh1 = CodeServer.prepareResourceHandler("/");
		Handler rh2 = CodeServer.prepareResourceHandler("../classes/");
		Handler rh3 = CodeServer.prepareResourceHandler("../generated-classes/cobertura/");
		// a bit more tricky for WebAppContext
		String thisPath = TestConnect.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		thisPath = thisPath.replace("/test-classes/", "/classes/");
		Handler ws = CodeServer.prepareServiceHandler("/ws", thisPath);
		HandlerList list = new HandlerList();
		list.addHandler(rh1);
		list.addHandler(rh2);
		list.addHandler(rh3);
		list.addHandler(ws);
		list.addHandler(new DefaultHandler());
		// start server
		CodeServer.startServer(8888, list);
		assertTrue(CodeServer.isStarted());
	}
	
	@After
	public void after() throws Exception {
		if(CodeServer.isStarted())
			CodeServer.stop();
	}
	
	@Test
	public void testStartAndStop() throws Exception {
		CodeServer.stop();
		assertFalse(CodeServer.isStarted());
		CodeServer.start();
		assertTrue(CodeServer.isStarted());
		CodeServer.stop();
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
	public void testService() throws Exception {
		URL url = new URL("http://localhost:8888/ws/someMethod?name=hello");
		URLConnection cnx = url.openConnection();
		InputStream input = cnx.getInputStream();
		assertNotNull(input);
		input.close();
	}

}
