package prompto.jsx;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.value.IValue;
import prompto.value.JsxValue;

public interface IJsxExpression extends IExpression {

	default IValue interpret(Context context) throws PromptoError {
		return new JsxValue(this);
	}

}
