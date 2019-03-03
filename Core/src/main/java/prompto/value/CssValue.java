package prompto.value;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.css.CssExpression;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.type.CssType;

public class CssValue extends BaseValue {

	CssExpression expression;
	
	public CssValue(CssExpression expression) {
		super(CssType.instance());
		this.expression = expression;
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return expression.toJson(true); // TODO support false
	}

}
