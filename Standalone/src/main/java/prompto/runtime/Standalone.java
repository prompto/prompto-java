package prompto.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.esotericsoftware.yamlbeans.document.YamlMapping;

import prompto.code.ICodeStore;
import prompto.code.ImmutableCodeStore;
import prompto.code.QueryableCodeStore;
import prompto.compiler.PromptoClassLoader;
import prompto.config.CmdLineConfigurationReader;
import prompto.config.IConfigurationReader;
import prompto.config.IDebugConfiguration;
import prompto.config.IDebugEventAdapterConfiguration;
import prompto.config.IDebugRequestListenerConfiguration;
import prompto.config.IRuntimeConfiguration;
import prompto.config.IStandaloneConfiguration;
import prompto.config.IStoreConfiguration;
import prompto.config.StandaloneConfiguration;
import prompto.config.TempDirectories;
import prompto.config.YamlConfigurationReader;
import prompto.debug.IDebugEvent;
import prompto.debug.IDebugEventAdapter;
import prompto.debug.IDebugEventAdapterFactory;
import prompto.debug.IDebugRequestListener;
import prompto.debug.IDebugRequestListenerFactory;
import prompto.debug.IDebugger;
import prompto.debug.ProcessDebugger;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.Status;
import prompto.debug.WorkerDebugger;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.TerminatedError;
import prompto.expression.ValueExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoVersion;
import prompto.java.JavaIdentifierExpression;
import prompto.libraries.Libraries;
import prompto.reader.YAMLReader;
import prompto.store.AttributeInfo;
import prompto.store.DataStore;
import prompto.store.IStore;
import prompto.store.IStoreFactory;
import prompto.store.memory.MemStore;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.CmdLineParser;
import prompto.utils.IdentifierList;
import prompto.utils.Logger;
import prompto.utils.TypeUtils;
import prompto.value.DictionaryValue;
import prompto.value.IValue;
import prompto.value.TextValue;
import prompto.writer.YAMLWriter;

public abstract class Standalone {

	private static Logger logger = new Logger();
	private static PromptoClassLoader classLoader;
	private static IDebugRequestListener debugRequestListener;
	private static IDebugEventAdapter debugEventAdapter;
	public static IRuntimeConfiguration configuration;
	
	public static void main(String[] args) throws Throwable {
		IStandaloneConfiguration config = loadConfiguration(args);
		main(config, null, null);
	}

	
	public static void main(IStandaloneConfiguration config, ICodeStore codeStore, IStore dataStore) throws Throwable {
		initialize(config, codeStore, dataStore);
		run(config);
	}

