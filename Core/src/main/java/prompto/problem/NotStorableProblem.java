package prompto.problem;

import prompto.parser.ICodeSection;

public class NotStorableProblem extends SyntaxProblemBase {

	String message;
	
	public NotStorableProblem(ICodeSection section, String name) {
		super(section);
		this.message = name + " is not storable";
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
