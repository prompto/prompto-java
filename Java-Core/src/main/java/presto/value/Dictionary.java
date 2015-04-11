package presto.value;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.CollectionType;
import presto.type.DictType;
import presto.type.IType;
import presto.type.TextType;

public class Dictionary extends BaseValue implements ICollection<IValue> {

	Map<Text, IValue> dict;

	public Dictionary(IType itemType) {
		super(new DictType(itemType));
		dict = new HashMap<Text, IValue>();
	}

	public Dictionary(Dictionary from) {
		this(((CollectionType) from.type).getItemType(), from.dict);
	}

	public Dictionary(IType itemType, Map<Text, IValue> dict) {
		super(new DictType(itemType));
		this.dict = dict;
	}

	public static Dictionary merge(Dictionary dict1, Dictionary dict2) {
		Map<Text, IValue> dict = new HashMap<Text, IValue>();
		dict.putAll(dict1.dict);
		dict.putAll(dict2.dict);
		return new Dictionary(((CollectionType) dict1.type).getItemType(), dict); // TODO
																					// check
																					// type
																					// fungibility
	}

	public long length() {
		return dict.size();
	}

	@Override
	public boolean isEmpty() {
		return dict.isEmpty();
	}

	public IValue Add(Context context, IValue value) throws PrestoError {
		if (value instanceof Dictionary)
			return merge(this, (Dictionary) value);
		else
			throw new SyntaxError("Illegal: Dict + "
					+ value.getClass().getSimpleName());
	}

	public boolean hasItem(Context context, IValue value) throws SyntaxError {
		if (value instanceof Text)
			return this.dict.containsKey((Text) value);
		else
			throw new SyntaxError("Only Text key instanceof supported by "
					+ this.getClass().getSimpleName());
	}

	@SuppressWarnings("unchecked")
	public IValue getMember(Context context, Identifier id) throws PrestoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(this.dict.size());
		else if ("keys".equals(name)) {
			IType type = TextType.instance();
			Set<IValue> values = (Set<IValue>) (Object) this.dict.keySet();
			return new SetValue(type, values);
		} else if ("values".equals(name)) {
			IType itemType = ((CollectionType) this.type).getItemType();
			Collection<IValue> values = this.dict.values();
			return new ListValue(itemType, values);
		} else
			return super.getMember(context, id);
	}

	public IValue getItem(Context context, IValue index) throws PrestoError {
		if (index instanceof Text)
			return dict.get((Text) index);
		else
			throw new SyntaxError("No such item:" + index.toString());
	}

	public Object ConvertTo(Class<?> type) {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dictionary))
			return false;
		return dict.equals(((Dictionary) obj).dict);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (Entry<Text, IValue> kvp : this.dict.entrySet()) {
			sb.append(kvp.getKey().toString());
			sb.append(":");
			sb.append(kvp.getValue().toString());
			sb.append(", ");
		}
		if (sb.length() > 2)
			sb.setLength(sb.length() - 2);
		sb.append("}");
		return sb.toString();
	}

	public Iterable<IValue> getItems(Context context) {
		return new KVPIterable(context);
	}

	class KVPIterable implements Iterable<IValue> {

		Context context;

		public KVPIterable(Context context) {
			this.context = context;
		}

		@Override
		public Iterator<IValue> iterator() {
			return new KVPIterator();
		}

		class KVPIterator implements Iterator<IValue> {

			Iterator<Entry<Text, IValue>> iterator = dict.entrySet().iterator();

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

		}

	}

	static class KVPValue extends BaseValue {
		Entry<Text, IValue> kvp;

		public KVPValue(Entry<Text, IValue> kvp) {
			super(null); // TODO, check that this is not a problem
			this.kvp = kvp;
		}

		@Override
		public IValue getMember(Context context, Identifier id) throws PrestoError {
			String name = id.toString();
			if ("key".equals(name))
				return kvp.getKey();
			else if ("value".equals(name))
				return kvp.getValue();
			else
				throw new InvalidDataError("No such member:" + name);
		}
	}
}
