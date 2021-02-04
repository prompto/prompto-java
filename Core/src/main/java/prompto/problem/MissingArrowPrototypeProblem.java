package prompto.problem;

import prompto.parser.ICodeSection;

public class MissingArrowPrototypeProblem extends SyntaxProblemBase {

	String source;
	
	public MissingArrowPrototypeProblem(ICodeSection section, String source) {
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
