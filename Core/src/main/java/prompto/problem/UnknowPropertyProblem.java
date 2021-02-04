package prompto.problem;

import prompto.parser.ICodeSection;

public class UnknowPropertyProblem extends SyntaxProblemBase {

	String name;
	
	public UnknowPropertyProblem(ICodeSection section, String name) {
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
