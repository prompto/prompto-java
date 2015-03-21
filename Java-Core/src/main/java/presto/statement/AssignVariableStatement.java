package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.INamed;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.IType;
import presto.type.ResourceType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;


public class AssignVariableStatement extends SimpleStatement {
	
	String name;
	IExpression expression;
	
	public AssignVariableStatement(String name, IExpression expression) {
		this.name = name;
		this.expression = expression;
	}

	public String getName() {
		return name;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	public void setExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(name);
		writer.append(" = ");
		expression.toDialect(writer);
	}

	public IType checkResource(Context context) throws SyntaxError {
		IType type = expression.check(context);
		if(!(type instanceof ResourceType))
			throw new SyntaxError("Not a resource!");
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual==null)
			context.registerValue(new Variable(name, type));
		else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			type.checkAssignableTo(context,actualType);
		}
		return VoidType.instance();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof AssignVariableStatement))
			return false;
		AssignVariableStatement other = (AssignVariableStatement)obj;
		return this.name.equals(other.name)
				&& this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual==null) {
			IType actualType = expression.check(context);
			context.registerValue(new Variable(name, actualType));
		} else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			IType newType = expression.check(context);
			newType.checkAssignableTo(context,actualType);
		}
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual==null) {
			IType actualType = expression.check(context);
			context.registerValue(new Variable(name, actualType));
		}
		context.setValue(name, expression.interpret(context));
		return null;
	}


}
