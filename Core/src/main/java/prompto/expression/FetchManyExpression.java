package prompto.expression;

import java.util.stream.Collectors;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoRoot;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStore;
import prompto.store.IStoredIterable;
import prompto.store.InvalidValueError;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.CursorValue;
import prompto.value.IValue;


public class FetchManyExpression extends FetchOneExpression {

	protected IExpression first;
	protected IExpression last;
	protected OrderByClauseList orderBy;
	
	public FetchManyExpression(CategoryType type, IExpression first, IExpression last, IExpression predicate, IdentifierList include, OrderByClauseList orderBy) {
		super(type, predicate, include);
		this.first = first;
		this.last = last;
		this.orderBy = orderBy;
	}
	
	
	@Override
	public String toString() {
		CodeWriter writer = new CodeWriter(Dialect.E, Context.newGlobalsContext());
		toDialect(writer);
		return writer.toString();
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
		case M:
			toMDialect(writer);
			break;
		}
	}
	
	private void toMDialect(CodeWriter writer) {
		writer.append("fetch ");
		if(first!=null) {
			writer.append("rows ");
			first.toDialect(writer);
			writer.append(" to ");
			last.toDialect(writer);
			writer.append(" ");
		} else
			writer.append("all ");
		writer.append("( ");
		if(type!=null) {
			type.toDialect(writer);
			writer.append(" ");
		}
		writer.append(") ");
		if(predicate!=null) {
			writer.append("where ");
			predicate.toDialect(writer);
			writer.append(" ");
		}
		if(include != null) {
			writer.append(" include ");
			include.toDialect(writer, false);
		}
		if(orderBy!=null)
			orderBy.toDialect(writer);
	}


	private void toODialect(CodeWriter writer) {
		writer.append("fetch ");
		if(first==null)
			writer.append("all ");
		if(type!=null) {
			writer.append("( ");
			type.toDialect(writer);
			writer.append(" ) ");
		}
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
		if(include != null) {
			writer.append(" include (");
			include.toDialect(writer, true);
			writer.append(") ");
		}
		if(orderBy!=null)
			orderBy.toDialect(writer);
	}


	private void toEDialect(CodeWriter writer) {
		writer.append("fetch ");
		if(first==null)
			writer.append("all ");
		if(type!=null) {
			type.toDialect(writer);
			writer.append(" ");
		}
		if(first!=null) {
			first.toDialect(writer);
			writer.append(" to ");
			last.toDialect(writer);
			writer.append(" ");
		} 
		if(predicate!=null) {
			writer.append("where ");
			predicate.toDialect(writer);
		}
		if(include != null) {
			writer.append(" include ");
			include.toDialect(writer, true);
		}
		if(orderBy!=null) {
			writer.append(" ");
			orderBy.toDialect(writer);
		}
	}


	@Override
	public IType check(Context context) {
		IType type = checkType(context);
		checkPredicate(context);
		checkInclude(context);
		checkOrderBy(context);
		checkSlice(context);
		return type;
	}
	
	protected IType checkType(Context context) {
		IType type = this.type;
		if(type==null)
			type = AnyType.instance();
		else {
			CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getTypeNameId());
			if(decl==null)
				throw new SyntaxError("Expecting a type type !");
			if(!decl.isStorable(context))
				context.getProblemListener().reportNotStorable(this, type.getTypeName());
			context = context.newInstanceContext(decl.getType(context), true);
		}
		return new CursorType(type);
	}
	
	protected void checkPredicate(Context context) {
		if(predicate==null)
			return;
		if(predicate instanceof IPredicate)
			((IPredicate)predicate).checkQuery(context);
		else
			context.getProblemListener().reportIllegalPredicate(this, predicate);
	}

	private void checkSlice(Context context) {
		// TODO Auto-generated method stub
		
	}


	private void checkOrderBy(Context context) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Object fetchRaw(IStore store) {
		IQuery query = buildFetchManyQuery(Context.newGlobalsContext(), store);
		return store.fetchMany(query);
	}

	@Override
	public IValue fetch(Context context, IStore store) throws PromptoError {
		IQuery query = buildFetchManyQuery(context, store);
		IStoredIterable docs = store.fetchMany(query);
		IType type = this.type==null ? AnyType.instance() : this.type;
		return new CursorValue(context, type, docs);
	}
	
	private IQuery buildFetchManyQuery(Context context, IStore store) {
		IQueryBuilder builder = store.newQueryBuilder();
		if(type!=null) {
			AttributeInfo info = AttributeInfo.CATEGORY;
			builder.verify(info, MatchOp.HAS, type.getTypeName());
		}
		if(predicate!=null) {
			if(predicate instanceof IPredicate)
				((IPredicate)predicate).interpretQuery(context, builder, store);
			else
				context.getProblemListener().reportIllegalPredicate(this, predicate);
		}
		if(type!=null && predicate!=null)
			builder.and();
		builder.first(interpretLimit(context, first));
		builder.last(interpretLimit(context, last));
		if(include!=null)
			builder.project(include.stream().map(Object::toString).collect(Collectors.toList()));
		if(orderBy!=null)
			orderBy.interpretQuery(context, builder);
		return builder.build();
	}

	private Long interpretLimit(Context context, IExpression exp) throws PromptoError {
		if(exp==null)
			return null;
		IValue value = exp.interpret(context);
		if(!(value instanceof prompto.value.IntegerValue))
			throw new InvalidValueError("Expecting an Integer, got:" + value.getType().toString());
		return ((prompto.value.IntegerValue)value).longValue();
	}	

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		compileNewQueryBuilder(context, method, flags); // -> IStore, IQueryBuilder
		compilePredicates(context, method, flags); // -> IStore, IQueryBuilder
		compileLimits(context, method, flags); // -> IStore, IQueryBuilder
		compileProject(context, method, flags); // -> IStore, IQueryBuilder
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
			ResultInfo info = first.compile(context, method, flags.withPrimitive(false));
			if(long.class==info.getType())
				CompilerUtils.longToLong(method);
			InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "first", Long.class, IQueryBuilder.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
		if(last!=null) {
			ResultInfo info = last.compile(context, method, flags.withPrimitive(false));
			if(long.class==info.getType())
				CompilerUtils.longToLong(method);
			InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "last", Long.class, IQueryBuilder.class);
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
	
	@Override
	public void declare(Transpiler transpiler) {
	    transpiler.require("Cursor");
	    transpiler.require("MatchOp");
	    transpiler.require("DataStore");
	    transpiler.require("AttributeInfo");
	    transpiler.require("TypeFamily");
	    if (this.type != null)
	        this.type.declare(transpiler);
	    if (this.predicate != null)
	        this.predicate.declare(transpiler);
	    if (this.first != null)
	        this.first.declare(transpiler);
	    if (this.last != null)
	        this.last.declare(transpiler);
	    if (this.orderBy != null)
	        this.orderBy.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(function() {").indent();
	    this.transpileQuery(transpiler);
	    boolean mutable = this.type!=null ? this.type.isMutable() : false;
	    transpiler.append("return $DataStore.instance.fetchMany(builder.build(),").append(mutable).append(");").newLine().dedent();
	    transpiler.append("})()");
	    return false;
	}
	
	@Override
	protected void transpileQuery(Transpiler transpiler) {
	    transpiler.append("var builder = $DataStore.instance.newQueryBuilder();").newLine();
	    if (type != null)
	        transpiler.append("builder.verify(new AttributeInfo('category', TypeFamily.TEXT, true, null), MatchOp.HAS, '").append(this.type.getTypeName()).append("');").newLine();
	    if (predicate instanceof IPredicate)
	        ((IPredicate)predicate).transpileQuery(transpiler, "builder");
	    if (type != null && predicate instanceof IPredicate)
	        transpiler.append("builder.and();").newLine();
	    if (this.first  != null) {
	        transpiler.append("builder.setFirst(");
	        this.first.transpile(transpiler);
	        transpiler.append(");").newLine();
	    }
	    if (this.last  != null) {
	        transpiler.append("builder.setLast(");
	        this.last.transpile(transpiler);
	        transpiler.append(");").newLine();
	    }
	    if (this.include != null) {
	    	transpiler.append("builder.project([");
	    	this.include.forEach(id->transpiler.append('"').append(id.toString()).append('"').append(", "));
	    	transpiler.trimLast(", ".length());
	    	transpiler.append("]);").newLine();
	    }
	    if (this.orderBy  != null)
	        this.orderBy.transpileQuery(transpiler, "builder");
	}

}
