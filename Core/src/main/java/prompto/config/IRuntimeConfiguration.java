package prompto.config;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.document.YamlMapping;
import com.esotericsoftware.yamlbeans.document.YamlSequence;

import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Mode;

public interface IRuntimeConfiguration {
	Supplier<Collection<URL>> getRuntimeLibs();
	IStoreConfiguration getCodeStoreConfiguration();
	IStoreConfiguration getDataStoreConfiguration();
	IDebugConfiguration getDebugConfiguration();
	Mode getRuntimeMode();
	Map<String, String> getArguments();
	String getApplicationName();
	PromptoVersion getApplicationVersion();
	URL[] getAddOnURLs();
	URL[] getResourceURLs();
	boolean isLoadRuntime();
	YamlMapping toYaml() throws YamlException;
	
	<T extends IRuntimeConfiguration> T withRuntimeLibs(Supplier<Collection<URL>> supplier);
	<T extends IRuntimeConfiguration> T withCodeStoreConfiguration(IStoreConfiguration supplier);
	<T extends IRuntimeConfiguration> T withDataStoreConfiguration(IStoreConfiguration supplier);
	<T extends IRuntimeConfiguration> T withAddOnURLs(URL[] addOnURLS);
	<T extends IRuntimeConfiguration> T withApplicationName(String name);
	<T extends IRuntimeConfiguration> T withApplicationVersion(PromptoVersion version);
	<T extends IRuntimeConfiguration> T withResourceURLs(URL[] resourceURLs);
	<T extends IRuntimeConfiguration> T withRuntimeMode(Mode mode);
	<T extends IRuntimeConfiguration> T withLoadRuntime(boolean set);
	<T extends IRuntimeConfiguration> T withDebugConfiguration(IDebugConfiguration config);


	@SuppressWarnings("unchecked")
	public static class Inline implements IRuntimeConfiguration {
		
		Supplier<Collection<URL>> runtimeLibs = null; // always passed from code
		Supplier<Map<String, String>> arguments = ()->Collections.emptyMap();
		Supplier<IDebugConfiguration> debugConfiguration = ()->null;
		Supplier<IStoreConfiguration> codeStoreConfiguration = ()->null;
		Supplier<IStoreConfiguration> dataStoreConfiguration = ()->null;
		Supplier<Mode> runtimeMode = ()->Mode.PRODUCTION;
		Supplier<Boolean> loadRuntime = ()->true;
		Supplier<URL[]> addOnURLs = ()->null;
		Supplier<URL[]> resourceURLs = ()->null;
		Supplier<String> applicationName = ()->null;
		Supplier<PromptoVersion> applicationVersion = ()->null;

		@Override public Supplier<Collection<URL>>getRuntimeLibs() { return runtimeLibs; }
		@Override public IStoreConfiguration getCodeStoreConfiguration() { return codeStoreConfiguration.get(); }
		@Override public IStoreConfiguration getDataStoreConfiguration() { return dataStoreConfiguration.get(); }
		@Override public IDebugConfiguration getDebugConfiguration() { return debugConfiguration.get(); }
		@Override public Map<String, String> getArguments() { return arguments.get(); }
		@Override public String getApplicationName() { return applicationName.get(); }
		@Override public PromptoVersion getApplicationVersion() { return applicationVersion.get(); }
		@Override public Mode getRuntimeMode() { return runtimeMode.get(); }
		@Override public URL[] getAddOnURLs() { return addOnURLs.get(); }
		@Override public URL[] getResourceURLs() { return resourceURLs.get(); }
		@Override public boolean isLoadRuntime() { return loadRuntime.get(); }
		
		@Override 
		public <T extends IRuntimeConfiguration> T withRuntimeLibs(Supplier<Collection<URL>> runtimeLibs) {
			this.runtimeLibs = runtimeLibs;
			return (T)this;
		}
		
		@Override
		public <T extends IRuntimeConfiguration> T withCodeStoreConfiguration(IStoreConfiguration storeConfig) {
			this.codeStoreConfiguration = ()->storeConfig;
			return (T)this;
		}
		
		@Override
		public <T extends IRuntimeConfiguration> T withDataStoreConfiguration(IStoreConfiguration storeConfig) {
			this.dataStoreConfiguration = ()->storeConfig;
			return (T)this;
		}
		
		@Override 
		public <T extends IRuntimeConfiguration> T withAddOnURLs(URL[] urls) {
			this.addOnURLs = ()->urls;
			return (T)this;
		}

		@Override 
		public <T extends IRuntimeConfiguration> T withApplicationName(String name) {
			this.applicationName = ()->name;
			return (T)this;
		}

		@Override 
		public <T extends IRuntimeConfiguration> T withApplicationVersion(PromptoVersion version) {
			this.applicationVersion = ()->version;
			return (T)this;
		}
		
		@Override 
		public <T extends IRuntimeConfiguration> T withResourceURLs(URL[] urls) {
			this.resourceURLs = ()->urls;
			return (T)this;
		}
		
		@Override
		public <T extends IRuntimeConfiguration> T withRuntimeMode(Mode mode) {
			this.runtimeMode = ()->mode;
			return (T)this;
		}
		
		@Override
		public <T extends IRuntimeConfiguration> T withLoadRuntime(boolean set) {
			this.loadRuntime = ()->set;
			return (T)this;
		}
		
		@Override
		public <T extends IRuntimeConfiguration> T withDebugConfiguration(IDebugConfiguration config) {
			this.debugConfiguration = ()->config;
			return (T)this;
		}
		
		@Override
		public YamlMapping toYaml() throws YamlException {
			YamlMapping yaml = new YamlMapping();
			String value = applicationName.get();
			if(value!=null)
				yaml.setEntry("applicationName", value);
			if(applicationVersion.get()!=null)
				yaml.setEntry("applicationVersion", applicationVersion.get().toString());
			IStoreConfiguration config = codeStoreConfiguration.get();
			if(config!=null)
				yaml.setEntry("codeStore", config.toYaml());
			config = dataStoreConfiguration.get();
			if(config!=null)
				yaml.setEntry("dataStore", config.toYaml());
			Mode mode = runtimeMode.get();
			if(mode!=null)
				yaml.setEntry("runtimeMode", mode.name());
			URL[] urls = addOnURLs.get();
			if(urls!=null) {
				YamlSequence sequence = new YamlSequence();
				for(URL url : urls)
					sequence.addElement(url.toExternalForm());
				yaml.setEntry("addOnURLs", sequence);
			}
			urls = resourceURLs.get();
			if(urls!=null) {
				YamlSequence sequence = new YamlSequence();
				for(URL url : urls)
					sequence.addElement(url.toExternalForm());
				yaml.setEntry("resourceURLs", sequence);
			}
			return yaml;
		}
		
	}


	



}
