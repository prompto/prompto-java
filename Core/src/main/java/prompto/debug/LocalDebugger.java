package prompto.debug;

import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.TerminatedError;
import prompto.parser.ISection;
import prompto.runtime.Context;

public class LocalDebugger implements IDebugger {

	public static void showEvent(String message) {
		// System.err.println(message);
	}
	
	
	Stack stack = new Stack();
	Object lock = new Object();
	Status status = Status.STARTING;
	ResumeReason resumeReason;
	IDebugEventListener listener;
	Context context;
	// positive for stepping on enterXXX
	// negative for stepping on leaveXXX
	// necessary to avoid stepping twice on the same statement
	int stepDepth = 1;
	boolean suspended = false;
	boolean terminated = false;
	
	
	@Override
	public void connect() {
		setStatus(Status.RUNNING);
	}
	
	public Stack getStack() {
		return stack;
	}
	
	public void setStatus(Status status) {
		showEvent("LocalDebugger sets status " + status);
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void suspend() {
		suspended = true;
	}
	
	public boolean isTerminated() {
		return status==Status.TERMINATED;
	}
	
	public void terminate() {
		terminated = true;
	}
	
	public IDebugEventListener getListener() {
		return listener;
	}
	
	public void setListener(IDebugEventListener listener) {
		this.listener = listener;
	}
	
	public void enterMethod(Context context, IDeclaration method) throws PromptoError {
		terminateIfRequested();
		this.context = context;
		stack.push(new StackFrame(context, method.getId().toString(), method));
		if(stack.size()>0 && stack.size()<=stepDepth)
			suspend(SuspendReason.STEPPING, context, method);
		else if(method.isBreakpoint())
			suspend(SuspendReason.BREAKPOINT, context, method);
		else
			suspendIfRequested(context, method);
		terminateIfRequested();
	}

	public void leaveMethod(Context context, ISection section) throws PromptoError {
		terminateIfRequested();
		if(stack.size()>0 && stack.size()==-stepDepth)
			suspend(SuspendReason.STEPPING, context, section);
		else
			suspendIfRequested(context, section);
		stack.pop();
		terminateIfRequested();
	}
	
	public void enterStatement(Context context, ISection section) throws PromptoError {
		terminateIfRequested();
		this.context = context;
		IStackFrame previous = stack.pop();
		stack.push(new StackFrame(context, previous.getMethodName(), section));
		if(stack.size()>0 && stack.size()<=stepDepth)
			suspend(SuspendReason.STEPPING, context, section);
		else if(section.isBreakpoint())
			suspend(SuspendReason.BREAKPOINT, context, section);
		else
			suspendIfRequested(context, section);
		terminateIfRequested();
	}

	public void leaveStatement(Context context, ISection section) throws PromptoError {
		terminateIfRequested();
		if(stack.size()>0 && stack.size()==-stepDepth)
			suspend(SuspendReason.STEPPING, context, section);
		else
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
			suspend(SuspendReason.SUSPENDED, context, section);
		}
		
	}

	public void suspend(SuspendReason reason, final Context context, ISection section) {
		showEvent("acquiring lock");
		synchronized(lock) {
			setStatus(Status.SUSPENDED);
			if(listener!=null)
				listener.handleSuspendedEvent(reason);
			try {
				showEvent("waiting lock");
				lock.wait();
				showEvent("waiting lock");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				setStatus( Status.RUNNING);
				if(listener!=null)
					listener.handleResumedEvent(resumeReason);
			}
		}
	}	
	
	public boolean isStepping() {
		return stepDepth!=0;
	}
	
	public boolean canSuspend() {
		return !isSuspended();
	}

	public boolean isSuspended() {
		return status==Status.SUSPENDED;
	}

	public boolean canResume() {
		return isSuspended();
	}
	
	public void resume() {
		stepDepth = 0;
		doResume(ResumeReason.RESUMED);
	}
	
	public boolean canStepOver() {
		return isSuspended();
	}
	
	public void stepOver() {
		stepDepth = stack.size();
		doResume(ResumeReason.STEP_OVER);
	}

	public boolean canStepInto() {
		return isSuspended();
	}
	
	public void stepInto() {
		stepDepth = Math.abs(stepDepth) + 1;
		doResume(ResumeReason.STEP_INTO);
	}
	
	public boolean canStepOut() {
		return isSuspended();
	}
	
	public void stepOut() {
		stepDepth = -(Math.abs(stepDepth) - 1);
		doResume(ResumeReason.STEP_OUT);
	}

	public void doResume(ResumeReason reason) {
		this.resumeReason = reason;
		showEvent("acquiring lock");
		synchronized(lock) {
			showEvent("notifying lock");
			lock.notify();
			showEvent("releasing lock");
		}
	}

	public int getLine() {
		IStackFrame frame = stack.peek();
		return frame==null ? -1 : frame.getLine();
	}

	public void notifyTerminated() {
		if(!isTerminated()) {
			setStatus(Status.TERMINATED);
			if(listener!=null)
				listener.handleTerminatedEvent();
		}
	}
	
	@Override
	public void installBreakpoint(ISection section) {
		if(context==null)
			throw new RuntimeException("No context to search from!");
		ISection instance = context.findSection(section);
		if(instance!=null) {
			showEvent("Found section " + instance.toString());
			instance.setAsBreakpoint(section.isBreakpoint());
		} else
			showEvent("Could not find section " + section.toString());
	}
	
}
