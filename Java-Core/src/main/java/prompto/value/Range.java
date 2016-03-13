package prompto.value;

import java.util.Iterator;

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
import prompto.intrinsic.PromptoRange;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.RangeType;

public abstract class Range<T extends IValue> extends BaseValue implements IContainer<T>, IRange<T> {
	
	PromptoRange<T> range;
	
	public Range(IType type, T left, T right) {
		super(new RangeType(type));
		// can't just use T extends Comparable<T> because T may already extend Comparable<R> with R!=T
		int cmp = compare(left,right);
		if(cmp<0)
			range = new PromptoRange<T>(left, right);
		else
			range = new PromptoRange<T>(right, left);
	}
	
	@Override
	public String toString() {
		return range.toString();
	}
	
	public T getLow() {
		return range.getLow();
	}
	
	public T getHigh() {
		return range.getHigh();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Range && range.equals(((Range<?>)obj).range);
	}
		
	public static ResultInfo compileEquals(Context context, MethodInfo method, ResultInfo left, IExpression exp, Flags flags) throws SyntaxError {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoRange.class, 
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

	public boolean hasItem(Context context, IValue lval) {
		@SuppressWarnings("unchecked")
		T val = (T)lval;
		return compare(val, getLow())>=0 && compare(getHigh(), val)>=0;
	}
	
	@SuppressWarnings("unchecked")
	public T getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof Integer) {
			try {
				Object value = this.getItem(((Integer) index).longValue());
				if (value instanceof IValue)
					return (T) value;
				else
					throw new InternalError("Item not a value!");
			} catch (IndexOutOfBoundsException e) {
				throw new IndexOutOfRangeError();
			}

		} else
			throw new SyntaxError("No such item:" + index.toString());
		  			
	}

	public Range<T> slice(Integer fi, Integer li) throws PromptoError {
		long size = length();
		long _fi = fi==null ? 1L : fi.longValue();
		if(_fi<0)
			throw new IndexOutOfRangeError();
		long _li = li==null ? size : li.longValue();
		if(_li<0)
			_li = size + 1 + _li;
		else if(_li>size)
			throw new IndexOutOfRangeError();
		return newInstance(getItem(_fi),getItem(_li));
	}

	@Override
	public Iterable<T> getIterable(Context context) {
		return new RangeIterable(context);
	}	
	
	class RangeIterable implements Iterable<T> {
		
		Context context;
		
		public RangeIterable(Context context) {
			this.context = context;
		}

		@Override
		public Iterator<T> iterator() {
			return new RangeIterator();
		}

		class RangeIterator implements Iterator<T> {
		
			long index = 0L;
			
			@Override
			public boolean hasNext() {
				return index<length();
			}
	
			@Override
			public T next() {
				try {
					return getItem(context, new Integer(++index));
				} catch(Throwable t) {
					throw new InternalError(t.getMessage());
				}
			}
	
			@Override
			public void remove() {
				throw new RuntimeException("Shold never get there!");
			}
			
		}
	}
	
	@Override
	public boolean isEmpty() {
		return length()==0;
	}
	
	public abstract long length();
	public abstract int compare(T o1,T o2);
	public abstract T getItem(long index);
	public abstract Range<T> newInstance(T left,T right);



}
