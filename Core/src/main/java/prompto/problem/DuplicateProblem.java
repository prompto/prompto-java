package prompto.problem;

import prompto.parser.ICodeSection;

public class DuplicateProblem extends SyntaxProblemBase {

	String name;
	ICodeSection other;
	
	public DuplicateProblem(ICodeSection section, String name, ICodeSection other) {
		super(section);
		this.name = name;
		this.other = other;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Duplicate declaration: " + name + ", see: " + other.toString();
	}

}
