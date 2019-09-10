package prompto.problem;

import java.util.Collections;
import java.util.Set;

import prompto.parser.ISection;
import prompto.type.IType;

public class IllegalAssignmentError extends SyntaxProblemBase {

	Set<IType> expected;
	IType actual;
		
	public IllegalAssignmentError(ISection section, IType expected, IType actual) {
		super(section);
		this.expected = Collections.singleton(expected);
		this.actual = actual;
	}

	public IllegalAssignmentError(ISection section, Set<IType> expected, IType actual) {
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
		return "Illegal expression type, expected: " +  expected.toString() + ", got:" + actual.getTypeName();
	}

}
