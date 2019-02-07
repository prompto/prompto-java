package prompto.config;

import java.util.function.Supplier;

public interface IDebugEventAdapterConfiguration {

	String getFactory();
	IDebugEventAdapterConfiguration withFactory(String factory);
	
	public static class Inline implements IDebugEventAdapterConfiguration {

		Supplier<String> factory = () -> null;
		
		@Override
		public String getFactory() {
			return factory.get();
		}

		@Override
		public IDebugEventAdapterConfiguration withFactory(String factory) {
			this.factory = () -> factory;
			return this;
		}
				
	}


}
