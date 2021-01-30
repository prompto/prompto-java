package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public class TerminatedDebugEvent implements IDebugEvent {

	@Override
	public void execute(IDebugEventListener listener) {
		listener.handleTerminatedEvent();
	}
}