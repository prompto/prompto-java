package presto.type;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.Integer;
import presto.value.IntegerRange;
import presto.value.Range;
import presto.value.ListValue;

public class IntegerType extends NativeType {

	static IntegerType instance = new IntegerType();
	
	public static IntegerType instance() {
		return instance;
	}
	
	private IntegerType() {
		super("Integer");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return Long.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof IntegerType) || (other instanceof DecimalType) || (other instanceof AnyType);
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return other;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return other;
		return super.checkSubstract(context, other);
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return other;
		if(other instanceof CharacterType)
			return TextType.instance();
		if(other instanceof TextType)
			return other;
		if(other instanceof PeriodType)
			return other;
		if(other instanceof ListType)
			return other;
		return super.checkMultiply(context, other, tryReverse);
	}

	@Override
	public IType checkDivide(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return DecimalType.instance();
		if(other instanceof DecimalType)
			return other;
		return super.checkDivide(context, other);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		return super.checkIntDivide(context, other);
	}

	@Override
	public IType checkModulo(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		return super.checkModulo(context, other);
	}

	@Override
	public IType checkMember(Context context, Identifier name) throws SyntaxError {
		if(name.equals("min"))
			return this;
		else if(name.equals("max"))
			return this;
		else
			return super.checkMember(context, name);
	}

	@Override
	public IValue getMember(Context context, Identifier name) throws PrestoError {
		if(name.equals("min"))
			return new Integer(java.lang.Integer.MIN_VALUE);
		else if(name.equals("max"))
			return new Integer(java.lang.Integer.MAX_VALUE);
		else
			return super.getMember(context, name);
	}
	
	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return BooleanType.instance();
		if(other instanceof DecimalType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
	}
	
	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return new RangeType(this);
		return super.checkCompare(context, other);
	}
	
	@Override
	public Range<?> newRange(Object left, Object right) throws SyntaxError {
		if(left instanceof Integer && right instanceof Integer)
			return new IntegerRange((Integer)left,(Integer)right);
		return super.newRange(left, right);
	}

	@Override
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		return this.doSort(context,list);
	}
	
	@Override
	public IValue convertJavaValueToPrestoValue(Object value) {
        if (value instanceof Number)
            return new Integer(((Number)value).longValue());
        else
            return (IValue)value; // TODO for now
	}

}
