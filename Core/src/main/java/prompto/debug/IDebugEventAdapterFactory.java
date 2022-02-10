package prompto.debug;

import prompto.config.IConfigurationReader;
import prompto.config.IDebugEventAdapterConfiguration;

public interface IDebugEventAdapterFactory {

	IDebugEventAdapter newAdapter(IDebugEventAdapterConfiguration config);
	IDebugEventAdapterConfiguration newConfiguration(IConfigurationReader reader);
	
	static IDebugEventAdapter newAdapterFromConfig(IDebugEventAdapterConfiguration cfg) throws Throwable {
		IDebugEventAdapterFactory factory = newAdapterFactory(cfg.getFactory());
		return factory.newAdapter(cfg);
	}
	
	static IDebugEventAdapterFactory newAdapterFactory(String factoryName) throws Throwable {
		Class<?> klass = Class.forName(factoryName, true, Thread.currentThread().getContextClassLoader());
		if(!(IDebugEventAdapterFactory.class.isAssignableFrom(klass)))
			throw new RuntimeException("Not an adapter factory: " + factoryName);
		return (IDebugEventAdapterFactory)klass.getDeclaredConstructor().newInstance();
	}


}
