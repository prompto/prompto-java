package prompto.problem;

import prompto.parser.ISection;

public class UnknownMemberError extends SyntaxProblemBase {

	String name;
	
	public UnknownMemberError(String name, ISection section) {
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
