package prompto.runtime;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import prompto.code.ICodeStore;
import prompto.code.UpdatableCodeStore;
import prompto.code.Version;
import prompto.compiler.PromptoClassLoader;
import prompto.debug.DebugEventClient;
import prompto.debug.DebugRequestServer;
import prompto.debug.LocalDebugger;
import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.libraries.Libraries;
import prompto.memstore.MemStoreFactory;
import prompto.nullstore.NullStoreFactory;
import prompto.store.AttributeInfo;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStoreFactory;
import prompto.store.IStoreFactory.Type;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.CmdLineParser;
import prompto.utils.IdentifierList;
import prompto.utils.TypeUtils;
import prompto.value.Dictionary;
import prompto.value.ExpressionValue;
import prompto.value.IValue;
import prompto.value.Text;

public abstract class Application {

	private static Context globalContext;
	private static PromptoClassLoader classLoader;
	
	public static void main(String[] args) throws Throwable {
		Integer debugPort = null;
		
		Map<String, String> argsMap = initialize(args, ()->Libraries.getRuntimeResources());
		
		String debugHost = argsMap.getOrDefault("debug_host", "localhost");
		if(argsMap.containsKey("debug_port"))
			debugPort = Integer.parseInt(argsMap.get("debug_port"));
		if(argsMap.containsKey("application")) {
			String mainMethod = "main";
			if(argsMap.containsKey("mainMethod"))
				mainMethod = argsMap.get("mainMethod");
			if(debugPort!=null)
				debugApplication(debugHost, debugPort, mainMethod, argsMap);
			else
				runApplication(mainMethod, argsMap);
		} else if(argsMap.containsKey("test")) {
			String testMethod = argsMap.get("test");
			if(debugPort!=null)
				debugTest(debugHost, debugPort, testMethod);
			else
				runTest(testMethod);
		}
			
	}


	public static Map<String, String> initialize(String[] args, Supplier<Collection<URL>> runtimeSupplier) throws Throwable {
		Boolean testMode = false;
		String[] resources = null;
		String application = null;
		String test = null;
		Version version = ICodeStore.LATEST_VERSION;
		String codeStoreFactory = MemStoreFactory.class.getName();
		String dataStoreFactory = MemStoreFactory.class.getName();
		Type codeStoreType = Type.CODE;
		Type dataStoreType = Type.DATA;

		Map<String, String> argsMap = CmdLineParser.parse(args);
		if(argsMap.containsKey("testMode"))
			testMode = Boolean.valueOf(argsMap.get("testMode"));
		if(argsMap.containsKey("resources"))
			resources = argsMap.get("resources").split(",");
		if(argsMap.containsKey("application"))
			application = argsMap.get("application");
		if(argsMap.containsKey("test"))
			test = argsMap.get("test");
		if(argsMap.containsKey("version"))
			version = Version.parse(argsMap.get("version"));
		if(!Boolean.getBoolean(argsMap.getOrDefault("loadRuntime", "true")))
			codeStoreFactory = NullStoreFactory.class.getName();
		if(argsMap.containsKey("codeStoreFactory"))
			codeStoreFactory = argsMap.get("codeStoreFactory");
		if(argsMap.containsKey("dataStoreFactory"))
			dataStoreFactory = argsMap.get("dataStoreFactory");
		if(argsMap.containsKey("codeStoreType"))
			codeStoreType = Type.valueOf(argsMap.get("codeStoreType"));
		if(argsMap.containsKey("dataStoreType"))
			dataStoreType = Type.valueOf(argsMap.get("dataStoreType"));
		
		if(application==null && test==null) {
			showHelp(application, test, version);
			System.exit(-1); // raise an error in whatever tool is used to launch this
		}

		// initialize code store
		IStoreFactory factory = newStoreFactory(codeStoreFactory);
		IStore store = factory.newStore(args, codeStoreType);
		ICodeStore codeStore = bootstrapCodeStore(store, runtimeSupplier, application, version, testMode, resources);
		// initialize data store
		factory = newStoreFactory(dataStoreFactory);
		store = factory.newStore(args, dataStoreType);
		IStore dataStore = bootstrapDataStore(store);
		synchronizeSchema(codeStore, dataStore);
		return argsMap;
	}

	public static Context getGlobalContext() {
		return globalContext;
	}
	
	public static PromptoClassLoader getClassLoader() {
		return classLoader;
	}


	private static void runTest(String testMethod) {
		try {
			if("all".equals(testMethod))
				Interpreter.interpretTests(getGlobalContext());
			else
				Interpreter.interpretTest(getGlobalContext(), new Identifier(testMethod), true);
		} finally {
			getGlobalContext().notifyTerminated();
		}
	}

