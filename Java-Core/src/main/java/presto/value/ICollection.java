package presto.value;

import presto.error.PrestoError;
import presto.runtime.Context;

public interface ICollection<T extends IValue> extends IValue
{
	boolean isEmpty();
	long length(); 
    boolean hasItem(Context context, IValue iValue) throws PrestoError;
    T getItem(Context context, IValue item) throws PrestoError;
    Iterable<T> getItems(Context context);
}

