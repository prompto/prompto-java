package prompto.problem;

import prompto.parser.ISection;

public class UnknowIdentifierError extends SyntaxProblemBase {

	String name;
	
	public UnknowIdentifierError(String name, ISection section) {
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
