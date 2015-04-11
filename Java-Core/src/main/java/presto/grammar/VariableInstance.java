package presto.grammar;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.DocumentType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class VariableInstance implements IAssignableInstance {
	
	Identifier name;
	
	public VariableInstance(Identifier name) {
		this.name = name;
	}
	
	public Identifier getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(name);
	}
	
	@Override
	public void checkAssignValue(Context context, IExpression expression) throws SyntaxError {
		IType type = expression.check(context);
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual==null)
			context.registerValue(new Variable(name, type));
		else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			type.checkAssignableTo(context,actualType);
		}
	}
	
	@Override
	public void checkAssignMember(Context context, Identifier memberName) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual==null) 
			throw new SyntaxError("Unknown variable:" + this.name);
		if(actual.getType(context)!=DocumentType.instance())
			throw new SyntaxError(this.name + " is not a document. Cannot assign member!");
	}
	
	@Override
	public void checkAssignElement(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PrestoError {
 		IValue value = expression.interpret(context);
		if(context.getRegisteredValue(INamed.class,name)==null)
			context.registerValue(new Variable(name, value.getType())); 
		context.setValue(name, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return context.getValue(name);
	}

}
