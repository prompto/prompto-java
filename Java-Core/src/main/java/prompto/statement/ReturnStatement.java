package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.runtime.VoidResult;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

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
	public IValue interpret(Context context) throws PromptoError {
		if(expression==null)
			return VoidResult.instance();
		else {
			IValue value = expression.interpret(context);
			return value==null ? NullValue.instance() : value;
		}
	}

}
