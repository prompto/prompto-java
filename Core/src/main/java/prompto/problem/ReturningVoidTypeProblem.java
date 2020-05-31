package prompto.problem;

import prompto.parser.ISection;

public class ReturningVoidTypeProblem extends SyntaxProblemBase {

	public ReturningVoidTypeProblem(ISection section) {
		super(section);
		this.section = section;
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
