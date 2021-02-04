package prompto.utils;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.JsxType;
import prompto.type.MissingType;
import prompto.type.PeriodType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.TypeMap;
import prompto.type.UuidType;
import prompto.type.VersionType;
import prompto.type.VoidType;
import prompto.value.IValue;
import prompto.value.JsxValue;

public abstract class TypeUtils {
	
	public static IType inferValuesType(Context context, Collection<? extends IValue> values, ICodeSection section) {
		if(values.isEmpty())
			return MissingType.instance();
		TypeMap types = new TypeMap();
		values.forEach(value -> types.add(value.getType()));
		return types.inferType(context, section);
	}
	
	public static IType inferExpressionsType(Context context, ExpressionList expressions, ICodeSection section) {
		if(expressions.isEmpty())
			return MissingType.instance();
		TypeMap types = new TypeMap();
		expressions.forEach(exp -> types.add(exp.check(context)));
		return types.inferType(context, section);
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
		map.put(double.class, DecimalType.instance());
		map.put(Double.class, DecimalType.instance());
		map.put(String.class, TextType.instance());
		map.put(UUID.class, UuidType.instance());
		map.put(PromptoDate.class, DateType.instance());
		map.put(PromptoTime.class, TimeType.instance());
		map.put(PromptoDateTime.class, DateTimeType.instance());
		map.put(PromptoPeriod.class, PeriodType.instance());
		map.put(PromptoVersion.class, VersionType.instance());
		map.put(PromptoDocument.class, DocumentType.instance());
		map.put(JsxValue.class, JsxType.instance());
		map.put(Object.class, AnyType.instance());
		return map;
	}

	public static IType typeToIType(Type type) {
		return typeToITypeMap.get(type);
	}

}
