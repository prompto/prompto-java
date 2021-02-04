package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalInitializeParametersProblem extends SyntaxProblemBase {

	public IllegalInitializeParametersProblem(ICodeSection section) {
		super(section);
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Initialize method cannot have parameters!";
	}

}
