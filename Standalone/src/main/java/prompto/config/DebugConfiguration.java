package prompto.config;

public class DebugConfiguration extends IDebugConfiguration.Inline {

	IConfigurationReader reader;

	public DebugConfiguration(IConfigurationReader reader) {
		this.eventAdapterConfiguration = ()->reader.readDebugEventAdapterConfiguration("eventAdapter");
		this.requestListenerConfiguration = ()->reader.readDebugRequestListenerConfiguration("requestListener");
	}
	
	
}
