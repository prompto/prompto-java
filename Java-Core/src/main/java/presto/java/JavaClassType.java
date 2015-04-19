package presto.java;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;

import presto.declaration.AnyNativeCategoryDeclaration;
import presto.declaration.NativeCategoryDeclaration;
import presto.grammar.Identifier;
import presto.runtime.Context;
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
import presto.value.NativeInstance;


public class JavaClassType extends CategoryType {
	
	static Map<Class<?>,IType> javaToPrestoMap = new HashMap<Class<?>, IType>();
	
	static {
		javaToPrestoMap.put(void.class, VoidType.instance());
		javaToPrestoMap.put(boolean.class, BooleanType.instance());
		javaToPrestoMap.put(Boolean.class, BooleanType.instance());
		javaToPrestoMap.put(char.class, CharacterType.instance());
		javaToPrestoMap.put(Character.class, CharacterType.instance());
		javaToPrestoMap.put(int.class, IntegerType.instance());
		javaToPrestoMap.put(Integer.class, IntegerType.instance());
		javaToPrestoMap.put(long.class, IntegerType.instance());
		javaToPrestoMap.put(Long.class, IntegerType.instance());
		javaToPrestoMap.put(Double.class, DecimalType.instance());
		javaToPrestoMap.put(String.class, TextType.instance());
		javaToPrestoMap.put(LocalDate.class, DateType.instance());
		javaToPrestoMap.put(LocalTime.class, TimeType.instance());
		javaToPrestoMap.put(DateTime.class, DateTimeType.instance());
		javaToPrestoMap.put(Period.class, PeriodType.instance());
		javaToPrestoMap.put(Object.class, AnyType.instance());
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
	
	public IType convertNativeTypeToPrestoType(Context context) {
		IType result = javaToPrestoMap.get(klass);
		if(result!=null)
			return result;
		NativeCategoryDeclaration decl = context.getNativeMapping(klass);
		if(decl!=null)
			return decl.getType(context);
		else
			return result; // TODO not sure this makes any sense
	}
	
    public IValue convertJavaValueToPrestoValue(Context context, Object value, IType returnType)
    {
        if(value instanceof IValue)
            return (IValue)value;
        IType result = javaToPrestoMap.get(klass);
        if (result != null)
            return result.convertJavaValueToPrestoValue(value);
		NativeCategoryDeclaration decl = context.getNativeMapping(klass);
		if(decl!=null)
			return new NativeInstance(decl, value);
        else if(returnType==AnyType.instance())
        	return new NativeInstance(AnyNativeCategoryDeclaration.getInstance(), value);
        else
            throw new InternalError("Unable to convert:" + value.getClass().getSimpleName());
    }



}