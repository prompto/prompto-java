package prompto.debug;

import java.util.Collection;

public interface IWorkerDebugger {

	Status getStatus();
	IStack<?> getStack();
	int getLineInFile();
	int getLineInMethod();
	boolean isStepping();
	boolean isSuspended();
	boolean canResume();
	boolean canSuspend();
	boolean canStepInto();
	boolean canStepOver();
	boolean canStepOut();
	void suspend();
	void resume();
	void terminate();
	void stepInto();
	void stepOut();
	void stepOver();
	Collection<? extends IVariable> getVariables(IStackFrame frame);
}
