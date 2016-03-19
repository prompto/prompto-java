package prompto.value;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.ListType;

import com.fasterxml.jackson.core.JsonGenerator;

public class ListValue extends BaseList<ListValue, PromptoList<IValue>> {

	public ListValue(IType itemType) {
		super(new ListType(itemType));
	}

	public ListValue(IType itemType, PromptoList<IValue> items) {
		super(new ListType(itemType), items);
	}

	public ListValue(IType itemType, Collection<IValue> items) {
		super(new ListType(itemType), items);
	}
	
	@Override
	protected PromptoList<IValue> newItemsInstance() {
		return new PromptoList<IValue>();
	}
	
	@Override
	protected PromptoList<IValue> newItemsInstance(Collection<IValue> items) {
		return new PromptoList<IValue>(items);
	}

	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		for(IValue item : this.items)
			item.storeValue(context, name, storable);
	}
	
	@Override
	public ListValue newInstance(List<IValue> items) {
		IType itemType = ((ContainerType)this.type).getItemType();
		return new ListValue(itemType, items);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ListValue))
			return false;
		return items.equals(((ListValue)obj).items);
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) throws SyntaxError {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoList.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse()) {
			// perform 1-0
			method.addInstruction(Opcode.ICONST_1);
			method.addInstruction(Opcode.SWAP);
			method.addInstruction(Opcode.ISUB);
		}
		if(flags.toNative())
			return new ResultInfo(boolean.class, false);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) throws SyntaxError {
		// TODO: return left if right is empty (or right if left is empty and is a list)
		// create result
		ResultInfo info = CompilerUtils.newInstance(method, PromptoList.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}
	
	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			IType itemType = ((ContainerType)this.type).getItemType();
			int count = (int) ((Integer) value).longValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			return new ListValue(itemType, this.items.multiply(count));
		} else
			throw new SyntaxError("Illegal: List * " + value.getClass().getSimpleName());
	}
	
	@Override
	public ListValue slice(Integer fi, Integer li) throws IndexOutOfRangeError {
		long _fi = fi == null ? 1L : fi.longValue();
		if (_fi < 0)
			throw new IndexOutOfRangeError();
		long _li = li == null ? items.size() : li.longValue();
		if (_li > items.size())
			throw new IndexOutOfRangeError();
		PromptoList<IValue> sliced = items.slice(_fi, _li); // 1 based
		return new ListValue(this.getItemType(), sliced);
	}

	public static ResultInfo compileSlice(Context context, MethodInfo method, Flags flags, 
			ResultInfo parent, IExpression first, IExpression last) throws SyntaxError {
		compileSliceFirst(context, method, flags, first);
		compileSliceLast(context, method, flags, last);
		MethodConstant m = new MethodConstant(PromptoList.class, "slice", 
				long.class, long.class, PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return parent;
	}

	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) throws SyntaxError {
		ResultInfo right = exp.compile(context, method, flags.withNative(true));
		right = CompilerUtils.numberToint(method, right);
		// minus 1
		method.addInstruction(Opcode.ICONST_M1);
		method.addInstruction(Opcode.IADD);
		// create result
		IOperand oper = new MethodConstant(PromptoList.class, "get", 
				int.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class, true);
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeStartArray();
			for(IValue value : this.items)
				value.toJson(context, generator, null, null);
			generator.writeEndArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
