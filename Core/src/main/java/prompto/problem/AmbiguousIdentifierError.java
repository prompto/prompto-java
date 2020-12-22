package prompto.problem;

import prompto.parser.ISection;

public class AmbiguousIdentifierError extends SyntaxProblemBase {

	String name;
	
	public AmbiguousIdentifierError(ISection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Ambiguous identifier: " + name;
	}

}
