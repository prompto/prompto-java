package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalAbstractMethodCallProblem extends SyntaxProblemBase {

	String methodSignature;
	
	public IllegalAbstractMethodCallProblem(ICodeSection section, String methodSignature) {
		super(section);
		this.methodSignature = methodSignature;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot call abstract method: " + methodSignature;
	}

}
