package prompto.problem;

import prompto.parser.ISection;

public class IllegalValueProblem extends SyntaxProblemBase {

	String message;
	
	public IllegalValueProblem(ISection section, String message) {
		super(section);
		this.message = message;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
