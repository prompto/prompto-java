package prompto.value;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
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

public class ListValue extends BaseList<ListValue> {

	public ListValue(IType itemType) {
		super(new ListType(itemType));
	}

	public ListValue(IType itemType, List<IValue> items) {
		super(new ListType(itemType), items);
	}

	public ListValue(IType itemType, Collection<IValue> items) {
		super(new ListType(itemType), items);
	}
	
	@Override
	protected List<IValue> newItemsInstance() {
		return new PromptoList<IValue>();
	}
	
	@Override
	protected List<IValue> newItemsInstance(Collection<IValue> items) {
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
	
	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean right) throws SyntaxError {
		// TODO: return left if right is empty (or right if left is empty and is a list)
		// create result
		ResultInfo info = CompilerUtils.newInstance(method, PromptoList.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		Operand oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, false); // stack is: result, result, right
		oper = new MethodConstant(PromptoList.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}
	
	@Override
	public IValue Multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			IType itemType = ((ContainerType)this.type).getItemType();
			int count = (int) ((Integer) value).longValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			if (count == 0)
				return new ListValue(itemType);
			if (count == 1)
				return this;
			List<IValue> result = new PromptoList<IValue>();
			for (long i = 0; i < count; i++)
				result.addAll(this.items);
			return new ListValue(itemType, result);
		} else
			throw new SyntaxError("Illegal: List * " + value.getClass().getSimpleName());
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
