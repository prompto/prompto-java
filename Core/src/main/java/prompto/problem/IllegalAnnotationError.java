package prompto.problem;

import prompto.parser.ISection;

public class IllegalAnnotationError extends SyntaxProblemBase {

	String message;
	
	public IllegalAnnotationError(String message, ISection section) {
		super(section);
		this.message = message;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
