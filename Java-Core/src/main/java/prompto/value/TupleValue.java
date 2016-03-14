package prompto.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoTuple;
import prompto.literal.Literal;
import prompto.runtime.Context;
import prompto.type.TupleType;
import prompto.utils.CodeWriter;

public class TupleValue extends BaseList<TupleValue, PromptoTuple<IValue>> {

	public TupleValue() {
		super(TupleType.instance());
	}
	
	public TupleValue(PromptoTuple<IValue> items) {
		super(TupleType.instance(), items);
	}
	
	public TupleValue(Collection<IValue> items) {
		super(TupleType.instance(), items);
	}

	@Override
	protected PromptoTuple<IValue> newItemsInstance() {
		return new PromptoTuple<IValue>();
	}
	
	@Override
	protected PromptoTuple<IValue> newItemsInstance(Collection<IValue> items) {
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
	public TupleValue slice(Integer fi, Integer li) throws IndexOutOfRangeError {
		long _fi = fi == null ? 1L : fi.longValue();
		if (_fi < 0)
			throw new IndexOutOfRangeError();
		long _li = li == null ? items.size() : li.longValue();
		if (_li > items.size())
			throw new IndexOutOfRangeError();
		PromptoTuple<IValue> sliced = items.slice(_fi, _li); // 1 based
		return new TupleValue(sliced);
	}
	
	public static ResultInfo compileSlice(Context context, MethodInfo method, 
			ResultInfo parent, IExpression first, IExpression last, Flags flags) throws SyntaxError {
		compileSliceFirst(context, method, flags, first);
		compileSliceLast(context, method, flags, last);
		MethodConstant m = new MethodConstant(PromptoTuple.class, "slice", 
				long.class, long.class, PromptoTuple.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return parent;
	}


	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if(!(value instanceof TupleValue))
			return super.compareTo(context, value);
		return CompareTo(context, (TupleValue)value, new ArrayList<java.lang.Boolean>());
	}

	public int CompareTo(Context context, TupleValue other, Collection<java.lang.Boolean> directions) throws PromptoError {
		Iterator<java.lang.Boolean> iterDirs = directions.iterator();
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
			int cmp = thisVal.compareTo(context, otherVal);
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

	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression exp, Flags flags) throws SyntaxError {
		// TODO: return left if right is empty (or right if left is empty and is a list)
		// create result
		ResultInfo info = CompilerUtils.newInstance(method, PromptoTuple.class); 
		// add left, current stack is: left, result, we need: result, result, left
		method.addInstruction(Opcode.DUP_X1); // stack is: result, left, result
		method.addInstruction(Opcode.SWAP); // stack is: result, result, left
		IOperand oper = new MethodConstant(PromptoTuple.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		// add right, current stack is: result, we need: result, result, right
		method.addInstruction(Opcode.DUP); // stack is: result, result 
		exp.compile(context, method, flags); // stack is: result, result, right
		oper = new MethodConstant(PromptoTuple.class, "addAll", 
				Collection.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume returned boolean
		return info;
	}
}
