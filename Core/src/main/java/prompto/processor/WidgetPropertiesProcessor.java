package prompto.processor;


import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IWidgetDeclaration;
import prompto.grammar.Annotation;
import prompto.grammar.Property;
import prompto.grammar.PropertyMap;
import prompto.literal.DictEntry;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TypeLiteral;
import prompto.runtime.Context;
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
		if(properties!=null)
			widget.setProperties(properties);
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
						if(embedded!=null)
							prop.setType(new PropertiesType(embedded));
						else
							return null;
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
