package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLength;
import prompto.intrinsic.IteratorWithLength;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IteratorType;
import prompto.utils.CodeWriter;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.IteratorValue;

public class IteratorExpression implements IExpression {

	Identifier name;
	IExpression source;
	IExpression expression;
	
	public IteratorExpression(Identifier name, IExpression source, IExpression exp) {
		this.name = name;
		this.source = source;
		this.expression = exp;
	}

	@Override
	public IteratorType check(Context context) throws SyntaxError {
		IType srcType = source.check(context);
		IType elemType = srcType.checkIterator(context);
		Context child = context.newChildContext();
		context.registerValue(new Variable(name, elemType));
		IType itemType = expression.check(child);
		return new IteratorType(itemType);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IteratorType iterType = check(context);
		IType itemType = iterType.getItemType();
		IValue items = source.interpret(context);
		IteratorWithLength<IValue> iterator = getIterator(context, items);
		return new IteratorValue(context, name, itemType, iterator, expression);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo srcinfo = source.compile(context, method, flags);
		// TODO Auto-generated method stub
		return IExpression.super.compile(context, method, flags);
	}

	@SuppressWarnings("unchecked")
	private IteratorWithLength<IValue> getIterator(Context context, Object src) {
		if (src instanceof IIterable) 
			return ((IIterable<IValue>) src).getIterable(context).iterator();
		else if(src instanceof IterableWithLength)
			return ((IterableWithLength<IValue>)src).iterator();
		else
			throw new InternalError("Should never get there!");
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}

	private void toSDialect(CodeWriter writer) {
		expression.toDialect(writer);
		writer.append(" for ");
		writer.append(name.toString());
		writer.append(" in ");
		source.toDialect(writer);
	}

	private void toODialect(CodeWriter writer) {
		expression.toDialect(writer);
		writer.append(" for each ( ");
		writer.append(name.toString());
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(" )");
	}

	private void toEDialect(CodeWriter writer) {
		expression.toDialect(writer);
		writer.append(" for each ");
		writer.append(name.toString());
		writer.append(" in ");
		source.toDialect(writer);
	}
	

}
