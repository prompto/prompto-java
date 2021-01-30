package prompto.problem;

import prompto.parser.ISection;

public class IllegalWidgetConstructorProblem extends SyntaxProblemBase {

	String name;
	
	public IllegalWidgetConstructorProblem(ISection section, String name) {
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
