package prompto.value;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
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
	public void store(Context context, String name, IStorable storable) {
		for(IValue item : this.items)
			item.store(context, name, storable);
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
	

	@Override
	public IValue Multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			IType itemType = ((ContainerType)this.type).getItemType();
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
	
	@Override
	public void toJson(Context context, JsonGenerator generator) throws IOException, PromptoError {
		generator.writeStartArray();
		for(IValue value : this.items)
			value.toJson(context, generator);
		generator.writeEndArray();
	}

}
