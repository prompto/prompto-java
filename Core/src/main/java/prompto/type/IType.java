package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.IMethodDeclaration;
import prompto.error.InternalError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.expression.PredicateExpression;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.parser.ECleverParser;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.FamilyInfo;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.utils.StringUtils;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public interface IType extends ICodeSection {
	
	static IType fromTypeName(Context context, String typeName) throws PromptoError {
		if(Character.isUpperCase(typeName.charAt(0))) try {
			return new ECleverParser(typeName).parse_standalone_type();
		} catch(Throwable t) {
			throw new InternalError(t);
		} else
			return context.findAttribute(typeName).getType();
	}

	FamilyInfo getFamilyInfo(Context context);
	
	default IType anyfy() {
		return this;
	}
	
	default IType resolve(Context context, Consumer<IType> onError) {
		return this;
	}

	default String getTypeName() {
		return StringUtils.capitalizeFirst(getFamilyInfo(null).getFamily().name());
	}
	
	default Identifier getTypeNameId() {
		return new Identifier(getTypeName());
	}
	
	default boolean isStorable(Context context) {
		return false;
	}
	
	default boolean isMutable(Context context) {
		return false;
	}

	default IType asMutable(Context context, boolean mutable) {
		if(mutable)
			throw new UnsupportedOperationException("Mutable not supported for " + this.getClass());
		else
			return this;
	}
	
	Type getJavaType(Context context);

	IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section);
	IType checkSubstract(Context context, IType other, ICodeSection section);
	IType checkDivide(Context context, IType other, ICodeSection section);
	IType checkIntDivide(Context context, IType other, ICodeSection section);
	IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section);
	IType checkModulo(Context context, IType other, ICodeSection section);
	void checkCompare(Context context, IType other, ICodeSection section);
	IType checkItem(Context context, IType itemType, ICodeSection section) ;
	IType checkRange(Context context, IType other);
	void checkContains(Context context, IType other, ICodeSection section);
	void checkContainsAllOrAny(Context context, IType other);
	IType checkIterator(Context context);
	IType checkSlice(Context context);
	IType checkMember(Context context, Identifier name);
	IType checkStaticMember(Context context, Identifier name);

	void checkUnique(Context context);
	void checkExists(Context context);

	void checkAssignableFrom(Context context, IType other, ICodeSection section);
	boolean isAssignableFrom(Context context, IType other);
	boolean isMoreSpecificThan(Context context, IType other);
	
	RangeBase<?> newRange(Object first,Object last);
	Comparator<? extends IValue> getComparator(Context context, IExpression key, boolean descending);
	Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id);
	IValue getStaticMemberValue(Context context, Identifier id);
	Set<IMethodDeclaration> getStaticMemberMethods(Context context, Identifier id);


	String toString(Object value);
	void toDialect(CodeWriter writer);
	IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts);
	
	default IValue convertIValueToIValue(Context context, IValue value) {
		throw new UnsupportedOperationException("Cannot convertIValueToPromptoValue for " + this.getClass());
	}

	default IValue convertJavaValueToIValue(Context context, Object value) {
		throw new UnsupportedOperationException("Cannot convertJavaValueToPromptoValue for " + this.getClass());
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
	
	default void transpile(Transpiler transpiler) {
		throw new UnsupportedOperationException("transpile " + this.getClass().getName()); 
	}


	default void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) { 
		if(tryReverse)
			other.declareAdd(transpiler, this, false, right, left, section);
		else
			transpiler.getContext().getProblemListener().reportIllegalOperation(section, " add ", other, this);
	}

	default void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) { 
		if(tryReverse)
			other.transpileAdd(transpiler, this, false, right, left, section);
		else
			transpiler.getContext().getProblemListener().reportIllegalOperation(section, " add ", other, this);
	}


	default String getTranspiledName(Context context) { 
		throw new UnsupportedOperationException("getTranspiledName " + this.getClass().getName());
	}

	default void transpileInstance(Transpiler transpiler) { 
		throw new UnsupportedOperationException("transpileInstance " + this.getClass().getName());
	}

	default void declareMember(Transpiler transpiler, Identifier name) {
	    if(!"text".equals(name.toString()))
			transpiler.getContext().getProblemListener().reportUnknownMember(name, name.toString());
	}

	default void transpileMember(Transpiler transpiler, Identifier name) {
	    if("text".equals(name.toString()))
          transpiler.append("getText()");
	    else if("json".equals(name.toString()))
	          transpiler.append("toJson()");
	    else
	        throw new UnsupportedOperationException("transpileMember " + name + " for " + this.getClass().getName());
	}
	
	default void declareStaticMember(Transpiler transpiler, Identifier name) {
        throw new UnsupportedOperationException("declareStaticMember " + name + " for " + this.getClass().getName());
	}

	default void transpileStaticMember(Transpiler transpiler, Identifier name) {
	    throw new UnsupportedOperationException("transpileStaticMember " + name + " for " + this.getClass().getName());
	}
	
	default void declareModulo(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section)  { 
		throw new UnsupportedOperationException("declareModulo " + this.getClass().getName());
	}

	default void transpileModulo(Transpiler transpiler, IType other, IExpression left, IExpression right) {
        throw new UnsupportedOperationException("transpileModulo " + this.getClass().getName());
	}

	default void declareDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) { 
		throw new UnsupportedOperationException("declareDivide " + this.getClass().getName());
	}

	default void transpileDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
        throw new UnsupportedOperationException("transpileDivide " + this.getClass().getName());
	}

	default void declareIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) { 
		throw new UnsupportedOperationException("declareIntDivide " + this.getClass().getName());
	}

	default void transpileIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
        throw new UnsupportedOperationException("transpileIntDivide " + this.getClass().getName());
	}

	default void declareMinus(Transpiler transpiler, IExpression expression) { 
		throw new UnsupportedOperationException("declareMinus " + this.getClass().getName());
	}

	default void transpileMinus(Transpiler transpiler, IExpression expression) {
        throw new UnsupportedOperationException("transpileMinus " + this.getClass().getName());
	}

	default void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) { 
		if(tryReverse)
			other.declareMultiply(transpiler, this, false, right, left, section);
		else
			throw new UnsupportedOperationException("declareMultiply " + this.getClass().getName());
	}

	default void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) { 
		if(tryReverse)
			other.transpileMultiply(transpiler, this, false, right, left);
		else
			throw new UnsupportedOperationException("transpileMultiply " + this.getClass().getName());
	}

	default void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section)  { 
		throw new UnsupportedOperationException("declareSubtract " + this.getClass().getName());
	}

	default void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right)  { 
		throw new UnsupportedOperationException("transpileSubtract " + this.getClass().getName());
	}

	default void transpileAssignMember(Transpiler transpiler, String name)   { 
		throw new UnsupportedOperationException("transpileAssignMember " + this.getClass().getName());
	}


	default void transpileAssignMemberValue(Transpiler transpiler, String name, IExpression expression) { 
		throw new UnsupportedOperationException("transpileAssignMemberValue " + this.getClass().getName());
	}

	default void transpileAssignItemValue(Transpiler transpiler, IExpression item, IExpression expression) { 
		throw new UnsupportedOperationException("transpileAssignItemValue " + this.getClass().getName());
	}


	default void declareSlice(Transpiler transpiler, IExpression first, IExpression last)   { 
		throw new UnsupportedOperationException("declareSlice " + this.getClass().getName());
	}

	default void transpileSlice(Transpiler transpiler, IExpression first, IExpression last) {
		throw new UnsupportedOperationException("transpileSlice " + this.getClass().getName());
	}

	default void declareCompare(Transpiler transpiler, IType other)   { 
		throw new UnsupportedOperationException("declareCompare " + this.getClass().getName());
	}

	default void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
		throw new UnsupportedOperationException("transpileCompare " + this.getClass().getName());
	}

	default void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
		throw new UnsupportedOperationException("declareItem " + this.getClass().getName());
	}

	default void transpileItem(Transpiler transpiler, IType itemType, IExpression item)  {
		throw new UnsupportedOperationException("transpileItem " + this.getClass().getName());
	}

	default void declareRange(Transpiler transpiler, IType lastType) {
		throw new UnsupportedOperationException("declareRange " + this.getClass().getName());
	}

	default void transpileRange(Transpiler transpiler, IExpression first, IExpression last) {
		throw new UnsupportedOperationException("transpileRange " + this.getClass().getName());
	}

	default void declareHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item, ICodeSection section)  {
		transpiler.getContext().getProblemListener().reportError(section, "Cannot transpile " + this.getClass().getName());
	}

	default void transpileHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
		throw new UnsupportedOperationException("transpileHasValue " + this.getClass().getName());
	}

	default void declareHasAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items)  {
		throw new UnsupportedOperationException("declareHasAllOrAny " + this.getClass().getName());
	}

	default void transpileHasAllValues(Transpiler transpiler, IType other, IExpression container, IExpression items) {
		throw new UnsupportedOperationException("transpileHasAllValues " + this.getClass().getName());
	}

	default void transpileHasAnyValue(Transpiler transpiler, IType other, IExpression container, IExpression items) {
		throw new UnsupportedOperationException("transpileHasAnyValue " + this.getClass().getName());
	}

	default void transpileHasAllPredicate(Transpiler transpiler, IExpression source, PredicateExpression predicate) {
		throw new UnsupportedOperationException("transpileHasAllPredicate " + this.getClass().getName());
	}

	default void transpileHasAnyPredicate(Transpiler transpiler, IExpression source, PredicateExpression predicate) {
		throw new UnsupportedOperationException("transpileHasAnyPredicate " + this.getClass().getName());
	}

	default void declareSorted(Transpiler transpiler, IExpression key) {
		throw new UnsupportedOperationException("declareSorted " + this.getClass().getName());
	}

	default void transpileSortedComparator(Transpiler transpiler, IExpression key, boolean descending) {
		throw new UnsupportedOperationException("transpileSortedComparator " + this.getClass().getName());
	}

	default void declareIterator(Transpiler transpiler, Identifier id, IExpression expression) {
		throw new UnsupportedOperationException("declareIterator " + this.getClass().getName());
	}

	default void transpileIterator(Transpiler transpiler, Identifier id, IExpression expression) {
		throw new UnsupportedOperationException("transpileIterator " + this.getClass().getName());
	}

	default void transpileJsxCode(Transpiler transpiler, IExpression expression) {
		expression.transpile(transpiler);
	}

	default ResultInfo compileSorted(Context context, MethodInfo method, Flags flags, ResultInfo srcInfo, IExpression key, boolean descending) {
		throw new UnsupportedOperationException("compileSorted " + this.getClass().getName());
	}

	default ResultInfo compileGetStaticMember(Context context, MethodInfo method, Flags flags, Identifier id) {
		if(flags.isGraceful())
			return null;
		else
			throw new UnsupportedOperationException("compileGetStaticMember " + this.getClass().getName());
	}

}
 