package prompto.value;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import prompto.intrinsic.IterableWithCounts;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.AnyType;

public interface IIterable<T extends IValue> extends IValue
{
    IterableWithCounts<T> getIterable(Context context);
    default void collectStorables(List<IStorable> storables) {
    	throw new UnsupportedOperationException();
    }
    @Override
    default IValue toDocumentValue(Context context) {
    	// TODO create PromptoList collector
		List<IValue> values = StreamSupport.stream(getIterable(context).spliterator(), false)
				.map(value->value.toDocumentValue(context))
				.collect(Collectors.toList());
    	return new ListValue(AnyType.instance(), values);
    }
}

