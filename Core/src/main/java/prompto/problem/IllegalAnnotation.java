package prompto.problem;

import prompto.parser.ISection;

public class IllegalAnnotation extends SyntaxProblemBase {

	String message;
	
	public IllegalAnnotation(ISection section, String message) {
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
