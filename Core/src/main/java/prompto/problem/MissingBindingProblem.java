package prompto.problem;

import prompto.parser.ICodeSection;

public class MissingBindingProblem extends SyntaxProblemBase {

	String name;
	
	public MissingBindingProblem(ICodeSection section, String name) {
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
