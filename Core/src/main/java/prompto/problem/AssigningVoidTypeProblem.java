package prompto.problem;

import prompto.parser.ISection;

public class AssigningVoidTypeProblem extends SyntaxProblemBase {

	public AssigningVoidTypeProblem(ISection section) {
		super(section);
		this.section = section;
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
