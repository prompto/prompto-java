package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.IValue;
import prompto.value.Text;

import com.fasterxml.jackson.databind.JsonNode;


public class TextType extends NativeType {

	static TextType instance = new TextType();
	
	public static TextType instance() {
		return instance;
	}
	
	private TextType() {
		super(Family.TEXT);
	}
	
	@Override
	public Type getJavaType() {
		return String.class;
	}
	

	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return other==TextType.instance() || other==AnyType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(tryReverse)
			return this; // we're lhs, ok
		else
			return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if(other instanceof TextType || other instanceof CharacterType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkItem(Context context, IType other) {
		if(other==IntegerType.instance())
			return CharacterType.instance();
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
       if ("length".equals(name))
            return IntegerType.instance();
       else
    	   return super.checkMember(context, id);
	}

	
	@Override
	public IType checkContains(Context context, IType other) {
		if(other instanceof TextType || other instanceof CharacterType)
			return BooleanType.instance();
		return super.checkContains(context, other);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) {
		return BooleanType.instance();
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}

	@Override
	public Comparator<Text> getComparator() {
		return new Comparator<Text>() {
			@Override
			public int compare(Text o1, Text o2) {
				return o1.getStorableData().compareTo(o2.getStorableData());
			}
		};
	}

	@Override
	public IValue convertJavaValueToPromptoValue(Context context, Object value) {
        if (value instanceof String)
            return new Text((String)value);
        else
            return super.convertJavaValueToPromptoValue(context, value);
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		return new Text(value.asText());
	}
}
