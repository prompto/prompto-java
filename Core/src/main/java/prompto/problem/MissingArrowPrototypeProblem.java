package prompto.problem;

import prompto.parser.ISection;

public class MissingArrowPrototypeProblem extends SyntaxProblemBase {

	String source;
	
	public MissingArrowPrototypeProblem(ISection section, String source) {
		super(section);
		this.source = source;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot use arrow expression without a prototype: " + source;
	}

}
