package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.error.UserError;
import presto.expression.IExpression;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class RaiseStatement extends SimpleStatement {
	
	IExpression expression;
	
	public RaiseStatement(IExpression expression) {
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case S:
			writer.append("raise ");
			break;
		case O:
			writer.append("throw ");
			break;
		}
		expression.toDialect(writer);
	}
	
	@Override
	public String toString() {
		return "raise " + expression.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof RaiseStatement))
			return false;
		RaiseStatement other = (RaiseStatement)obj;
		return this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = expression.check(context);
		if(!type.isAssignableTo(context, new CategoryType(new Identifier("Error"))))
			throw new SyntaxError(type.getName() + " does not extend Error");
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		throw new UserError(expression);
	}

}
