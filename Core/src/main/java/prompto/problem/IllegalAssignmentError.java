package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public class IllegalAssignmentError extends SyntaxProblemBase {

	IType expected;
	IType actual;
		
	public IllegalAssignmentError(ISection section, IType expected, IType actual) {
		super(section);
		this.expected = expected;
		this.actual = actual;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Illegal expression type, expected: " +  expected.getTypeName() + ", got:" + actual.getTypeName();
	}

}
