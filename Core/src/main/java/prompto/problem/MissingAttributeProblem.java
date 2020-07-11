package prompto.problem;

import prompto.parser.ISection;

public class MissingAttributeProblem extends SyntaxProblemBase {

	String actual;
	
	public MissingAttributeProblem(ISection section, String actual) {
		super(section);
		this.actual = actual;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Expected an attribute, got: " + actual;
	}

}
