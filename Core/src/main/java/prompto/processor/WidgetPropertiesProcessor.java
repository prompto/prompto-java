package prompto.processor;

import java.util.Set;
import java.util.stream.Collectors;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IWidgetDeclaration;
import prompto.error.InternalError;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.literal.BooleanLiteral;
import prompto.literal.DictEntry;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.SetLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TypeLiteral;
import prompto.property.Property;
import prompto.property.PropertyMap;
import prompto.property.TypeSetValidator;
import prompto.property.ValueSetValidator;
import prompto.property.TypeValidator;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.PropertiesType;
import prompto.type.TypeType;
import prompto.value.BooleanValue;
import prompto.value.IValue;

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
		Object value = entry.getValue();
		if(value instanceof TypeLiteral)
			return checkProperty(annotation, context, entry, prop, (TypeLiteral)value);
		else if(value instanceof SetLiteral)
			return checkProperty(annotation, context, entry, prop, (SetLiteral)value);
		else if(value instanceof DocumentLiteral)
			return checkProperty(annotation, context, entry, prop, (DocumentLiteral)value);
		else {
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
			return null;
		}
	}
			
	private Property checkProperty(Annotation annotation, Context context, DictEntry entry, Property prop, DocumentLiteral doc) {
		for(DictEntry child : doc.getEntries()) {
			String name = child.getKey().toString();
			Object value = child.getValue();
			switch(name) {
			case "required":
				if(value instanceof BooleanLiteral)
					prop.setRequired(((BooleanLiteral)value).interpret(context)==BooleanValue.TRUE);
				else {
					context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Boolean value for 'required'.");
					return null;
				}
				break;
			case "help":
				if(value instanceof TextLiteral)
					prop.setHelp(((TextLiteral)value).getValue().getStorableData());
				else {
					context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Text value for 'help'.");
					return null;
				}
				break;
			case "type":
				if(value instanceof TypeLiteral)
					prop.setValidator(new TypeValidator(((TypeLiteral)value).getType()));
				else if(value instanceof DocumentLiteral) {
					PropertyMap embedded = checkProperties(annotation, context, ((DocumentLiteral)value).getEntries());
					if(embedded!=null)
						prop.setValidator(new TypeValidator(new PropertiesType(embedded)));
					else
						return null;
				} else {
					context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Type value for 'type'.");
					return null;
				}
				break;
			case "values":
				if(value instanceof SetLiteral) {
					Set<String> texts = ((SetLiteral)value).getValue().getItems().stream()
							.map(IValue::getStorableData)
							.map(String::valueOf)
							.collect(Collectors.toSet());
					prop.setValidator(new ValueSetValidator(texts));
				} else {
					context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Set value for 'values'.");
					return null;
				}
				break;
			default:
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Unknown property attribute: " + name);
				return null;
			}
		}
		return prop;
	}

	private Property checkProperty(Annotation annotation, Context context, DictEntry entry, Property prop, SetLiteral value) {
		IType itemType = null;
		IType setType = value.check(context);
		if(setType instanceof ContainerType)
			itemType = ((ContainerType)setType).getItemType();
		if(itemType instanceof TypeType) {
			Set<IType> types = ((SetLiteral)entry.getValue()).getItems().stream()
				.map(v->(TypeLiteral)v)
				.map(TypeLiteral::getType)
				.collect(Collectors.toSet());
			prop.setValidator(new TypeSetValidator(types));
			return prop;
			
		} else {
			context.getProblemListener().reportIllegalAnnotation(entry.getKey(), "Expected a set of Types.");
			return null;
		}
	}

	private Property checkProperty(Annotation annotation, Context context, DictEntry entry, Property prop, TypeLiteral value) {
		prop.setValidator(new TypeValidator(((TypeLiteral)entry.getValue()).getType()));
		return prop;
	}


}
