package presto.value;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import presto.declaration.NativeCategoryDeclaration;
import presto.error.InternalError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.java.JavaClassType;
import presto.runtime.Context;
import presto.type.CategoryType;



public class NativeInstance extends BaseValue implements IInstance {
	
	NativeCategoryDeclaration declaration;
	Object instance;
	
	public NativeInstance(NativeCategoryDeclaration declaration) throws SyntaxError {
		super(new CategoryType(declaration.getName()));
		this.declaration = declaration;
		this.instance = makeInstance();
	}
	
	public Object getInstance() {
		return instance;
	}
	
	private Object makeInstance() throws SyntaxError {
		Class<?> mapped = declaration.getMappedClass();
		try {
			return mapped.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public CategoryType getType() {
		return (CategoryType)this.type;
	}
	
	@Override
	public Set<String> getMemberNames() {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public IValue getMember(Context context, String attrName) throws PrestoError {
		Method getter = getGetter(attrName);
		Object value = getValue(getter);
		JavaClassType ct = new JavaClassType(value.getClass());
		return ct.convertNativeValueToPrestoValue(value);
	}
	
	private Object getValue(Method getter) throws PrestoError {
		try {
			getter.setAccessible(true);
			return getter.invoke(instance);
		} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
			throw new InternalError(e);
		} 
	}

	@Override
	public void setMember(Context context, String attrName, IValue value) throws PrestoError {
		Method setter = getSetter(attrName);
		Object data = value.ConvertTo(setter.getParameterTypes()[0]);
		setValue(setter, data);
	}

	private void setValue(Method setter, Object data) throws PrestoError {
		try {
			setter.setAccessible(true);
			setter.invoke(instance, data);
		} catch (IllegalArgumentException e) {
			throw new SyntaxError("Cannot assign " + data.getClass().getSimpleName()
					+ " to " + setter.getParameterTypes()[0].getSimpleName());
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new InternalError(e);
		} 
	}

	private Method getSetter(String attrName) throws SyntaxError {
		String setterName = "set" + attrName.substring(0,1).toUpperCase() + attrName.substring(1);
		return getMethod(attrName, setterName);
	}
	
	private Method getGetter(String attrName) throws SyntaxError {
		String setterName = "get" + attrName.substring(0,1).toUpperCase() + attrName.substring(1);
		return getMethod(attrName, setterName);
	}

	private Method getMethod(String attrName, String setterName) throws SyntaxError {
		for(Method method : instance.getClass().getMethods()) {
			if(method.getName().equals(setterName))
				return method;
		}
		throw new SyntaxError("Missing setter for:" + attrName);
	}

}
