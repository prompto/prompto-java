package prompto.problem;

import prompto.parser.ISection;

public class UnknownMemberProblem extends SyntaxProblemBase {

	String name;
	
	public UnknownMemberProblem(ISection section, String name) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot read member: " + name;
	}

}
