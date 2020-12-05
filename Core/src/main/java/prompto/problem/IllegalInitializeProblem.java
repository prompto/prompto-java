package prompto.problem;

import prompto.parser.ISection;

public class IllegalInitializeProblem extends SyntaxProblemBase {

	public IllegalInitializeProblem(ISection section) {
		super(section);
		this.section = section;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Initialize method is only allowed in singletons!";
	}

}
