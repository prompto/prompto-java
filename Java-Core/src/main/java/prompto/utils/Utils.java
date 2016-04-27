package prompto.utils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import prompto.declaration.AttributeDeclaration;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.runtime.Context;
import prompto.store.IStore;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.MissingType;
import prompto.type.PeriodType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.UUIDType;
import prompto.type.VoidType;
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
	
	public static IType inferElementType(Context context, Collection<? extends IValue> items) {
		Collection<IType> types = collectElementTypes(context, items);
		return inferType(context, types);
	}
	
	private static Collection<IType> collectElementTypes(Context context, Collection<? extends IValue> items) {
		List<IType> types = new ArrayList<IType>(items.size());
		for(IValue item : items)
			types.add(item.getType());
		return types;
	}
	
	private static IType inferType(Context context, Collection<IType> types) {
		if(types.isEmpty())
			return MissingType.instance();
		IType lastType = null;
		for(IType type : types) {
			if(lastType==null)
				lastType = type;
			else if(!lastType.equals(type)) { 
				if(lastType.isAssignableFrom(context, type))
					; // lastType is less specific
				else if(type.isAssignableFrom(context, lastType))
					lastType = type; // elemType is less specific
				else 
					throw new SyntaxError("Incompatible types: " + type.toString() + " and " + lastType.toString());
			}
		}
		return lastType; 
	}

	public static IType inferElementType(Context context, ExpressionList expressions) {
		Collection<IType> types = collectElementTypes(context, expressions);
		return inferType(context, types);
	}

	private static Collection<IType> collectElementTypes(Context context, ExpressionList expressions) {
		List<IType> types = new ArrayList<IType>(expressions.size());
		for(IExpression expression : expressions)
			types.add(expression.check(context));
		return types;
	}

	static final Map<Type,IType> typeToITypeMap = createTypeToITypeMap();
	
	static Map<Type, IType> createTypeToITypeMap() {
		Map<Type,IType> map = new HashMap<Type, IType>();
		map.put(void.class, VoidType.instance());
		map.put(boolean.class, BooleanType.instance());
		map.put(Boolean.class, BooleanType.instance());
		map.put(char.class, CharacterType.instance());
		map.put(Character.class, CharacterType.instance());
		map.put(int.class, IntegerType.instance());
		map.put(Integer.class, IntegerType.instance());
		map.put(long.class, IntegerType.instance());
		map.put(Long.class, IntegerType.instance());
		map.put(Double.class, DecimalType.instance());
		map.put(String.class, TextType.instance());
		map.put(UUID.class, UUIDType.instance());
		map.put(PromptoDate.class, DateType.instance());
		map.put(PromptoTime.class, TimeType.instance());
		map.put(PromptoDateTime.class, DateTimeType.instance());
		map.put(PromptoPeriod.class, PeriodType.instance());
		map.put(PromptoDocument.class, DocumentType.instance());
		map.put(Object.class, AnyType.instance());
		return map;
	}

	public static IType typeToIType(Type type) {
		return typeToITypeMap.get(type);
	}

	public static IValue fieldToValue(Context context, String name, Object data) {
		if(data==null)
			return null;
		IType type = fieldType(context, name, data);
		return type.convertJavaValueToPromptoValue(context, data);
	}

	private static IType fieldType(Context context, String name, Object data) {
		if(IStore.dbIdName.equals(name))
			return typeToIType(data.getClass());
		else {
			AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, new Identifier(name));
			return decl.getType();
		}
	}

}
