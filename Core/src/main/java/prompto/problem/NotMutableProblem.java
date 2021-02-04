package prompto.problem;

import prompto.parser.ICodeSection;

public class NotMutableProblem extends SyntaxProblemBase {

	String message;
	
	public NotMutableProblem(ICodeSection section, String name) {
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
