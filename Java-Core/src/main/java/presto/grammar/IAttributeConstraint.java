package presto.grammar;

import presto.error.PrestoError;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.IValue;

public interface IAttributeConstraint {

	void checkValue(Context context, IValue value) throws PrestoError;
	void toDialect(CodeWriter writer);

}
