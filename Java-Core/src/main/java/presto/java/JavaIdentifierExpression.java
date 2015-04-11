package presto.java;

import java.lang.reflect.Field;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;


public class JavaIdentifierExpression implements JavaExpression {

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
	public Object interpret(Context context) throws PrestoError {
		if(parent==null)
			return evaluate_root(context);
		else
			return evaluate_child(context);
	}
	
	Object evaluate_root(Context context) throws PrestoError {
		Object o = evaluate_instance(context);
		if(o!=null)
			return o;
		else
			return evaluate_class(); // as an instance for static field/method
	}

	Object evaluate_instance(Context context) throws PrestoError {
		try {
			return context.getValue(new Identifier(identifier)); 
		} catch (PrestoError e) {
			return null;
		}
	}

	public Class<?> evaluate_class() {
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

	Object evaluate_child(Context context) throws PrestoError {
		Object o = parent.interpret(context); 
		if(o!=null)
			return evaluate_field(o);
		else
			return evaluate_class();
	}
	
	Object evaluate_field(Object o) {
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
		IType t = check_instance(context);
		if(t!=null)
			return t;
		else
			return check_class(); // as an instance for accessing static field/method
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
		Class<?> klass = ((JavaClassType)t).klass;
		try {
			Field field = klass.getField(identifier);
			return new JavaClassType(field.getType());
		} catch (NoSuchFieldException e) { 
			return null;
		}
	}
}
