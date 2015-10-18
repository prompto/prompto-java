package prompto.java;

import java.lang.reflect.Field;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;


public class JavaIdentifierExpression extends Section implements JavaExpression {

	public static JavaIdentifierExpression parse(String ids) {
		String[] parts = ids.split("\\.");
		JavaIdentifierExpression result = null;
		for(String part : parts)
			result = new JavaIdentifierExpression(result,part);
		return result;
	}
	
	JavaIdentifierExpression parent = null;
	String identifier;
	boolean isChildClass = false;
	
	public JavaIdentifierExpression(String identifier) {
		this.identifier = identifier;
	}

	public JavaIdentifierExpression(JavaIdentifierExpression parent, String identifier) {
		this.parent = parent;
		this.identifier = identifier;
	}
	
	public JavaIdentifierExpression(JavaIdentifierExpression parent, String identifier, boolean isChildClass) {
		this.parent = parent;
		this.identifier = identifier;
		this.isChildClass = isChildClass;
	}

	public JavaIdentifierExpression getParent() {
		return parent;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(parent!=null) {
			parent.toDialect(writer);
			writer.append(isChildClass ? '$' : '.');
		}
		writer.append(identifier);
	}
	
	@Override
	public String toString() {
		if(parent==null)
			return identifier;
		else 
			return parent.toString() + (isChildClass ? '$' : '.') + identifier;
	}
		
	@Override
	public Object interpret(Context context) throws PromptoError {
		if(parent==null)
			return interpret_root(context);
		else
			return interpret_child(context);
	}
	
	Object interpret_root(Context context) throws PromptoError {
		Object o = interpret_prompto(context);
		if(o!=null)
			return o;
		o = interpret_instance(context);
		if(o!=null)
			return o;
		else
			return interpret_class(); // as an instance for static field/method
	}

	private Object interpret_prompto(Context context) {
		switch(identifier) {
		case "$context":
			return context;
		}
		return null;
	}

	Object interpret_instance(Context context) throws PromptoError {
		try {
			return context.getValue(new Identifier(identifier)); 
		} catch (PromptoError e) {
			return null;
		}
	}

	public Class<?> interpret_class() {
		String fullName = this.toString();
		try {
			return Class.forName(fullName);
		} catch (ClassNotFoundException e1) {
			// package prefix not required for classes in java.lang package
			if(parent==null) try {
				fullName = "java.lang." + identifier;
				return Class.forName(fullName);
			} catch (ClassNotFoundException e2) {
			}	
		}
		return null;
	}

	Object interpret_child(Context context) throws PromptoError {
		Object o = parent.interpret(context); 
		if(o!=null)
			return interpret_field(o);
		else
			return interpret_class();
	}
	
	Object interpret_field(Object o) {
		Class<?> klass = null;
		if(o instanceof Class<?>) {
			klass = (Class<?>)o;
			o = null;
		} else
			klass = o.getClass();
		try {
			Field field = klass.getField(identifier);
			return field.get(o);
		} catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) { 
			return null;
		}
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		if(parent==null)
			return check_root(context);
		else
			return check_child(context);
	}
	
	IType check_root(Context context) throws SyntaxError {
		IType t = check_prompto(context);
		if(t!=null)
			return t;
		t = check_instance(context);
		if(t!=null)
			return t;
		else
			return check_class(); // as an instance for accessing static field/method
	}

	private IType check_prompto(Context context) {
		switch(identifier) {
		case "$context":
			return new JavaClassType(context.getClass());
		}
		return null;
	}

	IType check_instance(Context context) throws SyntaxError {
		INamed named = context.getRegisteredValue(INamed.class, new Identifier(identifier)); 
		if(named==null)
			return null;
		try {
			return named.getType(context);
		} catch (SyntaxError e) {
			return null;
		}
	}
		
	IType check_class() {
		String fullName = this.toString();
		try {
			Class<?> klass = Class.forName(fullName);
			return new JavaClassType(klass);
		} catch (ClassNotFoundException e1) {
			// package prefix not required for classes in java.lang package
			if(parent==null) try {
				fullName = "java.lang." + identifier;
				Class<?> klass = Class.forName(fullName);
				return new JavaClassType(klass);
			} catch (ClassNotFoundException e2) {
			}	
		}
		return null;
	}

	IType check_child(Context context) throws SyntaxError {
		IType t = parent.check(context); 
		if(t!=null)
			return check_field(t);
		else
			return check_class();
	}
	
	IType check_field(IType t) {
		if(!(t instanceof JavaClassType))
			return null;
		Class<?> klass = t.toJavaClass();
		try {
			Field field = klass.getField(identifier);
			return new JavaClassType(field.getType());
		} catch (NoSuchFieldException e) { 
			return null;
		}
	}
}
