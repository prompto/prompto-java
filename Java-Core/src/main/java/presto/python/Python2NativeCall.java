package presto.python;

import presto.utils.CodeWriter;

public class Python2NativeCall extends PythonNativeCall {

	public Python2NativeCall(PythonStatement statement) {
		super(statement);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Python2: ");
		super.toDialect(writer);
	}
	
	
}
