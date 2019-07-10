package prompto.processor;

import prompto.declaration.CategoryDeclaration;
import prompto.expression.TypeExpression;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;

public class WidgetFieldProcessor extends AnnotationProcessor {

	@Override
	public void processCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		if(declaration.isAWidget(context))
			doProcessCategory(annotation, context, declaration);
		else
			context.getProblemListener().reportIllegalAnnotation("WidgetField is only applicable to widgets", annotation);
	}

	private void doProcessCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		Object fieldName = annotation.getArgument("name");
		Object fieldType = annotation.getArgument("type");
		if (!(fieldName instanceof TextLiteral))
			context.getProblemListener().reportIllegalAnnotation("WidgetField requires a Text value for argument 'name'",  annotation);
		else if (!(fieldType instanceof TypeExpression))
			context.getProblemListener().reportIllegalAnnotation("WidgetField requires a Type value for argument 'type'",  annotation);
		else {
			String name = ((TextLiteral)fieldName).toString();
			IType type = ((TypeExpression)fieldType).getType();
			context.registerValue(new Variable(new Identifier(name.substring(1, name.length() -1)), type), false);
		}
	}
}
