package prompto.value;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.GetterMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.SetterMethodDeclaration;
import prompto.error.InternalError;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.java.JavaClassType;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.IDataStore;
import prompto.store.IStorable;
import prompto.type.CategoryType;

public class NativeInstance extends BaseValue implements IInstance {
	
	NativeCategoryDeclaration declaration;
	Object instance = null;
	IStorable storable = null;
	boolean mutable = false;
	
	public NativeInstance(Context context, NativeCategoryDeclaration declaration) throws SyntaxError {
		super(new CategoryType(declaration.getIdentifier()));
		this.declaration = declaration;
		this.instance = makeInstance(context);
		if(declaration.isStorable()) {
			List<String> categories = Arrays.asList(declaration.getName()); 
			storable = IDataStore.getInstance().newStorable(categories);
		}
	}
	
	public NativeInstance(NativeCategoryDeclaration declaration, Object instance) {
		super(new CategoryType(declaration.getIdentifier()));
		this.declaration = declaration;
		this.instance = instance;
		if(declaration.isStorable()) {
			List<String> categories = Arrays.asList(declaration.getName()); 
			storable = IDataStore.getInstance().newStorable(categories);
		}
	}
	
	@Override
	public IStorable getStorable() {
		return storable;
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
	
	private Object makeInstance(Context context) throws SyntaxError {
		Class<?> mapped = declaration.getBoundClass(context, true);
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
	public IValue getMember(Context context, Identifier attrName, boolean autoCreate) throws PromptoError {
		Map<Identifier,Context> activeGetters = this.activeGetters.get();
		Context stacked = activeGetters.get(attrName);
		boolean first = stacked==null;
		if(first)
			activeGetters.put(attrName, context);
		try {
			return getMemberAllowGetter(context, attrName, first);
		} finally {
			if(first)
				activeGetters.remove(attrName);
		}
	}

	public IValue getMemberAllowGetter(Context context, Identifier attrName, boolean allowGetter) throws PromptoError {
		GetterMethodDeclaration promptoGetter = allowGetter ? declaration.findGetter(context, attrName) : null;
		if(promptoGetter!=null) {
			context = context.newInstanceContext(this).newChildContext(); // mimic method call
			return promptoGetter.interpret(context);
		} else {
			Method nativeGetter = getGetter(attrName);
			Object value = getValue(nativeGetter);
			JavaClassType ct = new JavaClassType(value.getClass());
			return ct.convertJavaValueToPromptoValue(context, value, null);
		}
	}
	
	private Object getValue(Method getter) throws PromptoError {
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
	public void setMember(Context context, Identifier attrName, IValue value) throws PromptoError {
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
	
	public void setMember(Context context, Identifier attrName, IValue value, boolean allowSetter) throws PromptoError {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, attrName);
		SetterMethodDeclaration promptoSetter = allowSetter ? declaration.findSetter(context,attrName) : null;
		if(promptoSetter!=null) {
			// use attribute name as parameter name for incoming value
			context = context.newInstanceContext(this).newChildContext(); // mimic method call
			context.registerValue(new Variable(attrName, decl.getType())); 
			context.setValue(attrName, value);
			value = promptoSetter.interpret(context);
		} else {
			Method nativeSetter = getSetter(attrName);
			Object data = value.ConvertTo(nativeSetter.getParameterTypes()[0]);
			setValue(nativeSetter, data);
			if(storable!=null && decl.isStorable()) {
				storable.setValue(context, attrName, value);
			}
		}
	}

	private void setValue(Method setter, Object data) throws PromptoError {
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

	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeStartObject();
			for(Identifier attrName : declaration.getAttributes()) {
				generator.writeFieldName(attrName.toString());
				IValue value = getMember(context, attrName, false);
				if(value!=null)
					value.toJson(context, generator, this, attrName);
				else
					generator.writeNull();
			}
			generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
