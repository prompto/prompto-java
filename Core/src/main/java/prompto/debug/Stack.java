package prompto.debug;

import java.util.ArrayDeque;

public class Stack extends ArrayDeque<FullStackFrame> implements IStack<FullStackFrame> {

	private static final long serialVersionUID = 1L;

	public FullStackFrame find(IStackFrame frame) {
		for(FullStackFrame f : this) {
			if(f.equals(frame))
				return f;
		}
		return null;
	}

	
}
