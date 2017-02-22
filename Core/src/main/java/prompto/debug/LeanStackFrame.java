package prompto.debug;

import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.parser.ISection;
import prompto.statement.IStatement;

/* designed to be serialized in JSON */
public class LeanStackFrame implements IStackFrame {
	
	String methodName;
	String filePath;
	int line;
	int startCharIndex;
	int endCharIndex;
	
	public LeanStackFrame() {
	}
	
	public LeanStackFrame(String methodName, IDeclaration method) {
		this(methodName, (ISection)method);
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
	
	public LeanStackFrame(String methodName, ISection section) {
		this.methodName = methodName;
		this.filePath = section.getFilePath();
		this.line = section.getStart().getLine();
		this.startCharIndex = section.getStart().getIndex();
		this.endCharIndex = section.getEnd().getIndex();
	}
	
	public LeanStackFrame(IStackFrame frame) {
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
		if(!(obj instanceof IStackFrame))
			return false;
		IStackFrame sf = (IStackFrame)obj;
		return this.methodName.equals(sf.getMethodName())
				&& this.filePath.equals(sf.getFilePath())
				&& this.line==sf.getLine()
				&& this.startCharIndex==sf.getStartCharIndex()
				&& this.endCharIndex==sf.getEndCharIndex();
	}

}
