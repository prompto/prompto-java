package prompto.code;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.ReadWriteError;
import prompto.store.IStore;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class AppStoreBootstrapper {

	public static ICodeStore bootstrap(IStore store, ICodeStore runtime, String application, String version, String ... resourceNames) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(resourceNames!=null) {
			for(String resourceName : resourceNames) {
				resourceName = trim(resourceName);
				runtime = bootstrapResource(resourceName, runtime, version);
			}
		}
		return runtime;
	}

	private static String trim(String resourceName) {
		if(resourceName.startsWith("\""))
			resourceName = resourceName.substring(1);
		if(resourceName.endsWith("\""))
			resourceName = resourceName.substring(0, resourceName.length()-1);
		return resourceName;
	}

	private static ICodeStore bootstrapResource(String resourceName, ICodeStore runtime, String version) {
		try {
			URL resourceUrl = getUrl(resourceName);
			return new ResourceCodeStore(runtime, ModuleType.WEBSITE, resourceUrl, version);
		} catch (MalformedURLException e) {
			throw new InternalError(e);
		}
	}

	private static URL getUrl(String resourceName) throws MalformedURLException {
		if(resourceName.startsWith("file:") || resourceName.startsWith("jar:"))
			return new URL(resourceName);
		else {
			File file = new File(resourceName);
			if(!file.exists())
				throw new ReadWriteError("Could not locate resource: " + resourceName);
			return file.toURI().toURL();
		}
	}

}
