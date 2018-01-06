package prompto.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Mode;

public class RuntimeConfiguration extends IRuntimeConfiguration.Inline {

	IConfigurationReader reader;
	
	
	protected RuntimeConfiguration(IConfigurationReader reader, Map<String, String> arguments) {
		this.reader = reader;
		this.applicationName = ()->reader.getString("applicationName");
		this.applicationVersion = ()->readApplicationVersion();
		this.codeStoreConfiguration = ()->reader.readStoreConfiguration("codeStore");
		this.dataStoreConfiguration = ()->reader.readStoreConfiguration("dataStore");
		this.arguments = ()->arguments;
		this.addOnURLs = ()->readURLs("addOnURLs");
		this.resourceURLs = ()->readURLs("resourceURLs");
		this.debugConfiguration = ()->readDebugConfiguration();
		this.runtimeMode = ()->Mode.valueOf(reader.getStringOrDefault("runtimeMode", Mode.PRODUCTION.name()));
		this.loadRuntime = ()->reader.getBooleanOrDefault("loadRuntime", true);
	}
	
	private IDebugConfiguration readDebugConfiguration() {
		IConfigurationReader child = reader.getObject("debug");
		return child==null ? null : new DebugConfiguration(child);
	}
	
	private PromptoVersion readApplicationVersion() {
		String version = reader.getString("applicationVersion");
		return version==null ? PromptoVersion.LATEST : PromptoVersion.parse(version);
	}

	private URL[] readURLs(String key) {
		Collection<Object> list = reader.getArray(key);
		if(list==null || list.isEmpty())
			return null;
		List<URL> urls = list.stream()
				.map(Object::toString)
				.map(RuntimeConfiguration::convertToURL)
				.collect(Collectors.toList());
		return urls.toArray(new URL[urls.size()]);
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
