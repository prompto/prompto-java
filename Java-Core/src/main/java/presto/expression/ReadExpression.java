package presto.expression;

import presto.error.InvalidResourceError;
import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.ResourceType;
import presto.type.TextType;
import presto.utils.CodeWriter;
import presto.value.IResource;
import presto.value.IValue;
import presto.value.Text;

public class ReadExpression implements IExpression {

	IExpression resource;
	
	public ReadExpression(IExpression resource) {
		this.resource = resource;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("read from ");
		resource.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		context = context.newResourceContext();
		IType sourceType = resource.check(context);
		if(!(sourceType instanceof ResourceType))
			throw new SyntaxError("Not a readable resource!");
		return TextType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		context = context.newResourceContext();
		IValue o = resource.interpret(context);
		if(o==null)
			throw new NullReferenceError();
		if(!(o instanceof IResource))
			throw new InternalError("Illegal read source: " + o);
		IResource res = (IResource)o;
		if(!res.isReadable())
			throw new InvalidResourceError("Not readable");
		String str = res.readFully();
		return new Text(str);
	}
}
