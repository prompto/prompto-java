package presto.java;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.runtime.VoidResult;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

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
			type = ((JavaClassType)type).convertNativeTypeToPrestoType(context, returnType);
		return isReturn ? type : VoidType.instance();
	}

	public IValue interpret(Context context, IType returnType) throws PrestoError {
		Object result = expression.interpret(context);
		if(result==null) 
			return isReturn ? VoidResult.instance() : null;
		else {	
            IType type = expression.check(context);
            if (type instanceof JavaClassType)
                return ((JavaClassType)type).convertJavaValueToPrestoValue(context, result, returnType);
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
}
