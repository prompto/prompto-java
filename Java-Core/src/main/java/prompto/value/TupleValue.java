package prompto.value;

import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoTuple;
import prompto.literal.Literal;
import prompto.runtime.Context;
import prompto.type.TupleType;
import prompto.utils.CodeWriter;

public class TupleValue extends BaseList<TupleValue> {

	public TupleValue() {
		super(TupleType.instance());
	}
	
	public TupleValue(List<IValue> items) {
		super(TupleType.instance(), items);
	}
	
	@Override
	protected List<IValue> newItemsInstance() {
		return new PromptoTuple<IValue>();
	}
	
	@Override
	protected List<IValue> newItemsInstance(Collection<IValue> items) {
		return new PromptoTuple<IValue>(items);
	}

	@Override
	public String toString() {
		String result = super.toString();
		return "(" + result.substring(1,result.length()-1) + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TupleValue))
			return false;
		return items.equals(((TupleValue)obj).items);
	}

	@Override
	public TupleValue newInstance(List<IValue> items) {
		return new TupleValue(items);
	}
	
	public void toDialect(CodeWriter writer) {
		writer.append('(');
		if(items.size()>0) {
			for(Object o : items) {
				if(o instanceof Literal<?>)
					((Literal<?>)o).toDialect(writer);
				else
					writer.append(o.toString());
				writer.append(", ");
			}
			writer.trimLast(2);
		}
		writer.append(')');
	}
	
	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if(!(value instanceof TupleValue))
			return super.CompareTo(context, value);
		return CompareTo(context, (TupleValue)value, new ArrayList<Boolean>());
	}

	public int CompareTo(Context context, TupleValue other, Collection<Boolean> directions) throws PromptoError {
		Iterator<Boolean> iterDirs = directions.iterator();
		Iterator<IValue> iterThis = this.items.iterator();
		Iterator<IValue> iterOther = other.items.iterator();
		while(iterThis.hasNext() && iterOther.hasNext()) {
			boolean descending = iterDirs.hasNext() ? iterDirs.next() : false;
			// compare items
			IValue thisVal = iterThis.next();
			IValue otherVal = iterOther.next();
			if(thisVal==null && otherVal==null)
				continue;
			else if(thisVal==null)
				return descending ? 1 : -1;
			else if(otherVal==null)
				return descending ? -1 : 1;
			int cmp = thisVal.CompareTo(context, otherVal);
			// if not equal, done
			if(cmp!=0) {
				return descending ? -cmp : cmp;
			}
		}
		boolean descending = iterDirs.hasNext() ? iterDirs.next() : false;
		if(iterThis.hasNext())
			return descending ? -1 : 1;
		else if(iterOther.hasNext())
			return descending ? 1 : -1;
		else
			return 0;
	}

	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		// TODO: return left if right is empty (or right if left is empty and is a list)
		// create result
		ResultInfo info = CompilerUtils.newInstance(method, PromptoTuple.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		Operand oper = new MethodConstant(PromptoTuple.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, false); // stack is: result, result, right
		oper = new MethodConstant(PromptoTuple.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}
}
