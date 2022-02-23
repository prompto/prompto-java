package prompto.statement;

import java.util.Objects;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoDeleteAndStoreQuery;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.IterableType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.value.IValue;

public class DeleteAndStoreStatement extends BaseStatement {
	
	ExpressionList deletables;
	ExpressionList storables;
	IExpression metadata;
	StatementList andThen;
	
	public DeleteAndStoreStatement(ExpressionList deletables, ExpressionList storables, IExpression metadata, StatementList andThen) {
		this.deletables = deletables;
		this.storables = storables;
		this.metadata = metadata;
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
		if(metadata!=null) {
			if(writer.getDialect()==Dialect.E) {
				writer.append(" with ");
				metadata.toDialect(writer);
				writer.append(" as metadata");
			} else {
				writer.append(" with metadata(");
				metadata.toDialect(writer);
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
	public int hashCode() {
		return Objects.hash(deletables, storables, metadata);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof DeleteAndStoreStatement))
			return false;
		DeleteAndStoreStatement other = (DeleteAndStoreStatement)obj;
		return Objects.equals(this.deletables, other.deletables)
				&& Objects.equals(this.storables, other.storables)
				&& Objects.equals(this.metadata, other.metadata);
	}
	
	@Override
	public IType check(Context context) {
		checkDeletables(context);
		checkStorables(context);
		checkMetadata(context);
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

	private void checkMetadata(Context context) {
		if(metadata!=null) {
			IType type = metadata.check(context);
			if(type != DocumentType.instance())
				context.getProblemListener().reportIllegalAssignment(this, DocumentType.instance(), type);
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
		PromptoDeleteAndStoreQuery query = new PromptoDeleteAndStoreQuery();
		if(deletables!=null) for(IExpression exp : deletables) {
			IValue value = exp.interpret(context);
			query.delete(context, value);
		}
		if(storables!=null) for(IExpression exp : storables) {
			IValue value = exp.interpret(context);
			query.store(context, value);
		}
		if(metadata!=null) {
			IValue value = metadata.interpret(context);
			query.metadata(context, value);
		}
		query.execute();
		if(andThen!=null)
			andThen.interpret(context);
		return null;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		CompilerUtils.compileNewInstance(method, PromptoDeleteAndStoreQuery.class);
		compileObjectsToDelete(context, method, flags);
		compileStorablesToStore(context, method, flags);
		compileMetaData(context, method, flags);
		compileExecute(context, method, flags);
		if(andThen!=null)
			andThen.compile(context, method, flags);
		return new ResultInfo(void.class);
	}

	private void compileStorablesToStore(Context context, MethodInfo method, Flags flags) {
		if(storables!=null) {
			MethodConstant m = new MethodConstant(PromptoDeleteAndStoreQuery.class, "store", Object.class, void.class);
			for(IExpression exp : storables) {
				method.addInstruction(Opcode.DUP);
				exp.compile(context, method, flags);
				method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			}
		}
	}
	
	private void compileObjectsToDelete(Context context, MethodInfo method, Flags flags) {
		if(deletables!=null) {
			MethodConstant m = new MethodConstant(PromptoDeleteAndStoreQuery.class, "delete", Object.class, void.class);
			for(IExpression exp : deletables) {
				method.addInstruction(Opcode.DUP);
				exp.compile(context, method, flags);
				method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			}
		}
	}

	private void compileMetaData(Context context, MethodInfo method, Flags flags) {
		if(metadata!=null) {
			MethodConstant m = new MethodConstant(PromptoDeleteAndStoreQuery.class, "metadata", Object.class, void.class);
			method.addInstruction(Opcode.DUP);
			metadata.compile(context, method, flags);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		}
		
	}

	private void compileExecute(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoDeleteAndStoreQuery.class, "execute", void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		if(!transpiler.getEngine().isTestEngine())
			transpiler.require("Remote");
		transpiler.require("DataStore");
		if(andThen!=null)
			andThen.declare(transpiler);
		if(metadata!=null)
			transpiler.require("Document");
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("$DataStore.instance.deleteAndStore").append(andThen==null?"":"Async").append("(");
	    this.transpileIdsToDelete(transpiler);
	    transpiler.append(", ");
	    this.transpileStorablesToAdd(transpiler);
	    transpiler.append(", ");
	    this.transpileMetadata(transpiler);
	    this.transpileFuture(transpiler);
	    transpiler.append(")");
	    return false;
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

	private void transpileMetadata(Transpiler transpiler) {
		if(metadata!=null)
			metadata.transpile(transpiler);
		else
			transpiler.append("null");
		
	}

	private void transpileFuture(Transpiler transpiler) {
	    if(andThen!=null) {
	    	transpiler.append(", function() {").indent();
	    	andThen.transpile(transpiler);
	    	transpiler.dedent().append("}.bind(this)");
	    } 
	}


}
