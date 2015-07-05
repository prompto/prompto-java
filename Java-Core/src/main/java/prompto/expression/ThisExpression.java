package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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
	public IValue interpret(Context context) throws PromptoError {
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
