package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.runtime.Context;
import prompto.value.Boolean;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class BooleanType extends NativeType {
	
	static BooleanType instance = new BooleanType();
	
	public static BooleanType instance() {
		return instance;
	}
	
	private BooleanType() {
		super(Family.BOOLEAN);
	}

	@Override
	public Type getJavaType() {
		return java.lang.Boolean.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof BooleanType) || (other instanceof AnyType);
	}
	
	@Override
	public Comparator<? extends IValue> getComparator() {
		return new Comparator<Boolean>() {
			@Override
			public int compare(Boolean o1, Boolean o2) {
				return java.lang.Boolean.compare(o1.getValue(), o2.getValue());
			}
		};
	}
	
	@Override
	public IValue convertJavaValueToPromptoValue(Object value) {
        if (value instanceof java.lang.Boolean)
            return Boolean.valueOf(((java.lang.Boolean)value).booleanValue());
        else
        	return super.convertJavaValueToPromptoValue(value);
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		return prompto.value.Boolean.valueOf(value.asBoolean());
	}

}
