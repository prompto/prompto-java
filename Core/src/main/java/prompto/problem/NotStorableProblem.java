package prompto.problem;

import prompto.parser.ISection;

public class NotStorableProblem extends SyntaxProblemBase {

	String message;
	
	public NotStorableProblem(ISection section, String name) {
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
