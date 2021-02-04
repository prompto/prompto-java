package prompto.problem;

import prompto.parser.ICodeSection;

public class ReturningVoidTypeProblem extends SyntaxProblemBase {

	public ReturningVoidTypeProblem(ICodeSection section) {
		super(section);
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot return void expression!";
	}

}
