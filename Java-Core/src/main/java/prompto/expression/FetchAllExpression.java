package prompto.expression;

import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class FetchAllExpression extends FetchOneExpression {

	IExpression start;
	IExpression end;
	
	public FetchAllExpression(CategoryType type, IExpression filter, IExpression start, IExpression end) {
		super(type, filter);
		this.start = start;
		this.end = end;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch all ");
			writer.append(type.getName().toString());
			break;
		case O:
			writer.append("fetch all (");
			writer.append(type.getName().toString());
			writer.append(")");
			break;
		case S:
			writer.append("fetch all ");
			writer.append(type.getName().toString());
			break;
		}
		writer.append(" where ");
		filter.toDialect(writer);
		if(start!=null) {
			writer.append(" rows ");
			start.toDialect(writer);
			writer.append(" to ");
			end.toDialect(writer);
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getName());
		if(decl==null)
			throw new SyntaxError("Expecting a type type !");
		Context local = context.newLocalContext();
		IType filterType = filter.check(local);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
		// TODO check start and end
		return new ListType(type);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return null;
	}
}
