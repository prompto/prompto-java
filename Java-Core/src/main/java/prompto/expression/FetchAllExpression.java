package prompto.expression;

import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.OrderByClauseList;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IPredicateExpression;
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
		if(predicate!=null) {
			writer.append("where ");
			predicate.toDialect(writer);
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
		if(predicate!=null) {
			writer.append(" where ( ");
			predicate.toDialect(writer);
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
		if(predicate!=null) {
			writer.append(" where ");
			predicate.toDialect(writer);
		}
		if(orderBy!=null) {
			writer.append(" ");
			orderBy.toDialect(writer);
		}
	}


	@Override
	public IType check(Context context) throws SyntaxError {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
		if(decl==null)
			throw new SyntaxError("Expecting a type type !");
		checkPredicate(context);
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


	private void checkPredicate(Context context) throws SyntaxError {
		if(predicate==null)
			return;
		if(!(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IType filterType = predicate.check(context);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
	}


	@Override
	public IValue interpret(Context context) throws PromptoError {
		IStore<Object> store = IDataStore.getInstance();
		if(predicate!=null && !(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IStoredIterator docs = store.interpretFetchMany(context, type, start, end, (IPredicateExpression)predicate, orderBy);
		return new Cursor(context, type, docs);
	}
}
