package prompto.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import prompto.declaration.AttributeDeclaration;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.TextType;
import prompto.value.Binary;
import prompto.value.Boolean;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;
import prompto.value.Text;
import prompto.value.TupleValue;

/* a utility class for running unit tests only */
public final class MemStore implements IStore {

	private Map<Integer, StorableDocument> documents = new HashMap<>();
	private long lastDbId = 0;
	
	@Override
	public IType getDbIdType() {
		return IntegerType.instance();
	}
	
	@Override
	public IType getColumnType(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeDeclaration> columns) {
		// nothing to do
	}
	
	static final Identifier dbIdName = new Identifier("dbId");
	
	@Override
	public void store(Context context, Collection<IStorable> storables) throws PromptoError {
		for(IStorable storable : storables) {
			if(!(storable instanceof StorableDocument))
				throw new IllegalStateException("Expecting a StorableDocument");
			store(context, (StorableDocument)storable);
		}
	}
	
	public void store(Context context, StorableDocument storable) throws PromptoError {
		// ensure db id
		IValue dbId = storable.getValue(context, dbIdName);
		if(!(dbId instanceof Integer)) {
			dbId = new Integer(++lastDbId);
			storable.setValue(context, dbIdName, dbId);
		}
		documents.put((Integer)dbId, storable);
	}
	
	@Override
	public Binary fetchBinary(String dbId, String attr) {
		for(StorableDocument doc : documents.values()) {
			Object data = doc.getData("dbId");
			if(data==null || !dbId.equals(data.toString()))
				continue;
			data = doc.getData("attr");
		}
		return null;
	}
	
	@Override
	public void deleteOne(Object dbId) throws PromptoError {
		documents.remove(dbId);
	}
	
	@Override
	public void deleteAll() throws PromptoError {
		documents = new HashMap<>();
	}
	
	
	@Override
	public IStored fetchUnique(Context context, IValue dbId) throws PromptoError {
		return documents.get(dbId);
	}
	
	@Override
	public IStored fetchOne(Context context, CategoryType type, IExpression filter) throws PromptoError {
		for(StorableDocument doc : documents.values()) {
			if(matches(context, doc, type, filter))
				return doc;
		}
		return null;
	}
	
	private boolean matches(Context context, StorableDocument doc, CategoryType type, IExpression filter) throws PromptoError {
		return matchesType(context, doc, type) && matchesFilter(context, doc, filter);
	}
	
	private boolean matchesFilter(Context context, StorableDocument doc, IExpression filter) throws PromptoError {
		if(filter==null)
			return true;
		Context local = context.newDocumentContext(doc.document, true);
		IValue test = filter.interpret(local);
		if(!(test instanceof Boolean))
			throw new InternalError("Illegal test result: " + test);
		return ((Boolean)test).getValue();
	}

	private boolean matchesType(Context context, StorableDocument doc, CategoryType type) throws PromptoError {
		if(type==null)
			return true;
		ListValue list = (ListValue) doc.getValue(context, new Identifier("category"));
		return list==null ? false : list.hasItem(context, new Text(type.getName()));
	}

	@Override
	public IStoredIterator fetchMany(Context context, CategoryType type, 
				IExpression start, IExpression end, 
				IExpression filter, OrderByClauseList orderBy) throws PromptoError {
		
		final List<StorableDocument> docs = fetchManyDocs(context, type, start, end, filter, orderBy);
		final Iterator<StorableDocument> iter = docs.iterator();
		return new IStoredIterator() {
			@Override public boolean hasNext() { return iter.hasNext(); }
			@Override public IStored next() { return iter.next(); }
			@Override public long length() { return docs.size(); }
		};
	}

