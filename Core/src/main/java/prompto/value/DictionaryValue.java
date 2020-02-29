package prompto.value;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;
import prompto.store.InvalidValueError;
import prompto.type.ContainerType;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.TextType;

public class DictionaryValue extends BaseValue implements IContainer<IValue> {

	PromptoDict<TextValue, IValue> dict;
	
	public DictionaryValue(IType itemType, boolean mutable) {
		super(new DictType(itemType));
		dict = new PromptoDict<>(mutable);
	}

	public DictionaryValue(DictionaryValue from) {
		this(((ContainerType) from.type).getItemType(), from.dict);
	}

	public DictionaryValue(IType itemType, PromptoDict<TextValue, IValue> dict) {
		super(new DictType(itemType));
		this.dict = dict;
	}
	
	@Override
	public PromptoDict<TextValue, IValue> getStorableData() {
		return dict;
	}

	public static DictionaryValue merge(DictionaryValue dict1, DictionaryValue dict2) {
		PromptoDict<TextValue, IValue> dict = new PromptoDict<>(false);
		dict.putAll(dict1.dict);
		dict.putAll(dict2.dict);
		// TODO check type fungibility		
		return new DictionaryValue(((ContainerType) dict1.type).getItemType(), dict); 
	}

	@Override
	public long getLength() {
		return dict.size();
	}

	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof DictionaryValue)
			return merge(this, (DictionaryValue) value);
		else
			throw new SyntaxError("Illegal: Dict + "
					+ value.getClass().getSimpleName());
	}
	
	@Override
	public boolean hasItem(Context context, IValue value) {
		if (value instanceof TextValue)
			return this.dict.containsKey((TextValue) value);
		else
			throw new SyntaxError("Only Text key supported by " + this.getClass().getSimpleName());
	}

	@Override
	public boolean isMutable() {
		return this.dict.isMutable();
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(this.dict.size());
		else if ("keys".equals(name)) {
			@SuppressWarnings("unchecked")
			PromptoSet<IValue> values = (PromptoSet<IValue>)(Object)new PromptoSet<TextValue>(this.dict.keySet());
			return new SetValue(TextType.instance(), values);
		} else if ("values".equals(name)) {
			IType itemType = ((ContainerType) this.type).getItemType();
			Collection<IValue> values = this.dict.values();
			return new ListValue(itemType, values);
		} else
			return super.getMember(context, id, autoCreate);
	}
	
	
	
	@Override
	public void setItem(Context context, IValue item, IValue value) {
		if(!(item instanceof TextValue))
			throw new InvalidValueError("Expected a Text, got:" + item.getClass().getName());
		this.dict.put((TextValue)item, value);
	}

	@Override
	public IValue getItem(Context context, IValue index) throws PromptoError {
		return getItem(index);
	}
	
	
	public IValue getItem(IValue index) throws PromptoError {
		if (index instanceof TextValue)
			return dict.getOrDefault((TextValue) index, NullValue.instance());
		else
			throw new SyntaxError("No such item:" + index.toString());
	}


	@Override
	public Object convertTo(Context context, Type type) {
		if(canConvertTo(type)) {
			Type itemType = getItemType(type);
			PromptoDict<String, Object> dict = new PromptoDict<>(true);
			for(Map.Entry<TextValue, IValue> entry : this.dict.entrySet()) {
				String key = entry.getKey().toString();
				Object value = entry.getValue().convertTo(context, itemType);
				dict.put(key, value);
			}
			dict.setMutable(this.isMutable());
			return dict;
		} else
			return super.convertTo(context, type);
	}

	private boolean canConvertTo(Type type) {
		return type==PromptoDict.class || (type instanceof Class<?> && ((Class<?>)type).isAssignableFrom(PromptoDict.class));
	}

	private Type getItemType(Type type) {
		return type instanceof ParameterizedType ? ((ParameterizedType)type).getActualTypeArguments()[1] : Object.class;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DictionaryValue))
			return false;
		return dict.equals(((DictionaryValue) obj).dict);
	}

	@Override
	public String toString() {
		return dict.toString();
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		for(Entry<TextValue, IValue> entry : dict.entrySet())
			result.set(entry.getKey().getStorableData(), producer.apply(entry.getValue()));
		return result;
	}
	
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(this.getType().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartObject();
			for(Entry<TextValue, IValue> entry : dict.entrySet()) {
				generator.writeFieldName(entry.getKey().toString());
				IValue value = entry.getValue();
				if(value==null)
					generator.writeNull();
				else
					value.toJsonStream(context, generator, System.identityHashCode(this), entry.getKey().toString(), withType, binaries);
			}
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}


	@Override
	public IterableWithCounts<IValue> getIterable(Context context) {
		return new KVPIterable(context);
	}

	class KVPIterable implements IterableWithCounts<IValue> {

		Context context;

		public KVPIterable(Context context) {
			this.context = context;
		}

		@Override
		public Long getCount() {
			return (long)dict.size();
		}
		
		@Override
		public Long getTotalCount() {
			return (long)dict.size();
		}
		
		@Override
		public Iterator<IValue> iterator() {
			return new Iterator<IValue>() {

				Iterator<Entry<TextValue, IValue>> iterator = dict.entrySet().iterator();
				
				@Override
				public boolean hasNext() {
					return iterator.hasNext();
				}
	
				@Override
				public KVPValue next() {
					return new KVPValue(iterator.next());
				}
	
				@Override
				public void remove() {
					iterator.remove();
				}
			};

		}

	}

	static class KVPValue extends BaseValue {
		Entry<TextValue, IValue> kvp;

		public KVPValue(Entry<TextValue, IValue> kvp) {
			super(null); // TODO, check that this is not a problem
			this.kvp = kvp;
		}

		@Override
		public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
			String name = id.toString();
			if ("key".equals(name))
				return kvp.getKey();
			else if ("value".equals(name))
				return kvp.getValue();
			else
				throw new SyntaxError("No such member:" + name);
		}
		
	}
}
