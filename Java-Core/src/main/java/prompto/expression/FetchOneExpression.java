package prompto.expression;

import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

public class FetchOneExpression extends Section implements IExpression {

	CategoryType type;
	IExpression filter;
	
	public FetchOneExpression(CategoryType type, IExpression filter) {
		this.type = type;
		this.filter = filter;
	}
	
	public IExpression getFilter() {
		return filter;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch one ");
			writer.append(type.getId().toString());
			writer.append(" where ");
			filter.toDialect(writer);
			break;
		case O:
			writer.append("fetch one (");
			writer.append(type.getId().toString());
			writer.append(") where (");
			filter.toDialect(writer);
			writer.append(")");
			break;
		case S:
			writer.append("fetch one ");
			writer.append(type.getId().toString());
			writer.append(" where ");
			filter.toDialect(writer);
			break;
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
		if(decl==null)
			throw new SyntaxError("Unknown category: " + type.getId().toString());
		IType filterType = filter.check(context);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expresion must return a boolean !");
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IStore store = IDataStore.getInstance();
		IStored stored = store.fetchOne(context, filter);
		if(stored==null)
			return NullValue.instance();
		else
			return type.newInstance(context, stored);
	}

}
