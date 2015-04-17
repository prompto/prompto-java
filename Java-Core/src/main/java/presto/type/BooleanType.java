package presto.type;

import presto.error.PrestoError;
import presto.runtime.Context;
import presto.value.Boolean;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.ListValue;

public class BooleanType extends NativeType {
	
	static BooleanType instance = new BooleanType();
	
	public static BooleanType instance() {
		return instance;
	}
	
	private BooleanType() {
		super("Boolean");
	}

	@Override
	public Class<?> toJavaClass() {
		return java.lang.Boolean.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof BooleanType) || (other instanceof AnyType);
	}
	
	@Override
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		return this.doSort(context,list);
	}
	
	@Override
	public IValue convertJavaValueToPrestoValue(Object value) {
        if (value instanceof java.lang.Boolean)
            return Boolean.ValueOf(((java.lang.Boolean)value).booleanValue());
        else
            return (IValue)value; // TODO for now
	}

}
