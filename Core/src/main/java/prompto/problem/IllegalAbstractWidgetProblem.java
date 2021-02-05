package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalAbstractWidgetProblem extends SyntaxProblemBase {

	String name;
	String missingMethod;
	
	public IllegalAbstractWidgetProblem(ICodeSection section, String name, String missingMethod) {
		super(section);
		this.name = name;
		this.missingMethod = missingMethod;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot instantiate abstract widget: " + name + ", missing method: " + missingMethod;
	}

}
