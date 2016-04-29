package prompto.instance;

import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.expression.ItemSelector;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoAny;
import prompto.intrinsic.PromptoDocument;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IContainer;
import prompto.value.IValue;

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
	public IType checkAssignValue(Context context, IType valueType) {
		// called when a[3] = value
		IType itemType = item.check(context);
		return parent.checkAssignItem(context, itemType, valueType);
	}
	
	@Override
	public IType checkAssignMember(Context context, Identifier memberName, IType valueType) {
		// called when a[3].member = value
		return AnyType.instance(); // TODO 
	}
	
	@Override
	public IType checkAssignItem(Context context, IType itemType, IType valueType) {
		// called when a[3][x] = value
		IType thisItemType = item.check(context);
		IType parentType = parent.checkAssignItem(context, thisItemType, valueType);
		return parentType.checkItem(context, itemType); 
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
		IValue root = parent.interpret(context);
		if(!root.isMutable())
			throw new NotMutableError();
		IValue idx = item.interpret(context);
		IValue value = expression.interpret(context);
		root.setItem(context, idx, value);
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
	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		ResultInfo parentInfo = this.parent.compileParent(context, method, flags);
		return ItemSelector.compileGetItem(context, method, flags, parentInfo, item);
	}
	
	@Override
	public ResultInfo compileAssign(Context context, MethodInfo method, Flags flags, IExpression value) {
		ResultInfo parentInfo = this.parent.compileParent(context, method, flags);
		if(PromptoAny.class==parentInfo.getType() || PromptoDocument.class==parentInfo.getType())
			return compileAssignAny(context, method, flags, item, value);
		else 
			throw new UnsupportedOperationException("Cannot compileAssign for " + parentInfo.getType().getTypeName());
	}
	
	private ResultInfo compileAssignAny(Context context, MethodInfo method, Flags flags, IExpression item, IExpression value) {
		item.compile(context, method, flags.withPrimitive(false));
		value.compile(context, method, flags.withPrimitive(false));
		IOperand oper = new MethodConstant(PromptoAny.class, "setItem", Object.class, Object.class, Object.class, void.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(void.class);
	}
	
}
