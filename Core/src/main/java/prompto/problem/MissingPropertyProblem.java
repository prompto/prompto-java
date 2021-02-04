package prompto.problem;

import prompto.parser.ICodeSection;

public class MissingPropertyProblem extends SyntaxProblemBase {

	String name;
	
	public MissingPropertyProblem(ICodeSection section, String name) {
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