	private List<StorableDocument> fetchManyDocs(Context context, CategoryType type, 
			IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError {
		List<StorableDocument> docs = filterDocs(context, type, filter);
		// sort it if required
		docs = sort(context, docs, orderBy);
		// slice it if required
		docs = slice(context, docs, start, end);
		// done
		return docs;
	}

	private List<StorableDocument> filterDocs(Context context, CategoryType type, IExpression filter) throws PromptoError {
		// create list of filtered docs
		List<StorableDocument> docs = new ArrayList<StorableDocument>();
		List<StorableDocument> all = new ArrayList<>(documents.values()); // need a copy to avoid concurrent modification
		for(StorableDocument doc : all) {
			if(matches(context, doc, type, filter))
				docs.add(doc);
		}
		return docs;
	}

	private List<StorableDocument> slice(Context context, List<StorableDocument> docs, IExpression start, IExpression end) throws PromptoError {
		if(docs.isEmpty())
			return docs;
		if(start==null && end==null)
			return docs;
		Long startValue = null;
		Long endValue = null;
		if(start!=null) {
			IValue value = start.interpret(context);
			if(value==null)
				throw new NullReferenceError();
			else if(!(value instanceof Integer))
				throw new SyntaxError("Expecting an integer, got " + value.getType().getId().getName());
			startValue = ((Integer)value).IntegerValue();
		}
		if(end!=null) {
			IValue value = end.interpret(context);
			if(value==null)
				throw new NullReferenceError();
			else if(!(value instanceof Integer))
				throw new SyntaxError("Expecting an integer, got " + value.getType().getId().getName());
			endValue = ((Integer)value).IntegerValue();
		}
		if(startValue==null || startValue<1)
			startValue = 1L;
		if(endValue==null || endValue>docs.size())
			endValue = new Long(docs.size());
		if(startValue>docs.size() || startValue > endValue)
			return new ArrayList<StorableDocument>();
		return docs.subList(startValue.intValue() - 1, endValue.intValue());
	}

	private List<StorableDocument> sort(Context context, List<StorableDocument> docs, OrderByClauseList orderBy) {
		if(orderBy!=null) {
			Collection<java.lang.Boolean> directions = collectDirections(orderBy);
			docs.sort(new Comparator<StorableDocument>() {

				@Override
				public int compare(StorableDocument o1, StorableDocument o2) {
					try {
						TupleValue v1 = readValue(context, o1, orderBy);
						TupleValue v2 = readValue(context, o2, orderBy);
						return v1.CompareTo(context, v2, directions);
					} catch (PromptoError e) {
						throw new RuntimeException(e);
					}
				}

			});
		}
		return docs;
	}
	
	private List<java.lang.Boolean> collectDirections(OrderByClauseList orderBy) {
		List<java.lang.Boolean> list = new ArrayList<>();
		for(OrderByClause clause : orderBy)
			list.add(clause.isDescending());
		return list;
	}

	private TupleValue readValue(Context context, StorableDocument doc, OrderByClauseList orderBy) throws PromptoError {
		TupleValue tuple = new TupleValue();
		for(OrderByClause clause : orderBy)
			tuple.addItem(readValue(context, doc, clause));
		return tuple;
	}

	private IValue readValue(Context context, StorableDocument doc, OrderByClause clause) throws PromptoError {
		IValue source = doc.document;
		IValue value = null;
		for(Identifier name : clause.getNames()) {
			if(!(source instanceof Document))
				return null;
			value = source.getMember(context, name, false);
			source = value;
		}
		return value;
	}
	
	@Override
	public IStorable newStorable(List<String> categories) {
		return new StorableDocument(categories);
	}
	
	class StorableDocument implements IStored, IStorable {

		Document document = null;
		List<String> categories;
		
		public StorableDocument(List<String> categories) {
			this.categories = categories;
		}

		@Override
		public IValue getDbId() {
			return getValue(null, dbIdName);
		}
		
		@Override
		public IValue getOrCreateDbId() {
			IValue dbId = getValue(null, dbIdName);
			if(dbId==null) {
				setDirty(true);
				dbId = new Integer(++lastDbId);
				document.setMember(null, dbIdName, dbId);
			}
			return dbId;
		}
		
		@Override
		public void setDirty(boolean set) {
			if(!set)
				document = null;
			else if(document==null)
				document = newDocument();
		}

		private Document newDocument() {
			Document doc = new Document();
			if(categories!=null) {
				ListValue value = new ListValue(TextType.instance());
				for(String name : categories)
					value.addItem(new Text(name));
				doc.setMember(null, new Identifier("category"), value);
			}
			return doc;
		}

		@Override
		public boolean isDirty() {
			return document!=null;
		}

		@Override
		public IValue getValue(Context context, Identifier name) {
			if(document==null)
				return null;
			else
				return document.getMember(context, name, false);
		}
		
		@Override
		public void setValue(Context context, Identifier name, IValue value, IDbIdProvider provider) {
			if(document==null)
				document = newDocument();
			if(value instanceof StorableDocument)
				value = ((StorableDocument)value).document;
			document.setMember(context, name, value);
		}
		
		@Override
		public Object getData(String name) {
			return document.getMember(null, new Identifier(name), false);
		}
		
		@Override
		public void setData(String name, Object value) {
			if(document==null)
				document = newDocument();
			if(value==null)
				document.setMember(null, new Identifier(name), null);
			else if(value instanceof StorableDocument)
				document.setMember(null, new Identifier(name), ((StorableDocument)value).document);
			else if(value instanceof IValue)
				document.setMember(null, new Identifier(name), (IValue)value);
			else
				throw new IllegalStateException();
		}

	}

	
}
