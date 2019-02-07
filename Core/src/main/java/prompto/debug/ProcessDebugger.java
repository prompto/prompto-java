package prompto.debug;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.utils.Logger;

public class ProcessDebugger implements IDebugger {

	private static Logger logger = new Logger();

	static ProcessDebugger instance = null;
	
	public static ProcessDebugger getInstance() {
		return instance;
	}
	
	public static ProcessDebugger createInstance(Context context) {
		if(instance!=null)
			throw new IllegalStateException("An instance already exists!");
		instance = new ProcessDebugger(context);
		return instance;
	}
	
	public static void reset() {
		instance = null;
	}

	
	Map<IThread, IThreadDebugger> debuggers = new HashMap<>();
	Status status = Status.STARTING;
	IDebugEventListener listener;
	Context context;
	
	private ProcessDebugger(Context context) {
		this.context = context;
	}
	
	public void setProcessStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public Status getProcessStatus() {
		return status;
	}
	
	public void register(Thread thread, ThreadDebugger debugger) {
		DebuggedThread debugged = DebuggedThread.wrap(thread);
		debuggers.put(debugged, debugger);
	}
	
	public void unregister(Thread thread) {
		DebuggedThread debugged = DebuggedThread.wrap(thread);
		debuggers.remove(debugged);
	}

	@Override
	public void setListener(IDebugEventListener listener) {
		this.listener = listener;
	}

	@Override
	public void installBreakpoint(ISection section) {
		if(context==null)
			throw new RuntimeException("No context to search from!");
		ISection instance = context.findSection(section);
		if(instance!=null) {
			logger.debug(()->"Found section " + instance.toString());
			instance.setAsBreakpoint(section.isBreakpoint());
		} else
			logger.debug(()->"Could not find section " + section.toString());
		
	}

	@Override
	public boolean isTerminated() {
		return status==Status.TERMINATED;
	}

	@Override
	public boolean canTerminate() {
		return !isTerminated();
	}

	@Override
	public void terminate() {
		notifyTerminated();
	}

	@Override
	public void notifyTerminated() {
		if(!isTerminated()) {
			setProcessStatus(Status.TERMINATED);
			if(listener!=null)
				listener.handleTerminatedEvent();
		}
	}

	@Override
	public Collection<? extends IThread> getThreads() {
		return debuggers.keySet();
	}

	@Override
	public Status getThreadStatus(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return Status.TERMINATED;
		} else
			return debugger.getStatus();
	}

	@Override
	public IStack<?> getStack(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return new LeanStack();
		} else
			return debugger.getStack();
	}

	@Override
	public int getLine(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return -1;
		} else
			return debugger.getLine();	
	}

	@Override
	public boolean isStepping(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.isStepping();	
	}

	@Override
	public boolean isSuspended(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.isSuspended();	
	}

	@Override
	public boolean canResume(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.canResume();	
	}

	@Override
	public boolean canSuspend(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.canSuspend();	
	}

	@Override
	public boolean canStepInto(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.canStepInto();	
	}

	@Override
	public boolean canStepOver(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.canStepOver();	
	}

	@Override
	public boolean canStepOut(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return false;
		} else
			return debugger.canStepOut();	
	}

	@Override
	public void suspend(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null)
			logger.warn(()->"Invalid thread: " + thread);
		else
			debugger.suspend(); 
	}

	@Override
	public void resume(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null)
			logger.warn(()->"Invalid thread: " + thread);
		else
			debugger.resume(); 
	}

	@Override
	public void stepInto(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null)
			logger.warn(()->"Invalid thread: " + thread);
		else
			debugger.stepInto(); 
	}

	@Override
	public void stepOut(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null)
			logger.warn(()->"Invalid thread: " + thread);
		else
			debugger.stepOut(); 
	}

	@Override
	public void stepOver(IThread thread) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null)
			logger.warn(()->"Invalid thread: " + thread);
		else
			debugger.stepOver(); 
	}

	@Override
	public Collection<? extends IVariable> getVariables(IThread thread, IStackFrame frame) {
		IThreadDebugger debugger = debuggers.get(thread);
		if(debugger==null) {
			logger.warn(()->"Invalid thread: " + thread);
			return Collections.emptyList();
		} else
			return debugger.getVariables(frame);
	}
	
	public static class DebuggedThread implements IThread {

		public static DebuggedThread wrap(Thread thread) {
			return new DebuggedThread(thread.getId());
		}

		public static IThread parse(String threadId) {
			try {
				long id = Long.parseLong(threadId);
				return new DebuggedThread(id);
			} catch(NumberFormatException e) {
				// special case for testing
				if("only".equals(threadId)) {
					Set<IThread> threads = ProcessDebugger.getInstance().debuggers.keySet();
					if(threads.size()==1)
						return threads.iterator().next();
				}
				return null;
			}
		}

		long threadId;
		
		public DebuggedThread(long threadId) {
			this.threadId = threadId;
		}
		
		@Override
		public boolean equals(Object obj) {
			return obj instanceof DebuggedThread && equals((DebuggedThread)obj);
		}

		public boolean equals(DebuggedThread obj) {
			return this.threadId == obj.threadId;
		}
		
		@Override
		public int hashCode() {
			return Long.hashCode(this.threadId);
		}
		
		@Override
		public String toString() {
			return Long.toString(threadId);
		}

	
	}



}
