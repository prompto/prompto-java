package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.literal.TypeLiteral;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.ClosureValue;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;

public class MethodExpression implements IExpression {

	IExpression expression;

	public MethodExpression(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return expression.toString();
	}

	public IExpression getExpression() {
		return expression;
	}

	public TypeLiteral asTypeLiteral(Context context) {
		if (expression instanceof UnresolvedIdentifier) {
			Identifier id = ((UnresolvedIdentifier) expression).getId();
			return new TypeLiteral(new CategoryType(id));
		} else
			throw new RuntimeException();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if (writer.getDialect() == Dialect.E)
			writer.append("Method: ");
		if (expression instanceof UnresolvedIdentifier) {
			writer.append(expression.toString());
		} else if (expression instanceof UnresolvedSelector) {
			writer.append(expression.toString());
		} else
			throw new RuntimeException();
	}

	@Override
	public IType check(Context context) {
		IMethodDeclaration declaration = getDeclaration(context);
		if (declaration != null)
			return new MethodType(declaration);
		else
			throw new SyntaxError("Not a method:" + expression);
	}

	private IMethodDeclaration getDeclaration(Context context) {
		IExpression expression = this.expression;
		if(expression instanceof UnresolvedSelector) {
			IExpression parent = ((UnresolvedSelector)expression).getParent();
			if(parent != null) {
				IType type = parent.check(context);
				if(type instanceof CategoryType) {
					expression = new UnresolvedIdentifier(((UnresolvedSelector)expression).getId());
					context = context.newInstanceContext((CategoryType)type, true);
				} else
					return null; // TODO report problem
			}
		}
		if (expression instanceof UnresolvedIdentifier) {
			Identifier id = ((UnresolvedIdentifier) expression).getId();
			MethodDeclarationMap methods = context.getRegisteredDeclaration(MethodDeclarationMap.class, id);
			if (methods != null)
				return methods.getFirst(); 
			else
				return null;
		} else 
			throw new RuntimeException();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IExpression expression = this.expression;
		if(expression instanceof UnresolvedSelector) {
			IExpression parent = ((UnresolvedSelector)expression).getParent();
			if(parent != null) {
				IValue value = parent.interpret(context);
				if(value instanceof IInstance) {
					expression = new UnresolvedIdentifier(((UnresolvedSelector)expression).getId());
					context = context.newInstanceContext((IInstance)value, true);
				} else
					return NullValue.instance(); // TODO throw error
			}
		}
		if (expression instanceof UnresolvedIdentifier) {
			Identifier id = ((UnresolvedIdentifier) expression).getId();
			if (context.hasValue(id))
				return context.getValue(id);
			else {
				INamed named = context.getRegistered(id);
				if (named instanceof Context.MethodDeclarationMap) {
					ConcreteMethodDeclaration decl = (ConcreteMethodDeclaration) ((MethodDeclarationMap) named).values().iterator().next();
					MethodType type = new MethodType(decl);
					return new ClosureValue(context, type);
				} else
					throw new SyntaxError("No method with name:" + id);
			}
		} else
			throw new RuntimeException();
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		if(expression instanceof UnresolvedSelector)
			return compileUnresolvedSelector(context, method, flags, (UnresolvedSelector)expression);
		else if (expression instanceof UnresolvedIdentifier)
			return compileUnresolvedIdentifier(context, method, flags, (UnresolvedIdentifier)expression);
		else
			throw new RuntimeException();
	}
	
	private ResultInfo compileUnresolvedSelector(Context context, MethodInfo method, Flags flags, UnresolvedSelector expression) {
		IExpression parent = expression.getParent();
		if(parent != null) {
			IType parentType = parent.check(context);
			if(parentType instanceof CategoryType) {
		       	CategoryDeclaration category = (CategoryDeclaration)((CategoryType)parentType).getDeclaration(context);
				MethodDeclarationMap methods = category.getMemberMethods(context, expression.getId(), false);
				ConcreteMethodDeclaration proto = (ConcreteMethodDeclaration)methods.getFirst(); // TODO check prototype
				return proto.compileMethodInstance(context, method, flags, parent::compileParent);
			} else
				throw new SyntaxError("Not a method:" + expression);
		} else
			return compileUnresolvedIdentifier(context, method, flags, new UnresolvedIdentifier(expression.getId()));
	} 

	private ResultInfo compileUnresolvedIdentifier(Context context, MethodInfo method, Flags flags, UnresolvedIdentifier expression) {
		Identifier id = expression.getId();
		INamed named = context.getRegistered(id);
		if (named instanceof Context.MethodDeclarationMap) {
			ConcreteMethodDeclaration decl = (ConcreteMethodDeclaration) ((MethodDeclarationMap) named).getFirst();
			return decl.compileMethodInstance(context, method, flags);
		} else
			throw new SyntaxError("Not a method:" + expression);
	}

	@Override
	public void declare(Transpiler transpiler) {
		IExpression expression = this.expression;
		if(expression instanceof UnresolvedSelector) {
			IExpression parent = ((UnresolvedSelector)expression).getParent();
			if(parent != null) {
				IType parentType = parent.check(transpiler.getContext());
				if(parentType instanceof CategoryType) {
					parent.declare(transpiler);
					transpiler = transpiler.newInstanceTranspiler((CategoryType)parentType);
					expression = new UnresolvedIdentifier(((UnresolvedSelector)expression).getId());
				} else
					throw new RuntimeException();
			}
		}
		if (expression instanceof UnresolvedIdentifier) {
			Identifier id = ((UnresolvedIdentifier) expression).getId();
			INamed named = transpiler.getContext().getRegistered(id);
			if (named instanceof Context.MethodDeclarationMap) {
				IMethodDeclaration decl = ((MethodDeclarationMap) named).getFirst();
				// don't declare closures
				if (decl.getDeclarationOf() == null)
					decl.declare(transpiler);
			}
		} else
			throw new RuntimeException();
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		IExpression expression = this.expression;
		IExpression parent = null;
		if(expression instanceof UnresolvedSelector) {
			parent = ((UnresolvedSelector)expression).getParent();
			if(parent != null) {
				IType type = parent.check(transpiler.getContext());
				if(type instanceof CategoryType) {
					transpiler = transpiler.newInstanceTranspiler((CategoryType)type);
					expression = new UnresolvedIdentifier(((UnresolvedSelector)expression).getId());
				} else
					throw new RuntimeException();
			}
		}
		if (expression instanceof UnresolvedIdentifier) {
			Identifier id = ((UnresolvedIdentifier) expression).getId();
			INamed named = transpiler.getContext().getRegistered(id);
			if (named instanceof Context.MethodDeclarationMap) {
				Context context = transpiler.getContext().contextForValue(id);
				IMethodDeclaration decl = ((MethodDeclarationMap) named).getFirst();
				if (context instanceof InstanceContext) {
					if(parent!=null)
						parent.transpile(transpiler);
					else
						((InstanceContext) context).getInstanceType().transpileInstance(transpiler);
					transpiler.append(".");
				}
				transpiler.append(decl.getTranspiledName(transpiler.getContext()));
				// need to bind instance methods
				if (context instanceof InstanceContext) {
					transpiler.append(".bind(");
					if(parent!=null)
						parent.transpile(transpiler);
					else
						((InstanceContext) context).getInstanceType().transpileInstance(transpiler);
					transpiler.append(")");
				}
				transpiler.flush();
			}
			return false;
		} else
			throw new RuntimeException();

	}


}
