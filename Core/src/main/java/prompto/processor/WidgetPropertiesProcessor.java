package prompto.processor;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IWidgetDeclaration;
import prompto.error.InternalError;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.grammar.Property;
import prompto.grammar.PropertyMap;
import prompto.literal.BooleanLiteral;
import prompto.literal.DictEntry;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TypeLiteral;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.type.IType;
import prompto.type.PropertiesType;

public class WidgetPropertiesProcessor extends AnnotationProcessor {

	@Override
	public void processCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		if(declaration.isAWidget(context))
			doProcessCategory(annotation, context, declaration);
		else
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties is only applicable to widgets");
	}

	private void doProcessCategory(Annotation annotation, Context context, CategoryDeclaration declaration) {
		IWidgetDeclaration widget = declaration.asWidget();
		Object value = annotation.getDefaultArgument();
		PropertyMap properties = checkProperties(annotation, context, value);
		if(properties!=null) {
			widget.setProperties(properties);
			Annotation widgetField = findWidgetPropertiesFieldAnnotation(context, declaration);
			if(widgetField!=null)
				overrideWidgetFieldType(context, widgetField, new PropertiesType(properties));
		}
	}
	
	private void overrideWidgetFieldType(Context context, Annotation widgetField, IType type) {
		Object value = widgetField.getArgument("name");
		if(!(value instanceof TextLiteral))	
			return; // raise warning
		String name = ((TextLiteral)value).toString();
		InstanceContext instance = context.getClosestInstanceContext();
		if(instance==null)
			throw new InternalError("Expected an instance context. Please report this bug.");
		instance.registerWidgetField(new Identifier(name.substring(1, name.length() -1)), type, true);
	}

	private Annotation findWidgetPropertiesFieldAnnotation(Context context, CategoryDeclaration declaration) {
		return declaration.getAllAnnotationsAsStream(context)
				.filter(a->a.isNamed("@WidgetField"))
				.filter(a->{
					Object value = a.getArgument("isProperties");
					return value instanceof BooleanLiteral && ((BooleanLiteral)value).getValue().getValue();
				}).findFirst()
				.orElse(null);
	}

	private PropertyMap checkProperties(Annotation annotation, Context context, Object value) {
		if(!(value instanceof DocumentLiteral)) {
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
			return null;
		}
		return checkProperties(annotation, context, ((DocumentLiteral)value).getEntries());
	}
	
	private PropertyMap checkProperties(Annotation annotation, Context context, DocEntryList entries) {
		PropertyMap props = new PropertyMap();
		for(DictEntry entry : entries) {
			Property prop = checkProperty(annotation, context, entry);
			if(prop==null)
				continue;
			if(props.containsKey(prop.getName()))
				context.getProblemListener().reportIllegalAnnotation(entry.getKey(), "Duplicate property: " + prop.getName());
			else
				props.put(prop.getName(), prop);
		}
		return props;
	}
	
	private Property checkProperty(Annotation annotation, Context context, DictEntry entry) {
		Property prop = new Property();
		prop.setName(entry.getKey().toString());
		if(entry.getValue() instanceof TypeLiteral)
			prop.setType(((TypeLiteral)entry.getValue()).getType());
		else if(entry.getValue() instanceof DocumentLiteral) {
			DocEntryList children = ((DocumentLiteral)entry.getValue()).getEntries();
			for(DictEntry child : children) {
				String name = child.getKey().toString();
				Object value = child.getValue();
				switch(name) {
				case "help":
					if(value instanceof TextLiteral)
						prop.setHelp(((TextLiteral)value).getValue().getStorableData());
					else
						context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Text value for 'help'.");
					break;
				case "type":
					if(value instanceof TypeLiteral)
						prop.setType(((TypeLiteral)value).getType());
					else if(value instanceof DocumentLiteral) {
						PropertyMap embedded = checkProperties(annotation, context, ((DocumentLiteral)value).getEntries());
						prop.setType(new PropertiesType(embedded));
					} else {
						context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Type value for 'type'.");
						return null;
					}
					break;
				default:
					context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Unknown property attribute: " + name);
				}
			}
		} else {
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
			return null;
		}
		return prop;
	}


}
