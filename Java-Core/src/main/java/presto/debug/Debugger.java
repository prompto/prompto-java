package presto.debug;

import presto.declaration.IMethodDeclaration;
import presto.error.PrestoError;
import presto.error.TerminatedError;
import presto.parser.ISection;
import presto.runtime.Context;

public class Debugger {

	Stack stack = new Stack();
	Object blocker = new Object();
	Status status = Status.STARTING;
	ResumeReason resumeReason;
	IDebugEventListener listener;
	// positive for stepping on enterXXX
	// negative for stepping on leaveXXX
	// necessary to avoid stepping twice on the same statement
	int stepDepth = 1;
	boolean suspended = false;
	boolean terminated = false;
	
	public static enum Status {
		STARTING,
		RUNNING,
		SUSPENDED,
		TERMINATING,
		TERMINATED;
		
		@Override
		public String toString() {
			return name().substring(0,1) + name().substring(1).toLowerCase();
		}
	}
	
	public Stack getStack() {
		return stack;
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
	
	public void enterMethod(Context context, IMethodDeclaration method) throws PrestoError {
		terminateIfRequested();
		stack.push(new StackFrame(context, method.getName(), method));
		if(stack.size()>0 && stack.size()<=stepDepth)
			suspend(SuspendReason.STEPPING, context, method);
		else if(method.isBreakpoint())
			suspend(SuspendReason.BREAKPOINT, context, method);
		else
			suspendIfRequested(context, method);
		terminateIfRequested();
	}

	public void leaveMethod(Context context, ISection section) throws PrestoError {
		terminateIfRequested();
		if(stack.size()>0 && stack.size()==-stepDepth)
			suspend(SuspendReason.STEPPING, context, section);
		else
			suspendIfRequested(context, section);
		stack.pop();
		terminateIfRequested();
	}
	
	public void enterStatement(Context context, ISection section) throws PrestoError {
		terminateIfRequested();
		StackFrame previous = stack.pop();
		stack.push(new StackFrame(context, previous.getMethodName(), section));
		if(stack.size()>0 && stack.size()<=stepDepth)
			suspend(SuspendReason.STEPPING, context, section);
		else if(section.isBreakpoint())
			suspend(SuspendReason.BREAKPOINT, context, section);
		else
			suspendIfRequested(context, section);
		terminateIfRequested();
	}

	public void leaveStatement(Context context, ISection section) throws PrestoError {
		terminateIfRequested();
		if(stack.size()>0 && stack.size()==-stepDepth)
			suspend(SuspendReason.STEPPING, context, section);
		else
			suspendIfRequested(context, section);
		terminateIfRequested();
	}
	
	private void terminateIfRequested() throws TerminatedError {
		if(terminated) {
			status = Status.TERMINATING;
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
		synchronized(blocker) {
			status = Status.SUSPENDED;
			if(listener!=null)
				listener.handleSuspendEvent(reason, context, section);
			try {
				blocker.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				status = Status.RUNNING;
				if(listener!=null)
					listener.handleResumeEvent(resumeReason, context, section);
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
		synchronized(blocker) {
			blocker.notify();
		}
	}

	public int getLine() {
		StackFrame frame = stack.peek();
		return frame==null ? -1 : frame.getLine();
	}

	public void terminated() {
		status = Status.TERMINATED;
		if(listener!=null)
			listener.handleTerminateEvent();
	}
	
}
