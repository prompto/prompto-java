package prompto.debug;

import prompto.parser.ISection;

public interface IDebugger {

	void connect();
	void setListener(IDebugEventListener listener);
	Status getStatus();
	IStack<?> getStack();
	int getLine();
	boolean isStepping();
	boolean isSuspended();
	boolean isTerminated();
	void notifyTerminated();
	boolean canResume();
	boolean canSuspend();
	boolean canStepInto();
	boolean canStepOver();
	boolean canStepOut();
	boolean canTerminate();
	void suspend();
	void resume();
	void terminate();
	void stepInto();
	void stepOut();
	void stepOver();
	void installBreakpoint(ISection section);
}
