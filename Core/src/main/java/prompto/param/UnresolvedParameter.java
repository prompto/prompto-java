package prompto.param;

import java.lang.reflect.Type;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.StackLocal;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class UnresolvedParameter extends BaseParameter implements INamedParameter {

	INamedParameter resolved = null;
	
	public UnresolvedParameter(Identifier id) {
		super(id);
	}
	
	public INamedParameter getResolved() {
		return resolved;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return getId().toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public void check(Context context) {
		resolve(context);
		resolved.check(context);
	}
	
	@Override
	public String getProto() {
		return id.toString();
	}
	
	@Override
	public IType getType(Context context) {
		resolve(context);
		return resolved.getType(context);
	}
	
	@Override
	public void register(Context context) {
		resolve(context);
		resolved.register(context);
	}
	
	@Override
	public IValue checkValue(Context context, IExpression value) {
		resolve(context);
		return resolved.checkValue(context, value);
	}
	
	private void resolve(Context context) {
		if(resolved!=null) 
			return;
		IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(named instanceof AttributeDeclaration)
			resolved = new AttributeParameter(id);
		else if(named instanceof MethodDeclarationMap)
			resolved = new MethodParameter(id);
		else
			throw new SyntaxError("Unknown identifier: " + id);
	}
	
	@Override
	public Type getJavaType(Context context) {
		resolve(context);
		return resolved.getJavaType(context);
	}
	
	@Override
	public StackLocal registerLocal(Context context, MethodInfo method, Flags flags) {
		resolve(context);
		return resolved.registerLocal(context, method, flags);
	}
	
	@Override
	public void extractLocal(Context context, MethodInfo method, Flags flags) {
		resolve(context);
		resolved.extractLocal(context, method, flags);
	}
	
	@Override
	public void compileArgument(Context context, MethodInfo method, Flags flags, ArgumentList assignments, boolean isFirst) {
		resolve(context);
		resolved.compileArgument(context, method, flags, assignments, isFirst);
	}
	
	@Override
	public String getTranspiledName(Context context) {
	    resolve(context);
	    return resolved.getTranspiledName(context);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    resolve(transpiler.getContext());
	    resolved.declare(transpiler);
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
	    resolve(transpiler.getContext());
	    resolved.transpile(transpiler);
	}

	@Override
	public void transpileCall(Transpiler transpiler, IExpression expression) {
	    resolve(transpiler.getContext());
	    resolved.transpileCall(transpiler, expression);
	}

}
