package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.declaration.IDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
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
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new TypeValue(type);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ClassConstant c = new ClassConstant(new PromptoType(type.getJavaType(context).getTypeName()));
		method.addInstruction(Opcode.LDC, c);
		return new ResultInfo(Class.class);
	}
	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
		if(decl instanceof SingletonCategoryDeclaration)
			return compile(context, method, flags);
		else
			return IExpression.super.compileParent(context, method, flags);
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
