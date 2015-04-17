package presto.type;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.Range;
import presto.value.ExpressionValue;
import presto.value.ListValue;

public abstract class BaseType implements IType {

	Identifier name;

	protected BaseType(String name) {
		this(new Identifier(name));
	}

	protected BaseType(Identifier name) {
		this.name = name;
	}

	@Override
	public Identifier getName() {
		return name;
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
		return this.getName().equals(type.getName());
	}

	@Override
	public String toString() {
		return name.toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(name);
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(tryReverse)
			return other.checkAdd(context, this, false);
		else
			throw new SyntaxError("Cannot add " + this.getName() + " to " + other.getName());
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot substract " + this.getName() + " from " + other.getName());
	}

	@Override
	public IType checkDivide(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot divide " + this.getName() + " with " + other.getName());
	}

	@Override
	public IType checkIntDivide(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot divide " + this.getName() + " with " + other.getName());
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(tryReverse)
			return other.checkMultiply(context, this, false);
		else
			throw new SyntaxError("Cannot multiply " + this.getName() + " with " + other.getName());
	}

	@Override
	public IType checkModulo(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot modulo " + this.getName() + " with " + other.getName());
	}
	
	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot compare " + this.getName() + " to " + other.getName());
	}

	@Override
	public IType checkContains(Context context, IType other) throws SyntaxError {
		throw new SyntaxError(this.getName() + " cannot contain " + other.getName());
	}

	@Override
	public IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError {
		throw new SyntaxError(this.getName() + " cannot contain " + other.getName());
	}

	@Override
	public IType checkItem(Context context, IType itemType) throws SyntaxError {
		throw new SyntaxError("Cannot read item from " + this.getName());
	}

	@Override
	public IType checkMember(Context context, Identifier name) throws SyntaxError {
		throw new SyntaxError("Cannot read member from " + this.getName());
	}

	@Override
	public IType checkSlice(Context context) throws SyntaxError {
		throw new SyntaxError("Cannot slice " + this.getName());
	}

	@Override
	public IType checkIterator(Context context) throws SyntaxError {
		throw new SyntaxError("Cannot iterate over " + this.getName());
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
			throw new SyntaxError("Type: " + this.getName() + " is not compatible with: " + other.getName());
	}

	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		throw new SyntaxError("Cannot create range of " + this.getName() + " and " + other.getName());
	}

	@Override
	public Range<?> newRange(Object left, Object right) throws SyntaxError {
		throw new SyntaxError("Cannot create range of " + this.getName());
	}

	@Override
	public String toString(Object value) {
		return value.toString();
	}

	@Override
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		throw new RuntimeException("Unsupported!");
	}

	protected ListValue doSort(Context context, ICollection<IValue> list) throws PrestoError {
		return doSort(context, list, null);
	}

	protected <T extends IValue> ListValue doSort(Context context, ICollection<IValue> list, Comparator<T> cmp) throws PrestoError {
		PriorityQueue<T> queue = new PriorityQueue<T>((int) list.length(), cmp);
		for (Object o : list.getItems(context)) {
			if (o instanceof IExpression)
				o = ((IExpression) o).interpret(context);
			@SuppressWarnings("unchecked")
			T value = (T) o;
			queue.offer(value);
		}
		List<IValue> result = new ArrayList<IValue>();
		while (queue.peek() != null)
			result.add(new ExpressionValue(this, queue.poll()));
		IType itemType = ((CollectionType)list.getType()).getItemType();
		return new ListValue(itemType, result);
	}

	public IValue convertJavaValueToPrestoValue(Object value) {
		return (IValue) value; // TODO for now
	}
	
	@Override
	public IValue getMember(Context context, Identifier name) throws PrestoError {
		throw new SyntaxError("Cannot read member from " + this.getName());
	}

}
