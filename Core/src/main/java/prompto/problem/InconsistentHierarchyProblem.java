package prompto.problem;

import prompto.parser.ICodeSection;

public class InconsistentHierarchyProblem extends SyntaxProblemBase {

	String message;
	
	public InconsistentHierarchyProblem(ICodeSection section, String category, String culprit) {
		super(section);
		this.message = "Inconsistent hierarchy for " + category + ", unknown parent type: " + culprit;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
