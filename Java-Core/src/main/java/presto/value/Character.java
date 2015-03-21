package presto.value;

import java.text.Collator;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.CharacterType;

public class Character extends BaseValue implements Comparable<Character>, IMultiplyable
{
    char value;

    public Character(char value)
    {
		super(CharacterType.instance());
        this.value = value;
    }

    public char getValue() { 
    	return value; 
    }

    @Override
    public IValue Add(Context context, IValue value)
    {
        return new Text(this.value + value.toString());
    }

    @Override
    public IValue Multiply(Context context, IValue value) throws PrestoError
    {
        if (value instanceof Integer)
        {
            int count = (int)((Integer)value).IntegerValue();
            if (count < 0)
                throw new SyntaxError("Negative repeat count:" + count);
            if (count == 0)
                return new Text("");
            if (count == 1)
                return new Text("" + value);
            char[] cc = new char[count];
            for (int i = 0; i < count; i++)
                cc[i] = this.value;
            return new Text(new String(cc));
      }
        else
           throw new SyntaxError("Illegal: Chararacter * " + value.getClass().getSimpleName());
     }

    public int compareTo(Character obj)
    {
        return java.lang.Character.compare(value, obj.getValue());
    }

    @Override
    public int CompareTo(Context context, IValue value) throws SyntaxError
    {
        if (value instanceof Character)
            return java.lang.Character.compare(this.value, ((Character)value).value);
        else
            throw new SyntaxError("Illegal comparison: Character + " + value.getClass().getSimpleName());

    }

    
    @Override
    public Object ConvertTo(Class<?> type)
    {
        return value;
    }
    
    @Override
    public String toString()
    {
        return "" + value;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Character)
            return value == ((Character)obj).value;
        else
            return false;
    }
    
    @Override
    public boolean Roughly(Context context, IValue obj) throws PrestoError {
        if (obj instanceof Character || obj instanceof Text) {
        	Collator c = Collator.getInstance();
        	c.setStrength(Collator.PRIMARY);
        	return c.compare(value, obj.toString())==0;
        } else
            return false;
    }


}

