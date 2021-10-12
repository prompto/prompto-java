package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.Collator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.IndexOutOfRangeError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoString;
import prompto.runtime.Context;
import prompto.type.TextType;


public class TextValue extends BaseValue implements Comparable<TextValue>, IContainer<CharacterValue>, ISliceable<CharacterValue>, IMultiplyable {

	String value;

	public TextValue(String value) {
		super(TextType.instance());
		this.value = value;
	}

	@Override
	public String getStorableData() {
		return value;
	}
	
	@Override
	public long getLength() {
		return value.length();
	}
	
	@Override
	public IValue plus(Context context, IValue value) {
		return new TextValue(this.value + value.toString());
	}

	@Override
	public IValue multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof IntegerValue) {
			int count = (int) ((IntegerValue) value).longValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			return new TextValue(PromptoString.multiply(this.value, count));
		} else
			throw new SyntaxError("Illegal: Chararacter * " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(TextValue obj) {
		return value.compareTo(obj.value);
	}

	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof TextValue)
			return this.value.compareTo(((TextValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: Text + " + value.getClass().getSimpleName());
	}
	
	@Override
	public boolean hasItem(Context context, IValue value) throws PromptoError {
		if (value instanceof CharacterValue)
			return this.value.indexOf(((CharacterValue) value).value) >= 0;
		else if (value instanceof TextValue)
			return this.value.indexOf(((TextValue) value).value) >= 0;
		else
			throw new SyntaxError("Illegal contain: Text + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(value.length());
		else
			return super.getMember(context, id, autoCreate);
	}

	@Override
	public CharacterValue getItem(Context context, IValue index) throws PromptoError {
		try {
			if (index instanceof IntegerValue)
				return new CharacterValue(value.charAt((int) ((IntegerValue) index).longValue() - 1));
			else
				throw new SyntaxError("No such item:" + index.toString());
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfRangeError();
		}

	}
	
	@Override
	public IterableWithCounts<CharacterValue> getIterable(Context context) {
		return new CharacterIterable(context);
	}

	class CharacterIterable implements IterableWithCounts<CharacterValue> {

		Context context;
		
		public CharacterIterable(Context context) {
			this.context = context;
		}
		
		@Override
		public Long getCount() {
			return (long)value.length();
		}
		
		@Override
		public Long getTotalCount() {
			return (long)value.length();
		}
		
		@Override
		public Iterator<CharacterValue> iterator() {
			return new Iterator<CharacterValue>() {
				int index = -1;
				
				@Override
				public boolean hasNext() {
					return index < value.length() - 1;
				}
				
				@Override
				public CharacterValue next() {
					return new CharacterValue(value.charAt(++index));
				}
				
				@Override
				public void remove() {
					throw new InternalError("Should never get there!");
				}
			};
		};
	}
	
	@Override
	public Object toJavaValue(Context context, Type type) {
		if(type==String.class)
			return value;
		else
			return super.toJavaValue(context, type);
	}

	@Override
	public ISliceable<CharacterValue> slice(IntegerValue fi, IntegerValue li) throws PromptoError {
		int first = checkSliceFirst(fi);
		int last = checkSliceLast(li);
		return new TextValue(value.substring(first - 1, last ));
	}
	
	private int checkSliceFirst(IntegerValue fi) throws IndexOutOfRangeError {
		int value = (fi == null) ? 1 : (int) fi.longValue();
		if (value < 1 || value > this.value.length())
			throw new IndexOutOfRangeError();
		return value;
	}

	private int checkSliceLast(IntegerValue li) throws IndexOutOfRangeError {
		int value = (li == null) ? this.value.length() : (int) li.longValue();
		if (value < 0)
			value = this.value.length() + 1 + (int) li.longValue();
		if (value < 1 || value > this.value.length())
			throw new IndexOutOfRangeError();
		return value;
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TextValue)
			return value.equals(((TextValue) obj).value);
		else
			return value.equals(obj);
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
    public boolean contains(Context context, IValue obj) throws PromptoError {
        if (obj instanceof TextValue)
        	return value.contains(((TextValue)obj).value);
        else if(obj instanceof CharacterValue)
        	return value.indexOf(((CharacterValue)obj).value) >= 0;
        else
            return false;
    }

	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.textNode(value);
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeString(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
	@Override
	public IValue toDocumentValue(Context context) {
		// necessary to avoid splitting into chars
		return this;
	}

}


