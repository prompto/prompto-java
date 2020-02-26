package prompto.problem;

import prompto.parser.ISection;

public class UnknowAttributeError extends SyntaxProblemBase {

	String name;
	String hint;
	
	public UnknowAttributeError(String name, String hint, ISection section) {
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
