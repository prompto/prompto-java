package prompto.expression;

import java.io.IOException;

import prompto.error.InvalidResourceError;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.ResourceType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.value.IResource;
import prompto.value.IValue;
import prompto.value.Text;

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
	public IValue interpret(Context context) throws PromptoError {
		context = context.newResourceContext();
		IValue o = resource.interpret(context);
		if(o==null)
			throw new NullReferenceError();
		if(!(o instanceof IResource))
			throw new InternalError("Illegal read source: " + o);
		IResource res = (IResource)o;
		if(!res.isReadable())
			throw new InvalidResourceError("Not readable");
		try {
			String str = res.readFully();
			return new Text(str);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
