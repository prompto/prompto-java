package prompto.type;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.ExpressionValue;
import prompto.value.IContainer;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.Range;

public abstract class BaseType implements IType {

	Identifier id;

	protected BaseType(String name) {
		this(new Identifier(name));
	}

	protected BaseType(Identifier id) {
		this.id = id;
	}

	@Override
	public Identifier getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return id.getName();
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
		return this.getId().equals(type.getId());
	}

	@Override
	public String toString() {
		return id.toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(tryReverse)
			return other.checkAdd(context, this, false);
		else
			throw new SyntaxError("Cannot add " + this.getId() + " to " + other.getId());
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot substract " + this.getId() + " from " + other.getId());
	}

	@Override
	public IType checkDivide(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot divide " + this.getId() + " with " + other.getId());
	}

	@Override
	public IType checkIntDivide(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot divide " + this.getId() + " with " + other.getId());
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(tryReverse)
			return other.checkMultiply(context, this, false);
		else
			throw new SyntaxError("Cannot multiply " + this.getId() + " with " + other.getId());
	}

	@Override
	public IType checkModulo(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot modulo " + this.getId() + " with " + other.getId());
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) throws SyntaxError {
		context.getProblemListener().reportIllegalComparison(this, other, section);
		return BooleanType.instance();
	}

	@Override
	public IType checkContains(Context context, IType other) throws SyntaxError {
		throw new SyntaxError(this.getId() + " cannot contain " + other.getId());
	}

	@Override
	public IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError {
		throw new SyntaxError(this.getId() + " cannot contain " + other.getId());
	}

	@Override
	public IType checkItem(Context context, IType itemType) throws SyntaxError {
		throw new SyntaxError("Cannot read item from " + this.getId());
	}

	@Override
	public IType checkMember(Context context, Identifier name) throws SyntaxError {
		context.getProblemListener().reportIllegalMember(name.getName(), name);
		return VoidType.instance();
	}

	@Override
	public IType checkSlice(Context context) throws SyntaxError {
		throw new SyntaxError("Cannot slice " + this.getId());
	}

	@Override
	public IType checkIterator(Context context) throws SyntaxError {
		throw new SyntaxError("Cannot iterate over " + this.getId());
	}

	@Override
	public abstract void checkUnique(Context context) throws SyntaxError;

	@Override
	public abstract void checkExists(Context context) throws SyntaxError;

	@Override
	public abstract boolean isAssignableTo(Context context, IType other);

	@Override
	public abstract boolean isMoreSpecificThan(Context context, IType other);

	@Override
	public final void checkAssignableTo(Context context, IType other) throws SyntaxError {
		if (!isAssignableTo(context, other))
			throw new SyntaxError("Type: " + this.getId() + " is not compatible with: " + other.getId());
	}

	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot create range of " + this.getId() + " and " + other.getId());
	}

	@Override
	public Range<?> newRange(Object left, Object right) throws SyntaxError {
		throw new SyntaxError("Cannot create range of " + this.getId());
	}

	@Override
	public String toString(Object value) {
		return value.toString();
	}

	@Override
	public ListValue sort(Context context, IContainer<IValue> list) throws PromptoError {
		throw new RuntimeException("Unsupported!");
	}

	protected ListValue doSort(Context context, IContainer<IValue> list) throws PromptoError {
		return doSort(context, list, null);
	}

	protected <T extends IValue> ListValue doSort(Context context, IContainer<IValue> list, Comparator<T> cmp) throws PromptoError {
		PriorityQueue<T> queue = new PriorityQueue<T>((int) list.length(), cmp);
		for (Object o : list.getIterable(context)) {
			if (o instanceof IExpression)
				o = ((IExpression) o).interpret(context);
			@SuppressWarnings("unchecked")
			T value = (T) o;
			queue.offer(value);
		}
		List<IValue> result = new ArrayList<IValue>();
		while (queue.peek() != null)
			result.add(new ExpressionValue(this, queue.poll()));
		IType itemType = ((ContainerType)list.getType()).getItemType();
		return new ListValue(itemType, result);
	}

	public IValue convertJavaValueToPromptoValue(Object value) {
		return (IValue) value; // TODO for now
	}
	
	@Override
	public IValue getMember(Context context, Identifier name) throws PromptoError {
		throw new SyntaxError("Cannot read member from " + this.getId());
	}

	@Override
	public IValue readJSONValue(JsonNode value) {
		throw new InvalidParameterException(value.toString());
	}
}
