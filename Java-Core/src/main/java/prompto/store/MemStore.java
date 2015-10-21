package prompto.store;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.value.Boolean;
import prompto.value.Document;
import prompto.value.IValue;

/* a utility class for running unit tests only */
public final class MemStore implements IStore {

	private Set<Document> documents = new HashSet<>();
	
	@Override
	public void store(Document document) {
		documents.add(document);
	}
	
	@Override
	public Document fetchOne(Context context, IExpression filter) throws PromptoError {
		for(Document doc : documents) {
			if(matches(context, doc, filter))
				return doc;
		}
		return null;
	}
	
	private boolean matches(Context context, Document doc, IExpression filter) throws PromptoError {
		Context local = context.newDocumentContext(doc);
		IValue test = filter.interpret(local);
		if(!(test instanceof Boolean))
			throw new InternalError("Illegal test result: " + test);
		return ((Boolean)test).getValue();
	}

	@Override
	public IDocumentIterator fetchMany(Context context, IExpression start, IExpression end, 
									IExpression filter, OrderByClauseList orderBy) throws PromptoError {
		
		// create list of filtered docs
		List<Document> docs = new ArrayList<Document>();
		for(Document doc : documents) {
			if(matches(context, doc, filter))
				docs.add(doc);
		}
		// sort it if required
		if(orderBy!=null)
			; // TODO
		// slice it if required
		if(start!=null) {
			// TODO
		}
		if(end!=null) {
			// TODO
		}
		return new IDocumentIterator() {
			Iterator<Document> iter = docs.iterator();
			@Override public boolean hasNext() { return iter.hasNext(); }
			@Override public Document next() { return iter.next(); }
		};
	}
	
}
