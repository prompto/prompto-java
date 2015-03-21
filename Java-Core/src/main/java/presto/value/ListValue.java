package presto.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.CollectionType;
import presto.type.IType;
import presto.type.ListType;

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
	public ListValue newInstance(List<IValue> items) {
		IType itemType = ((CollectionType)this.type).getItemType();
		return new ListValue(itemType, items);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ListValue))
			return false;
		return items.equals(((ListValue)obj).items);
	}
	

	@Override
	public IValue Multiply(Context context, IValue value) throws PrestoError {
		if (value instanceof Integer) {
			IType itemType = ((CollectionType)this.type).getItemType();
			int count = (int) ((Integer) value).IntegerValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			if (count == 0)
				return new ListValue(itemType);
			if (count == 1)
				return this;
			List<IValue> result = new ArrayList<IValue>();
			for (long i = 0; i < count; i++)
				result.addAll(this.items);
			return new ListValue(itemType, result);
		} else
			throw new SyntaxError("Illegal: List * " + value.getClass().getSimpleName());
	}

}
