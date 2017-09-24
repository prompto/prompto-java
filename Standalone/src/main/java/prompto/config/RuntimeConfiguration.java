package prompto.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import prompto.intrinsic.PromptoVersion;

public class RuntimeConfiguration implements IRuntimeConfiguration {

	IConfigurationReader reader;
	Map<String, String> arguments;
	Supplier<Collection<URL>> runtimeLibsSupplier;
	
	protected RuntimeConfiguration(IConfigurationReader reader, Map<String, String> arguments) {
		this.reader = reader;
		this.arguments = arguments;
	}
	
	@Override
	public IDebugConfiguration getDebugConfiguration() {
		IConfigurationReader child = reader.getObject("debug");
		return child==null ? null : new DebugConfiguration(child);
	}
	
	@Override
	public IStoreConfiguration getCodeStoreConfiguration() {
		return reader.readStoreConfiguration("codeStore");
	}
	
	@Override
	public IStoreConfiguration getDataStoreConfiguration() {
		return reader.readStoreConfiguration("dataStore");
	}
	
	@Override
	public Supplier<Collection<URL>> getRuntimeLibsSupplier() {
		return this.runtimeLibsSupplier;
	}
	
	@Override
	public void setRuntimeLibsSupplier(Supplier<Collection<URL>> supplier) {
		this.runtimeLibsSupplier = supplier;
	}
	
	@Override
	public Map<String, String> getArguments() {
		return arguments;
	}

	@Override
	public boolean isTestMode() {
		return reader.getBooleanOrDefault("testMode", false);
	}
	
	@Override
	public boolean isLoadRuntime() {
		return reader.getBooleanOrDefault("loadRuntime", true);
	}

	@Override
	public URL[] getAddOnURLs() {
		return getURLs("addOnURLs");
	}

	@Override
	public String getApplicationName() {
		return reader.getString("applicationName");
	}

	@Override
	public PromptoVersion getApplicationVersion() {
		String version = reader.getString("applicationVersion");
		return version==null ? PromptoVersion.LATEST : PromptoVersion.parse(version);
	}

	@Override
	public URL[] getResourceURLs() {
		return getURLs("resourceURLs");
	}
	
	private URL[] getURLs(String key) {
		List<Object> list = reader.getArray(key);
		if(list==null || list.isEmpty())
			return null;
		URL[] urls = new URL[list.size()];
		for(int i=0;i<urls.length;i++) {
			urls[i] = convertToURL(list.get(i).toString());
		}
		return urls;
	}

	private static URL convertToURL(String resourceName) {
		try {
			if(resourceName.startsWith("\""))
				resourceName = resourceName.substring(1);
			if(resourceName.endsWith("\""))
				resourceName = resourceName.substring(0, resourceName.length()-1);
			if(resourceName.startsWith("file:") || resourceName.startsWith("jar:"))
				return new URL(resourceName);
			URL url = Thread.currentThread().getContextClassLoader().getResource(resourceName);
			if(url!=null)
				return url;
			File file = new File(resourceName);
			if(!file.exists())
				throw new FileNotFoundException(resourceName);
			return file.toURI().toURL();
		} catch(Throwable t) {
			throw new RuntimeException(t);
		}
	}

}
