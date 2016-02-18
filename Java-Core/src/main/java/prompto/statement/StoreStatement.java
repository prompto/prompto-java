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
import prompto.value.IteratorValue;
import prompto.value.ListValue;

public class StoreStatement extends SimpleStatement {
	
	ExpressionList del;
	ExpressionList add;
	
	public StoreStatement(ExpressionList del, ExpressionList add) {
		this.del = del;
		this.add = add;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("store ");
		if(writer.getDialect()==Dialect.E)
			add.toDialect(writer);
		else {
			writer.append('(');
			add.toDialect(writer);
			writer.append(')');
		}
	}
	
	@Override
	public String toString() {
		return "store " + add.toString();
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
		return this.add.equals(other.add);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO check expression
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IStore store = IDataStore.getInstance();
		List<IValue> dbIdsToDel = collectDbIdsToDel(context);
		List<IStorable> docsToAdd = collectDocsToAdd(context);
		if(dbIdsToDel!=null || docsToAdd!=null)
			store.store(context, dbIdsToDel, docsToAdd);
		return null;
	}

	private List<IStorable> collectDocsToAdd(Context context) throws PromptoError {
		if(add==null || add.isEmpty())
			return null;
		List<IStorable> docsToAdd = new ArrayList<>();
		for(IExpression exp : add) {
			IValue value = exp.interpret(context);
			collectDocsToAdd(context, docsToAdd, value);
		}
		if(docsToAdd.isEmpty())
			return null;
		else
			return docsToAdd;
	}
	
	private void collectDocsToAdd(Context context, List<IStorable> docsToAdd, IValue value) throws PromptoError {
		if(value instanceof IInstance)
			((IInstance)value).collectStorables(docsToAdd);
		else if(value instanceof ListValue) {
			ListValue list = (ListValue)value;
			for(IValue item : list.getItems()) {
				collectDocsToAdd(context, docsToAdd, item);
			}
		} else if(value instanceof IteratorValue) {
			IteratorValue iter = (IteratorValue)value;
			while(iter.hasNext()) {
				collectDocsToAdd(context, docsToAdd, iter.next());
			}
		}
	}

	private List<IValue> collectDbIdsToDel(Context context) throws PromptoError {
		if(del==null || del.isEmpty())
			return null;
		List<IValue> dbIdsToDel = new ArrayList<>();
		for(IExpression exp : del) {
			IValue value = exp.interpret(context);
			collectDbIdsToDel(context, dbIdsToDel, value);
		}
		if(dbIdsToDel.isEmpty())
			return null;
		else
			return dbIdsToDel;
	}
	
	private void collectDbIdsToDel(Context context, List<IValue> dbIdsToDel, IValue value) throws PromptoError {
		if(value instanceof IInstance) {
			IValue dbId = ((IInstance)value).getMember(context, IStore.dbIdIdentifier, false);
			if(dbId!=null)
				dbIdsToDel.add(dbId);
		} else if(value instanceof ListValue) {
			for(IValue item : ((ListValue)value).getItems()) {
				collectDbIdsToDel(context, dbIdsToDel, item);
			}
		} else if(value instanceof IteratorValue) {
			IteratorValue iter = (IteratorValue)value;
			while(iter.hasNext()) {
				collectDbIdsToDel(context, dbIdsToDel, iter.next());
			}
		} else if(value.getType()==IDataStore.getInstance().getDbIdType())
			dbIdsToDel.add(value);
	}
	
}
