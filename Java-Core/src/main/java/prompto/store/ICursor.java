package prompto.store;

import prompto.runtime.Context;
import prompto.value.IValue;

public interface ICursor<T extends IValue> extends IValue
{
	boolean isEmpty();
	long length(); 
    Iterable<T> getItems(Context context);
}

