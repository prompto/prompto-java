package prompto.debug;

import java.util.Collection;
import java.util.Collections;

import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.event.CompletedDebugEvent;
import prompto.debug.event.StartedDebugEvent;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.TerminatedError;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.utils.Logger;

public class WorkerDebugger implements IWorkerDebugger {

	static Logger logger = new Logger();
	
	WorkerStack stack = new WorkerStack();
	Object lock = new Object();
	Status status = Status.STARTING;
	boolean suspended = false;
	boolean terminated = false;
	ResumeReason resumeReason;
	IDebugEventListener listener;
	Context context;
	int stepDepth = 0;
	/* 
	 stepDepth represents the stack depth at which we should be stepping 
	 it is normally positive, except when user requests stepOut
	 on stepInto we increase the depth by one such that the next statement in the invoked method will suspend
	 on stepOver we don't increase the depth such that only the next statement in the current method whill suspend
	 on StepOut we invert the value such that leaving the method will suspend
	 on resume we simply zero the depth
	*/
	
	
	@Override
	public WorkerStack getStack() {
		return stack;
	}
	
	@Override
	public Collection<? extends IVariable> getVariables(IStackFrame frame) {
		WorkerStackFrame sf = stack.find(frame);
		if(sf!=null)
			return sf.getVariables();
		// need some debug info
		System.err.println("Could not find frame: " +frame.toString() + " in stack:");
		stack.forEach(f->System.err.println(f.toString()));
		return Collections.emptyList();
	}
	
	
	@Override
	public IVariable getVariable(IStackFrame frame, String variableName) {
		WorkerStackFrame sf = stack.find(frame);
		if(sf!=null)
			return sf.getVariable(variableName);
		// need some debug info
		System.err.println("Could not find frame: " +frame.toString() + " in stack:");
		stack.forEach(f->System.err.println(f.toString()));
		return null;
	}
	
	public void setStatus(Status status) {
		logger.debug(()->"LocalDebugger sets status " + status);
		this.status = status;
	}
	
	@Override
	public Status getStatus() {
		return status;
	}
	
	@Override
	public void suspend() {
		suspended = true;
	}
	
	@Override
	public void terminate() {
		terminated = true;
		doResume(ResumeReason.RESUMED);
	}
	
	public IDebugEventListener getListener() {
		return listener;
	}
	
	public void setListener(IDebugEventListener listener) {
		this.listener = listener;
	}
	
	public void enterTest(Context context, TestMethodDeclaration test) {
		terminateIfRequested();
		this.context = context;
		stack.push(new WorkerStackFrame(context, null, test.getName(), null, stack.size(), test));
		terminateIfRequested();
	}
	
	public void enterMethod(Context context, IMethodDeclaration method) throws PromptoError {
		terminateIfRequested();
		this.context = context;
		CategoryDeclaration category = method.getMemberOf();
		String categoryName = category==null ? null : category.getName();
		stack.push(new WorkerStackFrame(context, categoryName, method.getName(), method.getProto(), stack.size(), method));
		terminateIfRequested();
	}

	public void leaveSection(Context context, ISection section) throws PromptoError {
		terminateIfRequested();
		if(stack.size()>0 && stack.size()==-stepDepth) {
			stepDepth = stack.size();
			suspend(SuspendReason.STEPPED, context, section); // stepping out
		} else
			suspendIfRequested(context, section);
		stack.pop();
		terminateIfRequested();
	}
	
	public void enterStatement(Context context, ISection section) throws PromptoError {
		terminateIfRequested();
		this.context = context;
		IStackFrame previous = stack.pop();
		stack.push(new WorkerStackFrame(context, previous.getCategoryName(), previous.getMethodName(), previous.getMethodProto(), previous.getMethodLine(), stack.size(), section));
		if(stack.size()>0 && stack.size()<=stepDepth)
			suspend(SuspendReason.STEPPED, context, section);
		else if(section.isBreakpoint()) {
			stepDepth = stack.size();
			suspend(SuspendReason.BREAKPOINT, context, section);
		} else
			suspendIfRequested(context, section);
		terminateIfRequested();
	}

