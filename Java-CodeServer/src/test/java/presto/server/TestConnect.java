package presto.server;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestConnect {

	@Before
	public void before() throws Exception {
		String[] args = { "-http_port", "8888", "-html_root", "../classes/" };
		CodeServer.main(args);
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
}
