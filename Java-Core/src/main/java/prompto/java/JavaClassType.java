package prompto.java;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;

import prompto.declaration.AnyNativeCategoryDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.PeriodType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.VoidType;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.NativeInstance;


public class JavaClassType extends CategoryType {
	
	static Map<Class<?>,IType> javaToPromptoMap = new HashMap<Class<?>, IType>();
	
	static {
		javaToPromptoMap.put(void.class, VoidType.instance());
		javaToPromptoMap.put(boolean.class, BooleanType.instance());
		javaToPromptoMap.put(Boolean.class, BooleanType.instance());
		javaToPromptoMap.put(char.class, CharacterType.instance());
		javaToPromptoMap.put(Character.class, CharacterType.instance());
		javaToPromptoMap.put(int.class, IntegerType.instance());
		javaToPromptoMap.put(Integer.class, IntegerType.instance());
		javaToPromptoMap.put(long.class, IntegerType.instance());
		javaToPromptoMap.put(Long.class, IntegerType.instance());
		javaToPromptoMap.put(Double.class, DecimalType.instance());
		javaToPromptoMap.put(String.class, TextType.instance());
		javaToPromptoMap.put(LocalDate.class, DateType.instance());
		javaToPromptoMap.put(LocalTime.class, TimeType.instance());
		javaToPromptoMap.put(DateTime.class, DateTimeType.instance());
		javaToPromptoMap.put(Period.class, PeriodType.instance());
		javaToPromptoMap.put(Document.class, DocumentType.instance());
		javaToPromptoMap.put(Object.class, AnyType.instance());
	}
	
	Type type;
	
	public JavaClassType(Type type) {
		super(new Identifier(type.getTypeName()));
		this.type = type;
	}
	
	@Override
	public Class<?> toJavaClass() {
		return toJavaClass(type);
	}
	
	private static Class<?> toJavaClass(Type type) {
		if(type instanceof Class<?>)
			return (Class<?>)type;
		else if (type instanceof ParameterizedType)
			return toJavaClass(((ParameterizedType)type).getRawType());
		else
			throw new RuntimeException("Unsupported:" + type.getClass());
	}

	public IType convertJavaClassToPromptoType(Context context, IType returnType) {
		return convertJavaClassToPromptoType(context, type, returnType);
	}
	
	private static IType convertJavaClassToPromptoType(Context context, Type type, IType returnType) {
		IType result = javaToPromptoMap.get(type);
		if(result!=null)
			return result;
		Type elemType = elemTypeFromListType(type);
		if(elemType!=null) {
			IType itemType = convertJavaClassToPromptoType(context, elemType, null);
			return new ListType(itemType);
		}
		NativeCategoryDeclaration decl = context.getNativeBinding(type);
		if(decl!=null)
			return decl.getType(context);
		else if(returnType==AnyType.instance())
			return returnType;
		else
			return null;
	}
	
    private static Type elemTypeFromListType(Type type) {
		if(type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType)type;
			Type rawType = ptype.getRawType();
			if(rawType instanceof Class<?> && List.class.isAssignableFrom((Class<?>)rawType))
				return ptype.getActualTypeArguments()[0];	
		}
		return null;
	}

	public IValue convertJavaValueToPromptoValue(Context context, Object value, IType returnType)
    {
    	return convertJavaValueToPromptoValue(context, value, type, returnType);
    }
    
    public static IValue convertJavaValueToPromptoValue(Context context, Object value, Type type, IType returnType) {
    	IValue val = convertIValue(value);
    	if(val!=null)
    		return val;
    	val = convertNative(value, type);
    	if(val!=null)
    		return val;
    	val = convertList(context, value, type, returnType);
    	if(val!=null)
    		return val;
    	val = convertCategory(context, value, type);
    	if(val!=null)
    		return val;
    	else if(returnType==AnyType.instance())
	    	return new NativeInstance(AnyNativeCategoryDeclaration.getInstance(), value);
	    else
	        throw new InternalError("Unable to convert:" + value.getClass().getSimpleName());
    }

	private static IValue convertIValue(Object value) {
	    return value instanceof IValue ? (IValue)value : null;
	}

	private static IValue convertNative(Object value, Type type) {
        IType itype = javaToPromptoMap.get(type);
        return itype != null ? itype.convertJavaValueToPromptoValue(value) : null;
	}


	private static IValue convertCategory(Context context, Object value, Type type) {
		NativeCategoryDeclaration decl = context.getNativeBinding(type);
		return decl!=null ? new NativeInstance(decl, value) : null;
	}

	@SuppressWarnings("unchecked")
	private static IValue convertList(Context context, Object value, Type type, IType returnType) {
		if(!(value instanceof List<?>) || !(returnType instanceof ListType))
			return null;
		Type elemType = elemTypeFromListType(type);
		IType itemType = ((ListType)returnType).getItemType();
		List<IValue> list = new ArrayList<IValue>();
		for(Object obj : (List<Object>)value) {
			IValue val = convertJavaValueToPromptoValue(context, obj, elemType, itemType);
			list.add(val);
		}
		return new ListValue(itemType, list);
	}



}