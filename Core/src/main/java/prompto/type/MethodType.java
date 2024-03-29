package prompto.type;

import java.lang.reflect.Type;
import java.util.Objects;

import prompto.compiler.CompilerUtils;
import prompto.compiler.NamedType;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.ClosureContext;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class MethodType extends BaseType {

	IMethodDeclaration method;
	
	public MethodType(IMethodDeclaration method) {
		super(Family.METHOD);
		this.method = method;
	}
	
	public IMethodDeclaration getMethod() {
		return method;
	}
	
	@Override
	public String getTypeName() {
		return method.getName();
	}
	
	@Override
	public Identifier getTypeNameId() {
		return method.getId();
	}
	
	
	@Override
	public Type toJavaType(Context context) {
		if(method.getClosureOf()!=null && method.getMemberOf()!=null)
			return getMemberClosureJavaType(context);
		else if(method.getMemberOf()!=null)
			return getMemberJavaType(context);
		else if(method.getClosureOf()!=null)
			return getClosureJavaType(context);
		else
			return CompilerUtils.getGlobalMethodType(method.getId());
	}
	
	private Type getMemberClosureJavaType(Context context) {
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	private Type getMemberJavaType(Context context) {
		Type outer = CompilerUtils.getCategoryConcreteType(method.getMemberOf().getId()); 
		return new NamedType(outer.getTypeName() + '$' + method.getName());
	}

	private Type getClosureJavaType(Context context) {
		if(method.getClosureOf() instanceof IMethodDeclaration) {
			IMethodDeclaration embedding = (IMethodDeclaration)method.getClosureOf();
			if(embedding.getMemberOf()==null) {
				Type outer = CompilerUtils.getGlobalMethodType(embedding.getId()); 
				return new NamedType(outer.getTypeName() + '$' + method.getName());
			} else {
				Type outer = CompilerUtils.getCategoryConcreteType(embedding.getMemberOf().getId()); 
				return new NamedType(outer.getTypeName() + '$' + embedding.getName() + '$' + method.getName());
			}
		} else
			throw new IllegalStateException("Should never get there!");
	}
	
	/*
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return other==this || (other instanceof MethodType && this.isAssignableFrom(context, (MethodType)other));
	}
	

	public boolean isAssignableFrom(Context context, MethodType other) {
		if(other==this)
			return true;
		else if(other==null)
			return false;
		else {
			ParameterList these = method.getParameters();
			ParameterList others = other.method.getParameters();
			return these.isAssignableFrom(context, others);
		}
	}
	*/
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof MethodType && ((MethodType)other).equals(this));
	}
	
	
	public boolean equals(MethodType other) {
		if(other==this)
			return true;
		else if(other==null)
			return false;
		else  {
			try {
				String thisProto = this.method.getProto();
				String otherProto = other.method.getProto();
				return Objects.equals(thisProto, otherProto);
			} catch (SyntaxError e) {
				return false;
			}
		}
	}
	
	@Override
	public void checkUnique(Context context) {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, method.getId());
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + method.getId() + "\"");
	}
	
	@Override
	public void checkExists(Context context) {
		// nothing to do
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		if(context instanceof ClosureContext) {
			INamed named = context.getRegistered(name);
			if(named!=null)
				return named.getType(context);
		}
		return super.checkMember(context, name);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}

	public IType checkArrowExpression(Context context, ArrowExpression expression) {
		context = context.newChildContext();
		this.method.registerParameters(context);
		expression.checkReturnType(context, method.getReturnType());
		return this;
	}

	public void declareArrowExpression(Transpiler transpiler, ArrowExpression expression) {
		transpiler = transpiler.newChildTranspiler();
		this.method.registerParameters(transpiler.getContext());
		expression.declare(transpiler);
	}

	public void transpileArrowExpression(Transpiler transpiler, ArrowExpression expression) {
		transpiler = transpiler.newChildTranspiler();
		transpiler.append("(function(");
		expression.transpileArguments(transpiler);
		transpiler.append(") {");
		this.method.registerParameters(transpiler.getContext());
		expression.transpile(transpiler);
		transpiler.append("}).bind(this)");
		transpiler.flush();
	}

	public void transpileMethodType(Transpiler transpiler) {
		this.method.transpileMethodType(transpiler);
	}



}
