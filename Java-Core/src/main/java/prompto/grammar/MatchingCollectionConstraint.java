package prompto.grammar;

import prompto.error.InvalidDataError;
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
				throw new InvalidDataError("Value:" + value.toString() + " is not in range: " + collection.toString());
		} else
			throw new InvalidDataError("Not a collection: " + collection.toString());
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(" in ");
		collection.toDialect(writer);
	}
}
