package prompto.config;

import java.util.function.Supplier;

public interface IDebugConfiguration {

	String getEventAdapterFactory();
	String getRequestListenerFactory();
	String getHost();
	Integer getPort();

	<T extends IDebugConfiguration> T withEventAdapterFactory(String factory);
	<T extends IDebugConfiguration> T withRequestListenerFactory(String factory);
	<T extends IDebugConfiguration> T withHost(String host);
	<T extends IDebugConfiguration> T withPort(Integer port);

	@SuppressWarnings("unchecked")
	public static class Inline implements IDebugConfiguration {

		Supplier<String> eventAdapterFactory = ()->null;
		Supplier<String> requestListenerFactory = ()->null;
		Supplier<String> host = ()->null;
		Supplier<Integer> port = ()->null;

		@Override public String getEventAdapterFactory() { return eventAdapterFactory.get(); }
		@Override public String getRequestListenerFactory() { return requestListenerFactory.get(); }
		@Override public String getHost() { return host.get(); }
		@Override public Integer getPort() { return port.get(); }
			
		@Override
		public <T extends IDebugConfiguration> T withEventAdapterFactory(String factory) {
			this.eventAdapterFactory = ()->factory;
			return (T)this;
		}
		
		@Override
		public <T extends IDebugConfiguration> T withRequestListenerFactory(String factory) {
			this.requestListenerFactory = ()->factory;
			return (T)this;
		}

		@Override
		public <T extends IDebugConfiguration> T withHost(String host) {
			this.host = ()->host;
			return (T)this;
		}
		
		@Override
		public <T extends IDebugConfiguration> T withPort(Integer port) {
			this.port = ()->port;
			return (T)this;
		}
		
	}

}
