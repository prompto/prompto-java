package prompto.compiler;

import java.lang.reflect.Type;

/* since we follow a bottom-up compile strategy, we must keep track of instance types at the top of the stack */
/* isInstance is also required to select GETFIELD/GETSTATIC or INVOKEVIRTUAL/INVOKESTATIC deterministically */ 
public class ResultInfo {

	public static enum Flag {
		RETURN,
		THROW,
		STATIC
	}

	Type type;
	boolean isReturn = false;
	boolean isThrow = false;
	boolean isStatic = false;
	Boolean isPrimitive = null;
	Boolean isInterface = null;
	Boolean isPromptoCategory = null;
	Boolean isNativeCategory = null;
	
	public ResultInfo(Type type, Flag ...flags) {
		this.type = type;
		for(Flag flag : flags) switch(flag) {
		case RETURN:
			isReturn = true;
			break;
		case THROW:
			isThrow = true;
			break;
		case STATIC:
			isStatic = true;
			break;
		}
	}
	
	@Override
	public String toString() {
		return type.toString();
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean isPrimitive() {
		if(isPrimitive==null) {
			if(type instanceof Class)
				isPrimitive = ((Class<?>)type).isPrimitive();
			else
				isPrimitive = false;
		}
		return isPrimitive;
	}

	public boolean isInterface() {
		if(isInterface==null) {
			if(isPrimitive())
				isInterface = false;
			else if(type instanceof Class)
				isInterface = ((Class<?>)type).isInterface();
			else if(type instanceof PromptoType) {
				isInterface = type.getTypeName().startsWith("π.") && type.getTypeName().indexOf('$')<0;
			} else
				throw new UnsupportedOperationException();
		}
		return isInterface;
	}

	public boolean isConcrete() {
		return !isInterface();
	}
	
	public boolean isStatic() {
		return isStatic;
	}

	public boolean isReturn() {
		return isReturn;
	}

	public boolean isThrow() {
		return isThrow;
	}
	
	public boolean isPromptoCategory() {
		if(isPromptoCategory==null) {
			if(isPrimitive())
				isPromptoCategory = false;
			else if(type instanceof Class)
				isPromptoCategory = false;
			else if(type instanceof PromptoType){
				isPromptoCategory = type.getTypeName().startsWith(CompilerUtils.CATEGORY_PACKAGE_PREFIX);
			} else
				throw new UnsupportedOperationException();
		}
		return isPromptoCategory;
	}

	public boolean isNativeCategory() {
		if(isNativeCategory==null) {
			if(isPrimitive())
				isNativeCategory = false;
			else if(type instanceof Class)
				isNativeCategory = !((Class<?>)type).isInterface();
			else if(type instanceof PromptoType){
				isNativeCategory = !type.getTypeName().startsWith(CompilerUtils.CATEGORY_PACKAGE_PREFIX);
			} else
				throw new UnsupportedOperationException();
		}
		return isNativeCategory;
	}

	public boolean isCategory() {
		return isPromptoCategory() || isNativeCategory();
	}
}