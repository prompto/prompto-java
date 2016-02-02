package prompto.server;

import java.net.URL;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

import prompto.code.UpdatableCodeStore;
import prompto.code.ICodeStore;
import prompto.code.Version;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStoreFactory;
import prompto.store.IStoreFactory.Type;
import prompto.store.MemStoreFactory;
import prompto.store.IStore;

public class AppServer {
	
	static Server jettyServer;
	static Context globalContext;
	
	public static void main(String[] args) throws Throwable {
		main(args, null);
	}
	
	public static interface ThrowingRunnable {
		void run() throws Throwable;
	}
	
	public static void main(String[] args, ThrowingRunnable serverInitialized ) throws Throwable {
		Integer httpPort = null;
		String resource = null;
		String application = null;
		String codeStoreFactory = MemStoreFactory.class.getName();
		String dataStoreFactory = MemStoreFactory.class.getName();
		Version version = ICodeStore.LATEST;
		
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
				version = Version.parse(args[++i]);
			} else if(args[i].equalsIgnoreCase("-codeStoreFactory")) {
				codeStoreFactory = args[++i];
			} else if(args[i].equalsIgnoreCase("-dataStoreFactory")) {
				dataStoreFactory = args[++i];
			}


		}
		if(httpPort==null || application==null) {
			showHelp(httpPort, application, version);
			System.exit(-1); // raise an error in whatever tool is used to launch this
		}
		// initialize code store
		IStoreFactory factory = newStoreFactory(codeStoreFactory);
		IStore store = factory.newStore(args, Type.CODE);
		bootstrap(store, resource, application, version);
		// initialize data store
		factory = newStoreFactory(dataStoreFactory);
		IDataStore.setInstance(factory.newStore(args, Type.DATA));
		// standard resource handlers
		Handler handler = prepareHandlers();
		// call pre-start code if any
		if(serverInitialized!=null)
			serverInitialized.run();
		// initialize server accordingly
		startServer(httpPort, handler);
	}

	private static IStoreFactory newStoreFactory(String factoryName) throws Throwable {
		Class<?> klass = Class.forName(factoryName, true, Thread.currentThread().getContextClassLoader());
		if(!(IStoreFactory.class.isAssignableFrom(klass)))
			throw new RuntimeException("Not a store factory: " + factoryName);
		return (IStoreFactory)klass.newInstance();
	}

	private static void showHelp(Integer httpPort, String application, Version version) {
		if(httpPort==null)
			System.out.println("Missing argument: -http_port");
		if(application==null)
			System.out.println("Missing argument: -application");
		if(version.equals(ICodeStore.LATEST))
			System.out.println("Additional argument: -version (optional)");
	}

	public static void bootstrap(IStore codeStore, String resourceName, String application, Version version) throws Exception {
		globalContext = Context.newGlobalContext();
		System.out.println("Bootstrapping prompto...");
		ICodeStore store = new UpdatableCodeStore(globalContext, codeStore, resourceName, application, version.toString());
		ICodeStore.setInstance(store);
		System.out.println("Initializing code store schema...");
		store.synchronizeSchema();
		System.out.println("Bootstrapping successful...");
	}

	static int startServer(Integer httpPort, Handler handler) throws Throwable {
		System.out.println("Starting web server on port " + httpPort + "...");
		if(httpPort==-1) {
			jettyServer = new Server(httpPort);
			ServerConnector sc = new ServerConnector(jettyServer);
			jettyServer.setConnectors(new Connector[] { sc });
			jettyServer.setHandler(handler);
			AppServer.start();
			httpPort = sc.getLocalPort();
		} else {
			jettyServer = new Server(httpPort);
			jettyServer.setHandler(handler);
			AppServer.start();
		}
		System.out.println("Web server started on port " + httpPort);
		return httpPort;
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
		URL url = ClassLoader.getSystemResource(".");
		return prepareServiceHandler(path, url.toExternalForm());
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

	static boolean startComplete = false;
	static Thread serverThread = null;
	static Throwable serverThrowable = null;
	
	public static void start() throws Throwable  {
		if(jettyServer.isStarted())
			throw new RuntimeException("Server is already started!");
		serverThrowable = null;
		startComplete = false;
		Object sync = new Object();
		serverThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Web server about to start...");
				try {
					try {
						jettyServer.start();
						System.out.println("Web server started...");
					} finally {
						System.out.println("Signaling start completion...");
						synchronized (sync) {
							startComplete = true;
							sync.notify();
						}
					}
					System.out.println("Web server thread waiting for completion...");
					jettyServer.join();
					System.out.println("Web server thread complete...");
				} catch(Throwable t) {
					serverThrowable = t;
				} finally {
					serverThread = null;
				}
			}
		}, "HTTP Server");
		serverThread.start();
		System.out.println("Waiting for start completion signal...");
		synchronized (sync) {
			while(!startComplete)
				sync.wait();
		}
		System.out.println("Start completion signalled...");
		if(serverThrowable!=null) {
			Throwable t = serverThrowable;
			serverThrowable = null;
			throw t;
		}
	}

	public static void stop() throws Exception {
		if(!jettyServer.isStarted())
			throw new RuntimeException("Server is not started!");
		System.out.println("Stopping web server...");
		jettyServer.stop();
		System.out.println("Web server stopped, waiting for completion...");
		jettyServer.join();
		System.out.println("Web server stop complete...");
	}

	public static boolean isStarted() {
		return jettyServer.isStarted();
	}

}
