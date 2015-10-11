package prompto.value;

import java.io.IOException;
import java.text.Collator;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.IndexOutOfRangeError;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.TextType;


public class Text extends BaseValue implements Comparable<Text>, ICollection<Character>, ISliceable<Character>, IMultiplyable {

	String value;

	public Text(String value) {
		super(TextType.instance());
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public long length() {
		return value.length();
	}
	
	@Override
	public boolean isEmpty() {
		return value.isEmpty();
	}

	@Override
	public IValue Add(Context context, IValue value) {
		return new Text(this.value + value.toString());
	}

	@Override
	public IValue Multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			int count = (int) ((Integer) value).IntegerValue();
			if (count < 0)
				throw new SyntaxError("Negative repeat count:" + count);
			if (count == 0)
				return new Text("");
			if (count == 1)
				return new Text(this.value);
			char[] src = this.value.toCharArray();
			char[] cc = new char[count * src.length];
			for (int i = 0; i < count; i++)
				System.arraycopy(src, 0, cc, i * src.length, src.length);
			return new Text(new String(cc));
		} else
			throw new SyntaxError("Illegal: Chararacter * " + value.getClass().getSimpleName());
	}

	public int compareTo(Text obj) {
		return value.compareTo(obj.getValue());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof Text)
			return this.value.compareTo(((Text) value).value);
		else
			throw new SyntaxError("Illegal comparison: Text + " + value.getClass().getSimpleName());
	}

	public boolean hasItem(Context context, IValue value) throws PromptoError {
		if (value instanceof Character)
			return this.value.indexOf(((Character) value).value) >= 0;
		else if (value instanceof Text)
			return this.value.indexOf(((Text) value).value) >= 0;
		else
			throw new SyntaxError("Illegal contain: Text + " + value.getClass().getSimpleName());
	}

	@Override
	public IValue getMember(Context context, Identifier id) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(value.length());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	public Character getItem(Context context, IValue index) throws PromptoError {
		try {
			if (index instanceof Integer)
				return new Character(value.charAt((int) ((Integer) index).IntegerValue() - 1));
			else
				throw new InvalidDataError("No such item:" + index.toString());
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfRangeError();
		}

	}
	
	@Override
	public Iterable<Character> getItems(Context context) {
		return new CharacterIterable(context);
	}

	class CharacterIterable implements Iterable<Character> {

		Context context;
		
		public CharacterIterable(Context context) {
			this.context = context;
		}
		
		@Override
		public Iterator<Character> iterator() {
			return new CharacterIterator();
		}
		
		class CharacterIterator implements Iterator<Character> {
			
			int index = -1;
			
			@Override
			public boolean hasNext() {
				return index < value.length() - 1;
			}
			
			@Override
			public Character next() {
				return new Character(value.charAt(++index));
			}
			
			@Override
			public void remove() {
				throw new InternalError("Should never get there!");
			}
		}
	}
	
	@Override
	public Object ConvertTo(Class<?> type) {
		return value;
	}

	public ISliceable<Character> slice(Integer fi, Integer li) throws PromptoError {
		int first = checkFirst(fi);
		int last = checkLast(li);
		return new Text(value.substring(first - 1, last ));
	}

	private int checkFirst(Integer fi) throws IndexOutOfRangeError {
		int value = (fi == null) ? 1 : (int) fi.IntegerValue();
		if (value < 1 || value > this.value.length())
			throw new IndexOutOfRangeError();
		return value;
	}

	private int checkLast(Integer li) throws IndexOutOfRangeError {
		int value = (li == null) ? this.value.length() : (int) li.IntegerValue();
		if (value < 0)
			value = this.value.length() + 1 + (int) li.IntegerValue();
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
		if (obj instanceof Text)
			return value.equals(((Text) obj).value);
		else
			return value.equals(obj);
	}

    @Override
    public boolean Roughly(Context context, IValue obj) throws PromptoError {
        if (obj instanceof Character || obj instanceof Text) {
        	Collator c = Collator.getInstance();
        	c.setStrength(Collator.PRIMARY);
        	return c.compare(value, obj.toString())==0;
        } else
            return false;
    }

	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator) throws IOException {
		generator.writeString(value);
	}

}


