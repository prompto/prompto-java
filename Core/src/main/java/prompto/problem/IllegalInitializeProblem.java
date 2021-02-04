package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalInitializeProblem extends SyntaxProblemBase {

	public IllegalInitializeProblem(ICodeSection section) {
		super(section);
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Initialize method is only allowed in singletons!";
	}

}
