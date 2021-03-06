package prompto.value;

import prompto.error.PromptoError;

public interface ISliceable<T extends IValue> extends IValue
{
    ISliceable<T> slice(IntegerValue fi, IntegerValue li) throws PromptoError;
}

