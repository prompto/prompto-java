package prompto.value;

import prompto.error.PromptoError;
import prompto.runtime.Context;

public interface ICollection<T extends IValue> extends ICursor<T>
{
    boolean hasItem(Context context, IValue iValue) throws PromptoError;
    T getItem(Context context, IValue item) throws PromptoError;
}

