package prompto.problem;

import prompto.parser.ISection;

public class IllegalValueError extends SyntaxProblemBase {

	String message;
	
	public IllegalValueError(String message, ISection section) {
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
