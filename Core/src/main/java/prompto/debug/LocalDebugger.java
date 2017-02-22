package prompto.debug;

import java.util.Collection;

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
	
	@Override
	public Stack getStack(IThread thread) {
		return stack;
	}
	
	@Override
	public Collection<IVariable> getVariables(IThread thread, IStackFrame frame) {
		FullStackFrame sf = stack.find(frame);
		return sf.getVariables();
	}
	
	public void setStatus(Status status) {
		showEvent("LocalDebugger sets status " + status);
		this.status = status;
	}
	
	@Override
	public Status getStatus(IThread thread) {
		return status;
	}
	
	@Override
	public void suspend(IThread thread) {
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
		stack.push(new FullStackFrame(context, method.getId().toString(), method));
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
		stack.push(new FullStackFrame(context, previous.getMethodName(), section));
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
	
	@Override
	public boolean isStepping(IThread thread) {
		return stepDepth!=0;
	}
	
	@Override
	public boolean canSuspend(IThread thread) {
		return !isSuspended(thread);
	}

	@Override
	public boolean isSuspended(IThread thread) {
		return status==Status.SUSPENDED;
	}

	@Override
	public boolean canResume(IThread thread) {
		return isSuspended(thread);
	}
	
	@Override
	public void resume(IThread thread) {
		stepDepth = 0;
		doResume(ResumeReason.RESUMED);
	}
	
	@Override
	public boolean canStepOver(IThread thread) {
		return isSuspended(thread);
	}
	
	@Override
	public void stepOver(IThread thread) {
		stepDepth = stack.size();
		doResume(ResumeReason.STEP_OVER);
	}

	@Override
	public boolean canStepInto(IThread thread) {
		return isSuspended(thread);
	}
	
	@Override
	public void stepInto(IThread thread) {
		stepDepth = Math.abs(stepDepth) + 1;
		doResume(ResumeReason.STEP_INTO);
	}
	
	@Override
	public boolean canStepOut(IThread thread) {
		return isSuspended(thread);
	}
	
	@Override
	public void stepOut(IThread thread) {
		stepDepth = -(Math.abs(stepDepth) - 1);
		doResume(ResumeReason.STEP_OUT);
	}
	
	@Override
	public boolean canTerminate() {
		return !isTerminated();
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

	@Override
	public int getLine(IThread thread) {
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
