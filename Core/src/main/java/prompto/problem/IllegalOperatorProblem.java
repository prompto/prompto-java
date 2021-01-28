package prompto.problem;

import prompto.parser.ISection;

public class IllegalOperatorProblem extends SyntaxProblemBase {

	String message;
	
	public IllegalOperatorProblem(ISection section, String message) {
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
