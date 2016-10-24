package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoString;
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
	public Type getJavaType(Context context) {
		return String.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==CharacterType.instance();
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
       if ("count".equals(name))
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
	public Comparator<Text> getComparator(boolean descending) {
		return descending ? 
				new Comparator<Text>() {
					@Override
					public int compare(Text o1, Text o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<Text>() {
					@Override
					public int compare(Text o1, Text o2) {
						return o1.getStorableData().compareTo(o2.getStorableData());
					}
				};
	}

	@Override
	public IValue convertIValueToIValue(Context context, IValue value) {
       if (value instanceof Text)
            return value;
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof String)
            return new Text((String)value);
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	
	@Override
	public void compileConvertObjectToExact(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoString.class, "convertObjectToExact", Object.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return new Text(value.asText());
	}
}
