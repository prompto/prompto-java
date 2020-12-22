package prompto.problem;

import prompto.parser.ISection;

public class IllegalRemoteCallProblem extends SyntaxProblemBase {

	String message;
	
	public IllegalRemoteCallProblem(ISection section, String message) {
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
