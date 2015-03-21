package presto.python;

import presto.utils.CodeWriter;

public class Python3NativeCall extends PythonNativeCall {

	public Python3NativeCall(PythonStatement statement) {
		super(statement);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Python3: ");
		super.toDialect(writer);
	}

}
