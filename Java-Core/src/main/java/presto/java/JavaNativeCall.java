package presto.java;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.statement.NativeCall;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class JavaNativeCall extends NativeCall {

	JavaStatement statement;
	
	public JavaNativeCall(JavaStatement statement) {
		this.statement = statement;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Java: ");
		statement.toDialect(writer);
	}
	 
	@Override
	public String toString() {
		return statement.toString();
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return statement.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return statement.interpret(context);
	}

}
