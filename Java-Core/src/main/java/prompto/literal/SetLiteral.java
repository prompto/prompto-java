package prompto.literal;

import java.util.HashSet;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MissingType;
import prompto.type.SetType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.SetValue;

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
	public IValue interpret(Context context) throws PromptoError {
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
