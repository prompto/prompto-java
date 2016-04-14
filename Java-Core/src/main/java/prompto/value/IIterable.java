package prompto.value;

import prompto.intrinsic.IterableWithLength;
import prompto.runtime.Context;

public interface IIterable<T extends IValue> extends IValue
{
    IterableWithLength<T> getIterable(Context context);
}

