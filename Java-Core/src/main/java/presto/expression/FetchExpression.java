package presto.expression;

import java.util.ArrayList;
import java.util.List;

import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.parser.Section;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.BooleanType;
import presto.type.CollectionType;
import presto.type.IType;
import presto.type.ListType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.ListValue;

public class FetchExpression extends Section implements IExpression {

	Identifier itemName;
	IExpression source;
	IExpression filter;
	
	public FetchExpression(Identifier itemName, IExpression source, IExpression filter) {
		this.itemName = itemName;
		this.source = source;
		this.filter = filter;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch any ");
			writer.append(itemName);
			break;
		case O:
			writer.append("fetch (");
			writer.append(itemName);
			writer.append(")");
			break;
		case S:
			writer.append("fetch ");
			writer.append(itemName);
			break;
		}
		writer.append(" from ");
		source.toDialect(writer);
		writer.append(" where ");
		filter.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof CollectionType))
			throw new SyntaxError("Expecting a list, set or tuple as data source !");
		Context local = context.newLocalContext();
		IType itemType = ((CollectionType)sourceType).getItemType();
		local.registerValue(new Variable(itemName, itemType));
		IType filterType = filter.check(local);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expresion must return a boolean !");
		return new ListType(itemType);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		Object src = source.interpret(context);
		if(src==null)
			throw new NullReferenceError();
		if(!(src instanceof ICollection<?>))
			throw new InternalError("Illegal fetch source: " + source);
		IType sourceType = source.check(context);
		if(!(sourceType instanceof CollectionType))
			throw new InternalError("Illegal source type: " + sourceType.getName());
		IType itemType = ((CollectionType)sourceType).getItemType();
		List<IValue> result = new ArrayList<IValue>();
		Context local = context.newLocalContext();
		Variable item = new Variable(itemName, itemType);
		local.registerValue(item);
		for(IValue o : ((ICollection<?>)src).getItems(context)) {
			local.setValue(itemName, o);
			Object test = filter.interpret(local);
			if(!(test instanceof Boolean))
				throw new InternalError("Illegal test result: " + test);
			if(((Boolean)test).getValue())
				result.add(o);
		}
		return new ListValue(itemType, result);
	}
}
