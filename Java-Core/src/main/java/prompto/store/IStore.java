package prompto.store;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.utils.ISingleton;
import prompto.value.Document;

/* a mean to store and fetch facts */
public interface IStore {
	
	static ISingleton<IStore> instance = new ISingleton<IStore>() {
		IStore instance = new MemStore();
		@Override public void set(IStore instance) { this.instance = instance; }
		@Override public IStore get() { return instance; }
	};
	
	static void setInstance(IStore store) {
		instance.set(store);
	}

	public static IStore getInstance() {
		return instance.get();
	}

	void store(Document document) throws PromptoError;
	Document fetchOne(Context context, IExpression filter) throws PromptoError;
	IDocumentIterator fetchMany(Context context, IExpression start, IExpression end, 
			IExpression filter, OrderByClauseList orderBy) throws PromptoError;
}
