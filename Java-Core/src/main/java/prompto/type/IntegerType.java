package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.IntegerRange;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public class IntegerType extends NativeType implements INumberType {

	static IntegerType instance = new IntegerType();
	
	public static IntegerType instance() {
		return instance;
	}
	
	private IntegerType() {
		super("Integer");
	}
	
	@Override
	public Type getJavaType() {
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
	public IValue getMember(Context context, Identifier name) throws PromptoError {
		if(name.equals("min"))
			return new Integer(java.lang.Integer.MIN_VALUE);
		else if(name.equals("max"))
			return new Integer(java.lang.Integer.MAX_VALUE);
		else
			return super.getMember(context, name);
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) throws SyntaxError {
		if(other instanceof IntegerType)
			return BooleanType.instance();
		if(other instanceof DecimalType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}
	
	@Override
	public RangeBase<?> newRange(Object left, Object right) throws SyntaxError {
		if(left instanceof Integer && right instanceof Integer)
			return new IntegerRange((Integer)left,(Integer)right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<Integer> getComparator() {
		return new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return java.lang.Long.compare(o1.longValue(), o2.longValue());
			}
		};
	}

	@Override
	public IValue convertJavaValueToPromptoValue(Object value) {
        if (value instanceof Number)
            return new Integer(((Number)value).longValue());
        else
            return (IValue)value; // TODO for now
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		return new Integer(value.asLong());
	}
}
