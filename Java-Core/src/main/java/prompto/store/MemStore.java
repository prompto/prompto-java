package prompto.store;

import java.util.HashSet;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.value.Boolean;
import prompto.value.Document;
import prompto.value.IValue;

/* a utility class for running unit tests only */
public final class MemStore implements IStore {

	static MemStore instance = new MemStore();
	
	public static MemStore getInstance() {
		return instance;
	}
	
	private Set<Document> instances = new HashSet<>();
	
	@Override
	public void store(Document document) {
		instances.add(document);
	}
	
	@Override
	public Document fetchOne(Context context, IExpression filter) throws PromptoError {
		for(Document doc : instances) {
			Context local = context.newDocumentContext(doc);
			IValue test = filter.interpret(local);
			if(!(test instanceof Boolean))
				throw new InternalError("Illegal test result: " + test);
			if(((Boolean)test).getValue())
				return doc;
		}
		return null;
	}
	
}
