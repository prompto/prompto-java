package presto.literal;

import java.util.ArrayList;
import java.util.List;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.TupleType;
import presto.utils.CodeWriter;
import presto.utils.ExpressionList;
import presto.value.IValue;
import presto.value.TupleValue;

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
	public IValue interpret(Context context) throws PrestoError {
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
