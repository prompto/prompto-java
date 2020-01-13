package prompto.expression;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;

public class SuperExpression extends ThisExpression {

	@Override
	public String toString() {
		return "super";
	}
	
	@Override
	public IType check(Context context) {
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
	
	/*
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(context!=null && !(context instanceof Context.InstanceContext))
			context = context.getClosestInstanceContext();
		if( context instanceof Context.InstanceContext) {
			IType type = ((Context.InstanceContext)context).getInstanceType();
			if(type instanceof CategoryType) {
				CategoryType superType = ((CategoryType)type).getSuperType(this, context);
				IInstance instance = ((Context.InstanceContext)context).getInstance();
				if(instance instanceof ConcreteInstance)
					return ((ConcreteInstance)instance).withType(context, superType);
			}
		}
		throw new SyntaxError("Not in an instance context!");
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		StackLocal local = method.getRegisteredLocal("this");
		if(local==null)
			return null;
		CompilerUtils.compileALOAD(method, local);
		IType type = check(context);
		return new ResultInfo(type.getJavaType(context));	
	}
	
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("super");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("super");
		return false;
	}
	*/
}
