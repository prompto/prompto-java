package prompto.statement;

import java.util.Iterator;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.utils.CodeWriter;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.Integer;

public class ForEachStatement extends BaseStatement {

	Identifier v1, v2;
	IExpression source;
	StatementList instructions;

	public ForEachStatement(Identifier v1, Identifier v2, IExpression source, StatementList instructions) {
		this.v1 = v1;
		this.v2 = v2;
		this.source = source;
		this.instructions = instructions;
	}

	public StatementList getInstructions() {
		return instructions;
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
	
	private void toODialect(CodeWriter writer) {
		writer.append("for each (");
		writer.append(v1);
		if(v2!=null) {
			writer.append(", ");
			writer.append(v2);
		}
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(")");
		boolean oneLine = instructions.size()==1 && (instructions.get(0) instanceof SimpleStatement);
		if(!oneLine)
			writer.append(" {");
		writer.newLine();
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		if(!oneLine) {
			writer.append("}");
			writer.newLine();
		}		
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("for each ");
		writer.append(v1);
		if(v2!=null) {
			writer.append(", ");
			writer.append(v2);
		}
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(":");
		writer.newLine();
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	private void toSDialect(CodeWriter writer) {
		writer.append("for ");
		writer.append(v1);
		if(v2!=null) {
			writer.append(", ");
			writer.append(v2);
		}
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(":");
		writer.newLine();
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType srcType = source.check(context);
		IType elemType = srcType.checkIterator(context);
		return checkItemIterator(elemType, context);
	}

	private IType checkItemIterator(IType elemType, Context context) throws SyntaxError {
		Context child = context.newChildContext();
		Identifier itemName = v2 == null ? v1 : v2;
		context.registerValue(new Variable(itemName, elemType));
		if (v2 != null)
			context.registerValue(new Variable(v1, IntegerType.instance()));
		return instructions.check(child, null);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType srcType = source.check(context);
		IType elemType = srcType.checkIterator(context);
		return interpretItemIterator(elemType, context);
	}

	private IValue interpretItemIterator(IType elemType, Context context) throws PromptoError {
		if (v2 == null)
			return interpretItemIteratorNoIndex(elemType, context);
		else
			return interpretItemIteratorWithIndex(elemType, context);
	}

	private IValue interpretItemIteratorNoIndex(IType elemType, Context context) throws PromptoError {
		IValue src = source.interpret(context);
		Iterator<IValue> iterator = getIterator(context, src);
		while (iterator.hasNext()) {
			Context child = context.newChildContext();
			child.registerValue(new Variable(v1, elemType));
			child.setValue(v1, iterator.next());
			IValue value = instructions.interpret(child);
			if (value != null)
				return value;
		}
		return null;
	}

	private IValue interpretItemIteratorWithIndex(IType elemType, Context context) throws PromptoError {
		IValue src = source.interpret(context);
		Iterator<IValue> iterator = getIterator(context, src);
		long index = 0L;
		while (iterator.hasNext()) {
			Context child = context.newChildContext();
			child.registerValue(new Variable(v2, elemType));
			child.setValue(v2, iterator.next());
			child.registerValue(new Variable(v1, IntegerType.instance()));
			child.setValue(v1, new Integer(++index));
			IValue value = instructions.interpret(child);
			if (value != null)
				return value;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private Iterator<IValue> getIterator(Context context, Object src) {
		if (src instanceof IIterable) 
			return ((IIterable<IValue>) src).getIterable(context).iterator();
		else if(src instanceof Iterable)
			return ((Iterable<IValue>)src).iterator();
		else
			throw new InternalError("Should never get there!");
	}

}
