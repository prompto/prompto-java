package prompto.type;

import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.Comparator;
import java.util.Map;

import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.Character;
import prompto.value.CharacterRange;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public class CharacterType extends NativeType {

	static CharacterType instance = new CharacterType();
	
	public static CharacterType instance() {
		return instance;
	}
	
	private CharacterType() {
		super(Family.CHARACTER);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return java.lang.Character.class;
	}
	

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		return TextType.instance();
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return TextType.instance();
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if(other instanceof CharacterType || other instanceof TextType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkRange(Context context, IType other) {
		if(other instanceof CharacterType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}
	
	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		if(left instanceof Character && right instanceof Character)
			return new CharacterRange((Character)left,(Character)right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<Character> getComparator() {
		return new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return java.lang.Character.compare(o1.getValue(), o2.getValue());
			}
		};
	}
	
	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof java.lang.Character)
            return new Character(((java.lang.Character)value).charValue());
        else
            return (IValue)value; // TODO for now
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		if(value.asText().length()>1)
			throw new InvalidParameterException(value.toString());
		return new Character(value.asText().charAt(0));
	}

}
