package prompto.debug;

import prompto.parser.ISection;
import prompto.runtime.IContext;

public interface IDebugEventListener {
	void handleResumeEvent(ResumeReason reason, IContext context, ISection section );
	void handleSuspendEvent(SuspendReason reason, IContext context, ISection section);
	void handleTerminateEvent();
}
