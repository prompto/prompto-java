package prompto.problem;

import prompto.expression.IExpression;
import prompto.parser.ISection;

public class IllegalPredicateProblem extends SyntaxProblemBase {

	IExpression expression;
	
	public IllegalPredicateProblem(ISection section, IExpression expression) {
		super(section);
		this.expression = expression;
	}

	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
	@Override
	public String getMessage() {
		return "Expected a predicate, got: " + expression.toString();
	}

}
