package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public class NoSuperCategoryProblem extends SyntaxProblemBase {

	String message;
	
	public NoSuperCategoryProblem(IType type, ISection section) {
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
