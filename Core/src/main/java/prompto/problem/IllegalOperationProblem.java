package prompto.problem;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class IllegalOperationProblem extends SyntaxProblemBase {

	String verb;
	IType left, right;
	
	public IllegalOperationProblem(ICodeSection section, String verb, IType left, IType right) {
		super(section);
		this.verb = verb;
		this.left = left;
		this.right = right;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot " + verb + " " + left.getTypeName() + " and " + right.getTypeName();
	}

}
