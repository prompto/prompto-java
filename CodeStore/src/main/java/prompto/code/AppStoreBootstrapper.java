package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.store.IStore;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class AppStoreBootstrapper {

	public static ICodeStore bootstrap(IStore store, ICodeStore runtime, String application, String version, String ... resourceNames) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(resourceNames!=null) for(String resourceName : resourceNames)
			runtime = new ResourceCodeStore(runtime, ModuleType.WEBSITE, resourceName, version.toString());
		return runtime;
	}

}
