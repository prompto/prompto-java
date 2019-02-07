package prompto.config;

import java.util.function.Supplier;

public interface IDebugRequestListenerConfiguration {

	String getFactory();
	IDebugRequestListenerConfiguration withFactory(String factory);
	
	
	public static class Inline implements IDebugRequestListenerConfiguration {

		Supplier<String> factory = () -> null;
		
		@Override
		public String getFactory() {
			return factory.get();
		}

		@Override
		public IDebugRequestListenerConfiguration withFactory(String factory) {
			this.factory = () -> factory;
			return this;
		}
		
	}

}
