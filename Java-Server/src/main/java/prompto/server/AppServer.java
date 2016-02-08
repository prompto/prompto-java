package prompto.server;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStoreFactory;
import prompto.store.IStoreFactory.Type;
import prompto.store.MemStoreFactory;
import prompto.store.IStore;

public class AppServer {
	
	static Server jettyServer;
	static Context globalContext;
	
	public static Context getGlobalContext() {
		return globalContext;
	}
	
	public static void main(String[] args) throws Throwable {
		main(args, null);
	}
	
	public static interface ThrowingRunnable {
		void run() throws Throwable;
	}
	
	public static void main(String[] args, ThrowingRunnable serverInitialized ) throws Throwable {
		Integer httpPort = null;
		String[] resources = null;
		String application = null;
		String codeStoreFactory = MemStoreFactory.class.getName();
		String dataStoreFactory = MemStoreFactory.class.getName();
		Version version = ICodeStore.LATEST;
		Type codeStoreType = Type.CODE;
		Type dataStoreType = Type.DATA;
		
		// parse parameters
		for(int i=0; i<args.length; i++) {
			String arg = args[i];
			if(!arg.startsWith("-"))
				continue;
			if(arg.equalsIgnoreCase("-http_port")) {
				httpPort = Integer.parseInt(args[++i]);
			} else if(arg.equalsIgnoreCase("-resources")) {
				resources = args[++i].split(",");
			} else if(arg.equalsIgnoreCase("-application")) {
				application = args[++i];
			} else if(arg.equalsIgnoreCase("-version")) {
				version = Version.parse(args[++i]);
			} else if(arg.equalsIgnoreCase("-codeStoreFactory")) {
				codeStoreFactory = args[++i];
			} else if(arg.equalsIgnoreCase("-codeStoreType")) {
				codeStoreType = Type.valueOf(args[++i]);
			} else if(arg.equalsIgnoreCase("-dataStoreFactory")) {
				dataStoreFactory = args[++i];
			} else if(arg.equalsIgnoreCase("-dataStoreType")) {
				dataStoreType = Type.valueOf(args[++i]);
			} 


		}
		if(httpPort==null || application==null) {
			showHelp(httpPort, application, version);
			System.exit(-1); // raise an error in whatever tool is used to launch this
		}
		// initialize code store
		IStoreFactory factory = newStoreFactory(codeStoreFactory);
		IStore store = factory.newStore(args, codeStoreType);
		ICodeStore codeStore = bootstrapCodeStore(store, application, version, resources);
		// initialize data store
		factory = newStoreFactory(dataStoreFactory);
		store = factory.newStore(args, dataStoreType);
		IStore dataStore = bootstrapDataStore(store);
		synchronizeSchema(codeStore, dataStore);
		// standard resource handlers
		Handler handler = prepareHandlers();
		// call pre-start code if any
		if(serverInitialized!=null)
			serverInitialized.run();
		// initialize server accordingly
		startServer(httpPort, handler);
	}

	private static IStore bootstrapDataStore(IStore store) {
		IDataStore.setInstance(store);
		return store;
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

	public static ICodeStore bootstrapCodeStore(IStore store, String application, Version version, String ...resourceNames) throws Exception {
		globalContext = Context.newGlobalContext();
		System.out.println("Bootstrapping prompto...");
		ICodeStore codeStore = new UpdatableCodeStore(store, application, version.toString(), resourceNames);
		ICodeStore.setInstance(codeStore);
		System.out.println("Bootstrapping successful.");
		return codeStore;
	}

	private static void synchronizeSchema(ICodeStore codeStore, IStore dataStore) throws PromptoError {
		System.out.println("Initializing schema...");
		List<AttributeDeclaration> columns = new ArrayList<>();
		codeStore.collectStorableAttributes(columns);
		dataStore.createOrUpdateColumns(columns);
		System.out.println("Schema successfully initialized.");
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
		System.out.println("Web server successfully started on port " + httpPort);
		return httpPort;
	}

	static Handler prepareHandlers() throws Exception {
		System.out.println("Preparing web handlers...");
		Handler rh = prepareResourceHandler("/");
		Handler ws = prepareServiceHandler("/ws/");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { rh, ws, new DefaultHandler() });
		System.out.println("Web handlers successfully prepared.");
		return handlers;
	}

	static Handler prepareServiceHandler(String path) throws Exception {
		URL url = ClassLoader.getSystemResource(".");
		// ugly work around for unit tests
		if(url.toExternalForm().contains("/test-classes/"))
			url = new URL(url.toExternalForm().replace("/test-classes/", "/classes/"));
		return prepareServiceHandler(path, url.toExternalForm());
	}
	public static Handler prepareServiceHandler(String path, String base) {
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath(path);
        webapp.setResourceBase(base);
 		return webapp;
	}

	static ResourceHandler prepareResourceHandler(String path) throws Exception {
		Resource resource = Resource.newClassPathResource(path);
		// ugly work around for unit tests
		if(resource.getURI().toString().contains("/test-classes/")) {
			URL url = new URL(resource.getURI().toString().replace("/test-classes/", "/classes/"));
			resource = Resource.newResource(url);
		}
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
					System.out.println("Web server thread complete.");
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
		System.out.println("Web server stop complete.");
	}

	public static boolean isStarted() {
		return jettyServer.isStarted();
	}

}