	public void leaveStatement(Context context, ISection section) throws PromptoError {
		terminateIfRequested();
		if(stack.size()>0 && stack.size()==-stepDepth) {
			stepDepth = stack.size();
			suspend(SuspendReason.STEPPED, context, section);
		} else
			suspendIfRequested(context, section);
		terminateIfRequested();
	}
	
	private void terminateIfRequested() throws TerminatedError {
		if(terminated) {
			setStatus(Status.TERMINATING);
			throw new TerminatedError();
		}
	}

	private void suspendIfRequested(Context context, ISection section) {
		if(suspended) {
			suspended = false;
			stepDepth = stack.size();
			suspend(SuspendReason.SUSPENDED, context, section);
		}
		
	}

	public void suspend(SuspendReason reason, final Context context, ISection section) {
		logger.debug(()->"acquiring lock");
		synchronized(lock) {
			setStatus(Status.SUSPENDED);
			if(listener!=null)
				listener.handleSuspendedEvent(DebuggedWorker.wrap(Thread.currentThread()), reason);
			try {
				logger.debug(()->"waiting lock");
				lock.wait();
				logger.debug(()->"waiting lock");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				setStatus( Status.RUNNING);
				if(listener!=null)
					listener.handleResumedEvent(DebuggedWorker.wrap(Thread.currentThread()), resumeReason);
			}
		}
	}	
	
	@Override
	public boolean isStepping() {
		return stepDepth!=0;
	}
	
	@Override
	public boolean canSuspend() {
		return !isSuspended();
	}

	@Override
	public boolean isSuspended() {
		return status==Status.SUSPENDED;
	}

	@Override
	public boolean canResume() {
		return isSuspended();
	}
	
	@Override
	public void resume() {
		stepDepth = 0;
		doResume(ResumeReason.RESUMED);
	}
	
	@Override
	public boolean canStepOver() {
		return isSuspended();
	}
	
	@Override
	public void stepOver() {
		stepDepth = stack.size();
		doResume(ResumeReason.STEP_OVER);
	}

	@Override
	public boolean canStepInto() {
		return isSuspended();
	}
	
	@Override
	public void stepInto() {
		stepDepth = Math.abs(stepDepth) + 1;
		doResume(ResumeReason.STEP_INTO);
	}
	
	@Override
	public boolean canStepOut() {
		return isSuspended();
	}
	
	@Override
	public void stepOut() {
		stepDepth = -(Math.abs(stepDepth) - 1);
		doResume(ResumeReason.STEP_OUT);
	}
	
	public void doResume(ResumeReason reason) {
		this.resumeReason = reason;
		logger.debug(()->"acquiring lock");
		synchronized(lock) {
			logger.debug(()->"notifying lock");
			lock.notify();
			logger.debug(()->"releasing lock");
		}
	}

	
	@Override
	public int getLineInFile() {
		IStackFrame frame = stack.peek();
		return frame==null ? -1 : frame.getStatementLine();
	}
	
	
	@Override
	public int getLineInMethod() {
		IStackFrame frame = stack.peek();
		return frame==null ? -1 : 1 + frame.getMethodLine() - frame.getStatementLine();
	}
	
	public void notifyStarted(StartedDebugEvent event) {
		setStatus(Status.RUNNING);
		if(listener!=null) {
			IWorker worker = DebuggedWorker.parse(event.getWorkerId());
			listener.handleStartedEvent(worker); 
		}
	}
	
	public void notifyCompleted(CompletedDebugEvent event) {
		ProcessDebugger.getInstance().unregister(Thread.currentThread());
		if(listener!=null) {
			IWorker worker = DebuggedWorker.parse(event.getWorkerId());
			listener.handleCompletedEvent(worker); 
		}
	}



	
}
