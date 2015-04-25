package presto.value;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import presto.declaration.AttributeDeclaration;
import presto.declaration.GetterMethodDeclaration;
import presto.declaration.NativeCategoryDeclaration;
import presto.declaration.SetterMethodDeclaration;
import presto.error.InternalError;
import presto.error.NotMutableError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.java.JavaClassType;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.CategoryType;

public class NativeInstance extends BaseValue implements IInstance {
	
	NativeCategoryDeclaration declaration;
	Object instance;
	boolean mutable = false;
	
	public NativeInstance(NativeCategoryDeclaration declaration) throws SyntaxError {
		super(new CategoryType(declaration.getIdentifier()));
		this.declaration = declaration;
		this.instance = makeInstance();
	}
	
	public NativeInstance(NativeCategoryDeclaration declaration, Object instance) {
		super(new CategoryType(declaration.getIdentifier()));
		this.declaration = declaration;
		this.instance = instance;
	}
	
	@Override
	public NativeCategoryDeclaration getDeclaration() {
		return declaration;
	}
	
	@Override
	public boolean setMutable(boolean mutable) {
		boolean result = this.mutable;
		this.mutable = mutable;
		return result;
	}
	
	public boolean isMutable() {
		return mutable;
	}

	public Object getInstance() {
		return instance;
	}
	
	private Object makeInstance() throws SyntaxError {
		Class<?> mapped = declaration.getBoundClass(true);
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
	public Set<Identifier> getMemberNames() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// don't call getters from getters, so register them
	ThreadLocal<Map<Identifier,Context>> activeGetters = new ThreadLocal<Map<Identifier,Context>>() {

		@Override
		protected Map<Identifier,Context> initialValue() {
			return new HashMap<Identifier,Context>();
		}
	};
	
	@Override
	public IValue getMember(Context context, Identifier attrName) throws PrestoError {
		Map<Identifier,Context> activeGetters = this.activeGetters.get();
		Context stacked = activeGetters.get(attrName);
		boolean first = stacked==null;
		if(first)
			activeGetters.put(attrName, context);
		try {
			return getMember(context, attrName, first);
		} finally {
			if(first)
				activeGetters.remove(attrName);
		}
	}

	public IValue getMember(Context context, Identifier attrName, boolean allowGetter) throws PrestoError {
		GetterMethodDeclaration prestoGetter = allowGetter ? declaration.findGetter(context, attrName) : null;
		if(prestoGetter!=null) {
			context = context.newInstanceContext(this).newChildContext(); // mimic method call
			return prestoGetter.interpret(context);
		} else {
			Method nativeGetter = getGetter(attrName);
			Object value = getValue(nativeGetter);
			JavaClassType ct = new JavaClassType(value.getClass());
			return ct.convertJavaValueToPrestoValue(context, value, null);
		}
	}
	
	private Object getValue(Method getter) throws PrestoError {
		try {
			getter.setAccessible(true);
			return getter.invoke(instance);
		} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
			throw new InternalError(e);
		} 
	}
	
	
	// don't call setters from setters, so register them
	ThreadLocal<Map<Identifier,Context>> activeSetters = new ThreadLocal<Map<Identifier,Context>>() {

		@Override
		protected Map<Identifier,Context> initialValue() {
			return new HashMap<Identifier,Context>();
		}
	};
	
	@Override
	public void setMember(Context context, Identifier attrName, IValue value) throws PrestoError {
		if(!mutable)
			throw new NotMutableError();
		Map<Identifier,Context> activeSetters = this.activeSetters.get();
		Context stacked = activeSetters.get(attrName);
		boolean first = stacked==null;
		try {
			if(first)
				activeSetters.put(attrName, context);
			setMember(context, attrName, value, first);
		} finally {
			if(first)
				activeSetters.remove(attrName);
		}
	}
	
	public void setMember(Context context, Identifier attrName, IValue value, boolean allowSetter) throws PrestoError {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, attrName);
		SetterMethodDeclaration prestoSetter = allowSetter ? declaration.findSetter(context,attrName) : null;
		if(prestoSetter!=null) {
			// use attribute name as parameter name for incoming value
			context = context.newInstanceContext(this).newChildContext(); // mimic method call
			context.registerValue(new Variable(attrName, decl.getType())); 
			context.setValue(attrName, value);
			value = prestoSetter.interpret(context);
		} else {
			Method nativeSetter = getSetter(attrName);
			Object data = value.ConvertTo(nativeSetter.getParameterTypes()[0]);
			setValue(nativeSetter, data);
		}
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

	private Method getSetter(Identifier attrName) throws SyntaxError {
		String setterName = "set" + attrName.toString().substring(0,1).toUpperCase() 
				+ attrName.toString().substring(1);
		Method m = getMethod(attrName, setterName);
		if(m==null)
			throw new SyntaxError("Missing setter for:" + attrName);
		else
			return m;
	}
	
	private Method getGetter(Identifier attrName) throws SyntaxError {
		String setterName = "get" + attrName.toString().substring(0,1).toUpperCase() 
				+ attrName.toString().substring(1);
		Method m = getMethod(attrName, setterName);
		if(m==null)
			throw new SyntaxError("Missing getter for:" + attrName);
		else
			return m;
	}

	private Method getMethod(Identifier attrName, String name) {
		for(Method method : instance.getClass().getMethods()) {
			if(method.getName().equals(name))
				return method;
		}
		return null;
	}

}
