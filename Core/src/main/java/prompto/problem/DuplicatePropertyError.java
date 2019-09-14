package prompto.problem;

import prompto.parser.ISection;

public class DuplicatePropertyError extends SyntaxProblemBase {

	String name;
	
	public DuplicatePropertyError(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Duplicate property:" + name;
	}

}
