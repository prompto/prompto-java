package prompto.value;

import java.util.Iterator;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.ICursor;
import prompto.store.IDocumentIterator;
import prompto.type.CategoryType;
import prompto.type.CollectionType;
import prompto.type.CursorType;
import prompto.type.IType;

public class Cursor extends BaseValue implements ICursor<IValue>, Iterable<IValue>, Iterator<IValue> {

	Context context;
	IDocumentIterator documents;
	
	public Cursor(Context context, IType itemType, IDocumentIterator documents) {
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
			Document doc = documents.next();
			CategoryType itemType = (CategoryType) ((CollectionType)type).getItemType();
			return itemType.newInstance(context, doc);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public IValue getMember(Context context, Identifier id) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(length());
		else
			throw new InvalidDataError("No such member:" + name);
	}



}
