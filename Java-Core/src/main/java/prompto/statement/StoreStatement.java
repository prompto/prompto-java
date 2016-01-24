package prompto.statement;

import java.util.ArrayList;
import java.util.List;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.ExpressionList;
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
		if(writer.getDialect()==Dialect.E)
			expressions.toDialect(writer);
		else {
			writer.append('(');
			expressions.toDialect(writer);
			writer.append(')');
		}
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
		IStore store = IDataStore.getInstance();
		List<IStorable> storables = new ArrayList<>();
		for(IExpression exp : expressions) {
			IValue value = exp.interpret(context);
			if(value instanceof IInstance)
				((IInstance)value).collectStorables(storables);
		}
		store.store(context, storables);
		return null;
	}

}
