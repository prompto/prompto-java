package prompto.java;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import prompto.declaration.AnyNativeCategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.BaseType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.NativeInstance;


public class JavaClassType extends BaseType {
	
	Type type;
	
	public JavaClassType(Type type) {
		super(Family.CLASS);
		this.type = type;
	}
	
	@Override
	public Type getJavaType() {
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
		IType result = Utils.typeToIType(type);
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
    	val = convertCategory(context, value, type, returnType);
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
        IType itype = Utils.typeToIType(type);
        return itype != null ? itype.convertJavaValueToPromptoValue(value) : null;
	}


	private static IValue convertCategory(Context context, Object value, Type type, IType returnType) {
		// ensure the underlying declaration is loaded
		context.getRegisteredDeclaration(IDeclaration.class, returnType.getTypeNameId());
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

	@Override
	public void checkUnique(Context context) throws SyntaxError { }

	@Override
	public void checkExists(Context context) throws SyntaxError { }

	@Override
	public boolean isAssignableTo(Context context, IType other) { return false; }

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) { return true; }



}