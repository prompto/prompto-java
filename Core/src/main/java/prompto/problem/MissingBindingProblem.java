package prompto.problem;

import prompto.parser.ICodeSection;

public class MissingBindingProblem extends SyntaxProblemBase {

	String message;
	
	public MissingBindingProblem(ICodeSection section, String message) {
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
