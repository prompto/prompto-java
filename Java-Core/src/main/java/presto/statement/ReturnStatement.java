package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.runtime.VoidResult;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class ReturnStatement extends SimpleStatement {
	
	IExpression expression;
	
	public ReturnStatement(IExpression expression) {
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("return");
		if(expression!=null) {
			writer.append(" ");
			expression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return "return " + expression==null ? "" : expression.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof ReturnStatement))
			return false;
		ReturnStatement other = (ReturnStatement)obj;
		return this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression==null ? VoidType.instance() : expression.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		if(expression==null)
			return VoidResult.instance();
		else
			return expression.interpret(context);
	}

}
