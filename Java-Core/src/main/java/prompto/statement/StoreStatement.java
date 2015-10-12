package prompto.statement;

import prompto.error.NotStorableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.MemStore;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
import prompto.value.Document;
import prompto.value.IInstance;
import prompto.value.IValue;

public class StoreStatement extends SimpleStatement {
	
	ExpressionList expressions;
	
	public StoreStatement(IExpression expression) {
		this.expressions = new ExpressionList(expression);
	}

	public StoreStatement(ExpressionList expressions) {
		this.expressions = expressions;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("store ");
		expressions.toDialect(writer);
	}
	
	@Override
	public String toString() {
		return "store " + expressions.toString();
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
		return this.expressions.equals(other.expressions);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO check expression
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IStore store = IStore.getInstance();
		if(store==null)
			store = MemStore.getInstance();
		for(IExpression exp : expressions) {
			IValue value = exp.interpret(context);
			IStorable storable = null;
			if(value instanceof IInstance)
				storable = ((IInstance)value).getStorable();
			if(storable==null)
				throw new NotStorableError();
			if(!storable.isDirty())
				continue;
			Document document = storable.asDocument();
			store.store(document);
		}
		return null;
	}

}
