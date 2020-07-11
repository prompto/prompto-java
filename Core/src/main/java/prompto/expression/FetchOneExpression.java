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
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoRoot;
import prompto.parser.Dialect;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.statement.UnresolvedCall;
import prompto.store.AttributeInfo;
import prompto.store.DataStore;
import prompto.store.IQuery;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

public class FetchOneExpression extends Section implements IFetchExpression {

	protected CategoryType type;
	protected IExpression predicate;
	
	public FetchOneExpression(CategoryType type, IExpression predicate) {
		this.type = type;
		this.predicate = predicate;
	}
	
	@Override
	public String toString() {
		CodeWriter writer = new CodeWriter(Dialect.E, Context.newGlobalsContext());
		toDialect(writer);
		return writer.toString();
	}

	public CategoryType getType() {
		return type;
	}
	
	public IPredicateExpression getPredicate(Context context) {
		IExpression predicate = this.predicate;
		if(predicate instanceof UnresolvedCall)
			predicate = ((UnresolvedCall)predicate).resolve(context);
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
		case M:
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
				context.getProblemListener().reportUnknownCategory(type, type.getTypeName());
			if(!decl.isStorable(context))
				context.getProblemListener().reportNotStorable(this, type.getTypeName());
			context = context.newInstanceContext(decl.getType(context), true);
		}
		if(!(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IType filterType = ((IPredicateExpression)predicate).checkQuery(context);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
		return type!=null ? type : AnyType.instance();
	}
	
	@Override
	public Object fetchRaw(IStore store) {
		IQuery query = buildFetchOneQuery(Context.newGlobalsContext(), store);
		return store.fetchOne(query);
	}
	
	@Override
	public IValue fetch(Context context, IStore store) throws PromptoError {
		IQuery query = buildFetchOneQuery(context, store);
		IStored stored = store.fetchOne(query);
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
	
	public IQuery buildFetchOneQuery(Context context, IStore store) {
		IQueryBuilder builder = store.newQueryBuilder();
		if(type!=null) {
			builder.verify(AttributeInfo.CATEGORY, MatchOp.HAS, type.getTypeName());
		}
		if(predicate!=null) {
			if(!(predicate instanceof IPredicateExpression))
				throw new SyntaxError("Filtering expression must be a predicate !");
			((IPredicateExpression)predicate).interpretQuery(context, builder, store);
		}
		if(type!=null && predicate!=null)
			builder.and();
		return builder.build();
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		compileNewQueryBuilder(context, method, flags); // -> IStore, IQueryBuilder
		compilePredicates(context, method, flags); // -> IStore, IQueryBuilder
		compileBuildQuery(context, method, flags); // -> IStore, IQuery
		compileFetchOne(context, method, flags); // -> IStored
		return compileInstantiation(context, method, flags);
	}

	protected void compileBuildQuery(Context context, MethodInfo method, Flags flags) {
		// need a query
		InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "build", IQuery.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
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

	protected void compileFetchOne(Context context, MethodInfo method, Flags flags) {
		InterfaceConstant i = new InterfaceConstant(IStore.class, "fetchOne", IQuery.class, IStored.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}

	protected void compilePredicates(Context context, MethodInfo method, Flags flags) {
		if(type!=null) {
			AttributeInfo info = AttributeInfo.CATEGORY;
			CompilerUtils.compileAttributeInfo(context, method, flags, info);
			CompilerUtils.compileJavaEnum(context, method, flags, MatchOp.HAS);
			method.addInstruction(Opcode.LDC, new StringConstant(type.toString()));
			InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "verify", 
					AttributeInfo.class, MatchOp.class, Object.class, IQueryBuilder.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
		if(predicate!=null)
			((IPredicateExpression)predicate).compileQuery(context, method, flags);
		if(type!=null && predicate!=null) {
			InterfaceConstant i = new InterfaceConstant(IQueryBuilder.class, "and", IQueryBuilder.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		}
	}

	protected void compileNewQueryBuilder(Context context, MethodInfo method, Flags flags) {
		// need the data store
		MethodConstant m = new MethodConstant(DataStore.class, "getInstance", IStore.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		// need a copy for fetch one
		method.addInstruction(Opcode.DUP);
		// need a query factory
		InterfaceConstant i = new InterfaceConstant(IStore.class, "newQueryBuilder", IQueryBuilder.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    transpiler.require("MatchOp");
	    transpiler.require("DataStore");
	    transpiler.require("AttributeInfo");
	    transpiler.require("TypeFamily");
	    transpiler.require("NativeError"); // for NotMutableError
	    if (this.type != null)
	        this.type.declare(transpiler);
	    if (this.predicate != null)
	        this.predicate.declareQuery(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(function() {").indent();
	    transpileQuery(transpiler);
	    transpiler.append("var $stored = $DataStore.instance.fetchOne(builder.build());").newLine();
	    transpileConvert(transpiler, "result");
	    transpiler.append("return result;").dedent();
	    transpiler.append("})()");
	    return false;
	}

	protected void transpileConvert(Transpiler transpiler, String varName) {
	    transpiler.append("if($stored===null)").indent().append("return null;").dedent();
	    transpiler.append("var $name = $stored.getData('category').slice(-1)[0];").newLine();
	    transpiler.append("var $type = eval($name);").newLine();
	    transpiler.append("var ").append(varName).append(" = new $type(null, {}, ").append(this.type!=null && this.type.isMutable()).append(");").newLine();
	    transpiler.append(varName).append(".fromStored($stored);").newLine();
	}

	protected void transpileQuery(Transpiler transpiler) {
	    transpiler.append("var builder = $DataStore.instance.newQueryBuilder();").newLine();
	    if (this.type != null)
	        transpiler.append("builder.verify(new AttributeInfo('category', TypeFamily.TEXT, true, null), MatchOp.HAS, '").append(this.type.getTypeName()).append("');").newLine();
	    if (this.predicate != null)
	        this.predicate.transpileQuery(transpiler, "builder");
	    if (this.type != null && this.predicate != null)
	        transpiler.append("builder.and();").newLine();
	}

}