	private static void debugTest(String debugHost, int debugPort, String testMethod) throws Throwable {
		DebugRequestServer server = startDebugging(debugHost, debugPort);
		try {
			runTest(testMethod);
		} finally {
			server.stopListening();
		}
	}

	private static void runApplication(String mainMethod, Map<String, String> args) {
		try {
			Interpreter.interpretMethod(getGlobalContext(), new Identifier(mainMethod), "");
		} finally {
			getGlobalContext().notifyTerminated();
		}
	}

	private static void debugApplication(String debugHost, int debugPort, String mainMethod, Map<String, String> args) throws Throwable {
		DebugRequestServer server = startDebugging(debugHost, debugPort);
		try {
			runApplication(mainMethod, args);
		} finally {
			server.stopListening();
		}
	}

	public static DebugRequestServer startDebugging(String debugHost, Integer debugPort) throws Throwable {
		LocalDebugger debugger = new LocalDebugger();
		debugger.setListener(new DebugEventClient(debugHost, debugPort));
		DebugRequestServer server = startDebuggerThread(debugger);
		getGlobalContext().setDebugger(debugger);
		debugger.notifyStarted("localhost", server.getPort());
		return server;
	}


	public static DebugRequestServer startDebuggerThread(LocalDebugger debugger) throws Exception {
		DebugRequestServer server = new DebugRequestServer(debugger);
		server.startListening();
		return server;
	}

	public static IExpression argsToArgValue(String[] args) {
		PromptoDict<Text, IValue> dict = new PromptoDict<>(true);
		for(int i=0;i<args.length; i+=2)
			dict.put(new Text(args[i]),new Text(args[i + 1]));
		return new ExpressionValue(new DictType(TextType.instance()), new Dictionary(TextType.instance(), dict));
	}

	public static void showHelp(String application, String test, Version version) {
		if(application==null && test==null)
			System.out.println("Missing argument: -application or -test");
		if(version.equals(ICodeStore.LATEST_VERSION))
			System.out.println("Additional argument: -version (optional)");
	}

	public static IStoreFactory newStoreFactory(String factoryName) throws Throwable {
		Class<?> klass = Class.forName(factoryName, true, Thread.currentThread().getContextClassLoader());
		if(!(IStoreFactory.class.isAssignableFrom(klass)))
			throw new RuntimeException("Not a store factory: " + factoryName);
		return (IStoreFactory)klass.newInstance();
	}

	public static IStore bootstrapDataStore(IStore store) {
		IDataStore.setInstance(store);
		return store;
	}

	public static void synchronizeSchema(ICodeStore codeStore, IStore dataStore) throws PromptoError {
		System.out.println("Initializing schema...");
		Map<String, AttributeDeclaration> columns = getMinimalDataColumns(dataStore);
		codeStore.collectStorableAttributes(columns);
		List<AttributeInfo> infos = columns.values().stream().map((c)->c.getAttributeInfo()).collect(Collectors.toList());
		dataStore.createOrUpdateColumns(infos);
		System.out.println("Schema successfully initialized.");
	}

	public static ICodeStore bootstrapCodeStore(IStore store, String application, Version version, boolean testMode, String ...resourceNames) throws Exception {
		return bootstrapCodeStore(store, ()->Libraries.getRuntimeResources(), application, version, testMode, resourceNames);
	}
	
	public static ICodeStore bootstrapCodeStore(IStore store, Supplier<Collection<URL>> runtimeSupplier, String application, Version version, boolean testMode, String ...resourceNames) throws Exception {
		System.out.println("Initializing class loader " + (testMode ? "in test mode" : "") + "...");
		Application.globalContext = Context.newGlobalContext();
		File promptoDir = Files.createTempDirectory("prompto_").toFile();
		Application.classLoader = PromptoClassLoader.initialize(Application.globalContext, promptoDir, testMode);
		System.out.println("Class loader initialized.");
		System.out.println("Bootstrapping prompto...");
		ICodeStore codeStore = new UpdatableCodeStore(store, runtimeSupplier, application, version.toString(), resourceNames);
		ICodeStore.setInstance(codeStore);
		System.out.println("Bootstrapping successful.");
		return codeStore;
	}

	public static Map<String, AttributeDeclaration> getMinimalDataColumns(IStore dataStore) {
		Map<String, AttributeDeclaration> columns = new HashMap<String, AttributeDeclaration>();
		// attributes with reserved names, the below declarations will be used
		IType dbIdIType = TypeUtils.typeToIType(dataStore.getDbIdClass());
		columns.put(IStore.dbIdName, new AttributeDeclaration(new Identifier(IStore.dbIdName), dbIdIType));
		columns.put("category", new AttributeDeclaration(new Identifier("category"), 
				new ListType(TextType.instance()), new IdentifierList(new Identifier("key"))));
		return columns;
	}

}
