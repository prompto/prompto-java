package prompto.problem;

import prompto.parser.ISection;

public class IllegalConstructorProblem extends SyntaxProblemBase {

	public IllegalConstructorProblem(ISection section) {
		super(section);
		this.section = section;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Constructor method is only allowed in singletons!";
	}

}
