package prompto.problem;

import prompto.parser.ISection;

public class MissingPropertyProblem extends SyntaxProblemBase {

	String name;
	
	public MissingPropertyProblem(ISection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Missing property:" + name;
	}

}
