package prompto.problem;

import prompto.parser.ISection;

public class IllegalInitializeParametersProblem extends SyntaxProblemBase {

	public IllegalInitializeParametersProblem(ISection section) {
		super(section);
		this.section = section;
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
