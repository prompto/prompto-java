package presto.expression;

import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.NullValue;

public class ItemSelector extends SelectorExpression {

	IExpression item;
	
	public ItemSelector(IExpression item) {
		this.item = item;
	}
	
	public ItemSelector(IExpression parent, IExpression item) {
		super(parent);
		this.item = item;
	}

	public IExpression getItem() {
		return item;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append("[");
		item.toDialect(writer);
		writer.append("]");
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType parentType = parent.check(context);
		IType itemType = item.check(context);
		return parentType.checkItem(context,itemType);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue o = parent.interpret(context);
        if (o == null || o==NullValue.instance())
            throw new NullReferenceError();
        IValue i = item.interpret(context);
        if (i == null || i==NullValue.instance())
            throw new NullReferenceError();
        if (o instanceof ICollection)
            return ((ICollection<?>)o).getItem(context, i);
        else
        	throw new SyntaxError("Unknown collection: " + parent);
	}

}
