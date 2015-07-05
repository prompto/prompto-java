package prompto.grammar;

import java.util.regex.Pattern;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public class MatchingPatternConstraint implements IAttributeConstraint {

	IExpression expression;
	Pattern pattern;
	
	public MatchingPatternConstraint(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void checkValue(Context context, IValue value) throws PromptoError {
		if(pattern==null) {
			Object toMatch = expression.interpret(context);
			pattern = Pattern.compile(toMatch.toString());
		}
		if(!pattern.matcher(value.toString()).matches())
			throw new InvalidDataError(value.toString() + " does not match:" + pattern.pattern());
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(" matching ");
		expression.toDialect(writer);
	}
}
