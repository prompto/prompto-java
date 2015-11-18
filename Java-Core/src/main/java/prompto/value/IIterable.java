package prompto.value;

import prompto.runtime.Context;

public interface IIterable<T extends IValue> extends IValue
{
	boolean isEmpty();
	long length(); 
    Iterable<T> getIterable(Context context);
}

