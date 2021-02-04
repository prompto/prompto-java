package prompto.problem;

import prompto.parser.ICodeSection;

public class DuplicatePropertyProblem extends SyntaxProblemBase {

	String name;
	
	public DuplicatePropertyProblem(ICodeSection section, String name) {
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
