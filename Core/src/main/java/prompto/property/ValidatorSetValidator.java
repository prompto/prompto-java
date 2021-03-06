package prompto.property;

import java.util.List;
import java.util.stream.Collectors;

import prompto.jsx.JsxProperty;
import prompto.problem.ProblemCollector;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;

public class ValidatorSetValidator implements IPropertyValidator {

	List<IPropertyValidator> validators;
	
	public ValidatorSetValidator(List<IPropertyValidator> validators) {
		this.validators = validators;
	}

	@Override
	public IType getType(Context context) {
		return AnyType.instance();
	}

	@Override
	public boolean validate(Context context, JsxProperty jsxProp) {
	     boolean valid = false;
        context.pushProblemListener(new ProblemCollector());
        try {
            valid = this.validators.stream().anyMatch(v -> v.validate(context, jsxProp));
        } finally {
            context.popProblemListener();
        }
        if(valid)
            return true;
        else {
            String message = "Illegal value " + jsxProp.getValue() + ", expected one of " + this.toLiteral();
            context.getProblemListener().reportIllegalValue(jsxProp, message);
            return false;
        }
	}

	@Override
	public String getKeyName() {
		return "values";
	}

	@Override
	public String toLiteral() {
		return "<" + validators.stream().map(s->s==null? "null" : s.toLiteral()).collect(Collectors.joining(", ")) + ">";
	}

}
