package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
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
	IValue getMemberValue(Context context, Identifier name) throws PromptoError;
	List<IMethodDeclaration> getMemberMethods(Context context, Identifier name) throws PromptoError;


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

	default void declare(Transpiler transpiler) { 
		throw new UnsupportedOperationException("declare " + this.getClass().getName()); 
	}

	default void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) { 
		if(tryReverse)
			other.declareAdd(transpiler, this, false, right, left);
		else
			throw new UnsupportedOperationException("declareAdd " + this.getClass().getName());
	}

	default boolean transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) { 
		if(tryReverse)
			return other.transpileAdd(transpiler, this, false, right, left);
		else
			throw new UnsupportedOperationException("transpileAdd " + this.getClass().getName());
	}


	default String getTranspiledName(Context context) { 
		throw new UnsupportedOperationException("getTranspiledName " + this.getClass().getName());
	}

	default void transpileInstance(Transpiler transpiler) { 
		throw new UnsupportedOperationException("transpileInstance " + this.getClass().getName());
	}

	default void declareMember(Transpiler transpiler, String name) {
	    if(!"text".equals(name))
	        throw new UnsupportedOperationException("declareMember " + name + " for " + this.getClass().getName());

	}

	default void transpileMember(Transpiler transpiler, String name) {
	    if("text".equals(name))
          transpiler.append("getText()");
	    else
	        throw new UnsupportedOperationException("transpileMember " + name + " for " + this.getClass().getName());
	}

	default void declareModulo(Transpiler transpiler, IType other, IExpression left, IExpression right)  { 
		throw new UnsupportedOperationException("declareModulo " + this.getClass().getName());
	}

	default boolean transpileModulo(Transpiler transpiler, IType other, IExpression left, IExpression right) {
        throw new UnsupportedOperationException("transpileModulo " + this.getClass().getName());
	}

	default void declareDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) { 
		throw new UnsupportedOperationException("declareDivide " + this.getClass().getName());
	}

	default boolean transpileDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
        throw new UnsupportedOperationException("transpileDivide " + this.getClass().getName());
	}

	default void declareIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) { 
		throw new UnsupportedOperationException("declareIntDivide " + this.getClass().getName());
	}

	default boolean transpileIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
        throw new UnsupportedOperationException("transpileIntDivide " + this.getClass().getName());
	}

	default void declareMinus(Transpiler transpiler, IExpression expression) { 
		throw new UnsupportedOperationException("declareMinus " + this.getClass().getName());
	}

	default boolean transpileMinus(Transpiler transpiler, IExpression expression) {
        throw new UnsupportedOperationException("transpileMinus " + this.getClass().getName());
	}

	default void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) { 
		if(tryReverse)
			other.declareMultiply(transpiler, this, false, right, left);
		else
			throw new UnsupportedOperationException("declareMultiply " + this.getClass().getName());
	}

	default boolean transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) { 
		if(tryReverse)
			return other.transpileMultiply(transpiler, this, false, right, left);
		else
			throw new UnsupportedOperationException("transpileMultiply " + this.getClass().getName());
	}


}
 