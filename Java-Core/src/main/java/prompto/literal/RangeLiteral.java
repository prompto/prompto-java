package prompto.literal;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class RangeLiteral implements IExpression {

	IExpression first;
	IExpression last;
	
	public RangeLiteral(IExpression first, IExpression last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public String toString() {
		return "[" + first.toString() + ".." + last.toString() + "]";
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("[");
		first.toDialect(writer);
		writer.append("..");
		last.toDialect(writer);
		writer.append("]");
	}

	public IExpression getFirst() {
		return first;
	}
	
	public IExpression getLast() {
		return last;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType firstType = first.check(context);
		IType lastType = last.check(context);
		return firstType.checkRange(context,lastType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType type = first.check(context);
		if("IntegerLimits".equals(type.getName()))
			type = IntegerType.instance();
		Object of = first.interpret(context);
		Object ol = last.interpret(context);
		return type.newRange(of,ol);
	}

}
