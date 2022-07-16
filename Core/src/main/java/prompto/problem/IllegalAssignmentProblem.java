package prompto.problem;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class IllegalAssignmentProblem extends SyntaxProblemBase {

	Set<IType> expected;
	IType actual;
		
	public IllegalAssignmentProblem(ICodeSection section, IType expected, IType actual) {
		super(section);
		this.expected = Collections.singleton(expected);
		this.actual = actual;
	}

	public IllegalAssignmentProblem(ICodeSection section, Set<IType> expected, IType actual) {
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
		return "Type " +  actual.getTypeName() + " is not compatible with " + expectedToString();
	}

	private String expectedToString() {
		return expected.size() == 1 ? expected.stream().map(Object::toString).collect(Collectors.joining("")) : expected.toString();
	}

}
