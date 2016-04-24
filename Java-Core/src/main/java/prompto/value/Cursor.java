package prompto.value;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLength;
import prompto.runtime.Context;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.type.IterableType;

import com.fasterxml.jackson.core.JsonGenerator;

public class Cursor extends BaseValue implements IIterable<IValue>, IterableWithLength<IValue> {

	Context context;
	IStoredIterable iterable;
	boolean mutable;
	
	public Cursor(Context context, IType itemType, IStoredIterable documents) {
		super(new CursorType(itemType));
		this.context = context;
		this.iterable = documents;
		this.mutable = itemType instanceof CategoryType ? ((CategoryType)itemType).isMutable() : false;
	}

	@Override
	public Object getStorableData() {
		throw new UnsupportedOperationException(); // can't be stored
	}
	
	@Override
	public Long getLength() {
		return iterable.length();
	}

	@Override
	public IterableWithLength<IValue> getIterable(Context context) {
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
		if ("length".equals(name))
			return new Integer(getLength());
		else
			throw new SyntaxError("No such member:" + name);
	}

	@Override
	public void toJson(Context context, JsonGenerator generator, Object instanceId, Identifier fieldName, Map<String, byte[]> data) {
		try {
			generator.writeStartArray();
			Iterator<IValue> iter = iterator();
			while(iter.hasNext())
				iter.next().toJson(context, generator, null, null, data);
			generator.writeEndArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}


}
