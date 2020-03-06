package prompto.problem;

import java.util.Collections;
import java.util.Set;

import prompto.parser.ISection;
import prompto.type.IType;

public class IllegalAssignmentProblem extends SyntaxProblemBase {

	Set<IType> expected;
	IType actual;
		
	public IllegalAssignmentProblem(ISection section, IType expected, IType actual) {
		super(section);
		this.expected = Collections.singleton(expected);
		this.actual = actual;
	}

	public IllegalAssignmentProblem(ISection section, Set<IType> expected, IType actual) {
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
