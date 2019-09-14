package prompto.problem;

import prompto.parser.ISection;

public class MissingPropertyError extends SyntaxProblemBase {

	String name;
	
	public MissingPropertyError(String name, ISection section) {
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
