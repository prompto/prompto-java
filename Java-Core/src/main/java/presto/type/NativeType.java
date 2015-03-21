package presto.type;

import presto.error.SyntaxError;
import presto.runtime.Context;

public abstract class NativeType extends BaseType {

	private static NativeType[] all = null;
	
	public static NativeType[] getAll() {
		if(all==null) {
			all = new NativeType[] {
					AnyType.instance(),
					BooleanType.instance(),
					IntegerType.instance(),
					DecimalType.instance(),
					CharacterType.instance(),
					TextType.instance(),
					CodeType.instance(),
					DateType.instance(),
					TimeType.instance(),
					DateTimeType.instance(),
					PeriodType.instance(),
					DocumentType.instance(),
					TupleType.instance()
				};
		}
		return all;
	}
	
	public NativeType(String name) {
		super(name);
	}
	
	@Override
	public void checkUnique(Context context) throws SyntaxError {
		// nothing to do
	}
	
	@Override
	public void checkExists(Context context) throws SyntaxError {
		// nothing to do
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return false;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return other==this;
	}
		
}
