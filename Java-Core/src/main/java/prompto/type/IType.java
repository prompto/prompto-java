package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public interface IType {
	
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
	
	static IType typeToIType(Type type) {
		return typeToITypeMap.get(type);
	}
	
	
	Identifier getId();
	String getName();
	Type getJavaType();

	IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError;
	IType checkSubstract(Context context, IType other) throws SyntaxError;
	IType checkDivide(Context context, IType other) throws SyntaxError;
	IType checkIntDivide(Context context, IType other) throws SyntaxError;
	IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError;
	IType checkModulo(Context context, IType rt) throws SyntaxError;
	IType checkCompare(Context context, IType other, ISection section) throws SyntaxError;
	IType checkItem(Context context, IType itemType)  throws SyntaxError;
	IType checkRange(Context context, IType other) throws SyntaxError;
	IType checkContains(Context context, IType other) throws SyntaxError;
	IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError;
	IType checkIterator(Context context) throws SyntaxError;
	IType checkSlice(Context context) throws SyntaxError;
	IType checkMember(Context context, Identifier name) throws SyntaxError;
	
	void checkUnique(Context context) throws SyntaxError;
	void checkExists(Context context) throws SyntaxError;

	void checkAssignableTo(Context context, IType other) throws SyntaxError;
	boolean isAssignableTo(Context context, IType other);
	boolean isMoreSpecificThan(Context context, IType other);
	
	RangeBase<?> newRange(Object first,Object last) throws SyntaxError;
	Comparator<? extends IValue> getComparator();
	IValue getMember(Context context, Identifier name) throws PromptoError;
	String toString(Object value);
	void toDialect(CodeWriter writer);
	IValue readJSONValue(Context context, JsonNode value);
	IValue convertJavaValueToPromptoValue(Object value);
}
 