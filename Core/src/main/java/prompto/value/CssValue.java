package prompto.value;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.css.CssExpression;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.CssType;

public class CssValue extends BaseValue {

	CssExpression expression;
	
	public CssValue(CssExpression expression) {
		super(CssType.instance());
		this.expression = expression;
	}
	
	
	@Override
	public String toString() {
		return expression.toString();
	}
	
	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		if (value instanceof CssValue)
			return new CssValue(this.expression.plus(((CssValue)value).expression));
		else
			throw new SyntaxError("Illegal: Css + " + value.getClass().getSimpleName());
	}

	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return expression.toJson(true); // TODO support false
	}

}
