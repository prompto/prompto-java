package prompto.problem;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class IncompatibleTypesProblem extends SyntaxProblemBase {

	IType first;
	IType second;
	
	public IncompatibleTypesProblem(ICodeSection section, IType first, IType second) {
		super(section);
		this.first = first;
		this.second = second;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Type " + first.getTypeName() + " is not compatible with " + second.getTypeName();
	}

}
