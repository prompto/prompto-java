package prompto.value;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoTuple;
import prompto.literal.Literal;
import prompto.runtime.Context;
import prompto.store.InvalidValueError;
import prompto.type.TupleType;
import prompto.utils.CodeWriter;

public class TupleValue extends BaseValue implements IContainer<IValue>, ISliceable<IValue>  {

	protected PromptoTuple<IValue> items;
	
	public TupleValue(boolean mutable) {
		super(TupleType.instance());
		this.items = new PromptoTuple<>(mutable);
	}
	
	public TupleValue(PromptoTuple<IValue> items) {
		super(TupleType.instance());
		this.items = items;
	}
	
	public TupleValue(Collection<IValue> items, boolean mutable) {
		super(TupleType.instance());
		this.items = new PromptoTuple<IValue>(items, mutable);
	}

	
	@Override
	public boolean isMutable() {
		return items.isMutable();
	}
	
	@Override
	public PromptoTuple<IValue> getStorableData() {
		return items;
	}
	
	@Override
	public String toString() {
		String result = items.toString();
		return "(" + result.substring(1,result.length()-1) + ")";
	}
	
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ArrayNode result = JsonNodeFactory.instance.arrayNode();
		for(IValue item : items)
			result.add(producer.apply(item));
		return result;
	}

	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(this.getType().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartArray();
			for(IValue value : this.items)
				value.toJsonStream(context, generator, withType, data);
			generator.writeEndArray();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	public void addItem(IValue item) {
		items.add(item);
	}
	
	public PromptoTuple<IValue> getItems() {
		return items;
	}
	
	public IValue getItem(int index) {
		return items.get(index);
	}
	
	public void setItem(int index, IValue element) {
		items.set(index, element);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TupleValue))
			return false;
		return items.equals(((TupleValue)obj).items);
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
	public TupleValue slice(IntegerValue fi, IntegerValue li) throws IndexOutOfRangeError {
		long _fi = fi == null ? 1L : fi.longValue();
		if (_fi < 0)
			throw new IndexOutOfRangeError();
		long _li = li == null ? items.size() : li.longValue();
		if (_li > items.size())
			throw new IndexOutOfRangeError();
		PromptoTuple<IValue> sliced = items.slice(_fi, _li); // 1 based
		return new TupleValue(sliced, false);
	}
	
	@Override
	public long getLength() {
		return items.size();
	}

	@Override
	public boolean hasItem(Context context, IValue lval) throws PromptoError {
		return this.items.contains(lval); // TODO interpret before
	}

	
	@Override
	public void setItem(Context context, IValue item, IValue value) {
		if(!(item instanceof IntegerValue))
			throw new InvalidValueError("Expected an Integer, got:" + item.getClass().getName());
		int index = (int)((IntegerValue)item).longValue();
		if(index<1 || index>this.getLength())
			throw new IndexOutOfRangeError();
		this.setItem(index-1, value);
	}

	
	@Override
	public IValue getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof IntegerValue) {
			try {
				int idx = (int)((IntegerValue)index).longValue() - 1;
				return items.get(idx);
			} catch (IndexOutOfBoundsException e) {
				throw new IndexOutOfRangeError();
			}

		} else
			throw new SyntaxError("No such item:" + index.toString());
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
        if (value instanceof ListValue)
            return this.merge(((ListValue)value).getItems());
        else if (value instanceof TupleValue)
            return this.merge(((TupleValue)value).getItems());
        else if (value instanceof SetValue)
            return this.merge(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " + this.type.getTypeName() + " + " + value.getClass().getSimpleName());
    }
	
	protected TupleValue merge(Collection<? extends IValue> items) {
		PromptoTuple<IValue> result = new PromptoTuple<IValue>(false);
		result.addAll(this.items);
		result.addAll(items);
		return new TupleValue(result);
	}
	
	
	@Override
	public IterableWithCounts<IValue> getIterable(Context context) {
		return new IterableWithCounts<IValue>() {
			@Override
			public Long getCount() {
				return (long)items.size();
			}
			@Override
			public Long getTotalCount() {
				return (long)items.size();
			}
			@Override
			public Iterator<IValue> iterator() {
				return items.iterator();
			}
		};
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(items.size());
		else
			return super.getMember(context, id, autoCreate);
	}
	
	
	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if(!(value instanceof TupleValue))
			return super.compareTo(context, value);
		return compareTo(context, (TupleValue)value, new ArrayList<java.lang.Boolean>());
	}

	public int compareTo(Context context, TupleValue other, Collection<java.lang.Boolean> directions) throws PromptoError {
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
}
