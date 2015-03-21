package presto.value;

import presto.error.PrestoError;

public interface ISliceable<T extends IValue> extends IValue
{
    ISliceable<T> slice(Integer fi, Integer li) throws PrestoError;
}

