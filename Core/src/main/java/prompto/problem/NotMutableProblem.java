package prompto.problem;

import prompto.parser.ISection;

public class NotMutableProblem extends SyntaxProblemBase {

	String message;
	
	public NotMutableProblem(String name, ISection section) {
		super(section);
		this.message = name + " is not mutable";
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
