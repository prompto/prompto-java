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
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.value.IValue;

public class StoreStatement extends SimpleStatement {
	
	ExpressionList deletables;
	ExpressionList storables;
	
	public StoreStatement(ExpressionList delete, ExpressionList add) {
		this.deletables = delete;
		this.storables = add;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("store ");
		if(writer.getDialect()==Dialect.E)
			storables.toDialect(writer);
		else {
			writer.append('(');
			storables.toDialect(writer);
			writer.append(')');
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
		// TODO check expressions
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		PromptoStoreQuery store = new PromptoStoreQuery();
		if(deletables!=null) for(IExpression exp : deletables) {
			IValue value = exp.interpret(context);
			store.delete(context, value);
		}
		if(storables!=null) for(IExpression exp : storables) {
			IValue value = exp.interpret(context);
			store.store(context, value);
		}
		store.execute();
		return null;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		CompilerUtils.compileNewInstance(method, PromptoStoreQuery.class);
		compileObjectsToDelete(context, method, flags);
		compileStorablesToStore(context, method, flags);
		compileExecute(context, method, flags);
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
	

	
}
