package prompto.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MissingType;
import prompto.value.IValue;

public class Utils {
	
	public static boolean equal(Object o1,Object o2) {
		if(o1==o2)
			return true;
		if(o1==null || o2==null)
			return false;
		return o1.equals(o2);
	}
	
	public static String capitalizeFirst(String value) {
		return Character.toUpperCase(value.charAt(0)) + value.substring(1).toLowerCase();
	}
	
	public static Character[] stringToCharacterArray(String value) {
		char[] chars = value.toCharArray();
		List<Character> list = new ArrayList<Character>(chars.length);
		for(int i=0;i<chars.length;i++)
			list.add(chars[i]);
		return list.toArray(new Character[chars.length]);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T downcast(Class<T> klass,Object actual) {
		if(actual!=null && klass.isAssignableFrom(actual.getClass()))
			return (T)actual;
		else
			return null;
	}
	
	public static IType inferElementType(Context context, Collection<IValue> items) throws SyntaxError {
		Collection<IType> types = collectElementTypes(context, items);
		return inferType(context, types);
	}
	
	private static Collection<IType> collectElementTypes(Context context, Collection<IValue> items) {
		List<IType> types = new ArrayList<IType>(items.size());
		for(IValue item : items)
			types.add(item.getType());
		return types;
	}
	
	private static IType inferType(Context context, Collection<IType> types) throws SyntaxError {
		if(types.isEmpty())
			return MissingType.instance();
		IType lastType = null;
		for(IType type : types) {
			if(lastType==null)
				lastType = type;
			else if(!lastType.equals(type)) { 
				if(type.isAssignableTo(context, lastType))
					; // lastType is less specific
				else if(lastType.isAssignableTo(context, type))
					lastType = type; // elemType is less specific
				else 
					throw new SyntaxError("Incompatible types: " + type.toString() + " and " + lastType.toString());
			}
		}
		return lastType; 
	}

	public static IType inferElementType(Context context, ExpressionList expressions) throws SyntaxError {
		Collection<IType> types = collectElementTypes(context, expressions);
		return inferType(context, types);
	}

	private static Collection<IType> collectElementTypes(Context context, ExpressionList expressions) throws SyntaxError {
		List<IType> types = new ArrayList<IType>(expressions.size());
		for(IExpression expression : expressions)
			types.add(expression.check(context));
		return types;
	}

}
