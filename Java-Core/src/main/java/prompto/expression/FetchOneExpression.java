package prompto.expression;

import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.store.IStore;
import prompto.store.MemStore;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.NullValue;

public class FetchOneExpression extends Section implements IExpression {

	CategoryType type;
	IExpression filter;
	
	public FetchOneExpression(CategoryType type, IExpression filter) {
		this.type = type;
		this.filter = filter;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch one ");
			writer.append(type.getName().toString());
			break;
		case O:
			writer.append("fetch one (");
			writer.append(type.getName().toString());
			writer.append(")");
			break;
		case S:
			writer.append("fetch one ");
			writer.append(type.getName().toString());
			break;
		}
		writer.append(" where ");
		filter.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getName());
		if(decl==null)
			throw new SyntaxError("Unknown category: " + type.getName().toString());
		Context local = context.newLocalContext();
		IType filterType = filter.check(local);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expresion must return a boolean !");
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IStore store = IStore.getInstance();
		if(store==null)
			store = MemStore.getInstance();
		Document doc = store.fetchOne(context, filter);
		if(doc==null)
			return NullValue.instance();
		else
			return type.newInstance(context, doc);
	}

}
