package prompto.value;

import java.util.List;

public interface IListable<T extends IValue> {
	T newInstance(List<IValue> values);
}
