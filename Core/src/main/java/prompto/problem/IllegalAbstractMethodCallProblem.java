package prompto.problem;

import prompto.parser.ISection;

public class IllegalAbstractMethodCallProblem extends SyntaxProblemBase {

	String methodSignature;
	
	public IllegalAbstractMethodCallProblem(ISection section, String methodSignature) {
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
