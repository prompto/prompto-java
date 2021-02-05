package prompto.problem;

import prompto.parser.ICodeSection;

public class UnknownWidgetProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownWidgetProblem(ICodeSection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Unknown widget: " + name;
	}

}
