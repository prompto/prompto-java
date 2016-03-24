package prompto.store;

import java.lang.reflect.Type;
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
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.TextType;
import prompto.value.Boolean;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.ListValue;
import prompto.value.Text;
import prompto.value.TupleValue;

/* a utility class for running unit tests only */
public final class MemStore implements IStore<Long> {

	private Map<Integer, StorableDocument> documents = new HashMap<>();
	private long lastDbId = 0;
	
	@Override
	public Type getDbIdType() {
		return Long.class;
	}
	
	@Override
	public Type getColumnType(String name) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void createOrUpdateColumns(Collection<AttributeDeclaration> columns) {
		// nothing to do
	}
	
	@Override
	public void store(Collection<Long> deletables, Collection<IStorable> storables) throws PromptoError {
		for(IStorable storable : storables) {
			if(!(storable instanceof StorableDocument))
				throw new IllegalStateException("Expecting a StorableDocument");
			store((StorableDocument)storable);
		}
	}
	
	public void store(StorableDocument storable) throws PromptoError {
		// ensure db id
		IValue dbId = storable.getValue(dbIdIdentifier);
		if(!(dbId instanceof Integer)) {
			dbId = new Integer(++lastDbId);
			storable.setValue(dbIdIdentifier, dbId);
		}
		documents.put((Integer)dbId, storable);
	}
	
	@Override
	public PromptoBinary fetchBinary(Long dbId, String attr) {
		for(StorableDocument doc : documents.values()) {
			Object data = doc.getData(IStore.dbIdName);
			if(data==null || !dbId.equals(data.toString()))
				continue;
			data = doc.getData("attr");
		}
		return null;
	}
	
	@Override
	public void delete(Collection<Long> dbIds) throws PromptoError {
		for(Object dbId : dbIds)
			documents.remove(dbId);
	}
	
	@Override
	public void deleteAll() throws PromptoError {
		documents = new HashMap<>();
	}
	
	static interface MemStoreQuery extends IQuery {

		boolean matches(StorableDocument doc) throws PromptoError;

		List<StorableDocument> sort(List<StorableDocument> docs) throws PromptoError;

		List<StorableDocument> slice(List<StorableDocument> docs) throws PromptoError;
		
	}

	@Override
	public IQueryBuilder<Long> getQueryBuilder(Context context, boolean compiled) {
		return new IQueryBuilder<Long>() {
		
			@Override
			public IQuery buildFetchOneQuery(CategoryType type, IExpression filter) throws PromptoError {
				return new MemStoreQuery() {
					@Override
					public boolean matches(StorableDocument doc) throws PromptoError {
						return MemStore.this.matches(context, doc, type, filter);
					}
					@Override
					public List<StorableDocument> sort(List<StorableDocument> docs) throws PromptoError {
						throw new UnsupportedOperationException();
					}
					@Override
					public List<StorableDocument> slice(List<StorableDocument> docs) throws PromptoError {
						throw new UnsupportedOperationException();
					}
				};
			}
			
			@Override
			public IQuery buildFetchManyQuery(CategoryType type, IExpression start,
					IExpression end, IExpression filter, OrderByClauseList orderBy)
					throws PromptoError {
				return new MemStoreQuery() {
					@Override
					public boolean matches(StorableDocument doc) throws PromptoError {
						return MemStore.this.matches(context, doc, type, filter);
					}
					@Override
					public List<StorableDocument> sort(List<StorableDocument> docs) throws PromptoError {
						return MemStore.this.sort(context, docs, orderBy);
					}
					@Override
					public List<StorableDocument> slice(List<StorableDocument> docs) throws PromptoError {
						return MemStore.this.slice(context, docs, start, end);
					}
				};
			}
	
		};
	}
	
	
	@Override
	public IStored fetchUnique(Long dbId) throws PromptoError {
		return documents.get(dbId);
	}
	
	@Override
	public IStored fetchOne(IQuery query) throws PromptoError {
		MemStoreQuery mquery = (MemStoreQuery)query;
		for(StorableDocument doc : documents.values()) {
			if(mquery.matches(doc))
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
		ListValue list = (ListValue) doc.getValue(new Identifier("category"));
		return list==null ? false : list.hasItem(context, new Text(type.getTypeName()));
	}
	
	@Override
	public IStoredIterator fetchMany(IQuery query) throws PromptoError {
		final List<StorableDocument> docs = fetchManyDocs((MemStoreQuery)query);
		final Iterator<StorableDocument> iter = docs.iterator();
		return new IStoredIterator() {
			@Override public boolean hasNext() { return iter.hasNext(); }
			@Override public IStored next() { return iter.next(); }
			@Override public long length() { return docs.size(); }
		};
	}

	private List<StorableDocument> fetchManyDocs(MemStoreQuery query) throws PromptoError {
		List<StorableDocument> docs = filterDocs(query);
		docs = query.sort(docs);
		docs = query.slice(docs);
		return docs;
	}

	private List<StorableDocument> filterDocs(MemStoreQuery query) throws PromptoError {
		// create list of filtered docs
		List<StorableDocument> docs = new ArrayList<StorableDocument>();
		List<StorableDocument> all = new ArrayList<>(documents.values()); // need a copy to avoid concurrent modification
		for(StorableDocument doc : all) {
			if(query.matches(doc))
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
				throw new SyntaxError("Expecting an integer, got " + value.getType().getTypeName());
			startValue = ((Integer)value).longValue();
		}
		if(end!=null) {
			IValue value = end.interpret(context);
			if(value==null)
				throw new NullReferenceError();
			else if(!(value instanceof Integer))
				throw new SyntaxError("Expecting an integer, got " + value.getType().getTypeName());
			endValue = ((Integer)value).longValue();
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
			return getValue(dbIdIdentifier);
		}
		
		@Override
		public IValue getOrCreateDbId() {
			IValue dbId = getValue(dbIdIdentifier);
			if(dbId==null) {
				setDirty(true);
				dbId = new Integer(++lastDbId);
				document.setMember(null, dbIdIdentifier, dbId);
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
				doc.setMember(new Identifier("category"), value);
			}
			return doc;
		}

		@Override
		public boolean isDirty() {
			return document!=null;
		}

		@Override
		public IValue getValue(Identifier name) {
			if(document==null)
				return null;
			else
				return document.getMember(name, false);
		}
		
		@Override
		public void setValue(Identifier name, IValue value, IDbIdProvider provider) {
			if(document==null)
				document = newDocument();
			if(value instanceof StorableDocument)
				value = ((StorableDocument)value).document;
			document.setMember(name, value);
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
