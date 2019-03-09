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
	String categoryName;
	String methodName;
	String methodProto;
	int methodLine; // in file
	int statementLine; // in file
	
	public LeanStackFrame() {
	}
	
	public LeanStackFrame(IStackFrame frame) {
		this.filePath = frame.getFilePath();
		this.index = frame.getIndex();
		this.startCharIndex = frame.getStartCharIndex();
		this.endCharIndex = frame.getEndCharIndex();
		this.categoryName = frame.getCategoryName();
		this.methodName = frame.getMethodName();
		this.methodProto = frame.getMethodProto();
		this.methodLine = frame.getMethodLine();
		this.statementLine = frame.getStatementLine();
	}

	@Override
	public String getCategoryName() {
		return categoryName;
	}
	
	@Override
	public String getMethodName() {
		return methodName;
	}
	
	@Override
	public String getMethodProto() {
		return methodProto;
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
	public int getStatementLine() {
		return statementLine;
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
		return methodName + ", line " + Integer.toString(statementLine);
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
