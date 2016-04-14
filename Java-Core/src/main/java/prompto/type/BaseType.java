package prompto.type;

import java.security.InvalidParameterException;
import java.util.Comparator;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public abstract class BaseType implements IType {

	Family family;

	protected BaseType(Family family) {
		this.family = family;
	}

	@Override
	public Family getFamily() {
		return family;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof IType))
			return false;
		IType type = (IType) obj;
		return this.getTypeName().equals(type.getTypeName());
	}

	@Override
	public String toString() {
		return getTypeName();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(getTypeName());
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(tryReverse)
			return other.checkAdd(context, this, false);
		else
			throw new SyntaxError("Cannot add " + this.getTypeName() + " to " + other.getTypeName());
	}

	@Override
	public IType checkSubstract(Context context, IType other) {
		throw new SyntaxError("Cannot substract " + this.getTypeName() + " from " + other.getTypeName());
	}

	@Override
	public IType checkDivide(Context context, IType other) {
		throw new SyntaxError("Cannot divide " + this.getTypeName() + " with " + other.getTypeName());
	}

	@Override
	public IType checkIntDivide(Context context, IType other) {
		throw new SyntaxError("Cannot divide " + this.getTypeName() + " with " + other.getTypeName());
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(tryReverse)
			return other.checkMultiply(context, this, false);
		else
			throw new SyntaxError("Cannot multiply " + this.getTypeName() + " with " + other.getTypeName());
	}

	@Override
	public IType checkModulo(Context context, IType other) {
		throw new SyntaxError("Cannot modulo " + this.getTypeName() + " with " + other.getTypeName());
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		context.getProblemListener().reportIllegalComparison(this, other, section);
		return BooleanType.instance();
	}

	@Override
	public IType checkContains(Context context, IType other) {
		throw new SyntaxError(this.getTypeName() + " cannot contain " + other.getTypeName());
	}

	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		throw new SyntaxError(this.getTypeName() + " cannot contain " + other.getTypeName());
	}

	@Override
	public IType checkItem(Context context, IType itemType) {
		throw new SyntaxError("Cannot read item from " + this.getTypeName());
	}

	@Override
	public IType checkMember(Context context, Identifier name) {
		context.getProblemListener().reportIllegalMember(name.toString(), name);
		return VoidType.instance();
	}

	@Override
	public IType checkSlice(Context context) {
		throw new SyntaxError("Cannot slice " + this.getTypeName());
	}

	@Override
	public IType checkIterator(Context context) {
		throw new SyntaxError("Cannot iterate over " + this.getTypeName());
	}

	@Override
	public abstract void checkUnique(Context context);

	@Override
	public abstract void checkExists(Context context);

	@Override
	public abstract boolean isAssignableTo(Context context, IType other);

	@Override
	public abstract boolean isMoreSpecificThan(Context context, IType other);

	@Override
	public final void checkAssignableTo(Context context, IType other) {
		if(other==DocumentType.instance() || other==AnyType.instance())
			return;
		if (!isAssignableTo(context, other))
			throw new SyntaxError("Type: " + this.getTypeName() + " is not compatible with: " + other.getTypeName());
	}

	@Override
	public IType checkRange(Context context, IType other) {
		throw new SyntaxError("Cannot create range of " + this.getTypeName() + " and " + other.getTypeName());
	}

	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		throw new SyntaxError("Cannot create range of " + this.getTypeName());
	}

	@Override
	public String toString(Object value) {
		return value.toString();
	}

	@Override
	public Comparator<? extends IValue> getComparator() {
		throw new RuntimeException("Unsupported!");
	}

	public IValue convertJavaValueToPromptoValue(Context context, Object value) {
		throw new RuntimeException("Unsupported convertJavaValueToPromptoValue for " + this.getClass());
	}
	
	@Override
	public IValue getMember(Context context, Identifier name) throws PromptoError {
		throw new SyntaxError("Cannot read member from " + this.getTypeName());
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		throw new InvalidParameterException(value.toString());
	}
	
}
