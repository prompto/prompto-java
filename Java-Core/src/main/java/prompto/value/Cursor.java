package prompto.value;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.ICursor;
import prompto.store.IStored;
import prompto.store.IStoredIterator;
import prompto.type.CategoryType;
import prompto.type.ContainerType;
import prompto.type.CursorType;
import prompto.type.IType;

public class Cursor extends BaseValue implements ICursor<IValue>, Iterable<IValue>, Iterator<IValue> {

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
	public Iterable<IValue> getItems(Context context) {
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
			CategoryType itemType = (CategoryType) ((ContainerType)type).getItemType();
			return itemType.newInstance(context, stored);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
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
	public void toJson(Context context, JsonGenerator generator) throws IOException, PromptoError {
		generator.writeStartArray();
		while(hasNext())
			next().toJson(context, generator);
		generator.writeEndArray();
	}


}
