package prompto.java;

import java.lang.reflect.Field;

import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IOperand;
import prompto.compiler.StackLocal;
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
	String name;
	boolean isChildClass = false;
	
	public JavaIdentifierExpression(String name) {
		this.name = name;
	}

	public JavaIdentifierExpression(JavaIdentifierExpression parent, String name) {
		this.parent = parent;
		this.name = name;
	}
	
	public JavaIdentifierExpression(JavaIdentifierExpression parent, String name, boolean isChildClass) {
		this.parent = parent;
		this.name = name;
		this.isChildClass = isChildClass;
	}

	public JavaIdentifierExpression getParent() {
		return parent;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(parent!=null) {
			parent.toDialect(writer);
			writer.append(isChildClass ? '$' : '.');
		}
		writer.append(name);
	}
	
	@Override
	public String toString() {
		if(parent==null)
			return name;
		else 
			return parent.toString() + (isChildClass ? '$' : '.') + name;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		if(parent==null)
			return compile_root(context, method);
		else
			return compile_child(context, method);
	}
	
	private ResultInfo compile_root(Context context, MethodInfo method) throws SyntaxError {
		ResultInfo info = compile_prompto(context, method);
		if(info!=null)
			return info;
		else
			info = compile_instance(context, method);
		if(info!=null)
			return info;
		else
			return compile_class(context, method);
	}

	private ResultInfo compile_prompto(Context context, MethodInfo method) {
		switch(name) {
		case "$context":
			throw new UnsupportedOperationException();
		}
		return null;
	}

	private ResultInfo compile_instance(Context context, MethodInfo method) {
		INamed named = context.getRegisteredValue(INamed.class, new Identifier(name));
		if(named==null)
			return null;
		StackLocal local = method.getRegisteredLocal(name);
		ClassConstant c = local instanceof StackLocal.ObjectLocal ? 
				((StackLocal.ObjectLocal)local).getClassName() 
				: new ClassConstant("java/lang/Object");
		switch(local.getIndex()) {
		case 0:
			method.addInstruction(Opcode.ALOAD_0, c);
			break;
		case 1:
			method.addInstruction(Opcode.ALOAD_1, c);
			break;
		case 2:
			method.addInstruction(Opcode.ALOAD_2, c);
			break;
		case 3:
			method.addInstruction(Opcode.ALOAD_3, c);
			break;
		default:
			// TODO: support ALOAD_W
			method.addInstruction(Opcode.ALOAD, new ByteOperand((byte)local.getIndex()), c);
			break;
		}
		// TODO return useful class so we can get members ?
		// not sure we support this...
		return new ResultInfo(Object.class, true); 
	}

	private ResultInfo compile_child(Context context, MethodInfo method) throws SyntaxError {
		ResultInfo info = parent.compile(context, method);
		if(info!=null)
			return compile_field(context, method, info);
		else
			return compile_class(context, method);
	}

	private ResultInfo compile_field(Context context, MethodInfo method, ResultInfo info) {
		try {
			Field field = info.getType().getField(name);
			String parentClassName = CompilerUtils.getClassName(info.getType());
			String fieldClassName = CompilerUtils.getDescriptor(field.getType());
			IOperand oper = new FieldConstant(parentClassName, name, fieldClassName);
			if(info.isInstance())
				method.addInstruction(Opcode.GETFIELD, oper);
			else
				method.addInstruction(Opcode.GETSTATIC, oper);
			return new ResultInfo(field.getType(), true);
		} catch (NoSuchFieldException e) { 
			return null;
		}
	}

	private ResultInfo compile_class(Context context, MethodInfo method) {
		String fullName = this.toString();
		try {
			return new ResultInfo(Class.forName(fullName), false);
		} catch (ClassNotFoundException e1) {
			// package prefix not required for classes in java.lang package
			if(parent==null) try {
				fullName = "java.lang." + name;
				return new ResultInfo(Class.forName(fullName), false);
			} catch (ClassNotFoundException e2) {
			}	
		}
		return null;
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
		switch(name) {
		case "$context":
			return context;
		}
		return null;
	}

	Object interpret_instance(Context context) throws PromptoError {
		try {
			return context.getValue(new Identifier(name)); 
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
				fullName = "java.lang." + name;
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
			Field field = klass.getField(name);
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
		switch(name) {
		case "$context":
			return new JavaClassType(context.getClass());
		}
		return null;
	}

	IType check_instance(Context context) throws SyntaxError {
		INamed named = context.getRegisteredValue(INamed.class, new Identifier(name)); 
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
				fullName = "java.lang." + name;
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
			Field field = klass.getField(name);
			return new JavaClassType(field.getType());
		} catch (NoSuchFieldException e) { 
			return null;
		}
	}
}
