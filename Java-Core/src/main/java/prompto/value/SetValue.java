package prompto.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IOperand;
import prompto.compiler.ResultInfo;
import prompto.error.IndexOutOfRangeError;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.SetType;

public class SetValue extends BaseValue implements IContainer<IValue>, IListable<SetValue> {

	Set<IValue> items = null;
	
	public SetValue(IType itemType) {
		super(new SetType(itemType));
		this.items = newSet();
	}
	
	public SetValue(IType itemType, Set<IValue> items) {
		super(new SetType(itemType));
		this.items = items;
	}

	protected Set<IValue> newSet() {
		return new PromptoSet<IValue>();
	}

	@Override
	public boolean isEmpty() {
		return items.isEmpty();
	}

	@Override
	public long length() {
		return items.size();
	}

	public Collection<IValue> getItems() {
		return items;
	}
	
	@Override
	public boolean hasItem(Context context, IValue value) throws PromptoError {
		return items.contains(value);
	}

	@Override
	public IValue getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof Integer) {
			int idx = (int)((Integer)index).longValue() - 1;
			return getNthItem(idx);
		} else
			throw new SyntaxError("No such item:" + index.toString());
	}

	private IValue getNthItem(int idx) throws PromptoError {
		Iterator<IValue> it = items.iterator();
		while(it.hasNext()) {
			IValue item = it.next();
			if(idx--==0)
				return item;
		}
		throw new IndexOutOfRangeError();
	}

	@Override
	public Iterable<IValue> getIterable(Context context) {
		return items;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof SetValue))
			return false;
		return items.equals(((SetValue)obj).items);
	}

	@Override
	public SetValue newInstance(List<IValue> values) {
		IType itemType = ((SetType)type).getItemType();
		SetValue result = new SetValue(itemType);
		result.items.addAll(values);
		return result;
	}
	
	@Override
	public String toString() {
		return items.toString();
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(items.size());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
        if (value instanceof BaseList<?,?>)
            return this.merge(((BaseList<?,?>)value).getItems());
        else if (value instanceof SetValue)
            return this.merge(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " +this.type.getId() + " + " + value.getClass().getSimpleName());
    }

	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		// TODO: return left if right is empty (or right if left is empty and is a set)
		// create result
		ResultInfo info = CompilerUtils.newInstance(method, PromptoSet.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoSet.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, false); // stack is: result, result, right
		oper = new MethodConstant(PromptoSet.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}
	
	public SetValue merge(Collection<IValue> items) {
		List<IValue> result = new ArrayList<IValue>();
		result.addAll(this.items);
		result.addAll(items);
		return newInstance(result);
	}

}
