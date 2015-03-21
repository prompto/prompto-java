package presto.grammar;

import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;

public class MatchingCollectionConstraint implements IAttributeConstraint {
	
	IExpression collection;
	
	public MatchingCollectionConstraint(IExpression collection) {
		this.collection = collection;
	}
	
	@Override
	public void checkValue(Context context, IValue value) throws PrestoError {
		Object container = collection.interpret(context);
		if(container instanceof ICollection) {
			if(!((ICollection<?>)container).hasItem(context, value))
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
