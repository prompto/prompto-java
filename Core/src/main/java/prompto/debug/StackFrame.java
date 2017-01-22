package prompto.debug;

import prompto.parser.ISection;
import prompto.runtime.Context;

public class StackFrame implements IStackFrame {
	
	String methodName;
	String path;
	int line;
	int startCharIndex;
	int endCharIndex;
	
	public StackFrame(Context context, String methodName, ISection section) {
		this.methodName = methodName;
		this.path = section.getPath();
		this.line = section.getStart().getLine();
		this.startCharIndex = section.getStart().getIndex();
		this.endCharIndex = section.getEnd().getIndex();
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public String getFilePath() {
		return path;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getEndCharIndex() {
		return endCharIndex;
	}
	
	public int getStartCharIndex() {
		return startCharIndex;
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
				&& this.startCharIndex==sf.startCharIndex
				&& this.endCharIndex==sf.endCharIndex;
	}
}
