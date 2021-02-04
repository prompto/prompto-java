package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public class TerminatedDebugEvent implements IDebugEvent {

	@Override
	public void execute(IDebugEventListener listener) {
		listener.handleTerminatedEvent();
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || other instanceof TerminatedDebugEvent;
	}

}