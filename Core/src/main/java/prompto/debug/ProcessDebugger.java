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

	
	Map<IWorker, IWorkerDebugger> debuggers = new HashMap<>();
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
	
	public void register(Thread thread, WorkerDebugger debugger) {
		DebuggedWorker debugged = DebuggedWorker.wrap(thread);
		debuggers.put(debugged, debugger);
	}
	
	public void unregister(Thread thread) {
		DebuggedWorker debugged = DebuggedWorker.wrap(thread);
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
		ISection instance = context.locateSection(section);
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
	public Collection<? extends IWorker> getWorkers() {
		return debuggers.keySet();
	}

	@Override
	public Status getWorkerStatus(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return Status.TERMINATED;
		} else
			return debugger.getStatus();
	}

	@Override
	public IStack<?> getStack(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return new LeanStack();
		} else
			return debugger.getStack();
	}

	@Override
	public int getLineInFile(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return -1;
		} else
			return debugger.getLineInFile();	
	}
	
	@Override
	public int getLineInMethod(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return -1;
		} else
			return debugger.getLineInMethod();	
	}

	@Override
	public boolean isStepping(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.isStepping();	
	}

	@Override
	public boolean isSuspended(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.isSuspended();	
	}

	@Override
	public boolean canResume(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.canResume();	
	}

	@Override
	public boolean canSuspend(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.canSuspend();	
	}

	@Override
	public boolean canStepInto(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.canStepInto();	
	}

	@Override
	public boolean canStepOver(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.canStepOver();	
	}

	@Override
	public boolean canStepOut(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return false;
		} else
			return debugger.canStepOut();	
	}

	@Override
	public void suspend(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null)
			logger.warn(()->"Invalid worker: " + worker);
		else
			debugger.suspend(); 
	}

	@Override
	public void resume(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null)
			logger.warn(()->"Invalid worker: " + worker);
		else
			debugger.resume(); 
	}
	
	
	@Override
	public void terminate(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null)
			logger.warn(()->"Invalid worker: " + worker);
		else
			debugger.terminate(); 
	}

	@Override
	public void stepInto(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null)
			logger.warn(()->"Invalid worker: " + worker);
		else
			debugger.stepInto(); 
	}

	@Override
	public void stepOut(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null)
			logger.warn(()->"Invalid worker: " + worker);
		else
			debugger.stepOut(); 
	}

	@Override
	public void stepOver(IWorker worker) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null)
			logger.warn(()->"Invalid worker: " + worker);
		else
			debugger.stepOver(); 
	}

	@Override
	public Collection<? extends IVariable> getVariables(IWorker worker, IStackFrame frame) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return Collections.emptyList();
		} else
			return debugger.getVariables(frame);
	}
	
	
	@Override
	public IVariable getVariable(IWorker worker, IStackFrame frame, String variableName) {
		IWorkerDebugger debugger = debuggers.get(worker);
		if(debugger==null) {
			logger.warn(()->"Invalid worker: " + worker);
			return null;
		} else
			return debugger.getVariable(frame, variableName);
	}
	
	public static class DebuggedWorker extends LeanWorker {

		public static DebuggedWorker wrap(Thread thread) {
			return new DebuggedWorker(thread);
		}

		public static IWorker parse(String workerId) {
			try {
				long id = Long.parseLong(workerId);
				return new DebuggedWorker(id);
			} catch(NumberFormatException e) {
				// gracefully handle special case for testing
				if("only".equals(workerId)) {
					Set<IWorker> workers = ProcessDebugger.getInstance().debuggers.keySet();
					if(workers.size()==1)
						return workers.iterator().next();
				}
				return null;
			}
		}

		long threadId;
		
		public DebuggedWorker(long threadId) {
			this.threadId = threadId;
			this.workerId = String.valueOf(threadId);
		}
		
		public DebuggedWorker(Thread thread) {
			this.threadId = thread.getId();
			this.workerId = String.valueOf(threadId);
			this.name = thread.getName();
			this.state = State.valueOf(thread.getState());
		}
		
		@Override
		public boolean equals(Object obj) {
			return obj instanceof DebuggedWorker && equals((DebuggedWorker)obj);
		}

		public boolean equals(DebuggedWorker obj) {
			return this.threadId == obj.threadId;
		}
		
		@Override
		public int hashCode() {
			return Long.hashCode(this.threadId);
		}
		
	}



}
