package prompto.problem;

import prompto.parser.ISection;

public class MissingBindingProblem extends SyntaxProblemBase {

	String name;
	
	public MissingBindingProblem(ISection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Missing binding:" + name;
	}

}
