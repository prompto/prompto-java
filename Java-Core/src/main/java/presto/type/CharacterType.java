package presto.type;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.value.Character;
import presto.value.CharacterRange;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.Range;
import presto.value.ListValue;

public class CharacterType extends NativeType {

	static CharacterType instance = new CharacterType();
	
	public static CharacterType instance() {
		return instance;
	}
	
	private CharacterType() {
		super("Character");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return java.lang.Character.class;
	}
	

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof CharacterType) || (other instanceof TextType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		return TextType.instance();
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return TextType.instance();
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if(other instanceof CharacterType || other instanceof TextType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
	}
	
	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		if(other instanceof CharacterType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}
	
	@Override
	public Range<?> newRange(Object left, Object right) throws SyntaxError {
		if(left instanceof Character && right instanceof Character)
			return new CharacterRange((Character)left,(Character)right);
		return super.newRange(left, right);
	}

	@Override
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		return this.doSort(context,list);
	}
	
	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue convertJavaValueToPrestoValue(Object value) {
        if (value instanceof java.lang.Character)
            return new Character(((java.lang.Character)value).charValue());
        else
            return (IValue)value; // TODO for now
	}

}
