package presto.error;

import presto.expression.ConstructorExpression;
import presto.expression.IExpression;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.grammar.UnresolvedArgument;
import presto.literal.TextLiteral;
import presto.runtime.Context;
import presto.runtime.ErrorVariable;
import presto.type.CategoryType;
import presto.value.IValue;

public abstract class ExecutionError extends PrestoError {

	private static final long serialVersionUID = 1L;

	protected ExecutionError() {
	}
	
	protected ExecutionError(String message) {
		super(message);
	}

	public abstract IExpression getExpression(Context context);

	public IValue interpret(Context context, Identifier errorName) throws PrestoError {
		IExpression exp = this.getExpression(context);
		if(exp==null) {
			ArgumentAssignmentList args = new ArgumentAssignmentList();
			args.add(new ArgumentAssignment(
					new UnresolvedArgument(new Identifier("name")), 
					new TextLiteral(this.getClass().getSimpleName())));
			args.add(new ArgumentAssignment(
					new UnresolvedArgument(new Identifier("text")), 
					new TextLiteral(this.getMessage())));
			exp = new ConstructorExpression(
					new CategoryType(new Identifier("Error")), args);
		}
		if(context.getRegisteredValue(INamed.class, errorName)==null)
			context.registerValue(new ErrorVariable(errorName));
		IValue error = exp.interpret(context);
		context.setValue(errorName, error);
		return error;
	}

	
}
