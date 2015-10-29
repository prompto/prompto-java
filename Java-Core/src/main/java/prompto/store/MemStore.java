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
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.value.Boolean;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.TupleValue;

/* a utility class for running unit tests only */
public final class MemStore implements IStore {

	private Map<Integer, Document> documents = new HashMap<>();
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
	public void store(Context context, Document document) {
		IValue dbId = document.getMember(context, dbIdName, false);
		if(!(dbId instanceof Integer)) {
			dbId = new Integer(++lastDbId);
			document.setMember(context, dbIdName, dbId);
		}
		documents.put((Integer)dbId, document);
	}
	
	@Override
	public Document fetchOne(Context context, IExpression filter) throws PromptoError {
		for(Document doc : documents.values()) {
			if(matches(context, doc, filter))
				return doc;
		}
		return null;
	}
	
	private boolean matches(Context context, Document doc, IExpression filter) throws PromptoError {
		if(filter==null)
			return true;
		Context local = context.newDocumentContext(doc);
		IValue test = filter.interpret(local);
		if(!(test instanceof Boolean))
			throw new InternalError("Illegal test result: " + test);
		return ((Boolean)test).getValue();
	}

	@Override
	public IDocumentIterator fetchMany(Context context, IExpression start, IExpression end, 
									IExpression filter, OrderByClauseList orderBy) throws PromptoError {
		
		final List<Document> docs = fetchManyDocs(context, start, end, filter, orderBy);
		final Iterator<Document> iter = docs.iterator();
		return new IDocumentIterator() {
			@Override public boolean hasNext() { return iter.hasNext(); }
			@Override public Document next() { return iter.next(); }
			@Override public long length() { return docs.size(); }
		};
	}

	private List<Document> fetchManyDocs(Context context, IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError {
		List<Document> docs = filterDocs(context, filter);
		// sort it if required
		docs = sort(context, docs, orderBy);
		// slice it if required
		docs = slice(context, docs, start, end);
		// done
		return docs;
	}

	private List<Document> filterDocs(Context context, IExpression filter) throws PromptoError {
		// create list of filtered docs
		List<Document> docs = new ArrayList<Document>();
		for(Document doc : documents.values()) {
			if(matches(context, doc, filter))
				docs.add(doc);
		}
		return docs;
	}

	private List<Document> slice(Context context, List<Document> docs, IExpression start, IExpression end) throws PromptoError {
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
				throw new SyntaxError("Expecting an integer, got " + value.getType().getName().getName());
			startValue = ((Integer)value).IntegerValue();
		}
		if(end!=null) {
			IValue value = end.interpret(context);
			if(value==null)
				throw new NullReferenceError();
			else if(!(value instanceof Integer))
				throw new SyntaxError("Expecting an integer, got " + value.getType().getName().getName());
			endValue = ((Integer)value).IntegerValue();
		}
		if(startValue==null || startValue<1)
			startValue = 1L;
		if(endValue==null || endValue>docs.size())
			endValue = new Long(docs.size());
		if(startValue>docs.size() || startValue > endValue)
			return new ArrayList<Document>();
		return docs.subList(startValue.intValue() - 1, endValue.intValue());
	}

	private List<Document> sort(Context context, List<Document> docs, OrderByClauseList orderBy) {
		if(orderBy!=null) {
			Collection<java.lang.Boolean> directions = collectDirections(orderBy);
			docs.sort(new Comparator<Document>() {

				@Override
				public int compare(Document o1, Document o2) {
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

	private TupleValue readValue(Context context, Document doc, OrderByClauseList orderBy) throws PromptoError {
		TupleValue tuple = new TupleValue();
		for(OrderByClause clause : orderBy)
			tuple.addItem(readValue(context, doc, clause));
		return tuple;
	}

	private IValue readValue(Context context, Document doc, OrderByClause clause) throws PromptoError {
		IValue source = doc;
		IValue value = null;
		for(Identifier name : clause.getNames()) {
			if(!(source instanceof Document))
				return null;
			value = source.getMember(context, name);
			source = value;
		}
		return value;
	}
	
	
}
