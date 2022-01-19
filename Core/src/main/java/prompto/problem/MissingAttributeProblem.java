package prompto.problem;

import prompto.parser.ICodeSection;

public class MissingAttributeProblem extends SyntaxProblemBase {

	String actual;
	
	public MissingAttributeProblem(ICodeSection section, String actual) {
		super(section);
		this.actual = actual;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Expected an attribute, found: " + actual;
	}

}
