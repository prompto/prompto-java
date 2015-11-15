package prompto.store;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.IValue;


public interface IStorable extends IStored {

	void setDirty(boolean dirty);
	boolean isDirty();
	void setValue(Context context, Identifier name, IValue value) throws PromptoError;
	void setData(String name, Object value) throws PromptoError;

}
