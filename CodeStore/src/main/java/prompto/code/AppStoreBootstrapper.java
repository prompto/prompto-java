package prompto.code;

import java.io.File;
import java.net.MalformedURLException;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.ReadWriteError;
import prompto.store.IStore;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class AppStoreBootstrapper {

	public static ICodeStore bootstrap(IStore store, ICodeStore runtime, String application, String version, String ... resourceNames) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(resourceNames!=null) for(String resourceName : resourceNames) {
			if(resourceName.startsWith("\""))
				resourceName = resourceName.substring(1);
			if(resourceName.endsWith("\""))
				resourceName = resourceName.substring(0, resourceName.length()-1);
			File file = new File(resourceName);
			if(!file.exists())
				throw new ReadWriteError("Could not locate resource: " + resourceName);
			try {
				runtime = new ResourceCodeStore(runtime, ModuleType.WEBSITE, file.toURI().toURL(), version.toString());
			} catch (MalformedURLException e) {
				throw new InternalError(e);
			}
		}
		return runtime;
	}

}
