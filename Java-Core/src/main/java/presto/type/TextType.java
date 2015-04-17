package presto.type;

import java.util.Comparator;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.Text;
import presto.value.ListValue;


public class TextType extends NativeType {

	static TextType instance = new TextType();
	
	public static TextType instance() {
		return instance;
	}
	
	private TextType() {
		super("Text");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return String.class;
	}
	

	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof TextType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(tryReverse)
			return this; // we're lhs, ok
		else
			return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if(other instanceof TextType || other instanceof CharacterType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
	}
	
	@Override
	public IType checkItem(Context context, IType other) throws SyntaxError {
		if(other==IntegerType.instance())
			return CharacterType.instance();
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
       if ("length".equals(name))
            return IntegerType.instance();
       else
    	   return super.checkMember(context, id);
	}

	
	@Override
	public IType checkContains(Context context, IType other) throws SyntaxError {
		if(other instanceof TextType || other instanceof CharacterType)
			return BooleanType.instance();
		return super.checkContains(context, other);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError {
		return BooleanType.instance();
	}
	
	@Override
	public IType checkSlice(Context context) throws SyntaxError {
		return this;
	}

	@Override
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		return this.<IValue>doSort(context,list, new Comparator<IValue>() {
			@Override
			public int compare(IValue o1, IValue o2) {
				return o1.toString().compareTo(o2.toString());
			};
		});
	}
	
	@Override
	public IValue convertJavaValueToPrestoValue(Object value) {
        if (value instanceof String)
            return new Text((String)value);
        else
            return (IValue)value; // TODO for now
	}
	
}
