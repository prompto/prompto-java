package presto.value;

public interface IRangeable<T extends IValue>
{
    IRange<T> NewRange();
}

