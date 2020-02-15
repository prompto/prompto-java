package prompto.value;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.Filterable;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.SetType;

public class SetValue extends BaseValue implements IContainer<IValue>, IFilterable {

	PromptoSet<IValue> items = null;
	
	public SetValue(IType itemType) {
		super(new SetType(itemType));
		this.items = new PromptoSet<IValue>();
	}
	
	public SetValue(IType itemType, PromptoSet<IValue> items) {
		super(new SetType(itemType));
		this.items = items;
	}

	@Override
	public PromptoSet<IValue> getStorableData() {
		return items;
	}
	
	@Override
	public String toString() {
		return items.toString();
	}

	public IType getItemType() {
		return ((ContainerType)type).getItemType();
	}

	@Override
	public long getLength() {
		return items.size();
	}

	public PromptoSet<IValue> getItems() {
		return items;
	}
	
	@Override
	public boolean hasItem(Context context, IValue value) throws PromptoError {
		return items.contains(value);
	}

	@Override
	public IValue getItem(Context context, IValue index) throws PromptoError {
		if (index instanceof IntegerValue) {
			int idx = (int)((IntegerValue)index).longValue() - 1;
			return getNthItem(idx);
		} else
			throw new SyntaxError("No such item:" + index.toString());
	}
	
	private IValue getNthItem(int idx) throws PromptoError {
		Iterator<? extends IValue> it = items.iterator();
		while(it.hasNext()) {
			IValue item = it.next();
			if(idx--==0)
				return item;
		}
		throw new IndexOutOfRangeError();
	}
	
	@Override
	public Filterable<IValue, IValue> getFilterable(Context context) {
		return new Filterable<IValue, IValue>() {
			@Override
			public IValue filter(Predicate<IValue> p) {
				PromptoSet<IValue> filtered = items.filter(p);
				return new SetValue(getItemType(), filtered);
			}
		};
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
	public boolean equals(Object obj) {
		if(!(obj instanceof SetValue))
			return false;
		return items.equals(((SetValue)obj).items);
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(items.size());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public IValue plus(Context context, IValue value) {
        if (value instanceof ListValue)
            return this.merge(((ListValue)value).getItems());
        else if (value instanceof SetValue)
            return this.merge(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " + this.type.getTypeName() + " + " + value.getClass().getSimpleName());
    }

	public SetValue merge(Collection<? extends IValue> items) {
		PromptoSet<IValue> result = new PromptoSet<IValue>();
		result.addAll(this.items);
		result.addAll(items);
		IType itemType = ((SetType)getType()).getItemType();
		return new SetValue(itemType, result);
	}
	
	
	@Override
	public IValue minus(Context context, IValue value) {
        if (value instanceof ListValue)
            return this.remove(((ListValue)value).getItems());
        else if (value instanceof SetValue)
            return this.remove(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " + this.type.getTypeName() + " + " + value.getClass().getSimpleName());
    }

	public SetValue remove(Collection<? extends IValue> items) {
		PromptoSet<IValue> result = new PromptoSet<IValue>();
		result.addAll(this.items);
		result.removeAll(items);
		IType itemType = ((SetType)getType()).getItemType();
		return new SetValue(itemType, result);
	}

	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ArrayNode result = JsonNodeFactory.instance.arrayNode();
		for(IValue item : items)
			result.add(producer.apply(item));
		return result;
	}

	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(this.getType().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartArray();
			for(IValue value : this.items)
				value.toJsonStream(context, generator, System.identityHashCode(this), null, withType, data);
			generator.writeEndArray();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
