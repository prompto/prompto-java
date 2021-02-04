package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalAnnotation extends SyntaxProblemBase {

	String message;
	
	public IllegalAnnotation(ICodeSection section, String message) {
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
