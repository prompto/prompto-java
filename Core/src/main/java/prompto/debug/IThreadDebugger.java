package prompto.debug;

import java.util.Collection;

public interface IThreadDebugger {

	Status getStatus();
	IStack<?> getStack();
	int getLine();
	boolean isStepping();
	boolean isSuspended();
	boolean canResume();
	boolean canSuspend();
	boolean canStepInto();
	boolean canStepOver();
	boolean canStepOut();
	void suspend();
	void resume();
	void stepInto();
	void stepOut();
	void stepOver();
	Collection<? extends IVariable> getVariables(IStackFrame frame);
}
