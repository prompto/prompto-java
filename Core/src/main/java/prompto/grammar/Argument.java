package prompto.grammar;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.MemberSelector;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
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
		// since we support implicit members, it's time to resolve them
		Identifier name = parameter.getId();
		IExpression expression = getExpression();
		IParameter argument = methodDeclaration.getParameters().find(name);
		IType required = argument.getType(context);
		IType actual = expression.check(context.getCallingContext());
		if(checkInstance && actual instanceof CategoryType) {
			Object value = expression.interpret(context.getCallingContext());
			if(value instanceof IInstance)
				actual = ((IInstance)value).getType();
		}
		boolean assignable = required.isAssignableFrom(context, actual);
		// when in dispatch, allow derived
		if(!assignable && allowDerived)
	        assignable = actual.isAssignableFrom(context, required);
		// try passing member
		if(!assignable && (actual instanceof CategoryType)) 
			expression = new MemberSelector(expression,name);
		return expression; 
	}

	public Argument resolveAndCheck(Context context, ParameterList argumentList) {
		IParameter argument = this.parameter;
		// when 1st argument, can be unnamed
		if(argument==null) {
			if(argumentList.size()==0)
				throw new SyntaxError("Method has no argument");
			argument = argumentList.get(0);
		} else
			argument = argumentList.find(this.getParameterId());
		if(argument==null)
			throw new SyntaxError("Method has no argument:" + this.getParameterId());
		IExpression expression = new ContextualExpression(context, getExpression());
		return new Argument(argument,expression);
	}


	public void declare(Transpiler transpiler) {
		if(this.expression!=null)
			this.expression.declare(transpiler);
	}


	public void transpile(Transpiler transpiler) {
		this.expression.transpile(transpiler);
	}
}
