package presto.statement;

import presto.error.InvalidResourceError;
import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.ResourceType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IResource;
import presto.value.IValue;

public class WriteStatement extends SimpleStatement {

	IExpression content;
	IExpression resource;
	
	public WriteStatement(IExpression content, IExpression resource) {
		this.content = content;
		this.resource = resource;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("write ");
		switch(writer.getDialect()) {
		case E:
		case S:
			content.toDialect(writer);
			break;
		case O:
			writer.append("(");
			content.toDialect(writer);
			writer.append(")");
			break;
		}
		writer.append(" to ");
		resource.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		context = context.newResourceContext();
		IType resourceType = resource.check(context);
		if(!(resourceType instanceof ResourceType))
			throw new SyntaxError("Not a resource!");
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		context = context.newResourceContext();
		Object o = resource.interpret(context);
		if(o==null)
			throw new NullReferenceError();
		if(!(o instanceof IResource))
			throw new InternalError("Illegal write source: " + o);
		IResource res = (IResource)o;
		if(!res.isWritable())
			throw new InvalidResourceError("Not writable");
		res.writeFully(content.interpret(context).toString());
		return null;
	}
}
