package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public class ExpectingResourceProblem extends SyntaxProblemBase {

	String message;
	
	public ExpectingResourceProblem(ISection section, IType type) {
		super(section);
		this.message = "Expected a resource, got: " + type.getTypeName();
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
