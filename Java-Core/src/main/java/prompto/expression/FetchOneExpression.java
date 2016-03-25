package prompto.expression;

import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IPredicateExpression;
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
	IExpression predicate;
	
	public FetchOneExpression(CategoryType type, IExpression predicate) {
		this.type = type;
		this.predicate = predicate;
	}
	
	public CategoryType getType() {
		return type;
	}
	
	public IPredicateExpression getPredicate() {
		return (IPredicateExpression)predicate; // assume this was checked earlier
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("fetch one ");
			type.toDialect(writer);
			writer.append(" where ");
			predicate.toDialect(writer);
			break;
		case O:
			writer.append("fetch one (");
			type.toDialect(writer);
			writer.append(") where (");
			predicate.toDialect(writer);
			writer.append(")");
			break;
		case S:
			writer.append("fetch one ");
			type.toDialect(writer);
			writer.append(" where ");
			predicate.toDialect(writer);
			break;
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getTypeNameId());
		if(decl==null)
			throw new SyntaxError("Unknown category: " + type.getTypeName());
		if(!(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IType filterType = predicate.check(context);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(!(predicate instanceof IPredicateExpression))
			throw new SyntaxError("Filtering expression must be a predicate !");
		IStore<Object>store = IDataStore.getInstance();
		IStored stored = store.fetchOne(context, type, (IPredicateExpression)predicate);
		if(stored==null)
			return NullValue.instance();
		else
			return type.newInstance(context, stored);
	}

}
