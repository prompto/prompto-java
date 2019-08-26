package prompto.problem;

import prompto.parser.ISection;

public class UnknowPropertyError extends SyntaxProblemBase {

	String name;
	
	public UnknowPropertyError(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Unknown property:" + name;
	}

}
