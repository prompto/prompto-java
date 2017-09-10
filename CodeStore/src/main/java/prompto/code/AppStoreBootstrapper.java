package prompto.code;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import prompto.code.ICodeStore.ModuleType;
import prompto.store.IStore;
import prompto.utils.ResourceUtils;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class AppStoreBootstrapper {

	public static ICodeStore bootstrap(IStore store, ICodeStore runtime, String application, Version version, URL[] addOns, URL ... resources) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(addOns!=null) {
			for(URL addOn : addOns)
				runtime = bootstrapAddOn(addOn, runtime);
		}
		if(resources!=null) {
			for(URL resource : resources)
				runtime = bootstrapResource(resource, runtime, version);
		}
		return runtime;
	}

	private static ICodeStore bootstrapAddOn(URL addOn, ICodeStore runtime) {
		try {
			System.out.println("Bootstrapping add-on " + addOn.toExternalForm());
			Collection<URL> urls = getAddOnLibraries(addOn);
			for(URL url : urls) {
				System.out.println("Connecting to " + url.toExternalForm());
				runtime = new ImmutableCodeStore(runtime, ModuleType.LIBRARY, url, Version.parse("0.0.1"));
			}
			return runtime;
		} catch (IOException e) {
			throw new InternalError(e);
		}
	}
	
	private static Collection<URL> getAddOnLibraries(URL addOn) throws IOException {
		String path = "jar:" + addOn.toExternalForm() + "!/libraries/";
		try {
			return ResourceUtils.listResourcesAt(new URL(path), ResourceUtils::isPromptoLibrary);
		} catch (FileNotFoundException e) {
			// dependency jars are add ons but have no prompto code
			return Collections.emptyList();
		}
	}
	

	private static ICodeStore bootstrapResource(URL resource, ICodeStore runtime, Version version) {
		System.out.println("Connecting to " + resource.toExternalForm());
		return new ImmutableCodeStore(runtime, ModuleType.LIBRARY, resource, version);
	}


}
