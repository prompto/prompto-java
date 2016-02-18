package prompto.value;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStored;
import prompto.store.IStoredIterator;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.type.IterableType;

import com.fasterxml.jackson.core.JsonGenerator;

public class Cursor extends BaseValue implements IIterable<IValue>, Iterable<IValue>, Iterator<IValue> {

	Context context;
	IStoredIterator documents;
	
	public Cursor(Context context, IType itemType, IStoredIterator documents) {
		super(new CursorType(itemType));
		this.context = context;
		this.documents = documents;
	}

	@Override
	public boolean isEmpty() {
		return length()==0;
	}

	@Override
	public long length() {
		return documents.length();
	}

	@Override
	public Iterable<IValue> getIterable(Context context) {
		return this;
	}
	
	@Override 
	public Iterator<IValue> iterator() {
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return documents.hasNext();
	}
	
	@Override
	public IValue next() {
		try {
			IStored stored = documents.next();
			CategoryType itemType = readItemType(stored);
			return itemType.newInstance(context, stored);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	private CategoryType readItemType(IStored stored) throws PromptoError {
		Object value = stored.getData("category");
		if(value instanceof List<?>) {
			List<String> categories = (List<String>)value;
			String category = categories.get(categories.size()-1);
			return new CategoryType(new Identifier(category));
		} else
			return (CategoryType) ((IterableType)type).getItemType();
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(length());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeStartArray();
			while(hasNext())
				next().toJson(context, generator, null, null);
			generator.writeEndArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}


}
