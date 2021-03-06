package prompto.statement;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoStoreQuery;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.type.IterableType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.value.IValue;

public class StoreStatement extends BaseStatement {
	
	ExpressionList deletables;
	ExpressionList storables;
	StatementList andThen;
	
	public StoreStatement(ExpressionList deletables, ExpressionList storables, StatementList andThen) {
		this.deletables = deletables;
		this.storables = storables;
		this.andThen = andThen;
	}
	
	@Override
	public boolean isSimple() {
		return andThen==null;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(deletables!=null) {
			writer.append("delete ");
			if(writer.getDialect()==Dialect.E)
				deletables.toDialect(writer);
			else {
				writer.append('(');
				deletables.toDialect(writer);
				writer.append(')');
			}
			if(storables!=null)
				writer.append(" and ");
		}
		if(storables!=null) {
			writer.append("store ");
			if(writer.getDialect()==Dialect.E)
				storables.toDialect(writer);
			else {
				writer.append('(');
				storables.toDialect(writer);
				writer.append(')');
			}
		}
		if(andThen!=null) {
			if(writer.getDialect()==Dialect.O) {
				writer.append(" then {").newLine().indent();
				andThen.toDialect(writer);
				writer.dedent().append("}");
			} else {
				writer.append(" then:").newLine().indent();
				andThen.toDialect(writer);
				writer.dedent();
			}
		}
	}
	
	@Override
	public String toString() {
		return "store " + storables.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof StoreStatement))
			return false;
		StoreStatement other = (StoreStatement)obj;
		return this.storables.equals(other.storables);
	}
	
	@Override
	public IType check(Context context) {
		checkDeletables(context);
		checkStorables(context);
		checkFuture(context);
		return VoidType.instance();
	}
	
	private void checkDeletables(Context context) {
		if(deletables!=null) 
			deletables.forEach(exp->checkStorable(context, exp));
	}

	private void checkStorables(Context context) {
		if(storables!=null) 
			storables.forEach(exp->checkStorable(context, exp));
	}

	private void checkStorable(Context context, IExpression exp) {
		IType type = exp.check(context);
		if(type instanceof IterableType)
			type = ((IterableType)type).getItemType();
		// on certain scenarios the type will be vague, we skip checking
		if(type == AnyType.instance())
			return;
		else if(!type.isStorable(context)) {
			String name = exp.toString();
			if(name.contains(" ") || name.contains(","))
				name = type.getTypeName();
			context.getProblemListener().reportNotStorable(this, name);
		}
	}

	private void checkFuture(Context context) {
		if(andThen!=null) {
			context = context.newChildContext();
			andThen.check(context, VoidType.instance());
		}
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		PromptoStoreQuery query = new PromptoStoreQuery();
		if(deletables!=null) for(IExpression exp : deletables) {
			IValue value = exp.interpret(context);
			query.delete(context, value);
		}
		if(storables!=null) for(IExpression exp : storables) {
			IValue value = exp.interpret(context);
			query.store(context, value);
		}
		query.execute();
		if(andThen!=null)
			andThen.interpret(context);
		return null;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		CompilerUtils.compileNewInstance(method, PromptoStoreQuery.class);
		compileObjectsToDelete(context, method, flags);
		compileStorablesToStore(context, method, flags);
		compileExecute(context, method, flags);
		if(andThen!=null)
			andThen.compile(context, method, flags);
		return new ResultInfo(void.class);
	}

	private void compileStorablesToStore(Context context, MethodInfo method, Flags flags) {
		if(storables!=null) {
			MethodConstant m = new MethodConstant(PromptoStoreQuery.class, "store", Object.class, void.class);
			for(IExpression exp : storables) {
				method.addInstruction(Opcode.DUP);
				exp.compile(context, method, flags);
				method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			}
		}
	}
	
	private void compileObjectsToDelete(Context context, MethodInfo method, Flags flags) {
		if(deletables!=null) {
			MethodConstant m = new MethodConstant(PromptoStoreQuery.class, "delete", Object.class, void.class);
			for(IExpression exp : deletables) {
				method.addInstruction(Opcode.DUP);
				exp.compile(context, method, flags);
				method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			}
		}
	}

	private void compileExecute(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoStoreQuery.class, "execute", void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		if(!transpiler.getEngine().isTestEngine())
			transpiler.require("Remote");
		transpiler.require("DataStore");
		if(andThen!=null)
			andThen.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("$DataStore.instance.store").append(andThen==null?"":"Async").append("(");
	    this.transpileIdsToDelete(transpiler);
	    transpiler.append(", ");
	    this.transpileStorablesToAdd(transpiler);
	    if(andThen!=null) {
	    	transpiler.append(", function() {").indent();
	    	andThen.transpile(transpiler);
	    	transpiler.dedent().append("}.bind(this)");
	    }
	    transpiler.append(")");
	    return false;
	}

	private void transpileStorablesToAdd(Transpiler transpiler) {
	    if (this.storables==null)
	        transpiler.append("null");
	    else {
	        transpiler.append("(function() { ").indent();
	        transpiler.append("var storablesToAdd = new Set();").newLine();
	        this.storables.forEach(exp-> {
	            exp.transpile(transpiler);
	            transpiler.append(" && ");
	            exp.transpile(transpiler);
	            transpiler.append(".collectStorables(storablesToAdd);").newLine();
	        });
	        transpiler.append("return Array.from(storablesToAdd);").newLine();
	        transpiler.dedent().append("})()");
	    }
	}

	private void transpileIdsToDelete(Transpiler transpiler) {
	    if(this.deletables==null)
	        transpiler.append("null");
	    else {
	        transpiler.append("(function() { ").indent();
	        transpiler.append("var idsToDelete = new Set();").newLine();
	        this.deletables.forEach(exp -> {
	            exp.transpile(transpiler);
	            transpiler.append(" && ");
	            exp.transpile(transpiler);
	            transpiler.append(".collectDbIds(idsToDelete);").newLine();
	        });
	        transpiler.append("return Array.from(idsToDelete);").newLine();
	        transpiler.dedent().append("})()");
	    }
	}

	
}
