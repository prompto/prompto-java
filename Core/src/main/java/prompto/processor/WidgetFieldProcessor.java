package prompto.processor;

import prompto.declaration.CategoryDeclaration;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.literal.TextLiteral;
import prompto.literal.TypeLiteral;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.type.IType;
import prompto.error.InternalError;
import prompto.expression.TypeExpression;

public class WidgetFieldProcessor extends AnnotationProcessor {

	@Override
	public void processCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		if(declaration.isAWidget(context))
			doProcessCategory(annotation, context, declaration);
		else
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetField is only applicable to widgets");
	}

	private void doProcessCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		Object fieldName = annotation.getArgument("name");
		Object fieldType = annotation.getArgument("type");
		if (!(fieldName instanceof TextLiteral))
			context.getProblemListener().reportIllegalAnnotation(annotation,  "WidgetField requires a Text value for argument 'name'");
		if (!(fieldType instanceof TypeLiteral || fieldType instanceof TypeExpression))
			context.getProblemListener().reportIllegalAnnotation(annotation,  "WidgetField requires a Type value for argument 'type'");
		else {
			InstanceContext instance = context.getClosestInstanceContext();
			if(instance==null)
				throw new InternalError("Expected an instance context. Please report this bug.");
			else {
				String name = ((TextLiteral)fieldName).toString();
				IType type = fieldType instanceof TypeLiteral ? ((TypeLiteral)fieldType).getType() : ((TypeExpression)fieldType).getType();
				instance.registerWidgetField(new Identifier(name.substring(1, name.length() -1)), type, this);
			}
		}
	}
}
