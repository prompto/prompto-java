package prompto.grammar;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.InvalidValueError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IContainer;
import prompto.value.IValue;

public class MatchingCollectionConstraint implements IAttributeConstraint {
	
	IExpression collection;
	
	public MatchingCollectionConstraint(IExpression collection) {
		this.collection = collection;
	}
	
	@Override
	public void checkValue(Context context, IValue value) throws PromptoError {
		Object container = collection.interpret(context);
		if(container instanceof IContainer) {
			if(!((IContainer<?>)container).hasItem(context, value))
				throw new InvalidValueError("Value:" + value.toString() + " is not in range: " + collection.toString());
		} else
			throw new InvalidValueError("Not a collection: " + collection.toString());
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(" in ");
		collection.toDialect(writer);
	}
	
	@Override
	public void compile(Context context, MethodInfo method, Flags flags) {
		throw new UnsupportedOperationException();
	}
}
