package prompto.debug;

import java.util.ArrayDeque;

public class ServerStack extends ArrayDeque<WorkerStackFrame> implements IStack<WorkerStackFrame> {

	private static final long serialVersionUID = 1L;

	public WorkerStackFrame find(IStackFrame frame) {
		for(WorkerStackFrame f : this) {
			if(f.equals(frame))
				return f;
		}
		return null;
	}

	
}
