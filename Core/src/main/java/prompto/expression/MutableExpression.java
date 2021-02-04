package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.IMutable;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;

public class MutableExpression extends CodeSection implements IExpression {

	IExpression source;
	
	public MutableExpression(IExpression source) {
		this.source = source;
	}

	@Override
	public CategoryType check(Context context) {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof CategoryType))
			 throw new SyntaxError("Expected a category instance, got:" + sourceType.toString());
		return new CategoryType((CategoryType)sourceType, true);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue value = source.interpret(context);
		if(value==null || value==NullValue.instance())
			throw new NullReferenceError();
		if(value instanceof IInstance)
			return ((IInstance)value).toMutable();
		else
			 throw new SyntaxError("Expected a category instance, got:" + value.getType().toString());
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		source.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		source.transpile(transpiler);
		transpiler.append(".toMutable()");
		return false;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo result = source.compile(context, method, flags);
		IOperand operand = new InterfaceConstant(IMutable.class, "toMutable", IMutable.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, operand);
		ClassConstant c = new ClassConstant(result.getType());
		method.addInstruction(Opcode.CHECKCAST, c);
		return new ResultInfo(result.getType());

	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("mutable ");
		source.toDialect(writer);
	}
	
	
}
