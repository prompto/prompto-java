package prompto.expression;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.IDeclaration;
import prompto.error.InvalidValueError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoRoot;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IDataStore;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;
import prompto.store.IStoredIterable;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Cursor;
import prompto.value.IValue;


public class FetchManyExpression extends FetchOneExpression {

	IExpression first;
	IExpression last;
	OrderByClauseList orderBy;
	
	public FetchManyExpression(CategoryType type, IExpression first, IExpression last, IExpression filter, OrderByClauseList orderBy) {
		super(type, filter);
		this.first = first;
		this.last = last;
		this.orderBy = orderBy;
	}
	
	public void setFirst(IExpression first) {
		this.first = first;
	}
	
	public IExpression getFirst() {
		return first;
	}
	
	
	public void setLast(IExpression last) {
		this.last = last;
	}
	
	public IExpression getLast() {
		return last;
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
		if(first!=null) {
			writer.append("rows ");
			first.toDialect(writer);
			writer.append(" to ");
			last.toDialect(writer);
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
		if(first==null)
			writer.append("all ");
		writer.append("( ");
		type.toDialect(writer);
		writer.append(" ) ");
		if(first!=null) {
			writer.append("rows ( ");
			first.toDialect(writer);
			writer.append(" to ");
			last.toDialect(writer);
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
		if(first==null)
			writer.append(" all");
		if(type!=null) {
			writer.append(" ");
			type.toDialect(writer);
		}
		if(first!=null) {
			writer.append(" ");
			first.toDialect(writer);
			writer.append(" to ");
			last.toDialect(writer);
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
	public IType check(Context context) {
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


	private void checkPredicate(Context context) {
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
		IStore store = IDataStore.getInstance();
		IQuery query = buildFetchManyQuery(context, store);
		IStoredIterable docs = store.fetchMany(query);
		IType type = this.type==null ? AnyType.instance() : this.type;
		return new Cursor(context, type, docs);
	}
	
	private IQuery buildFetchManyQuery(Context context, IStore store) {
		IQueryBuilder builder = store.newQueryBuilder();
		if(type!=null) {
			AttributeInfo info = new AttributeInfo("category", Family.TEXT, true, null);
			builder.verify(info, MatchOp.CONTAINS, type.getTypeName());
		}
		if(predicate!=null) {
			if(!(predicate instanceof IPredicateExpression))
				throw new SyntaxError("Filtering expression must be a predicate !");
			((IPredicateExpression)predicate).interpretQuery(context, builder);
		}
		if(type!=null && predicate!=null)
			builder.and();
		builder.setFirst(interpretLimit(context, first));
		builder.setLast(interpretLimit(context, last));
		if(orderBy!=null)
			orderBy.interpretQuery(context, builder);
		return builder.build();
	}

	private Long interpretLimit(Context context, IExpression exp) throws PromptoError {
		if(exp==null)
			return null;
		IValue value = exp.interpret(context);
		if(!(value instanceof prompto.value.Integer))
			throw new InvalidValueError("Expecting an Integer, got:" + value.getType().toString());
		return ((prompto.value.Integer)value).longValue();
	}	

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		compileNewQueryBuilder(context, method, flags); // -> IStore, IQueryBuilder
		compilePredicates(context, method, flags); // -> IStore, IQueryBuilder
		compileLimits(context, method, flags); // -> IStore, IQueryBuilder
		compileOrderBy(context, method, flags); // -> IStore, IQueryBuilder
		compileBuildQuery(context, method, flags); // -> IStore, IQuery
		compileFetchMany(context, method, flags); // -> IStored
		return compileInstantiation(context, method, flags);
	}
	
	private void compileOrderBy(Context context, MethodInfo method, Flags flags) {
		if(orderBy!=null)
			orderBy.compileQuery(context, method, flags);
	}


	private void compileLimits(Context context, MethodInfo method, Flags flags) {
		if(first!=null) {
			method.addInstruction(Opcode.DUP);
			ResultInfo info = first.compile(context, method, flags.withPrimitive(false));
			if(long.class==info.getType())
				CompilerUtils.longToLong(method);
			InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "setFirst", Long.class, void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
		if(last!=null) {
			method.addInstruction(Opcode.DUP);
			ResultInfo info = last.compile(context, method, flags.withPrimitive(false));
			if(long.class==info.getType())
				CompilerUtils.longToLong(method);
			InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "setLast", Long.class, void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
	}


	private void compileFetchMany(Context context, MethodInfo method, Flags flags) {
		InterfaceConstant i = new InterfaceConstant(IStore.class, "fetchMany", IQuery.class, IStoredIterable.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}

	private ResultInfo compileInstantiation(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoRoot.class, "newIterable", IStoredIterable.class, IterableWithCounts.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		return new ResultInfo(IterableWithCounts.class);
	}

}
