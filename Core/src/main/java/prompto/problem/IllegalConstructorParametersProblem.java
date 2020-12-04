package prompto.problem;

import prompto.parser.ISection;

public class IllegalConstructorParametersProblem extends SyntaxProblemBase {

	public IllegalConstructorParametersProblem(ISection section) {
		super(section);
		this.section = section;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Constructor method cannot have parameters!";
	}

}
