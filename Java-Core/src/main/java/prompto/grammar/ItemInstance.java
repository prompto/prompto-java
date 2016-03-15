package prompto.grammar;

import prompto.error.IndexOutOfRangeError;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.utils.CodeWriter;
import prompto.value.IContainer;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;

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
	public void toDialect(CodeWriter writer, IExpression expression) {
		parent.toDialect(writer, null);
		writer.append('[');
		item.toDialect(writer);
		writer.append(']');
	}
	
	@Override
	public IType checkAssignValue(Context context, IExpression expression) throws SyntaxError {
		IType elemType = parent.checkAssignElement(context);
		IType itemType = item.check(context);
		if(itemType!=IntegerType.instance())
			throw new SyntaxError("Expecting an Integer, got:" + itemType.toString());
		return elemType;
	}
	
	@Override
	public IType checkAssignMember(Context context, Identifier memberName) throws SyntaxError {
		return AnyType.instance(); // TODO 
	}
	
	@Override
	public IType checkAssignElement(Context context) throws SyntaxError {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
		IValue obj = parent.interpret(context);
		if(!(obj instanceof ListValue))
			throw new InvalidDataError("Expected a List, got:" + obj.getClass().getName());
		ListValue list = (ListValue)obj;
		IValue idx = item.interpret(context);
		if(!(idx instanceof Integer))
			throw new InvalidDataError("Expected an Integer, got:" + idx.getClass().getName());
		int index = (int)((Integer)idx).longValue();
		if(index<1 || index>list.length())
			throw new IndexOutOfRangeError();
		list.setItem(index-1, expression.interpret(context));
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue parent = this.parent.interpret(context);
		IValue item = this.item.interpret(context);
        if (parent instanceof IContainer)
            return ((IContainer<?>)parent).getItem(context, item);
         else
 			throw new SyntaxError("Unknown item/key: " + item.getClass().getName());
	}
	

}
