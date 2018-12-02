package prompto.compiler.comparator;

import java.lang.reflect.Type;

import prompto.compiler.ClassFile;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;

@FunctionalInterface 
public interface ComparatorCompiler {
	Type compile(Context context, ClassFile parentClass, IType itemType, IExpression key, boolean descending);
}