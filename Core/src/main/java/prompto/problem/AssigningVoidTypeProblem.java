package prompto.problem;

import prompto.parser.ICodeSection;

public class AssigningVoidTypeProblem extends SyntaxProblemBase {

	public AssigningVoidTypeProblem(ICodeSection section) {
		super(section);
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot assign void expression!";
	}

}
