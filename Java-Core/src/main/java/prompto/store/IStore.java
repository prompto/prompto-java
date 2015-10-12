package prompto.store;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.value.Document;

/* a mean to store and fetch facts */
public interface IStore {
	
	static IStore instance = null;
	
	public static IStore getInstance() {
		return instance;
	}

	void store(Document document) throws PromptoError;
	Document fetchOne(Context context, IExpression filter) throws PromptoError;
}
