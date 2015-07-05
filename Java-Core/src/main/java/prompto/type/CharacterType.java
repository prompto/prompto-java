package prompto.type;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.value.Character;
import prompto.value.CharacterRange;
import prompto.value.ICollection;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.Range;

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
	public ListValue sort(Context context, ICollection<IValue> list) throws PromptoError {
		return this.doSort(context,list);
	}
	
	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue convertJavaValueToPromptoValue(Object value) {
        if (value instanceof java.lang.Character)
            return new Character(((java.lang.Character)value).charValue());
        else
            return (IValue)value; // TODO for now
	}

}
