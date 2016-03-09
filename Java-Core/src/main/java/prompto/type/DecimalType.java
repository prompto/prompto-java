package prompto.type;

import java.util.Comparator;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.Decimal;
import prompto.value.IContainer;
import prompto.value.INumber;
import prompto.value.IValue;
import prompto.value.ListValue;


public class DecimalType extends NativeType implements INumberType {

	static DecimalType instance = new DecimalType();
	
	public static DecimalType instance() {
		return instance;
	}
	
	private DecimalType() {
		super("Decimal");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return Double.class;
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
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}

	@Override
	public IType checkDivide(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkDivide(context, other);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return other;
		return super.checkIntDivide(context, other);
	}
	
	@Override
	public IType checkModulo(Context context, IType other) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return this;
		return super.checkModulo(context, other);
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
	public ListValue sort(Context context, IContainer<IValue> list) throws PromptoError {
		return this.<INumber>doSort(context,list,new Comparator<INumber>() {
			@Override
			public int compare(INumber o1, INumber o2) {
				return o1.compareTo(o2);
			};
		});
	}

	@Override
	public IValue convertJavaValueToPromptoValue(Object value) {
        if (value instanceof Number)
            return new Decimal(((Number)value).doubleValue());
        else
            return (IValue)value; // TODO for now
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		return new Decimal(value.asDouble());
	}

}
