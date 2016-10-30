package prompto.server;

import static org.junit.Assert.*;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.junit.After;
import org.junit.Before;

import prompto.code.Version;
import prompto.memstore.MemStore;

public abstract class BaseServerTest {
	
	int port = -1;
	
	@Before
	public void __before__() throws Throwable {
		// bootstrap
		AppServer.bootstrapCodeStore(new MemStore(), "test", Version.parse("1.0.0"), true);
		// adjust handler path for junit and cobertura context
		Handler rh1 = AppServer.prepareResourceHandler("/");
		Handler rh2 = AppServer.prepareResourceHandler("../classes/");
		Handler rh3 = AppServer.prepareResourceHandler("../test-classes/");
		Handler rh4 = AppServer.prepareResourceHandler("../generated-classes/cobertura/");
		// a bit more tricky for WebAppContext
		String thisPath = BaseServerTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();
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
		port = AppServer.startServer(port, list);
		Thread.sleep(100);
		assertTrue(AppServer.isStarted());
	}
	
	@After
	public void __after__() throws Exception {
		port = -1;
		if(AppServer.isStarted()) {
			AppServer.stop();
			Thread.sleep(100);
		}
	}
	

}
