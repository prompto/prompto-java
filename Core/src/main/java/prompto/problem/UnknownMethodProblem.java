package prompto.problem;

import prompto.parser.ISection;

public class UnknownMethodProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownMethodProblem(ISection section, String name) {
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
