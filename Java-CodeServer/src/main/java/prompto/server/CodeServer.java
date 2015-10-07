package prompto.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

public class CodeServer {
	
	static Server jettyServer;
	
	public static void main(String[] args) throws Exception {
		Integer httpPort = null;
		// parse parameters
		for(int i=0; i<args.length; i++) {
			if(!args[i].startsWith("-"))
				continue;
			if(args[i].equalsIgnoreCase("-http_port")) {
				httpPort = Integer.parseInt(args[++i]);
			}
		}
		// standard resource handlers
		Handler handler = prepareHandlers();
		// initialize server accordingly
		startServer(httpPort, handler);
	}

	static void startServer(Integer httpPort, Handler handler) throws Exception {
		jettyServer = new Server(httpPort);
		jettyServer.setHandler(handler);
		CodeServer.start();
	}

	static Handler prepareHandlers() {
		Handler rh = prepareResourceHandler("/");
		Handler ws = prepareServiceHandler("/ws/");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { rh, ws, new DefaultHandler() });
		return handlers;
	}

	static Handler prepareServiceHandler(String path) {
		return prepareServiceHandler(path, "");
	}
	public static Handler prepareServiceHandler(String path, String base) {
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath(path);
        webapp.setResourceBase(base);
 		return webapp;
	}

	static ResourceHandler prepareResourceHandler(String path) {
		Resource resource = Resource.newClassPathResource(path);
		ResourceHandler rh = new ResourceHandler();
		rh.setDirectoriesListed(false);
		rh.setBaseResource(resource);
		return rh;
	}

	static Thread serverThread = null;
	
	public static void start() throws Exception  {
		if(jettyServer.isStarted())
			throw new RuntimeException("Server is already started!");
		Object sync = new Object();
		serverThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					jettyServer.start();
					synchronized (sync) {
						sync.notify();
					}
					jettyServer.join();
				} catch(Throwable t) {
					throw new RuntimeException(t);
				} finally {
					serverThread = null;
				}
			}
		}, "HTTP Server");
		serverThread.start();
		synchronized (sync) {
			sync.wait();
		}
	}

	public static void stop() throws Exception {
		if(!jettyServer.isStarted())
			throw new RuntimeException("Server is not started!");
		jettyServer.stop();
	}

	public static boolean isStarted() {
		return jettyServer.isStarted();
	}

}
