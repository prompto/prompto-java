package presto.debug;

import presto.parser.ISection;
import presto.runtime.Context;

public class StackFrame {
	
	String methodName;
	String path;
	int line;
	int charStart;
	int charEnd;
	
	public StackFrame(Context context, String methodName, ISection section) {
		this.methodName = methodName;
		this.path = section.getPath();
		this.line = section.getStart().getLine();
		this.charStart = section.getStart().getIndex();
		this.charEnd = section.getEnd().getIndex();
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public String getPath() {
		return path;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getCharEnd() {
		return charEnd;
	}
	
	public int getCharStart() {
		return charStart;
	}
	
	@Override
	public String toString() {
		return methodName + ", line " + Integer.toString(line);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof StackFrame))
			return false;
		StackFrame sf = (StackFrame)obj;
		return this.methodName.equals(sf.methodName)
				&& this.path.equals(sf.path)
				&& this.line==sf.line
				&& this.charStart==sf.charStart
				&& this.charEnd==sf.charEnd;
	}
}
