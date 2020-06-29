package prompto.runtime;

import prompto.compiler.PromptoClassLoader;
import prompto.debug.WorkerDebugger;

public abstract class ApplicationContext {

	private static Context instance;

	public static void reset() {
		WorkerDebugger debugger = instance.getDebugger();
		instance = Context.newGlobalsContext();
		instance.setDebugger(debugger);
		PromptoClassLoader loader = PromptoClassLoader.getInstance();
		if(loader!=null)
			loader.setContext(instance);
	}

	public static Context set(Context context) {
		Context replaced = instance;
		instance = context;
		return replaced;
	}

	public static Context get() {
		return instance;
	}
	
	public static Context init() {
		instance = Context.newGlobalsContext();
		return instance;
	}


}
