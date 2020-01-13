package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.ResultInfo.Flag;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public class SuperExpression extends ThisExpression {

	@Override
	public String toString() {
		return "super";
	}
	
	@Override
	public IType check(Context context) {
		return getSuperType(context);
	}
	

	private IType getSuperType(Context context) {
		if(context!=null && !(context instanceof Context.InstanceContext))
			context = context.getClosestInstanceContext();
		if( context instanceof Context.InstanceContext) {
			IType type = ((Context.InstanceContext)context).getInstanceType();
			if(type instanceof CategoryType)
				return ((CategoryType)type).getSuperType(this, context);
			else
				return type;
		} 
		throw new SyntaxError("Not in an instance context!");
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		StackLocal local = method.getRegisteredLocal("this");
		if(local==null)
			return null;
		CompilerUtils.compileALOAD(method, local);
		IType itype = check(context);
		Type type = CompilerUtils.getCategoryConcreteType(itype.getTypeNameId());
		return new ResultInfo(type, Flag.SUPER);	
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("super");
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IType type = getSuperType(transpiler.getContext());
		transpiler.append(type.getTranspiledName(transpiler.getContext())).append(".prototype");
		return false;
	}
}
