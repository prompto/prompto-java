package prompto.expression;

import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IDocumentIterator;
import prompto.store.IStore;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.value.Cursor;
import prompto.value.IValue;


public class FetchAllExpression extends FetchOneExpression {

	IExpression start;
	IExpression end;
	OrderByClauseList orderBy;
	
	public FetchAllExpression(CategoryType type, IExpression start, IExpression end, IExpression filter, OrderByClauseList orderBy) {
		super(type, filter);
		this.start = start;
		this.end = end;
		this.orderBy = orderBy;
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
		IStore store = IStore.getInstance();
		IDocumentIterator docs = store.fetchMany(context, start, end, filter, orderBy);
		return new Cursor(context, type, docs);
	}
}
