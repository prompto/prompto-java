package prompto.problem;

import prompto.parser.ISection;

public class UnknownMethodProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownMethodProblem(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Unknown method: " + name;
	}

}
