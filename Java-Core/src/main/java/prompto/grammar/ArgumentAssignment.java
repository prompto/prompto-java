package prompto.grammar;

import prompto.argument.IArgument;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.expression.MemberSelector;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.CategoryType;
import prompto.type.IType;
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
	
	public IArgument getArgument() {
		return argument;
	}

	public Identifier getArgumentId() {
		return argument==null ? null : argument.getId();
	} 
	
	public IExpression getExpression() {
		return expression;
	}

	public void setExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return (argument!=null ? argument.getId() + " = " : "") + expression.toString();
	}
	
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	
	private void toODialect(CodeWriter writer) {
		if(argument!=null) {
			writer.append(argument.getId());
			writer.append(" = ");
		}
		expression.toDialect(writer);
	}

	private void toSDialect(CodeWriter writer) {
		if(argument!=null) {
			writer.append(argument.getId());
			writer.append(" = ");
		}
		expression.toDialect(writer);
	}

	private void toEDialect(CodeWriter writer) {
		expression.toDialect(writer);
		if(argument!=null) {
			writer.append(" as ");
			writer.append(argument.getId());
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
		INamed actual = context.getRegisteredValue(INamed.class,argument.getId());
		if(actual==null) {
			IType actualType = expression.check(context);
			context.registerValue(new Variable(argument.getId(), actualType));
		} else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			IType newType = expression.check(context);
			newType.checkAssignableTo(context,actualType);
		}
		return VoidType.instance();
	}
	
	public IExpression resolve(Context context, IMethodDeclaration methodDeclaration,boolean checkInstance) throws PromptoError {
		// since we support implicit members, it's time to resolve them
		Identifier name = argument.getId();
		IExpression expression = getExpression();
		IArgument argument = methodDeclaration.getArguments().find(name);
		IType required = argument.getType(context);
		IType actual = expression.check(context.getCallingContext());
		if(checkInstance && actual instanceof CategoryType) {
			Object value = expression.interpret(context.getCallingContext());
			if(value instanceof IInstance)
				actual = ((IInstance)value).getType();
		}
		if(!actual.isAssignableTo(context, required) && (actual instanceof CategoryType)) 
			expression = new MemberSelector(expression,name);
		return expression; 
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
		IExpression expression = new ContextualExpression(context, this.expression);
		return new ArgumentAssignment(argument,expression);
	}
}
