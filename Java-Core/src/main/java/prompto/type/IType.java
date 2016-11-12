package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.utils.CodeWriter;
import prompto.utils.StringUtils;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public interface IType {
	
	Family getFamily();
	
	default String getTypeName() {
		return StringUtils.capitalizeFirst(getFamily().name());
	}
	
	default Identifier getTypeNameId() {
		return new Identifier(getTypeName());
	}
	Type getJavaType(Context context);

	IType checkAdd(Context context, IType other, boolean tryReverse);
	IType checkSubstract(Context context, IType other);
	IType checkDivide(Context context, IType other);
	IType checkIntDivide(Context context, IType other);
	IType checkMultiply(Context context, IType other, boolean tryReverse);
	IType checkModulo(Context context, IType rt);
	IType checkCompare(Context context, IType other, ISection section);
	IType checkItem(Context context, IType itemType) ;
	IType checkRange(Context context, IType other);
	IType checkContains(Context context, IType other);
	IType checkContainsAllOrAny(Context context, IType other);
	IType checkIterator(Context context);
	IType checkSlice(Context context);
	IType checkMember(Context context, Identifier name);
	
	void checkUnique(Context context);
	void checkExists(Context context);

	void checkAssignableFrom(Context context, IType other);
	boolean isAssignableFrom(Context context, IType other);
	boolean isMoreSpecificThan(Context context, IType other);
	
	RangeBase<?> newRange(Object first,Object last);
	Comparator<? extends IValue> getComparator(boolean descending);
	IValue getMember(Context context, Identifier name) throws PromptoError;
	String toString(Object value);
	void toDialect(CodeWriter writer);
	IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts);
	
	default IValue convertIValueToIValue(Context context, IValue value) {
		throw new UnsupportedOperationException("Cannot convertIValueToPromptoValue for " + this.getClass());
	}

	default IValue convertJavaValueToIValue(Context context, Object value) {
		throw new UnsupportedOperationException("Cannot convertJavaValueToPromptoValue for " + this.getClass());
	}
	
	default ResultInfo compileGetMember(Context context, MethodInfo method,
			Flags flags, IExpression parent, Identifier id) {
		throw new UnsupportedOperationException("Cannot compileGetMember for " + this.getClass());
	}

	default void compileConvertObjectToExact(Context context, MethodInfo method, Flags flags) {
		throw new UnsupportedOperationException("Cannot compileConvertObjectToExact for " + this.getClass());
	}

	default void compileGetStorableData(Context context, MethodInfo method, Flags flags) {
		// nothing to do
	}
}
 