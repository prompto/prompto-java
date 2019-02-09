package prompto.debug;

import java.util.Collection;

import prompto.parser.ISection;

public interface IDebugger {

	void setListener(IDebugEventListener listener);
	void installBreakpoint(ISection section);
	boolean isTerminated();
	boolean canTerminate();
	void terminate();
	void notifyTerminated();
	Collection<? extends IWorker> getWorkers();
	Status getProcessStatus();
	Status getWorkerStatus(IWorker worker);
	IStack<?> getStack(IWorker worker);
	int getLine(IWorker worker);
	boolean isStepping(IWorker worker);
	boolean isSuspended(IWorker worker);
	boolean canResume(IWorker worker);
	boolean canSuspend(IWorker worker);
	boolean canStepInto(IWorker worker);
	boolean canStepOver(IWorker worker);
	boolean canStepOut(IWorker worker);
	void suspend(IWorker worker);
	void resume(IWorker worker);
	void stepInto(IWorker worker);
	void stepOut(IWorker worker);
	void stepOver(IWorker worker);
	Collection<? extends IVariable> getVariables(IWorker worker, IStackFrame frame);
}
