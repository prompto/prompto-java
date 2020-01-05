package prompto.jsx;

import java.util.Set;

import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.literal.Literal;
import prompto.property.Property;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.ContextualExpression;

public class JsxExpression implements IJsxValue, IJsxExpression {

	IExpression expression;
	
	public JsxExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public boolean isLiteral() {
		return expression instanceof Literal<?>;
	}
	
	@Override
	public String toString() {
		return expression.toString();
	}
	
	@Override
	public IType check(Context context) {
		return expression.check(context);
	}
	
	@Override
	public IType checkProto(Context context, MethodType expected) {
		if(expression instanceof ArrowExpression)
			return expected.checkArrowExpression(context, (ArrowExpression)expression);
		else
			return expression.check(context);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("{");
		expression.toDialect(writer);
		writer.append("}");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		declare(transpiler, null);
	}

	@Override
	public void declare(Transpiler transpiler, Property property) {
		if(!declareArrowExpressionCall(transpiler, expression, property))
			expression.declare(transpiler);
	}
	
	
	private boolean declareArrowExpressionCall(Transpiler transpiler, IExpression expression2, Property property) {
		if(expression instanceof ContextualExpression)
			expression = ((ContextualExpression)expression).getExpression();
		if(expression instanceof ArrowExpression) {
			MethodType target = getMethodType(transpiler.getContext(), property);
			if(target==null)
				transpiler.getContext().getProblemListener().reportNoMatchingPrototype((ArrowExpression)expression, "Cannot use arrow expression without a prototype");
			else
				target.declareArrowExpression(transpiler, (ArrowExpression)expression);
			return true;
		} else
			return false;
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		return transpile(transpiler, null);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler, Property property) {
		if(!transpileArrowExpressionCall(transpiler, expression, property))
			expression.transpile(transpiler);
		return false;
	}

	private boolean transpileArrowExpressionCall(Transpiler transpiler, IExpression expression, Property property) {
		if(expression instanceof ContextualExpression)
			expression = ((ContextualExpression)expression).getExpression();
		if(expression instanceof ArrowExpression) {
			MethodType target = getMethodType(transpiler.getContext(), property);
			if(target==null)
				transpiler.getContext().getProblemListener().reportNoMatchingPrototype((ArrowExpression)expression, "Cannot use arrow expression without a prototype");
			else
				target.transpileArrowExpression(transpiler, (ArrowExpression)expression);
			return true;
		} else
			return false;
	}

	private MethodType getMethodType(Context context, Property property) {
		if(property==null)
			return null;
		Set<MethodType> types = property.getValidator().getMethodTypes(context);
		if(types!=null && types.size()==1)
			return types.iterator().next();
		if(types==null || types.isEmpty())
			context.getProblemListener().reportNoMatchingPrototype((ArrowExpression)expression, "Cannot use arrow expression without a prototype");
		else if(types.size() > 1)
			context.getProblemListener().reportNoMatchingPrototype((ArrowExpression)expression, "Ambiguous prototype");
		return null;
	}

}
