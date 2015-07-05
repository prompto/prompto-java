package prompto.literal;

import java.util.ArrayList;
import java.util.List;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.MissingType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.ListValue;

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
	public IValue interpret(Context context) throws PromptoError {
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
