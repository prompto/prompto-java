package presto.debug;

import presto.parser.ISection;
import presto.runtime.IContext;

public interface IDebugEventListener {
	void handleResumeEvent(ResumeReason reason, IContext context, ISection section );
	void handleSuspendEvent(SuspendReason reason, IContext context, ISection section);
	void handleTerminateEvent();
}
