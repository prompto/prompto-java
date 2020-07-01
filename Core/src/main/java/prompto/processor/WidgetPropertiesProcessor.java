package prompto.processor;

import java.util.Set;
import java.util.stream.Collectors;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IWidgetDeclaration;
import prompto.error.InternalError;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.literal.BooleanLiteral;
import prompto.literal.DocEntry;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.SetLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TypeLiteral;
import prompto.property.Property;
import prompto.property.PropertyMap;
import prompto.property.TypeSetValidator;
import prompto.property.TypeValidator;
import prompto.property.ValueSetValidator;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.type.PropertiesType;
import prompto.type.TextType;
import prompto.type.TypeType;
import prompto.value.BooleanValue;
import prompto.value.IValue;
import prompto.value.NullValue;
import prompto.value.SetValue;
import prompto.value.TypeValue;

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
		instance.overrideWidgetFieldType(new Identifier(name.substring(1, name.length() -1)), type, this);
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
		return loadProperties(annotation, context, ((DocumentLiteral)value).getEntries());
	}
	
	public PropertyMap loadProperties(Annotation annotation, Context context, DocEntryList entries) {
		PropertyMap props = new PropertyMap();
		for(DocEntry entry : entries) {
			Property prop = loadProperty(annotation, context, entry);
			if(prop==null)
				continue;
			if(props.containsKey(prop.getName()))
				context.getProblemListener().reportIllegalAnnotation(entry.getKey(), "Duplicate property: " + prop.getName());
			else
				props.put(prop.getName(), prop);
		}
		return props;
	}
	
	private Property loadProperty(Annotation annotation, Context context, DocEntry entry) {
		Property prop = new Property();
		prop.setName(entry.getKey().toString());
		Object value = entry.getValue();
		if(value instanceof TypeLiteral)
			return loadProperty(annotation, context, entry, prop, (TypeLiteral)value);
		else if(value instanceof SetLiteral)
			return loadProperty(annotation, context, entry, prop, (SetLiteral)value);
		else if(value instanceof DocumentLiteral)
			return loadProperty(annotation, context, entry, prop, (DocumentLiteral)value);
		else {
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
			return null;
		}
	}
			
	private Property loadProperty(Annotation annotation, Context context, DocEntry entry, Property prop, DocumentLiteral doc) {
		for(DocEntry child : doc.getEntries()) {
			String name = child.getKey().toString();
			Object value = child.getValue();
			switch(name) {
			case "required":
				if(value instanceof BooleanLiteral) {
					prop.setRequired(((BooleanLiteral)value).interpret(context)==BooleanValue.TRUE);
					break;
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Boolean value for 'required'.");
				return null;
			case "help":
				if(value instanceof TextLiteral) {
					prop.setHelp(((TextLiteral)value).getValue().getStorableData());
					break;
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Text value for 'help'.");
				return null;
			case "type":
				if(value instanceof TypeLiteral) {
					IType type = ((TypeLiteral)value).getType().resolve(context, t->context.getProblemListener().reportIllegalAnnotation(annotation, "Unkown type: " + t.getTypeName()));
					if(type==null)
						return null;
					prop.setValidator(new TypeValidator(type));
					break;
				} else if(value instanceof DocumentLiteral) {
					PropertyMap embedded = loadProperties(annotation, context, ((DocumentLiteral)value).getEntries());
					if(embedded!=null) {
						prop.setValidator(new TypeValidator(new PropertiesType(embedded)));
						break;
					}
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Type value for 'type'.");
				return null;
			case "types":
				if(value instanceof SetLiteral) {
					SetValue values = ((SetLiteral)value).interpret(context);
					if(values.getItemType() instanceof TypeType) {
						Set<IType> types = values.getItems().stream()
								.filter(v->v!=NullValue.instance())
								.map(v->(TypeValue)v)
								.map(TypeValue::getValue)
								.map(type->type.resolve(context,t->context.getProblemListener().reportIllegalAnnotation(annotation, "Unkown type: " + t.getTypeName())))
								.collect(Collectors.toSet());
						if(types.contains(null))
							return null; // TODO something went wrong
						prop.setValidator(new TypeSetValidator(types));
						prop.setRequired(types.size()==values.getLength()); // no null filtered out
						break;
					}
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Set of types for 'types'.");
				return null;
			case "values":
				if(value instanceof SetLiteral) {
					SetValue values = ((SetLiteral)value).interpret(context);
					Set<String> texts = values.getItems().stream()
							.filter(v->v!=NullValue.instance())
							.map(IValue::getStorableData)
							.map(String::valueOf)
							.collect(Collectors.toSet());
					prop.setValidator(new ValueSetValidator(texts));
					prop.setRequired(texts.size()==values.getLength()); // no null filtered out
					break;
				} 
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Set value for 'values'.");
				return null;
			default:
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Unknown property attribute: " + name);
				return null;
			}
		}
		return prop;
	}

	private Property loadProperty(Annotation annotation, Context context, DocEntry entry, Property prop, SetLiteral literal) {
		SetValue values = literal.interpret(context);
		IType itemType = values.getItemType();
		if(itemType instanceof TypeType) {
			Set<IType> types = values.getItems().stream()
				.filter(v->v!=NullValue.instance())
				.map(v->(TypeValue)v)
				.map(TypeValue::getValue)
				.map(type->type.resolve(context,t->context.getProblemListener().reportIllegalAnnotation(annotation, "Unkown type: " + t.getTypeName())))
				.collect(Collectors.toSet());
			if(types.contains(null))
				return null;
			prop.setValidator(new TypeSetValidator(types));
			prop.setRequired(types.size()==values.getLength()); // no null filtered out
			return prop;
		} else if(itemType==AnyType.instance() || itemType==TextType.instance()) {
			Set<String> texts = values.getItems().stream()
					.filter(v->v!=NullValue.instance())
					.map(Object::toString)
					.collect(Collectors.toSet());
				prop.setValidator(new ValueSetValidator(texts));
				prop.setRequired(texts.size()==values.getLength()); // no null filtered out
				return prop;
		} else {
			context.getProblemListener().reportIllegalAnnotation(entry.getKey(), "Expected a set of Types.");
			return null;
		}
	}

	private Property loadProperty(Annotation annotation, Context context, DocEntry entry, Property prop, TypeLiteral value) {
		IType type = value.getType().resolve(context, t->context.getProblemListener().reportIllegalAnnotation(annotation, "Unkown type: " + t.getTypeName()));
		if(type==null)
			return null;
		prop.setValidator(new TypeValidator(type));
		return prop;
	}


}
