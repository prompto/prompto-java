package prompto.problem;

import prompto.parser.ISection;

public class UnknowAnnotationError extends SyntaxProblemBase {

	String name;
	
	public UnknowAnnotationError(String name, ISection section) {
		super(section);
		this.name = name;
	}

	@Override
	public Type getType() {
		return Type.WARNING;
	}
	
	@Override
	public String getMessage() {
		return "Unknown annotation:" + name;
	}

}
