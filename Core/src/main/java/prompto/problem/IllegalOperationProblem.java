package prompto.problem;

import prompto.parser.ISection;
import prompto.type.IType;

public class IllegalOperationProblem extends SyntaxProblemBase {

	String verb;
	IType t1, t2;
	
	public IllegalOperationProblem(ISection section, String verb, IType t1, IType t2) {
		super(section);
		this.verb = verb;
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot " + verb + " " + t1.getTypeName() + " to " + t2.getTypeName();
	}

}
