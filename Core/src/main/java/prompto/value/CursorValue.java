package prompto.value;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.Filterable;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.IterableType;
import prompto.type.TextType;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class CursorValue extends BaseValue implements IIterable<IValue>, IterableWithCounts<IValue>, IFilterable {

	Context context;
	IStoredIterable iterable;
	boolean mutable;
	
	public CursorValue(Context context, IType itemType, IStoredIterable documents) {
		super(new CursorType(itemType));
		this.context = context;
		this.iterable = documents;
		this.mutable = itemType instanceof CategoryType ? ((CategoryType)itemType).isMutable() : false;
	}

	@Override
	public Object getStorableData() {
		throw new UnsupportedOperationException(); // can't be stored
	}
	
	
	public IType getItemType() {
		return ((CursorType)getType()).getItemType();
	}

	
	@Override
	public Long getCount() {
		return iterable.count();
	}
	
	@Override
	public Long getTotalCount() {
		return iterable.totalCount();
	}

	@Override
	public IterableWithCounts<IValue> getIterable(Context context) {
		return this;
	}
	
	@Override 
	public Iterator<IValue> iterator() {
		return new Iterator<IValue>() {
			
			Iterator<IStored> iterator = iterable.iterator();
			
			@Override
			public boolean hasNext() {
				return iterator.hasNext();
			}
			
			@Override
			public IValue next() {
				try {
					IStored stored = iterator.next();
					CategoryType itemType = readItemType(stored);
					return itemType.newInstance(context, stored);
				} catch (PromptoError e) {
					throw new RuntimeException(e);
				}
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	private CategoryType readItemType(IStored stored) throws PromptoError {
		Object value = stored.getData("category");
		if(value instanceof List<?>) {
			List<String> categories = (List<String>)value;
			String category = categories.get(categories.size()-1);
			CategoryType type = new CategoryType(new Identifier(category));
			type.setMutable(this.mutable);
			return type;
		} else
			return (CategoryType) ((IterableType)type).getItemType();
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(getCount());
		else if ("totalCount".equals(name))
			return new IntegerValue(getTotalCount());
		else
			throw new SyntaxError("No such member:" + name);
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		ObjectNode value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", TextType.instance().getTypeName());
		value.put("value", getItemType().getTypeName());
		result.set("itemTypeName", value);
		value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", IntegerType.instance().getTypeName());
		value.put("value", iterable.count());
		result.set("count", value);
		value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", IntegerType.instance().getTypeName());
		value.put("value", iterable.totalCount());
		result.set("totalCount", value);
		return result;
	}

	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(type.getTypeName());
			}
			generator.writeStartObject();
			generator.writeFieldName("count");
			generator.writeNumber(iterable.count());
			generator.writeFieldName("totalCount");
			generator.writeNumber(iterable.totalCount());
			generator.writeFieldName("items");
			generator.writeStartArray();
			Iterator<IValue> iter = iterator();
			while(iter.hasNext())
				iter.next().toJsonStream(context, generator, null, null, withType, data);
			generator.writeEndArray();
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@Override
	public Filterable<IValue, IValue> getFilterable(Context context) {
		return new Filterable<IValue, IValue>() {
			@Override
			public IValue filter(Predicate<IValue> predicate) {
				PromptoList<IValue> filtered = new PromptoList<IValue>(false);
				for(IValue value : getIterable(context)) {
					if(predicate.test(value))
						filtered.add(value);
				}
				return new ListValue(getItemType(), filtered);
			}
		};
	}
	
	public IValue toListValue() {
		ListValue values = new ListValue(this.getItemType());
		for(IValue item : this)
			values.addItem(item);
		return values;
	}



}
