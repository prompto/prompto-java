package prompto.problem;

import prompto.parser.ISection;

public class UnknownIdentifierProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownIdentifierProblem(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Unknown identifier: " + name;
	}

}