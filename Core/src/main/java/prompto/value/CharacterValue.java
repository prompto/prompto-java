package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.Collator;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoChar;
import prompto.runtime.Context;
import prompto.type.CharacterType;

public class CharacterValue extends BaseValue implements Comparable<CharacterValue>, IMultiplyable
{
    char value;

    public CharacterValue(char value)
    {
		super(CharacterType.instance());
        this.value = value;
    }

    public char getValue() { 
    	return value; 
    }
    
    @Override
    public Object getStorableData() {
    	return value;
    }
    
    public IValue asText() {
    	return new TextValue(java.lang.Character.toString(value));
    }

    @Override
    public IValue plus(Context context, IValue value) {
        return new TextValue(this.value + value.toString());
    }

	@Override
    public IValue multiply(Context context, IValue value) throws PromptoError {
        if (value instanceof IntegerValue) {
            int count = (int)((IntegerValue)value).longValue();
            if (count < 0)
                throw new SyntaxError("Negative repeat count:" + count);
            return new TextValue(PromptoChar.multiply(this.value, count));
      } else
           throw new SyntaxError("Illegal: Chararacter * " + value.getClass().getSimpleName());
     }

	@Override
	public int compareTo(CharacterValue obj) {
        return java.lang.Character.compare(value, obj.value);
    }

    @Override
    public int compareTo(Context context, IValue value) {
        if (value instanceof CharacterValue)
            return java.lang.Character.compare(this.value, ((CharacterValue)value).value);
        else
            throw new SyntaxError("Illegal comparison: Character + " + value.getClass().getSimpleName());
    }
    
    @Override
    public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		if ("codePoint".equals(id.toString()))
			return new IntegerValue((int)value);
		else
			return super.getMember(context, id, autoCreate);
    };

    @Override
	public Object convertTo(Context context, Type type) {
        return value;
    }
    
    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CharacterValue)
            return value == ((CharacterValue)obj).value;
        else
            return false;
    }
    
	@Override
    public boolean roughly(Context context, IValue obj) throws PromptoError {
        if (obj instanceof CharacterValue || obj instanceof TextValue) {
        	Collator c = Collator.getInstance();
        	c.setStrength(Collator.PRIMARY);
        	return c.compare(value, obj.toString())==0;
        } else
            return false;
    }
    
    @Override
    public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
    	return JsonNodeFactory.instance.textNode(String.valueOf(value));
    }
    
    @Override
    public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(CharacterType.instance().getTypeName());
				generator.writeFieldName("value");
				generator.writeString("" + value);
				generator.writeEndObject();
			} else
				generator.writeString("" + value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
   }



}

