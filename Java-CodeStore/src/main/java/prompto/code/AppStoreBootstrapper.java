package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.store.IStore;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class AppStoreBootstrapper {

	public static ICodeStore bootstrap(IStore store, ICodeStore runtime, String resourceName, String application, String version) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(resourceName!=null)
			return new ResourceCodeStore(runtime, ModuleType.APPLICATION, resourceName, version.toString());
		else
			return runtime;
	}

}
