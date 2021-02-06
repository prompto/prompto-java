package prompto.problem;

import java.util.Set;

import prompto.parser.ICodeSection;

public class TooManyPrototypesProblem extends SyntaxProblemBase {

	String actual;
	Set<String> culprits;
	
	public TooManyPrototypesProblem(ICodeSection section, String actual, Set<String> culprits) {
		super(section);
		this.actual = actual;
		this.culprits = culprits;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Too many prototypes for : " + actual + ", declared: " + String.join("\n", culprits);
	}

}
