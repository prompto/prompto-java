package prompto.problem;

import prompto.parser.ICodeSection;

public class UntypedRecursiveMethodProblem extends SyntaxProblemBase {

	String name;
	String prototype;
	
	public UntypedRecursiveMethodProblem(ICodeSection section, String name, String prototype) {
		super(section);
		this.name = name;
		this.prototype = prototype;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Cannot infer return type of method: " + name + ", because it is called recursively. Return type is mandatory for recursive methods.";
	}

}
