package prompto.value;

import java.util.Iterator;

import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IDocumentIterator;
import prompto.type.CategoryType;
import prompto.type.CollectionType;
import prompto.type.CursorType;
import prompto.type.IType;

public class Cursor extends BaseValue implements ICursor<IValue>, Iterable<IValue>, Iterator<IValue> {

	IDocumentIterator documents;
	Context context;
	
	public Cursor(Context context, IType itemType, IDocumentIterator documents) {
		super(new CursorType(itemType));
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long length() {
		// TODO Auto-generated method stub
		return 0;
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

}
