package prompto.literal;

import java.util.ArrayList;
import java.util.List;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TupleType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.value.IValue;
import prompto.value.TupleValue;

public class TupleLiteral extends Literal<TupleValue> {

	ExpressionList expressions = null;
	
	public TupleLiteral() {
		super("()",new TupleValue());
	}
	
	public TupleLiteral(ExpressionList expressions) {
		super("(" + expressions.toString() + ")",new TupleValue());
		this.expressions = expressions;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return TupleType.instance(); 
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && expressions!=null) {
			List<IValue> list = new ArrayList<IValue>();
			for(IExpression exp : expressions) 
				list.add(exp.interpret(context));
			value = new TupleValue(list);
			// don't dispose of expressions, they are required by translation 
		}
		return value;
	}

	public ExpressionList getExpressions() {
		return expressions;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(expressions!=null) {
			writer.append('(');
			expressions.toDialect(writer);
			writer.append(')');
		} else
			writer.append("()");
	}

}
