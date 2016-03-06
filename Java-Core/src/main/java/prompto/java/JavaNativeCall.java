package prompto.java;

import prompto.compiler.Compiler;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.statement.NativeCall;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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
		throw new RuntimeException("Should never get there!");
	}
	
	public IType checkNative(Context context, IType returnType) throws SyntaxError {
		return statement.check(context, returnType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		throw new RuntimeException("Should never get there!");
	}

	public IValue interpretNative(Context context, IType returnType) throws PromptoError {
		return statement.interpret(context, returnType);
	}

	@Override
	public void compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		statement.compile(context, compiler, method);
	}
}
