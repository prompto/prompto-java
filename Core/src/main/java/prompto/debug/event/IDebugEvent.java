package prompto.debug.event;

import prompto.debug.IDebugEventListener;

public interface IDebugEvent {

	void execute(IDebugEventListener listener);

}
