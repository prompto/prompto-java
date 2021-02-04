package prompto.debug;

import java.util.Collection;

import prompto.debug.stack.IStack;
import prompto.debug.stack.IStackFrame;
import prompto.debug.variable.IVariable;
import prompto.debug.worker.IWorker;
import prompto.parser.ISection;

public interface IDebugger {

	void setListener(IDebugEventListener listener);
	void installBreakpoint(ISection section);
	boolean isTerminated();
	boolean canTerminate();
	void terminate();
	void terminate(IWorker worker);
	void notifyTerminated();
	Collection<? extends IWorker> getWorkers();
	Status getProcessStatus();
	Status getWorkerStatus(IWorker worker);
	IStack<?> getWorkerStack(IWorker worker);
	int getLineInFile(IWorker worker); 
	int getLineInMethod(IWorker worker); 
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
	IVariable getVariable(IWorker worker, IStackFrame frame, String name);
	Collection<? extends IVariable> getVariables(IWorker worker, IStackFrame frame);
}
