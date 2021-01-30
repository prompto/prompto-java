package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public class ReadyDebugEvent implements IDebugEvent {
	
	@Override
	public void execute(IDebugEventListener listener) {
		listener.handleReadyEvent();
	}
}