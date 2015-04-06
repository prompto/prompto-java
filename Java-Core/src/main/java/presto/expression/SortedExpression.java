package presto.expression;

import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.UnresolvedIdentifier;
import presto.runtime.Context;
import presto.type.CategoryType;
import presto.type.CollectionType;
import presto.type.IType;
import presto.type.ListType;
import presto.type.SetType;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;

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
			toPDialect(writer);
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
	
	private void toPDialect(CodeWriter writer) {
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
	public IValue interpret(Context context) throws PrestoError {
		IType type = source.check(context);
		if(!(type instanceof ListType || type instanceof SetType))
			throw new SyntaxError("Unsupported type: " + type);
		IValue o = source.interpret(context);
		if(o==null)
			throw new NullReferenceError();
		if(!(o instanceof ICollection<?>))
			throw new InternalError("Unexpected type:" + o.getClass().getName());
		IType itemType = ((CollectionType)type).getItemType();
		if(itemType instanceof CategoryType) 
			return ((CategoryType)itemType).sort(context, (ICollection<IValue>)o, key);
		else
			return itemType.sort(context, (ICollection<IValue>)o );
	}

	public void setKey(IExpression key) {
		this.key = key;
	}


}
