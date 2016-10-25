package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.declaration.AttributeInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoRoot;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.statement.UnresolvedCall;
import prompto.store.IDataStore;
import prompto.store.IPredicateExpression;
import prompto.store.IQuery;
import prompto.store.IQuery.MatchOp;
import prompto.store.IQueryFactory;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.IType.Family;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

public class FetchOneExpression extends Section implements IFetchExpression {

	CategoryType type;
	IExpression predicate;
	
	public FetchOneExpression(CategoryType type, IExpression predicate) {
		this.type = type;
		this.predicate = predicate;
	}
	
	public CategoryType getType() {
		return type;
	}
	
	public IPredicateExpression getPredicate(Context context) {
		IExpression predicate = this.predicate;
		if(predicate instanceof UnresolvedCall)
			predicate = ((UnresolvedCall)predicate).getResolved(context);
		return (IPredicateExpression)predicate; // assume this was checked earlier
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch one ");
			if(type!=null) {
				type.toDialect(writer);
				writer.append(" ");
			}
			writer.append("where ");
			predicate.toDialect(writer);
			break;
		case O:
			writer.append("fetch one ");
			if(type!=null) {
				writer.append("(");
				type.toDialect(writer);
				writer.append(") ");
			}
			writer.append("where (");
			predicate.toDialect(writer);
			writer.append(")");
			break;
		case S:
			writer.append("fetch one ");
			if(type!=null) {
				type.toDialect(writer);
				writer.append(" ");
			}
			writer.append("where ");
			predicate.toDialect(writer);
			break;
		}
	}
	
	@Override
	public IType check(Context context) {
		if(type!=null) {
			CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getTypeNameId());
			if(decl==null)
				throw new SyntaxError("Unknown category: " + type.getTypeName());
		}
		if(!(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IType filterType = predicate.check(context);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
		return type!=null ? type : AnyType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(!(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IStore<Object> store = IDataStore.getInstance();
		IStored stored = store.interpretFetchOne(context, type, (IPredicateExpression)predicate);
		if(stored==null)
			return NullValue.instance();
		else {
			@SuppressWarnings("unchecked")
			PromptoList<String> categories = ((PromptoList<String>)stored.getData("category"));
			String actualTypeName = categories.getLast();
			CategoryType type = new CategoryType(new Identifier(actualTypeName));
			if(this.type!=null)
				type.setMutable(this.type.isMutable());
			return type.newInstance(context, stored);
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		compileNewQuery(context, method, flags); // -> IStore, IQuery
		compilePredicates(context, method, flags); // -> IStore, IQuery
		compileFetchOne(context, method, flags); // -> IStored
		return compileInstantiation(context, method, flags);
	}

	private ResultInfo compileInstantiation(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoRoot.class, "newInstance", IStored.class, PromptoRoot.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		if(type!=null) {
			method.addInstruction(Opcode.CHECKCAST, new ClassConstant(type.getJavaType(context)));
			return new ResultInfo(type.getJavaType(context));
		} else
			return new ResultInfo(AnyType.instance().getJavaType(context));
	}

	private void compileFetchOne(Context context, MethodInfo method, Flags flags) {
		InterfaceConstant i = new InterfaceConstant(IStore.class, "fetchOne", IQuery.class, IStored.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}

	protected void compilePredicates(Context context, MethodInfo method, Flags flags) {
		if(type!=null) {
			method.addInstruction(Opcode.DUP);
			AttributeInfo info = new AttributeInfo("category", Family.TEXT, true, null);
			CompilerUtils.compileAttributeInfo(context, method, flags, info);
			CompilerUtils.compileJavaEnum(context, method, flags, MatchOp.CONTAINS);
			method.addInstruction(Opcode.LDC, new StringConstant(type.toString()));
			InterfaceConstant i = new InterfaceConstant(IQuery.class, "verify", 
					AttributeInfo.class, MatchOp.class, Object.class, void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
		if(predicate!=null)
			((IPredicateExpression)predicate).compileQuery(context, method, flags);
			
		if(type!=null && predicate!=null) {
			method.addInstruction(Opcode.DUP);
			InterfaceConstant i = new InterfaceConstant(IQuery.class, "and", void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
	}

	protected void compileNewQuery(Context context, MethodInfo method, Flags flags) {
		// need the data store
		MethodConstant m = new MethodConstant(IDataStore.class, "getInstance", IStore.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		// need a copy for fetch one
		method.addInstruction(Opcode.DUP);
		// need a query factory
		InterfaceConstant i = new InterfaceConstant(IStore.class, "getQueryFactory", IQueryFactory.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
		// need a query
		i = new InterfaceConstant(IQueryFactory.class, "newQuery", IQuery.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}

}
