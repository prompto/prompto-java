package prompto.expression;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IterableType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class ExplicitPredicateExpression extends PredicateExpression implements IExpression {
	
	Identifier itemId;
	IExpression predicate;
	
	public ExplicitPredicateExpression(Identifier itemId, IExpression predicate) {
		this.itemId = itemId;
		this.predicate = predicate;
	}


	@Override
	public ArrowExpression toArrowExpression() {
		ArrowExpression arrow = new ArrowExpression(new IdentifierList(itemId), null, null);
		arrow.setExpression(predicate);
		return arrow;
	}


	@Override
	public String toString() {
		return "" + itemId + " where " + predicate.toString(); 
	}
	

	@Override
	void filteredToDialect(CodeWriter writer, IExpression source) {
		writer = writer.newChildWriter();
		IType sourceType = source.check(writer.getContext());
		IType itemType = ((IterableType)sourceType).getItemType();
		writer.getContext().registerInstance(new Variable(itemId, itemType));
		switch(writer.getDialect()) {
		case E:
		case M:
			source.toDialect(writer);
			writer.append(" filtered with ")
				.append(itemId)
				.append(" where ");
			predicate.toDialect(writer);
			break;
		case O:
			writer.append("filtered (");
			source.toDialect(writer);
			writer.append(") with (")
				.append(itemId)
				.append(") where (");
			predicate.toDialect(writer);
			writer.append(")");
			break;
		}
	}
	
	@Override
	void containsToDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case M:
			writer.append(" ")
				.append(itemId)
				.append(" where ");
			predicate.toDialect(writer);
			break;
		case O:
			writer.append(" (")
				.append(itemId)
				.append(") where (");
			predicate.toDialect(writer);
			writer.append(")");
			break;
		}
		
	}

	@Override
	IType checkFilter(Context context, IType itemType) {
		Context child = context.newChildContext();
		child.registerInstance(new Variable(itemId, itemType));
		return predicate.check(child);
	}


	@Override
	public IType check(Context context) {
		throw new UnsupportedOperationException();
	}


	@Override
	public IValue interpret(Context context) throws PromptoError {
		return toArrowExpression().interpret(context);
	}


	@Override
	public void toDialect(CodeWriter writer) {
		throw new UnsupportedOperationException();
	}




}
