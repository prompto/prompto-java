package prompto.value;

import prompto.error.PromptoError;
import prompto.runtime.Context;

public interface IContainer<T extends IValue> extends ICursor<T>
{
    boolean hasItem(Context context, IValue iValue) throws PromptoError;
    T getItem(Context context, IValue item) throws PromptoError;
}

