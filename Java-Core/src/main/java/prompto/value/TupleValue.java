package prompto.value;

import java.lang.Boolean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import prompto.error.PromptoError;
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
			int cmp = thisVal.CompareTo(context, otherVal);
			// if not equal, done
			if(cmp!=0) {
				if(descending)
					cmp = -cmp;
				return cmp;
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

	
}
