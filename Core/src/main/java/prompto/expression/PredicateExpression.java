package prompto.expression;

import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public abstract class PredicateExpression extends Section {

	public abstract ArrowExpression toArrowExpression();
	abstract IType checkFilter(Context context, IType itemType);
	abstract void filteredToDialect(CodeWriter writer, IExpression source);
	abstract void containsToDialect(CodeWriter writer);

}
