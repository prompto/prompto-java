package prompto.value;

import java.util.List;

import prompto.intrinsic.IterableWithLengths;
import prompto.runtime.Context;
import prompto.store.IStorable;

public interface IIterable<T extends IValue> extends IValue
{
    IterableWithLengths<T> getIterable(Context context);
    default void collectStorables(List<IStorable> storables) {
    	throw new UnsupportedOperationException();
    }
}

