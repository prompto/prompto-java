package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.ArgumentList;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class AbstractMethodDeclaration extends BaseMethodDeclaration {

	IType returnType;
	
	public AbstractMethodDeclaration(String name, ArgumentList arguments, IType returnType) {
		super(name,arguments);
		this.returnType = returnType!=null ? returnType : VoidType.instance();
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		if(arguments!=null)
			arguments.check(context);
		Context local = context.newLocalContext();
		registerArguments(local);
		return returnType;
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		throw new SyntaxError("Should never get there !");
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toPDialect(writer);
			break;
		}
	}
	
	private void toPDialect(CodeWriter writer) {
		writer.append("abstract def ");
		writer.append(name);
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(")");
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("->");
			returnType.toDialect(writer);
		}
	}

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(name);
		writer.append(" as: abstract method ");
		arguments.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning: ");
			returnType.toDialect(writer);
		}
	}
	
	protected void toODialect(CodeWriter writer) {
		writer.append("abstract ");
		if(returnType!=null && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("method ");
		writer.append(name);
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(");");
	}
}
