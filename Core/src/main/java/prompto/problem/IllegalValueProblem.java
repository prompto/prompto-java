package prompto.problem;

import prompto.parser.ISection;

public class IllegalValueProblem extends SyntaxProblemBase {

	String message;
	
	public IllegalValueProblem(String message, ISection section) {
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
