package prompto.jsx;

import java.util.Set;
import java.util.stream.Collectors;

import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.literal.Literal;
import prompto.literal.TypeLiteral;
import prompto.property.Property;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.VoidType;
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
		return expression == null ? "" : expression.toString();
	}
	
	@Override
	public IType check(Context context) {
		return expression == null ? VoidType.instance() : expression.check(context);
	}
	
	@Override
	public IType checkProto(Context context, MethodType expected) {
		if(expression instanceof ArrowExpression)
			return expected.checkArrowExpression(context, (ArrowExpression)expression);
		else if(expression instanceof TypeLiteral)
			return ((TypeLiteral)expression).getType().resolve(context, null);
		else if(expression != null)
			return expression.check(context);
		else 
			return VoidType.instance();
	}
	
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("{");
		if(expression!=null)
			expression.toDialect(writer);
		writer.append("}");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		declare(transpiler, null);
	}

	@Override
	public void declare(Transpiler transpiler, Property property) {
		if(!declareArrowExpressionCall(transpiler, expression, property) && expression != null)
			expression.declare(transpiler);
	}
	
	
	private boolean declareArrowExpressionCall(Transpiler transpiler, IExpression expression, Property property) {
		if(expression instanceof ContextualExpression)
			expression = ((ContextualExpression)expression).getExpression();
		if(expression instanceof ArrowExpression) {
			MethodType target = getMethodType(transpiler.getContext(), property);
			if(target==null)
				transpiler.getContext().getProblemListener().reportMissingArrowPrototype((ArrowExpression)expression, expression.toString());
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
		if(!transpileArrowExpressionCall(transpiler, expression, property) && expression != null)
			expression.transpileProperty(transpiler, property);
		return false;
	}

	private boolean transpileArrowExpressionCall(Transpiler transpiler, IExpression expression, Property property) {
		if(expression instanceof ContextualExpression)
			expression = ((ContextualExpression)expression).getExpression();
		if(expression instanceof ArrowExpression) {
			MethodType target = getMethodType(transpiler.getContext(), property);
			if(target==null)
				transpiler.getContext().getProblemListener().reportMissingArrowPrototype((ArrowExpression)expression, expression.toString());
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
		if(types==null || types.isEmpty()) {
			context.getProblemListener().reportMissingArrowPrototype((ArrowExpression)expression, expression.toString());
			return null;
		} else if(types.size() > 1) {
			context.getProblemListener().reportTooManyArrowPrototypes((ArrowExpression)expression, expression.toString(), types.stream().map(Object::toString).collect(Collectors.toSet()));
			return null;
		} else
			return types.iterator().next();
	}

}
