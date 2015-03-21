package presto.python;

import presto.utils.CodeWriter;

public interface PythonArgument {

	void toDialect(CodeWriter writer);

}
