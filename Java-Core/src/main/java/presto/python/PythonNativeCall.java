package presto.python;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.statement.NativeCall;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public abstract class PythonNativeCall extends NativeCall {

	PythonStatement statement;
	
	public PythonNativeCall(PythonStatement statement) {
		this.statement = statement;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		statement.toDialect(writer);
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		return VoidType.instance(); // TODO
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		throw new RuntimeException("Should never get there!");
	}

}
