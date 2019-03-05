package prompto.debug;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

/* designed to be serialized in JSON */
public class LeanStackFrame implements IStackFrame {
	
	String filePath;
	int index;
	int startCharIndex;
	int endCharIndex;
	String methodName;
	int methodLine;
	int instructionLine;
	
	public LeanStackFrame() {
	}
	
	public LeanStackFrame(IStackFrame frame) {
		this.filePath = frame.getFilePath();
		this.index = frame.getIndex();
		this.startCharIndex = frame.getStartCharIndex();
		this.endCharIndex = frame.getEndCharIndex();
		this.methodName = frame.getMethodName();
		this.methodLine = frame.getMethodLine();
		this.instructionLine = frame.getInstructionLine();
	}

	@Override
	public String getMethodName() {
		return methodName;
	}
	
	@Override
	public String getFilePath() {
		return filePath;
	}
	
	@Override
	public int getIndex() {
		return index;
	}
	
	@Override
	public int getMethodLine() {
		return methodLine;
	}
	
	@Override
	public int getInstructionLine() {
		return instructionLine;
	}
	
	@Override
	public int getEndCharIndex() {
		return endCharIndex;
	}
	
	@Override
	public int getStartCharIndex() {
		return startCharIndex;
	}
	
	@JsonIgnore
	@Override
	public Collection<? extends IVariable> getVariables() {
		throw new UnsupportedOperationException("Must override!");
	}
	
	@Override
	public String toString() {
		return methodName + ", line " + Integer.toString(instructionLine);
	}
	
	public String toJson() {
		return new ObjectMapper().valueToTree(this).toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof IStackFrame))
			return false;
		IStackFrame sf = (IStackFrame)obj;
		return this.index==sf.getIndex();
	}

}
