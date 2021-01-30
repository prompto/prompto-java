package prompto.problem;

import prompto.parser.ISection;

public class IllegalAbstractConstructorProblem extends SyntaxProblemBase {

	String name;
	String missingMethod;
	
	public IllegalAbstractConstructorProblem(ISection section, String name, String missingMethod) {
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
		return "Cannot instantiate abstract category: " + name + ", missing method: " + missingMethod;
	}

}
