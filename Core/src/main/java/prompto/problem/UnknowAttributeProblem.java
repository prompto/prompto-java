package prompto.problem;

import prompto.parser.ISection;

public class UnknowAttributeProblem extends SyntaxProblemBase {

	String name;
	String hint;
	
	public UnknowAttributeProblem(ISection section, String name, String hint) {
		super(section);
		this.name = name;
		this.hint = hint;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Unknown attribute: " + name + hint;
	}

}
