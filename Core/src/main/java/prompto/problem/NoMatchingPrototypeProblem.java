package prompto.problem;

import prompto.parser.ISection;

public class NoMatchingPrototypeProblem extends SyntaxProblemBase {

	String proto;
	
	public NoMatchingPrototypeProblem(String proto, ISection section) {
		super(section);
		this.proto = proto;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "No matching prototype:" + proto;
	}

}
