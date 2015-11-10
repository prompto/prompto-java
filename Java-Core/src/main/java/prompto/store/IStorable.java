package prompto.store;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.IValue;


public interface IStorable extends IStored {

	void setDirty(boolean dirty);
	boolean isDirty();
	void setValue(Context context, Identifier name, IValue value);
	void setData(String name, Object value);

}
