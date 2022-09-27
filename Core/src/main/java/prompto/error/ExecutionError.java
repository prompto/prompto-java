package prompto.error;

import prompto.expression.ConstructorExpression;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.literal.TextLiteral;
import prompto.param.UnresolvedParameter;
import prompto.runtime.Context;
import prompto.runtime.ErrorVariable;
import prompto.type.CategoryType;
import prompto.value.IValue;

public abstract class ExecutionError extends PromptoError {

	private static final long serialVersionUID = 1L;

	protected ExecutionError() {
	}
	
	protected ExecutionError(String message) {
		super(message);
	}

	public abstract IExpression getExpression(Context context);

	public IValue interpret(Context context, Identifier errorName) throws PromptoError {
		IExpression exp = this.getExpression(context);
		if(exp==null) {
			ArgumentList args = new ArgumentList();
			args.add(new Argument(
					new UnresolvedParameter(new Identifier("name")), 
					new TextLiteral(this.getClass().getSimpleName())));
			args.add(new Argument(
					new UnresolvedParameter(new Identifier("text")), 
					new TextLiteral(this.getMessage())));
			exp = new ConstructorExpression( new CategoryType(new Identifier("Error")), null, args);
		}
		if(context.getRegisteredValue(INamed.class, errorName)==null)
			context.registerInstance(new ErrorVariable(errorName));
		IValue error = exp.interpret(context);
		context.setValue(errorName, error);
		return error;
	}

	
}
