package prompto.problem;

import prompto.parser.ISection;

public class NotMutableProblem extends SyntaxProblemBase {

	String message;
	
	public NotMutableProblem(ISection section, String name) {
		super(section);
		this.message = name + " is not mutable";
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
