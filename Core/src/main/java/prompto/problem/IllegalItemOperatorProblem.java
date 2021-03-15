package prompto.problem;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class IllegalItemOperatorProblem extends SyntaxProblemBase {

	IType culprit;
		
	public IllegalItemOperatorProblem(ICodeSection section, IType culprit) {
		super(section);
		this.culprit = culprit;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Invalid [] operator for: " + culprit.getTypeName();
	}

}
