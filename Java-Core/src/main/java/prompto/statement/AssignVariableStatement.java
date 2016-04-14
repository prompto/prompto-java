package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.ResourceType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public class AssignVariableStatement extends SimpleStatement {
	
	Identifier name;
	IExpression expression;
	
	public AssignVariableStatement(Identifier name, IExpression expression) {
		this.name = name;
		this.expression = expression;
	}

	public Identifier getName() {
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

	public IType checkResource(Context context) {
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
	public IType check(Context context) {
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
	public IValue interpret(Context context) throws PromptoError {
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual==null) {
			IType actualType = expression.check(context);
			context.registerValue(new Variable(name, actualType));
		}
		context.setValue(name, expression.interpret(context));
		return null;
	}


}
