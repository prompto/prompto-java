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
		String htmlRoot = "/";
		// parse parameters
		for(int i=0; i<args.length; i++) {
			if(!args[i].startsWith("-"))
				continue;
			if(args[i].equalsIgnoreCase("-http_port")) {
				httpPort = Integer.parseInt(args[++i]);
			} else if(args[i].equalsIgnoreCase("-html_root")) {
				htmlRoot = args[++i];
			}
		}
		// initialize server accordingly
		jettyServer = new Server(httpPort);
		Resource resource = Resource.newClassPathResource(htmlRoot);
		ResourceHandler rh = new ResourceHandler();
		rh.setDirectoriesListed(false);
		rh.setBaseResource(resource);
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { rh, new DefaultHandler() });
		jettyServer.setHandler(handlers);
		CodeServer.start();
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
