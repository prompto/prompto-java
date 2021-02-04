package prompto.debug.stack;

import java.util.Collection;

import prompto.debug.IDebugger;
import prompto.debug.variable.IVariable;
import prompto.debug.worker.IWorker;

public class ClientStackFrame extends LeanStackFrame {

	IDebugger debugger;
	IWorker worker;
	
	public ClientStackFrame(IDebugger debugger, IWorker worker, LeanStackFrame frame) {
		super(frame);
		this.debugger = debugger;
		this.worker = worker;
	}
	
	@Override
	public Collection<? extends IVariable> getVariables() {
		return debugger.getVariables(worker, this);
	}
}