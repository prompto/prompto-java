package prompto.runtime;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import prompto.code.ICodeStore;
import prompto.code.UpdatableCodeStore;
import prompto.code.Version;
import prompto.compiler.PromptoClassLoader;
import prompto.debug.DebuggerServer;
import prompto.debug.LocalDebugger;
import prompto.declaration.AttributeDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.memstore.MemStoreFactory;
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
		String mainMethod = "main";
		
		Map<String, String> argsMap = initialize(args);
		
		if(argsMap.containsKey("debug_port"))
			debugPort = Integer.parseInt(argsMap.get("debug_port"));
		if(argsMap.containsKey("mainMethod"))
			mainMethod = argsMap.get("mainMethod");
		if(debugPort!=null)
			debug(debugPort, mainMethod, argsMap);
		else
			run(mainMethod, argsMap);
			
	}

	public static Map<String, String> initialize(String[] args) throws Throwable {
		Boolean testMode = false;
		String[] resources = null;
		String application = null;
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
		if(argsMap.containsKey("version"))
			version = Version.parse(argsMap.get("version"));
		if(argsMap.containsKey("codeStoreFactory"))
			codeStoreFactory = argsMap.get("codeStoreFactory");
		if(argsMap.containsKey("dataStoreFactory"))
			dataStoreFactory = argsMap.get("dataStoreFactory");
		if(argsMap.containsKey("codeStoreType"))
			codeStoreType = Type.valueOf(argsMap.get("codeStoreType"));
		if(argsMap.containsKey("dataStoreType"))
			dataStoreType = Type.valueOf(argsMap.get("dataStoreType"));
		
		if(application==null) {
			showHelp(application, version);
			System.exit(-1); // raise an error in whatever tool is used to launch this
		}
		// initialize code store
		IStoreFactory factory = newStoreFactory(codeStoreFactory);
		IStore store = factory.newStore(args, codeStoreType);
		ICodeStore codeStore = bootstrapCodeStore(store, application, version, testMode, resources);
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


	private static void run(String mainMethod, Map<String, String> args) {
		Interpreter.interpretMethod(getGlobalContext(), new Identifier(mainMethod), "");
	}

	private static void debug(int debugPort, String mainMethod, Map<String, String> args) {
		LocalDebugger debugger = new LocalDebugger();
		DebuggerServer server = new DebuggerServer(debugger, debugPort);
		debugger.setListener(server);
		final Context local = getGlobalContext().newLocalContext();
		local.setDebugger(debugger);
		Thread execThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Interpreter.interpretMethod(local, new Identifier(mainMethod), "");
				} catch (Throwable t) {
					t.printStackTrace(System.err);
				}
			}
		});
		Thread serverThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					server.acceptLoop();
				} catch (Throwable t) {
					t.printStackTrace(System.err);
				}
			}
		});
		execThread.start();
		serverThread.start();
		try {
			serverThread.join();
			execThread.join();
		} catch(InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	public static IExpression argsToArgValue(String[] args) {
		PromptoDict<Text, IValue> dict = new PromptoDict<>(true);
		for(int i=0;i<args.length; i+=2)
			dict.put(new Text(args[i]),new Text(args[i + 1]));
		return new ExpressionValue(new DictType(TextType.instance()), new Dictionary(TextType.instance(), dict));
	}

	public static void showHelp(String application, Version version) {
		if(application==null)
			System.out.println("Missing argument: -application");
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
		System.out.println("Initializing class loader " + (testMode ? "in test mode" : "") + "...");
		Application.globalContext = Context.newGlobalContext();
		File promptoDir = Files.createTempDirectory("prompto_").toFile();
		Application.classLoader = PromptoClassLoader.initialize(Application.globalContext, promptoDir, testMode);
		System.out.println("Class loader initialized.");
		System.out.println("Bootstrapping prompto...");
		ICodeStore codeStore = new UpdatableCodeStore(store, application, version.toString(), resourceNames);
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
