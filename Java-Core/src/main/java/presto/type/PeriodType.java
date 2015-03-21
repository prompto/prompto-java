package presto.type;

import org.joda.time.Period;

import presto.error.SyntaxError;
import presto.runtime.Context;



public class PeriodType extends NativeType {

	static PeriodType instance = new PeriodType();
	
	public static PeriodType instance() {
		return instance;
	}
	
	private PeriodType() {
		super("Duration");
	}

	@Override
	public Class<?> toJavaClass() {
		return Period.class;
	}
	

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof PeriodType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		if(other instanceof PeriodType)
			return this;
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}

	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if(other instanceof PeriodType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
	}
}
