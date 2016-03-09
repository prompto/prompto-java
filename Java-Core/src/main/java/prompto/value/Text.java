package prompto.value;

import java.io.IOException;
import java.text.Collator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import prompto.compiler.IConverterFunction;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.IndexOutOfRangeError;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.TextType;

import com.fasterxml.jackson.core.JsonGenerator;


public class Text extends BaseValue implements Comparable<Text>, IContainer<Character>, ISliceable<Character>, IMultiplyable {

	String value;

	public Text(String value) {
		super(TextType.instance());
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
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

	static Map<Class<?>, IConverterFunction> textConverters = createConverters();
	
	public static ResultInfo compileAdd(Context context, MethodInfo method, IExpression value) throws SyntaxError {
		ResultInfo right = value.compile(context, method);
		// convert right to String
		IConverterFunction converter = textConverters.get(right.getType());
		if(converter==null)
			converter = Text::objectConverter;
		right = converter.compile(context, method, right);
		// and call concat
		MethodConstant c = new MethodConstant(String.class, "concat", 
				String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(String.class, true);
	}
	
	private static Map<Class<?>, IConverterFunction> createConverters() {
		Map<Class<?>, IConverterFunction> map = new HashMap<>();
		map.put(String.class, Text::textConverter);
		return map;
	}

	private static ResultInfo objectConverter(Context context, MethodInfo method, ResultInfo info) {
		MethodConstant c = new MethodConstant(info.getType(), "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(String.class, true);
	}

	private static ResultInfo textConverter(Context context, MethodInfo method, ResultInfo info) {
		return info;
	}
	
	@Override
	public IValue Multiply(Context context, IValue value) throws PromptoError {
		if (value instanceof Integer) {
			int count = (int) ((Integer) value).longValue();
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
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(value.length());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	public Character getItem(Context context, IValue index) throws PromptoError {
		try {
			if (index instanceof Integer)
				return new Character(value.charAt((int) ((Integer) index).longValue() - 1));
			else
				throw new InvalidDataError("No such item:" + index.toString());
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfRangeError();
		}

	}
	
	@Override
	public Iterable<Character> getIterable(Context context) {
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
	public Object convertTo(Class<?> type) {
		return value;
	}

	public ISliceable<Character> slice(Integer fi, Integer li) throws PromptoError {
		int first = checkFirst(fi);
		int last = checkLast(li);
		return new Text(value.substring(first - 1, last ));
	}

	private int checkFirst(Integer fi) throws IndexOutOfRangeError {
		int value = (fi == null) ? 1 : (int) fi.longValue();
		if (value < 1 || value > this.value.length())
			throw new IndexOutOfRangeError();
		return value;
	}

	private int checkLast(Integer li) throws IndexOutOfRangeError {
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
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeString(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}


