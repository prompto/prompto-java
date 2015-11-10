package prompto.store;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.IValue;


public interface IStored {

	IValue getValue(Context context, Identifier name);
	Object getData(String name);
	
}
