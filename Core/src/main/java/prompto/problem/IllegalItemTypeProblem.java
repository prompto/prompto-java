package prompto.problem;

import java.util.Collections;
import java.util.Set;

import prompto.parser.ICodeSection;
import prompto.type.IType;

public class IllegalItemTypeProblem extends SyntaxProblemBase {

	Set<IType> expected;
	IType actual;
		
	public IllegalItemTypeProblem(ICodeSection section, IType expected, IType actual) {
		super(section);
		this.expected = Collections.singleton(expected);
		this.actual = actual;
	}

	public IllegalItemTypeProblem(ICodeSection section, Set<IType> expected, IType actual) {
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
		return "Illegal item type, expected: " +  expected.toString() + ", got: " + actual.getTypeName();
	}

}
