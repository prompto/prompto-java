package prompto.value;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoSet;
import prompto.java.JavaClassType;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.InvalidValueError;
import prompto.type.AnyType;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.ListType;

public class ListValue extends BaseValue implements IContainer<IValue>, ISliceable<IValue>, IFilterable  {

	PromptoList<IValue> items;
	List<Object> storables;
	
	public ListValue(IType itemType) {
		super(new ListType(itemType));
		this.items = new PromptoList<>(false);
	}
	
	public ListValue(IType itemType, PromptoList<IValue> items) {
		super(new ListType(itemType));
		this.items = items;
	}

	public ListValue(IType itemType, Collection<? extends IValue> items) {
		super(new ListType(itemType));
		this.items = new PromptoList<>(items, false);
	}
	
	public ListValue(IType itemType, Collection<? extends IValue> items, boolean mutable) {
		super(new ListType(itemType));
		this.items = new PromptoList<>(items, mutable);
	}

	public ListValue(Context context, PromptoList<?> list) {
		super(new ListType(AnyType.instance()));
		List<IValue> items = list.stream()
				.map((item)->JavaClassType.convertJavaValueToPromptoValue(context, item, item.getClass(), AnyType.instance()))
				.collect(Collectors.toList());
		this.items = new PromptoList<>(items, false);
	}

	@Override
	public boolean isMutable() {
		return items.isMutable();
	}
	
	@Override
	public Object getStorableData() {
		if(storables==null) {
			storables = new ArrayList<>();
			for(IValue item : items)
				storables.add(item.getStorableData());
		}
		return storables;
	}
	
	@Override
	public void collectStorables(Consumer<IStorable> collector) {
		items.forEach((value)->
			value.collectStorables(collector));
	}
	
	@Override
	public String toString() {
		return items.toString();
	}

	public IType getItemType() {
		return ((ContainerType)type).getItemType();
	}

	public PromptoList<IValue> getItems() {
		return items;
	}
	
	public void addItem(IValue item) {
		items.add(item);
	}
	
	public void removeItem(Long item) {
		items.remove(item.intValue() - 1);
	}

	public IValue getItem(int index) {
		return items.get(index);
	}
	
	public void setItem(int index, IValue element) {
		items.set(index, element);
	}
	
	public void removeValue(IValue value) {
		items.remove(value);
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
	public boolean hasItem(Context context, IValue lval) throws PromptoError {
		return this.items.contains(lval); // TODO interpret before
	}

	@Override
	public long getLength() {
		return items.size();
	}

	@Override
	public Filterable<IValue,IValue> getFilterable(Context context) {
		return new Filterable<IValue, IValue>() {
			@Override
			public IValue filter(Predicate<IValue> p) {
				PromptoList<IValue> filtered = items.filter(p);
				return new ListValue(getItemType(), filtered);
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
	public IValue getMember(Context context, Identifier id, boolean autoCreate) {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(items.size());
		else if ("iterator".equals(name))
			return new IteratorValue(getItemType(), getIterable(context).iterator());
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
	
	protected ListValue merge(Collection<? extends IValue> items) {
		PromptoList<IValue> result = new PromptoList<IValue>(false);
		result.addAll(this.items);
		result.addAll(items);
		IType itemType = ((ContainerType)getType()).getItemType();
		return new ListValue(itemType, result);
	}
	

	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
        if (value instanceof ListValue)
            return this.remove(((ListValue)value).getItems());
        else if (value instanceof SetValue)
            return this.remove(((SetValue)value).getItems());
        else
            throw new SyntaxError("Illegal: " + this.type.getTypeName() + " + " + value.getClass().getSimpleName());
	}
	

	protected ListValue remove(Collection<? extends IValue> items) {
		PromptoList<IValue> result = new PromptoList<IValue>(false);
		result.addAll(this.items);
		result.removeAll(items);
		IType itemType = ((ContainerType)getType()).getItemType();
		return new ListValue(itemType, result);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ListValue))
			return false;
		return items.equals(((ListValue)obj).items);
	}
	
	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue) {
			IType itemType = ((ContainerType)this.type).getItemType();
			int count = (int) ((IntegerValue) value).longValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			return new ListValue(itemType, this.items.multiply(count));
		} else
			throw new SyntaxError("Illegal: List * " + value.getClass().getSimpleName());
	}
	
	@Override
	public ListValue slice(IntegerValue fi, IntegerValue li) throws IndexOutOfRangeError {
		long _fi = fi == null ? 1L : fi.longValue();
		if (_fi < 0)
			throw new IndexOutOfRangeError();
		long _li = li == null ? items.size() : li.longValue();
		if (_li > items.size())
			throw new IndexOutOfRangeError();
		PromptoList<IValue> sliced = items.slice(_fi, _li); // 1 based
		return new ListValue(this.getItemType(), sliced);
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
	
	@Override
	public Object toJavaValue(Context context, Type type) {
		if(canConvertTo(type)) {
			Type itemType = getItemType(type);
			PromptoList<Object> result = new PromptoList<>(true);
			items.forEach((item)->result.add(item.toJavaValue(context, itemType)));
			return result;
		} else
			return super.toJavaValue(context, type);
	}

	private boolean canConvertTo(Type type) {
		return type==PromptoList.class || (type instanceof Class<?> && ((Class<?>)type).isAssignableFrom(PromptoList.class));
	}

	private Type getItemType(Type type) {
		return type instanceof ParameterizedType ? ((ParameterizedType)type).getActualTypeArguments()[0] : Object.class;
	}

	public IValue toSetValue() {
		PromptoSet<IValue> items = new PromptoSet<>(this.items);
		return new SetValue(((ListType)this.getType()).getItemType(), items);
	}

}
