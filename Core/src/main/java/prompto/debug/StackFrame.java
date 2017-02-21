package prompto.debug;

import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.statement.IStatement;

public class StackFrame implements IStackFrame {
	
	String methodName;
	String filePath;
	int line;
	int startCharIndex;
	int endCharIndex;
	
	public StackFrame() {
	}
	
	public StackFrame(Context context, String methodName, IDeclaration method) {
		this(context, methodName, (ISection)method);
		if(method instanceof ConcreteMethodDeclaration) {
			IStatement stmt = ((ConcreteMethodDeclaration)method).getStatements().getFirst();
			this.endCharIndex = stmt.getStart().getIndex() - 1;
		} else if(method instanceof NativeMethodDeclaration) {
			IStatement stmt = ((NativeMethodDeclaration)method).getStatements().getFirst();
			this.endCharIndex = stmt.getStart().getIndex() - 1;
		} else if(method instanceof TestMethodDeclaration) {
			IStatement stmt = ((TestMethodDeclaration)method).getStatements().getFirst();
			this.endCharIndex = stmt.getStart().getIndex() - 1;
		} else
			this.endCharIndex = this.startCharIndex + 1;
	}
	
	public StackFrame(Context context, String methodName, ISection section) {
		this.methodName = methodName;
		this.filePath = section.getFilePath();
		this.line = section.getStart().getLine();
		this.startCharIndex = section.getStart().getIndex();
		this.endCharIndex = section.getEnd().getIndex();
	}
	
	public StackFrame(IStackFrame frame) {
		this.methodName = frame.getMethodName();
		this.filePath = frame.getFilePath();
		this.line = frame.getLine();
		this.startCharIndex = frame.getStartCharIndex();
		this.endCharIndex = frame.getEndCharIndex();
	}

	public String getMethodName() {
		return methodName;
	}
	
	public String getFilePath() {
		return filePath;
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
				&& this.filePath.equals(sf.filePath)
				&& this.line==sf.line
				&& this.startCharIndex==sf.startCharIndex
				&& this.endCharIndex==sf.endCharIndex;
	}
}
