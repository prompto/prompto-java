package prompto.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import prompto.code.ICodeStore;
import prompto.code.QueryableCodeStore;
import prompto.code.Version;
import prompto.compiler.PromptoClassLoader;
import prompto.config.CmdLineConfigurationReader;
import prompto.config.IConfigurationReader;
import prompto.config.IDebugConfiguration;
import prompto.config.IRuntimeConfiguration;
import prompto.config.IStandaloneConfiguration;
import prompto.config.IStoreConfiguration;
import prompto.config.StandaloneConfiguration;
import prompto.config.YamlConfigurationReader;
import prompto.debug.DebugEventClient;
import prompto.debug.DebugRequestServer;
import prompto.debug.LocalDebugger;
import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.java.JavaIdentifierExpression;
import prompto.libraries.Libraries;
import prompto.memstore.MemStore;
import prompto.store.AttributeInfo;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStoreFactory;
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
		IStandaloneConfiguration config = loadConfiguration(args);
		initialize(config);
		run(config);
	}


	private static void run(IStandaloneConfiguration config) throws Throwable {
		IDebugConfiguration debug = config.getDebugConfiguration();
		String testMethod = config.getTestMethod();
		if(testMethod!=null) {
			if(debug!=null)
				debugTest(debug, testMethod);
			else 
				runTest(testMethod);
		} else {
			String mainMethod = config.getMainMethod();
			if(debug!=null)
				debugApplication(debug, mainMethod, config.getArguments());
			else 
				runApplication(mainMethod, config.getArguments());
		}
	}


	private static IStandaloneConfiguration loadConfiguration(String[] args) throws FileNotFoundException {
		Map<String, String> argsMap = CmdLineParser.parse(args);
		IConfigurationReader reader = readerFromArgs(argsMap);
		IStandaloneConfiguration config = new StandaloneConfiguration(reader, argsMap);
		config.setRuntimeLibsSupplier(()->Libraries.getPromptoLibraries(Libraries.class));
		return config;
	}


	public static IConfigurationReader readerFromArgs(Map<String, String> argsMap) throws FileNotFoundException {
		if(argsMap.containsKey("yamlConfigFile"))
			return new YamlConfigurationReader(new FileInputStream(argsMap.get("yamlConfigFile")));
		else
			return new CmdLineConfigurationReader(argsMap);
	}


	public static void initialize(IRuntimeConfiguration config) throws Throwable {
		// initialize code store
		IStoreConfiguration cfg = config.getCodeStoreConfiguration();
		if(cfg==null && !config.isLoadRuntime())
			cfg = IStoreConfiguration.NULL_STORE_CONFIG; // only use MemStore if required
		System.out.println("Using " + (cfg==null ? "MemStore" : cfg.toString()) + " as code store");
		IStore store = newStoreFromConfig(cfg);
		ICodeStore codeStore = bootstrapCodeStore(store, config);
		// initialize data store
		cfg = config.getDataStoreConfiguration();
		System.out.println("Using " + (cfg==null ? "MemStore" : cfg.toString()) + " as data store");
		store = newStoreFromConfig(cfg);
		IStore dataStore = bootstrapDataStore(store);
		synchronizeSchema(codeStore, dataStore);
	}
	
	private static IStore newStoreFromConfig(IStoreConfiguration cfg) throws Throwable {
		if(cfg==null)
			return new MemStore();
		IStoreFactory factory = newStoreFactory(cfg.getFactory());
		return factory.newStore(cfg);
	}


	public static Context getGlobalContext() {
		return globalContext;
	}
	
	public static PromptoClassLoader getClassLoader() {
		return classLoader;
	}

	public static void clearGlobalContext() {
		Application.globalContext = Context.newGlobalContext();
		PromptoClassLoader loader = PromptoClassLoader.getInstance();
		if(loader!=null)
			loader.setContext(Application.globalContext);
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

	private static void debugTest(IDebugConfiguration debug, String testMethod) throws Throwable {
		DebugRequestServer server = startDebugging(debug.getHost(), debug.getPort());
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

	private static void debugApplication(IDebugConfiguration debug, String mainMethod, Map<String, String> args) throws Throwable {
		DebugRequestServer server = startDebugging(debug.getHost(), debug.getPort());
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
			dict.put(new Text(args[i].substring(1)),new Text(args[i + 1]));
		return new ExpressionValue(new DictType(TextType.instance()), new Dictionary(TextType.instance(), dict));
	}

	public static void showHelp(String application, String test, Version version) {
		if(application==null && test==null)
			System.out.println("Missing argument: -application or -test");
		if(version.equals(Version.LATEST))
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

	public static ICodeStore bootstrapCodeStore(IStore store, IRuntimeConfiguration config) throws Exception {
		System.out.println("Initializing class loader " + (config.isTestMode() ? "in test mode" : "") + "...");
		Application.globalContext = Context.newGlobalContext();
		File promptoDir = Files.createTempDirectory("prompto_").toFile();
		Application.classLoader = PromptoClassLoader.initialize(Application.globalContext, promptoDir, config.isTestMode());
		JavaIdentifierExpression.registerAddOns(config.getAddOnURLs(), Application.classLoader);
		System.out.println("Class loader initialized.");
		System.out.println("Bootstrapping prompto...");
		ICodeStore codeStore = newQueryableCodeStore(store, config);
		ICodeStore.setInstance(codeStore);
		System.out.println("Bootstrapping successful.");
		return codeStore;
	}

	private static ICodeStore newQueryableCodeStore(IStore store, IRuntimeConfiguration config) {
		return new QueryableCodeStore(store, 
				config.getRuntimeLibsSupplier(), 
				config.getApplicationName(), 
				config.getApplicationVersion(), 
				config.getAddOnURLs(), 
				config.getResourceURLs());
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
