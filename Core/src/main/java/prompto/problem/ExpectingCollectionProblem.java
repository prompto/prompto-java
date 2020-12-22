package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public class ExpectingCollectionProblem extends SyntaxProblemBase {

	String message;
	
	public ExpectingCollectionProblem(ISection section, IType type) {
		super(section);
		this.message = "Expected a collection, got: " + type.getTypeName();
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
