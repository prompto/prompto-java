package presto.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.resource.Resource;

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
		ResourceHandler rh = prepareResourceHandler("/");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { rh, new DefaultHandler() });
		return handlers;
	}

	static ResourceHandler prepareResourceHandler(String path) {
		Resource resource = Resource.newClassPathResource(path);
		ResourceHandler rh = new ResourceHandler();
		rh.setDirectoriesListed(false);
		rh.setBaseResource(resource);
		return rh;
	}

	public static void start() throws Exception  {
		if(jettyServer.isStarted())
			throw new RuntimeException("Server is already started!");
		jettyServer.start();
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
