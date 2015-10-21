package prompto.value;

import prompto.runtime.Context;

public interface ICursor<T extends IValue> extends IValue
{
	boolean isEmpty();
	long length(); 
    Iterable<T> getItems(Context context);
}

