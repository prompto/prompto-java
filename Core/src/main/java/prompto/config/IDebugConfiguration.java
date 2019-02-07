package prompto.config;

import java.util.function.Supplier;

public interface IDebugConfiguration {

	IDebugEventAdapterConfiguration getEventAdapterConfiguration();
	IDebugRequestListenerConfiguration getRequestListenerConfiguration();

	<T extends IDebugConfiguration> T withEventAdapterConfiguration(IDebugEventAdapterConfiguration config);
	<T extends IDebugConfiguration> T withRequestListenerConfiguration(IDebugRequestListenerConfiguration config);

	@SuppressWarnings("unchecked")
	public static class Inline implements IDebugConfiguration {

		Supplier<IDebugEventAdapterConfiguration> eventAdapterConfiguration = ()->null;
		Supplier<IDebugRequestListenerConfiguration> requestListenerConfiguration = ()->null;

		@Override public IDebugEventAdapterConfiguration getEventAdapterConfiguration() { return eventAdapterConfiguration.get(); }
		@Override public IDebugRequestListenerConfiguration getRequestListenerConfiguration() { return requestListenerConfiguration.get(); }
			
		@Override
		public <T extends IDebugConfiguration> T withEventAdapterConfiguration(IDebugEventAdapterConfiguration config) {
			this.eventAdapterConfiguration = ()->config;
			return (T)this;
		}
		
		@Override
		public <T extends IDebugConfiguration> T withRequestListenerConfiguration(IDebugRequestListenerConfiguration config) {
			this.requestListenerConfiguration = ()->config;
			return (T)this;
		}

	}

}
