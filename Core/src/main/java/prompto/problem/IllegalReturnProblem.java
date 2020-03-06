package prompto.problem;

import prompto.parser.ISection;

public class IllegalReturnProblem extends SyntaxProblemBase {

	public IllegalReturnProblem(ISection section) {
		super(section);
		this.section = section;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Illegal return statement in test method body!";
	}

}
