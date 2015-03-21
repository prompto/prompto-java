package presto.literal;

import java.util.ArrayList;
import java.util.List;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.ListType;
import presto.type.MissingType;
import presto.utils.CodeWriter;
import presto.utils.ExpressionList;
import presto.utils.Utils;
import presto.value.IValue;
import presto.value.ListValue;

public class ListLiteral extends Literal<ListValue> {

	IType itemType = null;
	ExpressionList expressions = null;
	
	public ListLiteral() {
		super("[]",new ListValue(MissingType.instance()));
	}
	
	public ListLiteral(ExpressionList expressions) {
		super("[" + expressions.toString() + "]",new ListValue(MissingType.instance()));
		this.expressions = expressions;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		if(itemType==null) {
			if(expressions!=null)
				itemType = Utils.inferElementType(context, expressions);
			else
				itemType = Utils.inferElementType(context, value.getItems());
		}
		return new ListType(itemType); 
	}

	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		if(value.isEmpty() && expressions!=null) {
			check(context); // force computation of itemType
			List<IValue> list = new ArrayList<IValue>();
			for(IExpression exp : expressions)
				list.add(exp.interpret(context));
			value = new ListValue(itemType, list);
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
			writer.append('[');
			expressions.toDialect(writer);
			writer.append(']');
		} else
			writer.append("[]");
	}
}
