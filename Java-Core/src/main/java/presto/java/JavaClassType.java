package presto.java;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;

import presto.grammar.Identifier;
import presto.type.AnyType;
import presto.type.BooleanType;
import presto.type.CategoryType;
import presto.type.CharacterType;
import presto.type.DateTimeType;
import presto.type.DateType;
import presto.type.DecimalType;
import presto.type.IType;
import presto.type.IntegerType;
import presto.type.PeriodType;
import presto.type.TextType;
import presto.type.TimeType;
import presto.type.VoidType;
import presto.value.IValue;


public class JavaClassType extends CategoryType {
	
	static Map<Class<?>,IType> javaToTypeMap = new HashMap<Class<?>, IType>();
	
	static {
		javaToTypeMap.put(void.class, VoidType.instance());
		javaToTypeMap.put(boolean.class, BooleanType.instance());
		javaToTypeMap.put(Boolean.class, BooleanType.instance());
		javaToTypeMap.put(char.class, CharacterType.instance());
		javaToTypeMap.put(Character.class, CharacterType.instance());
		javaToTypeMap.put(int.class, IntegerType.instance());
		javaToTypeMap.put(Integer.class, IntegerType.instance());
		javaToTypeMap.put(long.class, IntegerType.instance());
		javaToTypeMap.put(Long.class, IntegerType.instance());
		javaToTypeMap.put(Double.class, DecimalType.instance());
		javaToTypeMap.put(String.class, TextType.instance());
		javaToTypeMap.put(LocalDate.class, DateType.instance());
		javaToTypeMap.put(LocalTime.class, TimeType.instance());
		javaToTypeMap.put(DateTime.class, DateTimeType.instance());
		javaToTypeMap.put(Period.class, PeriodType.instance());
		javaToTypeMap.put(Object.class, AnyType.instance());
	}
	
	Class<?> klass;
	
	public JavaClassType(Class<?> klass) {
		super(new Identifier(klass.getName()));
		this.klass = klass;
	}
	
	@Override
	public Class<?> toJavaClass() {
		return this.klass;
	}
	
	public IType convertSystemTypeToPrestoType() {
		IType result = javaToTypeMap.get(klass);
		if(result==null)
			return this;
		else
			return result;
	}
	
    public IValue convertNativeValueToPrestoValue(Object value)
    {
        if(value instanceof IValue)
            return (IValue)value;
        IType result = javaToTypeMap.get(klass);
        if (result != null)
            return result.convertNativeValueToPrestoValue(value);
        else
            throw new InternalError("Unable to convert:" + value.getClass().getSimpleName());
    }



}