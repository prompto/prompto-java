package presto.value;

import java.util.List;

import presto.literal.Literal;
import presto.type.TupleType;
import presto.utils.CodeWriter;

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

	
}
