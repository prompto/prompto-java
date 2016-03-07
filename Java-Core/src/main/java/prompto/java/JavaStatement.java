package prompto.java;

import prompto.compiler.Compiler;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.runtime.VoidResult;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class JavaStatement {

	JavaExpression expression;
	boolean isReturn;
	
	public JavaStatement(JavaExpression expression,boolean isReturn) {
		this.expression = expression;
		this.isReturn = isReturn;
	}

	public IType check(Context context, IType returnType) throws SyntaxError {
		IType type = expression.check(context);
		if(type instanceof JavaClassType) 
			type = ((JavaClassType)type).convertJavaClassToPromptoType(context, returnType);
		return isReturn ? type : VoidType.instance();
	}

	public IValue interpret(Context context, IType returnType) throws PromptoError {
		Object result = expression.interpret(context);
		if(result==null) 
			return isReturn ? VoidResult.instance() : null;
		else {	
            IType type = expression.check(context);
            if (type instanceof JavaClassType)
                return ((JavaClassType)type).convertJavaValueToPromptoValue(context, result, returnType);
            else
            	// TODO warning or exception?
            	return VoidResult.instance();
		}
	}
	
	@Override
	public String toString() {
		return "" + (isReturn ? "return " : "") + expression.toString() + ";";
	}

	public void toDialect(CodeWriter writer) {
		if(isReturn)
			writer.append("return ");
		expression.toDialect(writer);
		writer.append(';');
	}

	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		ResultInfo info = expression.compile(context, compiler, method);
		if(isReturn && info.getType()!=void.class) {
			method.addInstruction(Opcode.ARETURN);
			return info;
		} else
			return new ResultInfo(void.class, false);
	}
}
