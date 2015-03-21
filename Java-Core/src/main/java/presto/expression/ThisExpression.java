package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class ThisExpression implements IExpression {

	@Override
	public IType check(Context context) throws SyntaxError {
		if(context!=null && !(context instanceof Context.InstanceContext))
			context = context.getParentContext();
		if( context instanceof Context.InstanceContext)
			return ((Context.InstanceContext)context).getInstanceType();
		else
			throw new SyntaxError("Not in an instance context!");
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		if(context!=null && !(context instanceof Context.InstanceContext))
			context = context.getParentContext();
		if( context instanceof Context.InstanceContext)
			return ((Context.InstanceContext)context).getInstance();
		else
			throw new SyntaxError("Not in an instance context!");
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.O)
			writer.append("this");
		else
			writer.append("self");
		
	}
}
