package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class CastExpression implements IExpression {
	
	IExpression expression;
	IType type;
	
	public CastExpression(IExpression expression, IType type) {
		this.expression = expression;
		this.type = type;
	}
	
	@Override
	public IType check(Context context) {
		IType actual = expression.check(context);
		if(!type.isAssignableTo(context, actual))
			throw new SyntaxError("Cannot cast " + actual.toString() + " to " + type.toString());
		return type;
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue value = expression.interpret(context);
		if(value!=null && type.isMoreSpecificThan(context, value.getType()))
			value.setType(type);
		return value;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		expression.compile(context, method, flags);
		ClassConstant c = new ClassConstant(type.getJavaType(context));
		method.addInstruction(Opcode.CHECKCAST, c);
		return new ResultInfo(type.getJavaType(context));
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case S:
			expression.toDialect(writer);
			writer.append(" as ");
			type.toDialect(writer);
			break;
		case O:
			writer.append("(");
			type.toDialect(writer);
			writer.append(")");
			expression.toDialect(writer);
			break;
		}
		
	}

}
