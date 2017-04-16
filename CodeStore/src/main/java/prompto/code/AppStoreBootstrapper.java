package prompto.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.ReadWriteError;
import prompto.store.IStore;
import prompto.utils.ResourceUtils;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class AppStoreBootstrapper {

	public static ICodeStore bootstrap(IStore store, ICodeStore runtime, String application, String version, URL[] addOns, String ... resourceNames) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(addOns!=null) {
			for(URL addOn : addOns)
				runtime = bootstrapAddOn(addOn, runtime);
		}
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

	private static ICodeStore bootstrapAddOn(URL addOn, ICodeStore runtime) {
		try {
			System.out.println("Bootstrapping add-on " + addOn.toExternalForm());
			Collection<URL> urls = getAddOnLibraries(addOn);
			for(URL url : urls) {
				System.out.println("Connecting to " + url.toExternalForm());
				runtime = new ResourceCodeStore(runtime, ModuleType.LIBRARY, url, "0.0.1");
			}
			return runtime;
		} catch (IOException e) {
			throw new InternalError(e);
		}
	}
	
	private static Collection<URL> getAddOnLibraries(URL addOn) throws IOException {
		String path = "jar:" + addOn.toExternalForm() + "!/libraries/";
		try {
			return ResourceUtils.listResourcesAt(new URL(path), ResourceUtils::isPrompto);
		} catch (FileNotFoundException e) {
			// dependency jars are add ons but have no prompto code
			return Collections.emptyList();
		}
	}
	

	private static ICodeStore bootstrapResource(String resourceName, ICodeStore runtime, String version) {
		try {
			URL resourceUrl = getUrl(resourceName);
			System.out.println("Connecting to " + resourceUrl.toExternalForm());
			return new ResourceCodeStore(runtime, ModuleType.LIBRARY, resourceUrl, version);
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
