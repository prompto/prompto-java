package prompto.debug.java;

import java.util.function.Supplier;

import prompto.config.IConfigurationReader;
import prompto.config.IDebugEventAdapterConfiguration;
import prompto.debug.IDebugEventAdapter;
import prompto.debug.IDebugEventAdapterFactory;

public class JavaDebugEventAdapterFactory implements IDebugEventAdapterFactory {

	@Override
	public IDebugEventAdapter newAdapter(IDebugEventAdapterConfiguration config) {
		if(config instanceof Configuration)
			return newAdapter((Configuration)config);
		else
			throw new IllegalArgumentException("Expected a JavaDebugEventAdapterFactory.Configuration, got a " + (config==null ? null : config.getClass().getName()));
	}
	
	public IDebugEventAdapter newAdapter(Configuration config) {
		return new JavaDebugEventAdapter(config.getHost(), config.getPort());
	}

	@Override
	public IDebugEventAdapterConfiguration newConfiguration(IConfigurationReader reader) {
		return new Configuration(reader).withFactory(this.getClass().getName());
	}
	
	static class Configuration extends IDebugEventAdapterConfiguration.Inline {
		
		Supplier<String> host = ()->null;
		Supplier<Integer> port = ()->null;
	
		public Configuration(IConfigurationReader reader) {
			this.host = ()->reader.getStringOrDefault("host", "localhost");
			this.port = ()->reader.getInteger("port");
		}
		
		public String getHost() { 
			return host.get(); 
		}
		
		public Integer getPort() { 
			return port.get();
		}
	}
}
