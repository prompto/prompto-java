package prompto.problem;

import prompto.parser.ICodeSection;

public class IllegalWidgetConstructorProblem extends SyntaxProblemBase {

	String name;
	
	public IllegalWidgetConstructorProblem(ICodeSection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Cannot instantiate widget: " + name + " (widgets are instantiated during rendering)";
	}

}
