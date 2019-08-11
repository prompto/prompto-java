package prompto.grammar;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.MemberSelector;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.ContextualExpression;
import prompto.value.IInstance;

public class Argument {
	
	IParameter parameter;
	IExpression expression;
	
	public Argument(IParameter parameter, IExpression expression) {
		this.parameter = parameter;
		this.expression = expression;
	}
	
	
	public void setParameter(IParameter parameter) {
		this.parameter = parameter;
	}
	
	
	public IParameter getParameter() {
		return parameter;
	}

	public Identifier getParameterId() {
		return parameter==null ? null : parameter.getId();
	} 
	
	public IExpression getExpression() {
		return expression!=null ? expression : new InstanceExpression(parameter.getId());
	}

	public void setExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		if(parameter==null)
			return expression.toString();
		else if(expression==null)
			return parameter.getId().toString();
		else
			return parameter.getId() + " = " + expression.toString();
	}
	
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case M:
			toMDialect(writer);
			break;
		}
	}
	
	private void toODialect(CodeWriter writer) {
		toMDialect(writer);
	}

	private void toMDialect(CodeWriter writer) {
		if(expression==null)
			writer.append(parameter.getId());
		else {
			if(parameter!=null) {
				writer.append(parameter.getId());
				writer.append(" = ");
			}
			expression.toDialect(writer);
		}
	}

	private void toEDialect(CodeWriter writer) {
		if(expression==null)
			writer.append(parameter.getId());
		else {
			expression.toDialect(writer);
			if(parameter!=null) {
				writer.append(" as ");
				writer.append(parameter.getId());
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Argument))
			return false;
		Argument other = (Argument)obj;
		return this.getParameter().equals(other.getParameter())
				&& this.getExpression().equals(other.getExpression());
	}
	
	public IType check(Context context) {
		IExpression expression = getExpression();
		INamed actual = context.getRegisteredValue(INamed.class, parameter.getId());
		if(actual==null) {
			IType actualType = expression.check(context);
			context.registerValue(new Variable(parameter.getId(), actualType));
		} else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			IType newType = expression.check(context);
			actualType.checkAssignableFrom(context, newType);
		}
		return VoidType.instance();
	}
	
	public IExpression resolve(Context context, IMethodDeclaration methodDeclaration, boolean checkInstance, boolean allowDerived) throws PromptoError {
		IParameter parameter = findParameter(methodDeclaration);
		return resolve(context, parameter, checkInstance, allowDerived);
	}
	
	public IExpression resolve(Context context, IParameter parameter, boolean checkInstance, boolean allowDerived) throws PromptoError {
		// since we support implicit members, it's time to resolve them
		IExpression expression = getExpression();
		IType requiredType = parameter.getType(context);
		IType actualType = checkActualType(context, requiredType, expression, checkInstance);
		boolean assignable = requiredType.isAssignableFrom(context, actualType);
		// when in dispatch, allow derived
		if(!assignable && allowDerived)
	        assignable = actualType.isAssignableFrom(context, requiredType);
		// try passing category member
		if(!assignable && (actualType instanceof CategoryType)) 
			expression = new MemberSelector(expression, parameter.getId());
		return expression; 
	}

	public IType checkActualType(Context context, IType requiredType, IExpression expression, boolean checkInstance) {
		boolean isArrow = isArrowExpression(requiredType, expression);
		IType actualType = isArrow ? checkArrowExpression(context, (MethodType)requiredType, expression) : expression.check(context.getCallingContext());
		if(checkInstance && actualType instanceof CategoryType) {
			Object value = expression.interpret(context.getCallingContext());
			if(value instanceof IInstance)
				actualType = ((IInstance)value).getType();
		}
		return actualType;
	}


	private IType checkArrowExpression(Context context, MethodType requiredType, IExpression expression) {
		context = expression instanceof ContextualExpression ? ((ContextualExpression)expression).getCalling() : context.getCallingContext();
		ArrowExpression arrow = (ArrowExpression)(expression instanceof ArrowExpression ? expression : ((ContextualExpression)expression).getExpression());
		return requiredType.checkArrowExpression(context, arrow);
	}


	private boolean isArrowExpression(IType requiredType, IExpression expression) {
		if(!(requiredType instanceof MethodType))
			return false;
		if(expression instanceof ArrowExpression)
			return true;
		else
			return expression instanceof ContextualExpression && ((ContextualExpression)expression).getExpression() instanceof ArrowExpression;
	}


	private IParameter findParameter(IMethodDeclaration methodDeclaration) {
		return methodDeclaration.getParameters().find(this.parameter.getId());
	}


	public Argument resolveAndCheck(Context context, ParameterList argumentList) {
		IParameter parameter = this.parameter;
		// when 1st argument, can be unnamed
		if(parameter==null) {
			if(argumentList.size()==0)
				throw new SyntaxError("Method has no parameter");
			parameter = argumentList.get(0);
		} else
			parameter = argumentList.find(this.getParameterId());
		if(parameter==null)
			throw new SyntaxError("Method has no parameter:" + this.getParameterId());
		IExpression expression = new ContextualExpression(context, getExpression());
		return new Argument(parameter,expression);
	}


	public void declare(Transpiler transpiler, IMethodDeclaration methodDeclaration) {
		if(this.expression!=null && !this.declareArrowExpression(transpiler, methodDeclaration))
			this.expression.declare(transpiler);
	}


	private boolean declareArrowExpression(Transpiler transpiler, IMethodDeclaration methodDeclaration) {
		if(this.parameter==null || methodDeclaration==null)
			return false;
		IParameter parameter = findParameter(methodDeclaration);
		IType requiredType = parameter.getType(transpiler.getContext());
		boolean isArrow = requiredType instanceof MethodType && expression instanceof ArrowExpression;
		if(isArrow) {
			((MethodType)requiredType).declareArrowExpression(transpiler, (ArrowExpression)expression);
			return true;
		} else
			return false;
	}


	public void transpile(Transpiler transpiler, IMethodDeclaration methodDeclaration) {
		if(this.expression!=null && !this.transpileArrowExpression(transpiler, methodDeclaration))
			this.expression.transpile(transpiler);
	}


	private boolean transpileArrowExpression(Transpiler transpiler, IMethodDeclaration methodDeclaration) {
		// TODO Auto-generated method stub
		return false;
	}
}
