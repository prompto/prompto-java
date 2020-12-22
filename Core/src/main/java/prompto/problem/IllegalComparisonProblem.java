package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public class IllegalComparisonProblem extends SyntaxProblemBase {

	IType t1, t2;
	
	public IllegalComparisonProblem(ISection section, IType t1, IType t2) {
		super(section);
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot compare " + t1.getTypeName() + " to " + t2.getTypeName();
	}

}
