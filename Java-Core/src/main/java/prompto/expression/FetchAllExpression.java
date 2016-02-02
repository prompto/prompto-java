package prompto.expression;

import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStoredIterator;
import prompto.store.IStore;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
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
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	
	private void toSDialect(CodeWriter writer) {
		writer.append("fetch ");
		if(start!=null) {
			writer.append("rows ");
			start.toDialect(writer);
			writer.append(" to ");
			end.toDialect(writer);
		} else
			writer.append("all ");
		writer.append(" ( ");
		type.toDialect(writer);
		writer.append(" ) ");
		if(filter!=null) {
			writer.append("where ");
			filter.toDialect(writer);
			writer.append(" ");
		}
		if(orderBy!=null)
			orderBy.toDialect(writer);
	}


	private void toODialect(CodeWriter writer) {
		writer.append("fetch ");
		if(start==null)
			writer.append("all ");
		writer.append("( ");
		type.toDialect(writer);
		writer.append(" ) ");
		if(start!=null) {
			writer.append("rows ( ");
			start.toDialect(writer);
			writer.append(" to ");
			end.toDialect(writer);
			writer.append(") ");
		}
		if(filter!=null) {
			writer.append(" where ( ");
			filter.toDialect(writer);
			writer.append(") ");
		}
		if(orderBy!=null)
			orderBy.toDialect(writer);
	}


	private void toEDialect(CodeWriter writer) {
		writer.append("fetch");
		if(start==null)
			writer.append(" all");
		if(type!=null) {
			writer.append(" ");
			type.toDialect(writer);
		}
		if(start!=null) {
			writer.append(" ");
			start.toDialect(writer);
			writer.append(" to ");
			end.toDialect(writer);
		} 
		if(filter!=null) {
			writer.append(" where ");
			filter.toDialect(writer);
		}
		if(orderBy!=null) {
			writer.append(" ");
			orderBy.toDialect(writer);
		}
	}


	@Override
	public IType check(Context context) throws SyntaxError {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getId());
		if(decl==null)
			throw new SyntaxError("Expecting a type type !");
		checkFilter(context);
		checkOrderBy(context);
		checkSlice(context);
		return new CursorType(type);
	}
	
	private void checkSlice(Context context) {
		// TODO Auto-generated method stub
		
	}


	private void checkOrderBy(Context context) {
		// TODO Auto-generated method stub
		
	}


	private void checkFilter(Context context) throws SyntaxError {
		if(filter==null)
			return;
		IType filterType = filter.check(context);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
	}


	@Override
	public IValue interpret(Context context) throws PromptoError {
		IStore store = IDataStore.getInstance();
		IStoredIterator docs = store.fetchMany(context, type, start, end, filter, orderBy);
		return new Cursor(context, type, docs);
	}
}
