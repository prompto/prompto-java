package prompto.java;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;

import prompto.declaration.AnyNativeCategoryDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.PeriodType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.VoidType;
import prompto.value.IValue;
import prompto.value.NativeInstance;


public class JavaClassType extends CategoryType {
	
	static Map<Class<?>,IType> javaToPromptoMap = new HashMap<Class<?>, IType>();
	
	static {
		javaToPromptoMap.put(void.class, VoidType.instance());
		javaToPromptoMap.put(boolean.class, BooleanType.instance());
		javaToPromptoMap.put(Boolean.class, BooleanType.instance());
		javaToPromptoMap.put(char.class, CharacterType.instance());
		javaToPromptoMap.put(Character.class, CharacterType.instance());
		javaToPromptoMap.put(int.class, IntegerType.instance());
		javaToPromptoMap.put(Integer.class, IntegerType.instance());
		javaToPromptoMap.put(long.class, IntegerType.instance());
		javaToPromptoMap.put(Long.class, IntegerType.instance());
		javaToPromptoMap.put(Double.class, DecimalType.instance());
		javaToPromptoMap.put(String.class, TextType.instance());
		javaToPromptoMap.put(LocalDate.class, DateType.instance());
		javaToPromptoMap.put(LocalTime.class, TimeType.instance());
		javaToPromptoMap.put(DateTime.class, DateTimeType.instance());
		javaToPromptoMap.put(Period.class, PeriodType.instance());
		javaToPromptoMap.put(Object.class, AnyType.instance());
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
	
	public IType convertJavaClassToPromptoType(Context context, IType returnType) {
		IType result = javaToPromptoMap.get(klass);
		if(result!=null)
			return result;
		NativeCategoryDeclaration decl = context.getNativeMapping(klass);
		if(decl!=null)
			return decl.getType(context);
		else if(returnType==AnyType.instance())
			return returnType;
		else
			return null;
	}
	
    public IValue convertJavaValueToPromptoValue(Context context, Object value, IType returnType)
    {
        if(value instanceof IValue)
            return (IValue)value;
        IType result = javaToPromptoMap.get(klass);
        if (result != null)
            return result.convertJavaValueToPromptoValue(value);
		NativeCategoryDeclaration decl = context.getNativeMapping(klass);
		if(decl!=null)
			return new NativeInstance(decl, value);
        else if(returnType==AnyType.instance())
        	return new NativeInstance(AnyNativeCategoryDeclaration.getInstance(), value);
        else
            throw new InternalError("Unable to convert:" + value.getClass().getSimpleName());
    }



}