package prompto.type;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.Family;

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
	
	public NativeType(Family family) {
		super(family);
	}
	
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		if("text".equals(name.toString()))
			return TextType.instance();
		else
			return super.checkMember(context, name);
	}
	
	@Override
	public void checkUnique(Context context) {
		// nothing to do
	}
	
	@Override
	public void checkExists(Context context) {
		// nothing to do
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return false;
	}
	

}
