package prompto.store;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.value.IValue;


public interface IStored {

	IValue getValue(Identifier name) throws PromptoError;
	Object getData(String name) throws PromptoError;
	IValue getDbId();
	
}
