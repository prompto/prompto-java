package prompto.debug;

public interface IDebugger {

	void setListener(IDebugEventListener listener);
	Status getStatus();
	Stack getStack();
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
	void suspend();
	void resume();
	void terminate();
	void stepInto();
	void stepOut();
	void stepOver();
}
