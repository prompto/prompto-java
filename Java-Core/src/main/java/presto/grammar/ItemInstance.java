package presto.grammar;

import presto.error.IndexOutOfRangeError;
import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.IntegerType;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.Integer;
import presto.value.ListValue;

public class ItemInstance implements IAssignableSelector {

	IAssignableInstance parent;
	IExpression item;
	
	public ItemInstance(IExpression item) {
		this.item = item;
	}
	
	@Override
	public void setParent(IAssignableInstance parent) {
		this.parent = parent;
	}
	
	public IExpression getItem() {
		return item;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append('[');
		item.toDialect(writer);
		writer.append(']');
	}
	
	@Override
	public void checkAssignValue(Context context, IExpression expression) throws SyntaxError {
		parent.checkAssignElement(context);
		IType itemType = item.check(context);
		if(itemType!=IntegerType.instance())
			throw new SyntaxError("Expecting an Integer, got:" + itemType.toString());
	}
	
	@Override
	public void checkAssignMember(Context context, String memberName) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void checkAssignElement(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PrestoError {
		IValue obj = parent.interpret(context);
		if(!(obj instanceof ListValue))
			throw new InvalidDataError("Expected a List, got:" + obj.getClass().getName());
		ListValue list = (ListValue)obj;
		IValue idx = item.interpret(context);
		if(!(idx instanceof Integer))
			throw new InvalidDataError("Expected an Integer, got:" + idx.getClass().getName());
		int index = (int)((Integer)idx).IntegerValue();
		if(index<1 || index>list.length())
			throw new IndexOutOfRangeError();
		list.setItem(index-1, expression.interpret(context));
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue parent = this.parent.interpret(context);
		IValue item = this.item.interpret(context);
        if (parent instanceof ICollection)
            return ((ICollection<?>)parent).getItem(context, item);
         else
 			throw new SyntaxError("Unknown item/key: " + item.getClass().getName());
	}
	

}
