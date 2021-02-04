package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalReturnProblem extends SyntaxProblemBase {

	public IllegalReturnProblem(ICodeSection section) {
		super(section);
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Illegal return statement in method body!";
	}

}
