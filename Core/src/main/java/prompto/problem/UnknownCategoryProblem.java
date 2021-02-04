package prompto.problem;

import prompto.parser.ICodeSection;

public class UnknownCategoryProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownCategoryProblem(ICodeSection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Unknown category: " + name;
	}

}
