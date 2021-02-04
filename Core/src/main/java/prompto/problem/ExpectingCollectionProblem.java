package prompto.problem;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class ExpectingCollectionProblem extends SyntaxProblemBase {

	String message;
	
	public ExpectingCollectionProblem(ICodeSection section, IType type) {
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
