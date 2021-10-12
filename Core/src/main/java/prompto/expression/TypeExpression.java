package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.NamedType;
import prompto.compiler.ResultInfo;
import prompto.compiler.ResultInfo.Flag;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.TypeType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.TypeValue;

public class TypeExpression implements IExpression {

	IType type;
	
	public TypeExpression(IType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		type.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		type.checkExists(context);
		return new TypeType(type);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new TypeValue(type);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		// used in a type expression we want the class that holds this type
		ClassConstant c = new ClassConstant(getCompiledType(context));
		method.addInstruction(Opcode.LDC, c);
		return new ResultInfo(Class.class);
	}
	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		// caller will simply call a static method or field
		return new ResultInfo(getCompiledType(context), Flag.STATIC);
	}
	
	private NamedType getCompiledType(Context context) {
		return new NamedType(type.toJavaType(context).getTypeName());
	}
	
	public IType getType() {
		return type;
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		this.type.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		this.type.transpile(transpiler);
		return false;
	}

}
