package prompto.runtime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import prompto.code.ICodeStore;
import prompto.code.ImmutableCodeStore;
import prompto.code.QueryableCodeStore;
import prompto.compiler.PromptoClassLoader;
import prompto.config.CmdLineConfigurationReader;
import prompto.config.IConfigurationReader;
import prompto.config.IDebugConfiguration;
import prompto.config.IRuntimeConfiguration;
import prompto.config.IStandaloneConfiguration;
import prompto.config.IStoreConfiguration;
import prompto.config.StandaloneConfiguration;
import prompto.config.TempDirectories;
import prompto.config.YamlConfigurationReader;
import prompto.debug.DebugEventClient;
import prompto.debug.DebugRequestServer;
import prompto.debug.LocalDebugger;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoVersion;
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
import prompto.utils.Logger;
import prompto.utils.TypeUtils;
import prompto.value.Dictionary;
import prompto.value.ExpressionValue;
import prompto.value.IValue;
import prompto.value.Text;

public abstract class Standalone {

	private static Logger logger = new Logger();
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
			IExpression argsValue = argsToArgValue(config.getArguments());
			if(debug!=null)
				debugApplication(debug, mainMethod, argsValue);
			else 
				runApplication(mainMethod, argsValue);
		}
	}


	private static IStandaloneConfiguration loadConfiguration(String[] args) throws FileNotFoundException {
		Map<String, String> argsMap = CmdLineParser.read(args);
		IConfigurationReader reader = readerFromArgs(argsMap);
		IStandaloneConfiguration config = new StandaloneConfiguration(reader, argsMap);
		return config.withRuntimeLibs(()->Libraries.getPromptoLibraries(Libraries.class));
	}


	public static IConfigurationReader readerFromArgs(Map<String, String> argsMap) throws FileNotFoundException {
		if(argsMap.containsKey("yamlConfigFile"))
			return new YamlConfigurationReader(new FileInputStream(argsMap.get("yamlConfigFile")));
		else
			return new CmdLineConfigurationReader(argsMap);
	}


	public static void initialize(IRuntimeConfiguration config) throws Throwable {
		Mode.set(config.getRuntimeMode());
		TempDirectories.create();
		ICodeStore codeStore = initializeCodeStore(config);
		IStore dataStore = initializeDataStore(config);
		synchronizeSchema(codeStore, dataStore);
	}
	
	private static ICodeStore initializeCodeStore(IRuntimeConfiguration config) throws Throwable {
		IStoreConfiguration cfg = config.getCodeStoreConfiguration();
		// in SEED scenario, cfg is null to ensure latest code from resource is always used
		// so we use MemStore to stay consistent, but its content will never be persisted 
		IStore store = cfg==null ? new MemStore() : IStoreFactory.newStoreFromConfig(cfg); 
		logger.debug(()->"Using " + (cfg==null ? "MemStore" : cfg.toString()) + " as code store");
		return bootstrapCodeStore(store, config);
	}


	private static IStore initializeDataStore(IRuntimeConfiguration config) throws Throwable {
		IStoreConfiguration cfg = config.getDataStoreConfiguration();
		logger.debug(()->"Using " + (cfg==null ? "MemStore" : cfg.toString()) + " as data store");
		IStore store = IStoreFactory.newStoreFromConfig(cfg);
		return bootstrapDataStore(store);
	}


	public static Context getGlobalContext() {
		return globalContext;
	}
	
	public static PromptoClassLoader getClassLoader() {
		return classLoader;
	}

	public static void clearGlobalContext() {
		globalContext = Context.newGlobalContext();
		PromptoClassLoader loader = PromptoClassLoader.getInstance();
		if(loader!=null)
			loader.setContext(globalContext);
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

	private static void runApplication(String mainMethod, IExpression args) {
		try {
			Interpreter.interpretMethod(getGlobalContext(), new Identifier(mainMethod), "");
		} finally {
			getGlobalContext().notifyTerminated();
		}
	}

	private static void debugApplication(IDebugConfiguration debug, String mainMethod, IExpression args) throws Throwable {
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

	public static IExpression argsToArgValue(Map<String, String> args) {
		PromptoDict<Text, IValue> dict = new PromptoDict<>(true);
		for(Map.Entry<String, String> e : args.entrySet())
			dict.put(new Text(e.getKey()),new Text(e.getValue()));
		return new ExpressionValue(new DictType(TextType.instance()), new Dictionary(TextType.instance(), dict));
	}

	public static void showHelp(String application, String test, PromptoVersion version) {
		if(application==null && test==null)
			logger.info(()->"Missing argument: -application or -test");
		if(version.equals(PromptoVersion.LATEST))
			logger.info(()->"Additional argument: -version (optional)");
	}

	public static IStore bootstrapDataStore(IStore store) {
		IDataStore.setGlobal(store);
		return store;
	}

	public static void synchronizeSchema(ICodeStore codeStore, IStore dataStore) throws PromptoError {
		logger.info(()->"Initializing schema...");
		Map<String, AttributeDeclaration> columns = getMinimalDataColumns(dataStore);
		codeStore.collectStorableAttributes(columns);
		Function<Identifier, IDeclaration> locator = id->{
			Iterable<IDeclaration> found = codeStore.fetchLatestDeclarations(id.toString());
			if(found==null)
				return null;
			Iterator<IDeclaration> decls = found.iterator();
			return decls.hasNext() ? decls.next() : null;
		};
		List<AttributeInfo> infos = columns.values().stream().map((c)->c.getAttributeInfo(locator)).collect(Collectors.toList());
		dataStore.createOrUpdateAttributes(infos);
		logger.info(()->"Schema successfully initialized.");
	}

	public static ICodeStore bootstrapCodeStore(IStore store, IRuntimeConfiguration config) throws Exception {
		logger.info(()->"Initializing class loader " + ( Mode.get()==Mode.UNITTEST ? "in test mode" : "") + "...");
		globalContext = Context.newGlobalContext();
		classLoader = PromptoClassLoader.initialize(globalContext);
		JavaIdentifierExpression.registerAddOns(config.getAddOnURLs(), classLoader);
		logger.info(()->"Class loader initialized.");
		logger.info(()->"Bootstrapping prompto...");
		ICodeStore runtime = config.getRuntimeLibs() == null ? null : ImmutableCodeStore.bootstrapRuntime(config.getRuntimeLibs());
		ICodeStore codeStore = newQueryableCodeStore(store, runtime, config);
		ICodeStore.setInstance(codeStore);
		logger.info(()->"Bootstrapping successful.");
		return codeStore;
	}

	private static ICodeStore newQueryableCodeStore(IStore store, ICodeStore runtime, IRuntimeConfiguration config) {
		return new QueryableCodeStore(store, 
				runtime, 
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
