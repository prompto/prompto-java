package presto.grammar;

import java.util.regex.Pattern;

import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.IValue;


public class MatchingPatternConstraint implements IAttributeConstraint {

	IExpression expression;
	Pattern pattern;
	
	public MatchingPatternConstraint(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void checkValue(Context context, IValue value) throws PrestoError {
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
