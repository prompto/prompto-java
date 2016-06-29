package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.ClosureValue;
import prompto.value.IValue;

public class MethodExpression implements IExpression {

	Identifier id;
	
	public MethodExpression(Identifier id) {
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.E)
			writer.append("Method: ");
		writer.append(id);
	}
	
	@Override
	public IType check(Context context) {
		IMethodDeclaration declaration = getDeclaration(context);
		if(declaration!=null)
			return new MethodType(declaration);
		else
			throw new SyntaxError("No method with name:" + id);
	}
	
	private IMethodDeclaration getDeclaration(Context context) {
		MethodDeclarationMap methods = context.getRegisteredDeclaration(MethodDeclarationMap.class, id);
		if(methods!=null)
			return (IMethodDeclaration)(methods.values().iterator().next());
		else
			return null;
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(context.hasValue(id))
			return context.getValue(id);
		INamed named = context.getRegistered(id);
		if(named instanceof Context.MethodDeclarationMap) {
			ConcreteMethodDeclaration decl = (ConcreteMethodDeclaration)((MethodDeclarationMap)named).values().iterator().next();
			MethodType type = new MethodType(decl);
			return new ClosureValue(context, type);
		} else
			throw new SyntaxError("No method with name:" + id);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		INamed named = context.getRegistered(id);
		if(named instanceof Context.MethodDeclarationMap) {
			ConcreteMethodDeclaration decl = (ConcreteMethodDeclaration)((MethodDeclarationMap)named).values().iterator().next();
			return decl.compileMethodInstance(context, method, flags);
		} else
			throw new SyntaxError("No method with name:" + id);
	}
	
}
