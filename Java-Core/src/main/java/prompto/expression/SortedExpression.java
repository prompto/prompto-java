package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.UnresolvedIdentifier;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.SetType;
import prompto.utils.CodeWriter;
import prompto.value.IContainer;
import prompto.value.IValue;

public class SortedExpression implements IExpression {

	IExpression source;
	IExpression key;
	
	public SortedExpression(IExpression source) {
		this.source = source;
	}

	public SortedExpression(IExpression source, IExpression key) {
		this.source = source;
		this.key = key;
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

	private void toEDialect(CodeWriter writer) {
		writer.append("sorted ");
		source.toDialect(writer);
		if(key!=null) {
			writer.append(" with ");
			IExpression keyExp = key;
			if(keyExp instanceof UnresolvedIdentifier) try {
				keyExp = ((UnresolvedIdentifier)keyExp).resolve(writer.getContext(), false);
			} catch (SyntaxError e) {
				// TODO add warning 
			}
			if(keyExp instanceof InstanceExpression)
				((InstanceExpression)keyExp).toDialect(writer, false);
			else
				keyExp.toDialect(writer);
			writer.append(" as key");
		}
	}	

	private void toODialect(CodeWriter writer) {
		writer.append("sorted (");
		source.toDialect(writer);
		if(key!=null) {
			writer.append(", key = ");
			key.toDialect(writer);
		}
		writer.append(")");
	}
	
	private void toSDialect(CodeWriter writer) {
		toODialect(writer);
	}
	
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = source.check(context);
		if(!(type instanceof ListType || type instanceof SetType))
			throw new SyntaxError("Unsupported type: " + type);
		return type;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType type = source.check(context);
		if(!(type instanceof ListType || type instanceof SetType))
			throw new SyntaxError("Unsupported type: " + type);
		IValue o = source.interpret(context);
		if(o==null)
			throw new NullReferenceError();
		if(!(o instanceof IContainer<?>))
			throw new InternalError("Unexpected type:" + o.getClass().getName());
		IType itemType = ((ContainerType)type).getItemType();
		if(itemType instanceof CategoryType) 
			return ((CategoryType)itemType).sort(context, (IContainer<IValue>)o, key);
		else
			return itemType.sort(context, (IContainer<IValue>)o );
	}

	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		IType type = source.check(context);
		IType itemType = ((ContainerType)type).getItemType();
		if(itemType instanceof CategoryType) 
			return compileSortCategory(context, method, flags);
		else
			return compileSortNative(context, method, flags);
	}

	private ResultInfo compileSortNative(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		ResultInfo info = source.compile(context, method, flags);
		MethodConstant m = new MethodConstant(info.getType(), "sort", PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return new ResultInfo(PromptoList.class, true);
	}

	private ResultInfo compileSortCategory(Context context, MethodInfo method, Flags flags) {
		throw new UnsupportedOperationException();
	}

}
