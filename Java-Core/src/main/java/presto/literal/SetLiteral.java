package presto.literal;

import java.util.HashSet;
import java.util.Set;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.MissingType;
import presto.type.SetType;
import presto.utils.CodeWriter;
import presto.utils.ExpressionList;
import presto.utils.Utils;
import presto.value.IValue;
import presto.value.SetValue;

public class SetLiteral extends Literal<SetValue> {

	IType itemType = null;
	ExpressionList expressions;
	
	public SetLiteral() {
		super("<>", new SetValue(MissingType.instance()));
	}

	public SetLiteral(ExpressionList expressions) {
		super("<" + expressions.toString() + ">", new SetValue(MissingType.instance()));
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
		return new SetType(itemType); 
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		if(value.isEmpty() && expressions!=null) {
			check(context); // force computation of itemType
			Set<IValue> set = new HashSet<IValue>();
			for(IExpression exp : expressions)
				set.add(exp.interpret(context));
			if(itemType==null)
				itemType = Utils.inferElementType(context, set); 
			value = new SetValue(itemType, set);
			// don't dispose of expressions, they are required by translation 
		}
		return value;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(expressions!=null) {
			writer.append('<');
			expressions.toDialect(writer);
			writer.append('>');
		} else
			writer.append("< >");
	}


}
