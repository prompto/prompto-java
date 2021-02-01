package prompto.problem;

import java.util.Set;

import prompto.parser.ISection;

public class NoMatchingPrototypeProblem extends SyntaxProblemBase {

	String actual;
	Set<String> expected;
	
	public NoMatchingPrototypeProblem(ISection section, String actual, Set<String> expected) {
		super(section);
		this.actual = actual;
		this.expected = expected;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "No matching prototype for: " + actual + ", expected: " + String.join("\n", expected);
	}

}
