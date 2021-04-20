package prompto.processor;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IWidgetDeclaration;
import prompto.error.InternalError;
import prompto.expression.MethodExpression;
import prompto.expression.TypeExpression;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoSet;
import prompto.literal.BooleanLiteral;
import prompto.literal.DocEntry;
import prompto.literal.DocEntryList;
import prompto.literal.DocumentLiteral;
import prompto.literal.SetLiteral;
import prompto.literal.TextLiteral;
import prompto.literal.TypeLiteral;
import prompto.property.IPropertyValidator;
import prompto.property.Property;
import prompto.property.PropertyMap;
import prompto.property.TypeSetValidator;
import prompto.property.TypeValidator;
import prompto.property.ValidatorSetValidator;
import prompto.property.ValueSetValidator;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.PropertiesType;
import prompto.type.TextType;
import prompto.type.TypeType;
import prompto.value.BooleanValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.NullValue;
import prompto.value.SetValue;
import prompto.value.TextValue;
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
				.filter(a->a.toString().equals("@WidgetField"))
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
		if(value instanceof MethodExpression) {
			value = ((MethodExpression)value).asTypeLiteral(context);
		}
		if(value instanceof TypeExpression) {
			IType type = ((TypeExpression)value).getType();
			value = new TypeLiteral(type);
		}
		if(value instanceof TypeLiteral)
			return loadPropertyFromTypeLiteral(annotation, context, entry, prop, (TypeLiteral)value);
		else if(value instanceof SetLiteral)
			return loadPropertyFromSetLiteral(annotation, context, entry, prop, (SetLiteral)value);
		else if(value instanceof DocumentLiteral)
			return loadPropertyFromDocumentLiteral(annotation, context, entry, prop, (DocumentLiteral)value);
		else {
			context.getProblemListener().reportIllegalAnnotation(annotation, "WidgetProperties expects a Document of types as unique parameter");
			return null;
		}
	}
			
	private Property loadPropertyFromDocumentLiteral(Annotation annotation, Context context, DocEntry entry, Property prop, DocumentLiteral doc) {
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
					IPropertyValidator validator = newTypeValidator(annotation, context, entry, prop, ((TypeLiteral)value).getType());
					if(validator != null) {
						prop.setValidator(validator);
						break;
					}
				} else if(value instanceof DocumentLiteral) {
					PropertyMap embedded = loadProperties(annotation, context, ((DocumentLiteral)value).getEntries());
					if(embedded!=null) {
						prop.setValidator(new TypeValidator(new PropertiesType(embedded)));
						break;
					}
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Type for 'type'.");
				return null;
			case "types":
				if(value instanceof SetLiteral) {
					SetValue values = ((SetLiteral)value).interpret(context);
					if(values.getItemType() instanceof TypeType) {
						IPropertyValidator validator = newTypeSetValidator(annotation, context, values);
						if(validator != null) {
							prop.setValidator(validator);
							break;
						}
					}
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Set of types for 'types'.");
				return null;
			case "values":
				if(value instanceof SetLiteral) {
					SetValue values = ((SetLiteral)value).interpret(context);
					if(values.getItemType() instanceof TextType || values.getItemType() instanceof IntegerType) {
							IPropertyValidator validator = newValueSetValidator(annotation, context, values);
						if(validator != null) {
							prop.setValidator(validator);
							break;
						} 
					}
				}
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Expected a Set of values for 'values'.");
				return null;
			default:
				context.getProblemListener().reportIllegalAnnotation(child.getKey(), "Unknown property attribute: " + name);
				return null;
			}
		}
		return prop;
	}

	private Property loadPropertyFromSetLiteral(Annotation annotation, Context context, DocEntry entry, Property prop, SetLiteral literal) {
		SetValue value = literal.interpret(context);
		IPropertyValidator validator = newValidatorFromSetValue(annotation, context, value) ;
		if(validator != null) {
			prop.setValidator(validator);
			return prop;
		} else {
			context.getProblemListener().reportIllegalAnnotation(entry.getKey(), "Expected a Set of types or values.");
			return null;
		}
	}
	

	private Property loadPropertyFromTypeLiteral(Annotation annotation, Context context, DocEntry entry, Property prop, TypeLiteral value) {
		IPropertyValidator validator = newTypeValidator(annotation, context, entry, prop, value.getType());
		if(validator==null)
			return null;
		prop.setValidator(validator);
		return prop;
	}

	private IPropertyValidator newTypeValidator(Annotation annotation, Context context, DocEntry entry, Property prop, IType type) {
		IType actual = type.resolve(context, t->context.getProblemListener().reportIllegalAnnotation(annotation, "Unknown type: " + t.getTypeName()));
		return actual==null ? null : new TypeValidator(actual);
	}

	private IPropertyValidator newValidatorFromSetValue(Annotation annotation, Context context, SetValue value) {
		IType itemType = value.getItemType();
		if(itemType instanceof TypeType)
			return newTypeSetValidator(annotation, context, value);
		else if(itemType == TextType.instance() || itemType == IntegerType.instance())
			return newValueSetValidator(annotation, context, value);
		else if(itemType == AnyType.instance()) {
			if(setContainsType(context, value))
				return newValidatorSetValidator(annotation, context, value);
			else
				return newValueSetValidator(annotation, context, value);
		} else 
			return null;
	}

	private boolean setContainsType(Context context, SetValue value) {
		return value.getItems().stream()
				.map(IValue::getType)
				.anyMatch(t -> t instanceof TypeType);
	}

	private IPropertyValidator newValidatorSetValidator(Annotation annotation, Context context, SetValue value) {
        List<IPropertyValidator> validators = value.getItems().stream()
                .filter(l -> l != NullValue.instance())
                .map(l -> newValidatorFromValue(annotation, context, l))
                .filter(Objects::nonNull)
                .map(v -> v.optional())
                .collect(Collectors.toList());
        IPropertyValidator result = new ValidatorSetValidator(validators);
        if(validators.size() == value.getLength()) // no null filtered out
        	result = result.required();
        return result;
	}
	
	private IPropertyValidator newValidatorFromValue(Annotation annotation, Context context, IValue value) {
       if(value instanceof SetValue)
            return newValidatorFromSetValue(annotation, context, (SetValue)value);
        else if(value instanceof TextValue || value instanceof IntegerValue) {
            value = new SetValue(value.getType(), new PromptoSet<IValue>(Collections.singleton(value)));
            return newValueSetValidator(annotation, context, (SetValue)value);
        } else if(value instanceof TypeValue)
           return new TypeValidator(((TypeValue)value).getValue());
        else
            return null;
	}

	private IPropertyValidator newValueSetValidator(Annotation annotation, Context context, SetValue value) {
		Set<String> texts = value.getItems().stream()
				.filter(v->v!=NullValue.instance())
				.map(Object::toString)
				.collect(Collectors.toSet());
		IPropertyValidator result = new ValueSetValidator(texts);
		if(texts.size()==value.getLength()) // no null filtered out
			result = result.required();
		return result;
	}

	private IPropertyValidator newTypeSetValidator(Annotation annotation, Context context, SetValue value) {
		Set<IType> types = value.getItems().stream()
			.filter(v->v!=NullValue.instance())
			.map(v->(TypeValue)v)
			.map(TypeValue::getValue)
			.map(type->type.resolve(context,t->context.getProblemListener().reportIllegalAnnotation(annotation, "Unkown type: " + t.getTypeName())))
			.collect(Collectors.toSet());
		if(types.contains(null))
			return null;
		IPropertyValidator result = new TypeSetValidator(types);
		if(types.size()==value.getLength()) // no null filtered out
			result = result.required();
		return result;
	} 
	

}
