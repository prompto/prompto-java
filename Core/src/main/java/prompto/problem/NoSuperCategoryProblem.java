package prompto.problem;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class NoSuperCategoryProblem extends SyntaxProblemBase {

	String message;
	
	public NoSuperCategoryProblem(ICodeSection section, IType type) {
		super(section);
		this.message = type.getTypeName() + " has no parent type";
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
