package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public class ProcessTerminatedDebugEvent implements IDebugEvent {

	@Override
	public void execute(IDebugEventListener listener) {
		listener.onProcessTerminatedEvent();
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		return other==this || other instanceof ProcessTerminatedDebugEvent;
	}

}