	public static void run(IStandaloneConfiguration config) throws Throwable {
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


	private static IStandaloneConfiguration loadConfiguration(String[] args) throws IOException {
		Map<String, String> argsMap = CmdLineParser.read(args);
		IConfigurationReader reader = readerFromArgs(argsMap);
		IStandaloneConfiguration config = new StandaloneConfiguration(reader, argsMap);
		return config.withRuntimeLibs(()->Libraries.getPromptoLibraries(Libraries.class));
	}


	public static IConfigurationReader readerFromArgs(Map<String, String> argsMap) throws IOException {
		if(argsMap.containsKey("yamlConfigFile")) {
			try(InputStream input = loadYamlData(argsMap.get("yamlConfigFile"))) {
				return new YamlConfigurationReader(input);
			}
		} else
			return new CmdLineConfigurationReader(argsMap);
	}


	private static InputStream loadYamlData(String path) throws FileNotFoundException {
		File file = new File(path);
		if(file.exists())
			return new FileInputStream(file);
		InputStream resource = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
		if(resource!=null)
			return resource;
		else
			throw new FileNotFoundException(path);
	}

	public static PromptoDocument<String, Object> getApplicationConfiguration() {
		try {
			YamlMapping mapping = configuration.toYaml();
			String yaml = YAMLWriter.write(mapping);
			List<PromptoDocument<String, Object>> docs = YAMLReader.read(yaml);
			return docs.get(0);
		} catch(Throwable t) {
			throw new InternalError("getApplicationConfiguration failed!", t);
		}
	}

	public static void initialize(IRuntimeConfiguration config) throws Throwable {
		initialize(config, null, null);
	}
	
	public static void initialize(IRuntimeConfiguration config, ICodeStore codeStore, IStore dataStore) throws Throwable {
		configuration = config;
		Mode.set(config.getRuntimeMode());
		TempDirectories.create();
		if(codeStore==null)
			codeStore = initializeCodeStore(config);
		if(dataStore==null)
			dataStore = initializeDataStore(config);
		synchronizeSchema(codeStore, dataStore);
	}
	
	private static ICodeStore initializeCodeStore(IRuntimeConfiguration config) throws Throwable {
		// in SEED scenario, cfg from store is null to ensure latest code from resource is always used
		// so we use MemStore to stay consistent, but its content will never be persisted 
		IStore store = null;
		IStoreConfiguration cfg = config.getCodeStoreConfiguration();
		if(cfg!=null)
			store = IStoreFactory.newStoreFromConfig(cfg); 
		if(store==null)
			store = new MemStore();
		boolean isMemStore = store instanceof MemStore;
		logger.debug(()->"Using " + ( isMemStore ? "MemStore" : cfg.toString()) + " as code store");
		return bootstrapCodeStore(store, config);
	}


	private static IStore initializeDataStore(IRuntimeConfiguration config) throws Throwable {
		IStoreConfiguration cfg = config.getDataStoreConfiguration();
		logger.debug(()->"Using " + (cfg==null ? "MemStore" : cfg.toString()) + " as data store");
		IStore store = IStoreFactory.newStoreFromConfig(cfg);
		return bootstrapDataStore(store);
	}


	public static PromptoClassLoader getClassLoader() {
		return classLoader;
	}

	private static void runTest(String testMethod) {
		runTest(ApplicationContext.get(), testMethod);
	}
	
	private static void runTest(Context context, String testMethod) {
		try {
			if("all".equals(testMethod))
				Interpreter.interpretTests(context);
			else
				Interpreter.interpretTest(context, new Identifier(testMethod), true);
		} finally {
			context.notifyCompleted();
		}
	}

	private static void debugTest(IDebugConfiguration debug, String testMethod) throws Throwable {
		Context local = null;
		try {
			local = startProcessDebugger(debug);
			runTest(local, testMethod);
		} catch(TerminatedError e) {
			if(local!=null)
				local.notifyCompleted();
		} finally {
			stopProcessDebugger();
		}
	}

	private static void runApplication(String mainMethod, IExpression args) {
		runApplication(ApplicationContext.get(), mainMethod, args);
	}
	
	
	private static void runApplication(Context context, String mainMethod, IExpression args) {
		try {
			// TODO use args
			Interpreter.interpretMethod(context, new Identifier(mainMethod), "");
		} finally {
			context.notifyCompleted();
		}
	}
	
	private static void debugApplication(IDebugConfiguration debug, String mainMethod, IExpression args) throws Throwable {
		Context local = null;
		try {
			local = startProcessDebugger(debug);
			runApplication(local, mainMethod, args);
		} catch(TerminatedError e) {
			if(local!=null)
				local.notifyCompleted();
		} finally {
			stopProcessDebugger();
		}
	}
	
	public static IDebugEventAdapter getDebugEventAdapter() {
		return debugEventAdapter;
	}
	
	public static IDebugRequestListener getDebugRequestListener() {
		return debugRequestListener;
	}

	public static Context startProcessDebugger(IDebugConfiguration config) throws Throwable {
		// wire adapter which will send events to client
		debugEventAdapter = createDebugEventAdapter(config);
		ProcessDebugger processDebugger = ProcessDebugger.createInstance(ApplicationContext.get());
		processDebugger.setListener(debugEventAdapter);
		// wire listener which will receive requests from client
		debugRequestListener = createDebugRequestListener(config, processDebugger);
		IDebugEvent.Connected connected = debugRequestListener.startListening();
		debugEventAdapter.handleConnectedEvent(connected);
		// wire local context to debugger
		Context local = ApplicationContext.get().newLocalContext();
		WorkerDebugger workerDebugger = startWorkerDebugger(Thread.currentThread(), local);
		processDebugger.setProcessStatus(Status.RUNNING);
		// step in start method by default
		// TODO: make this configurable
		workerDebugger.stepInto();
		return local;

	}

	public static void stopProcessDebugger() {
		ProcessDebugger processDebugger = ProcessDebugger.getInstance();
		processDebugger.setProcessStatus(Status.TERMINATING);
		debugEventAdapter.handleTerminatedEvent();
		processDebugger.setProcessStatus(Status.TERMINATED);
		debugRequestListener.stopListening();
	}



	public static WorkerDebugger startWorkerDebugger(Thread thread, Context context) {
		WorkerDebugger workerDebugger = new WorkerDebugger();
		ProcessDebugger.getInstance().register(Thread.currentThread(), workerDebugger);
		debugEventAdapter.handleStartedEvent(DebuggedWorker.wrap(Thread.currentThread()));
		workerDebugger.setListener(debugEventAdapter);
		context.setDebugger(workerDebugger);
		workerDebugger.setStatus(Status.RUNNING);
		return workerDebugger;
	}


	public static IDebugRequestListener createDebugRequestListener(IDebugConfiguration cfg, IDebugger debugger) throws Throwable {
		IDebugRequestListenerConfiguration config  = cfg.getRequestListenerConfiguration();
		if(config==null)
			throw new RuntimeException("Missing requestListener in debug config!");
		return IDebugRequestListenerFactory.newListenerFromConfig(config, debugger);
	}


	public static IDebugEventAdapter createDebugEventAdapter(IDebugConfiguration cfg) throws Throwable {
		IDebugEventAdapterConfiguration config  = cfg.getEventAdapterConfiguration();
		if(config==null)
			throw new RuntimeException("Missing eventAdapter in debug config!");
		return IDebugEventAdapterFactory.newAdapterFromConfig(config);
	}

	public static IExpression argsToArgValue(Map<String, String> args) {
		PromptoDict<TextValue, IValue> dict = new PromptoDict<>(true);
		for(Map.Entry<String, String> e : args.entrySet())
			dict.put(new TextValue(e.getKey()),new TextValue(e.getValue()));
		return new ValueExpression(new DictType(TextType.instance()), new DictionaryValue(TextType.instance(), dict));
	}

	public static void showHelp(String application, String test, PromptoVersion version) {
		if(application==null && test==null)
			logger.info(()->"Missing argument: -application or -test");
		if(version.equals(PromptoVersion.LATEST))
			logger.info(()->"Additional argument: -version (optional)");
	}

	public static IStore bootstrapDataStore(IStore store) throws Exception {
		DataStore.setGlobal(store);
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
		Context context = Context.newGlobalsContext();
		List<AttributeInfo> infos = columns.values().stream().map((c)->c.getAttributeInfo(context, locator)).collect(Collectors.toList());
		dataStore.createOrUpdateAttributes(infos);
		logger.info(()->"Schema successfully initialized.");
	}

	public static ICodeStore bootstrapCodeStore(IStore store, IRuntimeConfiguration config) throws Exception {
		logger.info(()->"Initializing class loader " + ( Mode.get()==Mode.UNITTEST ? "in test mode" : "") + "...");
		classLoader = PromptoClassLoader.initialize(ApplicationContext.init());
		JavaIdentifierExpression.registerAddOns(config.getAddOnURLs(), classLoader);
		logger.info(()->"Class loader initialized.");
		logger.info(()->"Bootstrapping prompto...");
		ICodeStore runtime = config.getRuntimeLibs() == null ? null : ImmutableCodeStore.bootstrapRuntime(config.getRuntimeLibs());
		ICodeStore codeStore = newQueryableCodeStore(store, runtime, config);
		codeStore.upgradeIfRequired();
		ICodeStore.setInstance(codeStore);
		logger.info(()->"Bootstrapping successful.");
		codeStore.setMainModule(config.getApplicationName(), config.getApplicationVersion());
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
		columns.put(IStore.dbIdName, new AttributeDeclaration(new Identifier(IStore.dbIdName), dbIdIType).withStorable(true));
		columns.put("category", new AttributeDeclaration(new Identifier("category"), 
				new ListType(TextType.instance()), new IdentifierList(new Identifier("key"))));
		return columns;
	}




}
