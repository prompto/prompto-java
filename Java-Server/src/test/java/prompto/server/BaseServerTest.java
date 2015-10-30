package prompto.server;

import static org.junit.Assert.*;

import java.net.BindException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.junit.After;
import org.junit.Before;

import prompto.store.MemStore;
import prompto.store.Version;

public abstract class BaseServerTest {
	
	static int port = 8888;
	
	@Before
	public void __before__() throws Throwable {
		// bootstrap
		AppServer.bootstrap(new MemStore(), null, "test", Version.parse("1.0.0"));
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
		for(;;) {
			try {
				AppServer.startServer(port, list);
				assertTrue(AppServer.isStarted());
				break;
			} catch(BindException e) {
				port++;
			}
		}
		Thread.sleep(100);
	}
	
	@After
	public void __after__() throws Exception {
		if(AppServer.isStarted())
			AppServer.stop();
		Thread.sleep(100);
	}
	

}
