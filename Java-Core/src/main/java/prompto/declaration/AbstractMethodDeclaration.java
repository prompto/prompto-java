package prompto.declaration;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class AbstractMethodDeclaration extends BaseMethodDeclaration implements IMethodDeclaration {

	IType returnType;
	
	public AbstractMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType) {
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
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public IValue interpret(Context context) throws PromptoError {
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
		writer.append(getName());
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
		writer.append(getName());
		writer.append(" as abstract method ");
		arguments.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning ");
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
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(");");
	}
}
