package prompto.grammar;

import prompto.argument.IArgument;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.MemberSelector;
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

public class ArgumentAssignment {
	
	IArgument argument;
	IExpression expression;
	
	public ArgumentAssignment(IArgument argument, IExpression expression) {
		this.argument = argument;
		this.expression = expression;
	}
	
	
	public void setArgument(IArgument argument) {
		this.argument = argument;
	}
	
	
	public IArgument getArgument() {
		return argument;
	}

	public Identifier getArgumentId() {
		return argument==null ? null : argument.getId();
	} 
	
	public IExpression getExpression() {
		return expression!=null ? expression : new InstanceExpression(argument.getId());
	}

	public void setExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		if(argument==null)
			return expression.toString();
		else if(expression==null)
			return argument.getId().toString();
		else
			return argument.getId() + " = " + expression.toString();
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
			writer.append(argument.getId());
		else {
			if(argument!=null) {
				writer.append(argument.getId());
				writer.append(" = ");
			}
			expression.toDialect(writer);
		}
	}

	private void toEDialect(CodeWriter writer) {
		if(expression==null)
			writer.append(argument.getId());
		else {
			expression.toDialect(writer);
			if(argument!=null) {
				writer.append(" as ");
				writer.append(argument.getId());
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof ArgumentAssignment))
			return false;
		ArgumentAssignment other = (ArgumentAssignment)obj;
		return this.getArgument().equals(other.getArgument())
				&& this.getExpression().equals(other.getExpression());
	}
	
	public IType check(Context context) {
		IExpression expression = getExpression();
		INamed actual = context.getRegisteredValue(INamed.class, argument.getId());
		if(actual==null) {
			IType actualType = expression.check(context);
			context.registerValue(new Variable(argument.getId(), actualType));
		} else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			IType newType = expression.check(context);
			actualType.checkAssignableFrom(context, newType);
		}
		return VoidType.instance();
	}
	
	public IExpression resolve(Context context, IMethodDeclaration methodDeclaration, boolean checkInstance, boolean allowDerived) throws PromptoError {
		IArgument argument = findArgument(methodDeclaration);
		return resolve(context, argument, checkInstance, allowDerived);
	}
	
	public IExpression resolve(Context context, IArgument argument, boolean checkInstance, boolean allowDerived) throws PromptoError {
		// since we support implicit members, it's time to resolve them
		IExpression expression = getExpression();
		IType requiredType = argument.getType(context);
		IType actualType = getActualType(context, requiredType, expression, checkInstance);
		boolean assignable = requiredType.isAssignableFrom(context, actualType);
		// when in dispatch, allow derived
		if(!assignable && allowDerived)
	        assignable = actualType.isAssignableFrom(context, requiredType);
		// try passing category member
		if(!assignable && (actualType instanceof CategoryType)) 
			expression = new MemberSelector(expression, argument.getId());
		return expression; 
	}

	private IType getActualType(Context context, IType requiredType, IExpression expression, boolean checkInstance) {
		boolean checkArrow = requiredType instanceof MethodType && expression instanceof ContextualExpression && ((ContextualExpression)expression).getExpression() instanceof ArrowExpression;
		IType actualType = checkArrow ? ((MethodType)requiredType).checkArrowExpression((ContextualExpression)expression) : expression.check(context.getCallingContext());
		if(checkInstance && actualType instanceof CategoryType) {
			Object value = expression.interpret(context.getCallingContext());
			if(value instanceof IInstance)
				actualType = ((IInstance)value).getType();
		}
		return actualType;
	}


	private IArgument findArgument(IMethodDeclaration methodDeclaration) {
		return methodDeclaration.getArguments().find(this.argument.getId());
	}


	public ArgumentAssignment resolveAndCheck(Context context, ArgumentList argumentList) {
		IArgument argument = this.argument;
		// when 1st argument, can be unnamed
		if(argument==null) {
			if(argumentList.size()==0)
				throw new SyntaxError("Method has no argument");
			argument = argumentList.get(0);
		} else
			argument = argumentList.find(this.getArgumentId());
		if(argument==null)
			throw new SyntaxError("Method has no argument:" + this.getArgumentId());
		IExpression expression = new ContextualExpression(context, getExpression());
		return new ArgumentAssignment(argument,expression);
	}


	public void declare(Transpiler transpiler, IMethodDeclaration methodDeclaration) {
		if(this.expression!=null && methodDeclaration!=null && !this.declareArrowExpression(transpiler, methodDeclaration))
			this.expression.declare(transpiler);
	}


	private boolean declareArrowExpression(Transpiler transpiler, IMethodDeclaration methodDeclaration) {
		if(this.argument==null)
			return false;
		IArgument argument = findArgument(methodDeclaration);
		IType requiredType = argument.getType(transpiler.getContext());
		boolean isArrow = requiredType instanceof MethodType && expression instanceof ContextualExpression && ((ContextualExpression)expression).getExpression() instanceof ArrowExpression;
		if(isArrow) {
			((MethodType)requiredType).declareArrowExpression(transpiler, (ContextualExpression)expression);
			return true;
		} else
			return false;
	}


	public void transpile(Transpiler transpiler) {
		this.expression.transpile(transpiler);
	}
}
