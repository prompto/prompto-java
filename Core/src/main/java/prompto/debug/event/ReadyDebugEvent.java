package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public class ReadyDebugEvent implements IDebugEvent {
	
	@Override
	public void execute(IDebugEventListener listener) {
		listener.handleReadyEvent();
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || other instanceof ReadyDebugEvent;
	}

}