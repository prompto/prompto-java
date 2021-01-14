package prompto.value;

public interface INumberValue extends IValue, Comparable<INumberValue>
{
    long longValue();
    double doubleValue();
}

