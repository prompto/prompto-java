package prompto.problem;

import prompto.parser.ICodeSection;

public class AmbiguousIdentifierError extends SyntaxProblemBase {

	String name;
	
	public AmbiguousIdentifierError(ICodeSection section, String name) {
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
