package prompto.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

import prompto.runtime.Context;
import prompto.store.DistributedCodeStore;
import prompto.store.ICodeStore;
import prompto.store.BootstrapCodeStore;
import prompto.store.ICodeStore.ModuleType;
import prompto.store.IStore;
import prompto.store.MemStore;

public class AppServer {
	
	static Server jettyServer;
	static Context globalContext = Context.newGlobalContext();
	
	public static void main(String[] args) throws Exception {
		Integer httpPort = null;
		String resource = null;
		String application = null;
		String version = ICodeStore.LATEST;
		
		// parse parameters
		for(int i=0; i<args.length; i++) {
			if(!args[i].startsWith("-"))
				continue;
			if(args[i].equalsIgnoreCase("-http_port")) {
				httpPort = Integer.parseInt(args[++i]);
			} else if(args[i].equalsIgnoreCase("-resource")) {
				resource = args[++i];
			} else if(args[i].equalsIgnoreCase("-application")) {
				application = args[++i];
			} else if(args[i].equalsIgnoreCase("-version")) {
				version = args[++i];
			}
		}
		if(httpPort==null || application==null) {
			showHelp(httpPort, application, version);
			System.exit(-1); // raise an error in whatever tool is used to launch this
		}
		// initialize prompto
		bootstrap(new MemStore(), resource, application, version);
		// standard resource handlers
		Handler handler = prepareHandlers();
		// initialize server accordingly
		startServer(httpPort, handler);
	}

	private static void showHelp(Integer httpPort, String application, String version) {
		if(httpPort==null)
			System.out.println("Missing argument: -http_port");
		if(application==null)
			System.out.println("Missing argument: -application");
		if(version.equals(ICodeStore.LATEST))
			System.out.println("Additional argument: -version (optional)");
	}

	public static void bootstrap(IStore codeStore, String resourceName, String application, String version) throws Exception {
		System.out.println("Bootstrapping prompto...");
		System.out.println("Connecting to prompto runtime...");
		ICodeStore module = new BootstrapCodeStore(null, ModuleType.MODULE, "core.pec", "1.0.0");
		module = new BootstrapCodeStore(module, ModuleType.MODULE, "core.pec", "1.0.0");
		module = new BootstrapCodeStore(module, ModuleType.MODULE, "internet.pec", "1.0.0");
		if(resourceName!=null)
			module = new BootstrapCodeStore(module, ModuleType.APPLICATION, resourceName, version);
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		ICodeStore store = new DistributedCodeStore(codeStore, module, application, version);
		ICodeStore.setInstance(store);
		System.out.println("Bootstrapping successful...");
	}

	static void startServer(Integer httpPort, Handler handler) throws Exception {
		System.out.println("Starting web server...");
		jettyServer = new Server(httpPort);
		jettyServer.setHandler(handler);
		AppServer.start();
	}

	static Handler prepareHandlers() {
		System.out.println("Preparing web handlers...");
		Handler rh = prepareResourceHandler("/");
		Handler ws = prepareServiceHandler("/ws/");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { rh, ws, new DefaultHandler() });
		System.out.println("Web handlers successfully prepared...");
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
