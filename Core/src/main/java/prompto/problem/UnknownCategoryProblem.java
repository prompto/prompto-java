package prompto.problem;

import prompto.parser.ISection;

public class UnknownCategoryProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownCategoryProblem(ISection section, String name) {
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
