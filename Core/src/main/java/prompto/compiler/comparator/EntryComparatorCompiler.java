package prompto.compiler.comparator;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.StringConstant;
import prompto.expression.IExpression;
import prompto.literal.TextLiteral;
import prompto.runtime.Context;
import prompto.utils.ObjectUtils;

public class EntryComparatorCompiler extends ComparatorCompilerBase {

	@Override
	protected void compileMethodBody(Context context, MethodInfo method, Type paramType, IExpression key) {
		String keyName = ((TextLiteral)key).getValue().getStorableData();
		MethodConstant getter = new MethodConstant(paramType, "get", Object.class, Object.class);
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(paramType));
		method.addInstruction(Opcode.LDC, new StringConstant(keyName));
		method.addInstruction(Opcode.INVOKEVIRTUAL, getter);
		method.addInstruction(Opcode.ALOAD_2, new ClassConstant(paramType));
		method.addInstruction(Opcode.LDC, new StringConstant(keyName));
		method.addInstruction(Opcode.INVOKEVIRTUAL, getter);
		MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
		method.addInstruction(Opcode.INVOKESTATIC, compare);
		method.addInstruction(Opcode.IRETURN);
	}

}