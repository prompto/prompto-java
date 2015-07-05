package prompto.grammar;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class VariableInstance implements IAssignableInstance {
	
	Identifier name;
	
	public VariableInstance(Identifier name) {
		this.name = name;
	}
	
	public Identifier getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer, IExpression expression) {
		if(expression!=null) try {
			IType type = expression.check(writer.getContext());
			INamed actual = writer.getContext().getRegisteredValue(INamed.class,name);
			if(actual==null)
				writer.getContext().registerValue(new Variable(name, type));
		} catch(SyntaxError e) {
			// TODO warning
		}
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
	}
	
	@Override
	public void checkAssignElement(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
 		IValue value = expression.interpret(context);
		if(context.getRegisteredValue(INamed.class,name)==null)
			context.registerValue(new Variable(name, value.getType())); 
		context.setValue(name, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return context.getValue(name);
	}

}
