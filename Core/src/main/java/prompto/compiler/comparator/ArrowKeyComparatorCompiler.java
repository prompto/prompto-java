package prompto.compiler.comparator;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.ObjectUtils;

public class ArrowKeyComparatorCompiler extends ComparatorCompilerBase {
	
	
	@Override
	protected void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key) {
		ArrowExpression arrow = (ArrowExpression)key;
		if(arrow.getArgs().size()==1)
			compileMethodBody1Arg(context, method, paramIType, arrow);
		else
			throw new UnsupportedOperationException(); // compileMethodBody2Args(context, method, paramType, arrow);
	}
	
	private void compileMethodBody1Arg(Context context, MethodInfo method, IType paramIType, ArrowExpression arrow) {
		Type paramType = paramIType.getJavaType(context);
		Type thisType = method.getClassFile().getThisClass().getType();
		MethodConstant getKey = new MethodConstant(thisType, "getKey", paramType, Object.class);
		method.addInstruction(Opcode.ALOAD_0, new ClassConstant(thisType)); // load this comparator
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(paramType)); // load o1
		method.addInstruction(Opcode.INVOKEVIRTUAL, getKey);
		method.addInstruction(Opcode.ALOAD_0, new ClassConstant(thisType)); // load this comparator
		method.addInstruction(Opcode.ALOAD_2, new ClassConstant(paramType)); // load o2
		method.addInstruction(Opcode.INVOKEVIRTUAL, getKey);
		MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
		method.addInstruction(Opcode.INVOKESTATIC, compare);
		method.addInstruction(Opcode.IRETURN);
	}
	
	@Override
	protected void compileMethods(Context context, ClassFile classFile, IType itemType, IExpression key) {
		super.compileMethods(context, classFile, itemType, key);
		compileGetKeyMethod(context, classFile, itemType, (ArrowExpression)key);
	}

	private void compileGetKeyMethod(Context context, ClassFile classFile, IType paramIType, ArrowExpression arrow) {
		Type paramType = paramIType.getJavaType(context);
		Descriptor.Method proto = new Descriptor.Method(paramType, Object.class);
		MethodInfo method = classFile.newMethod("getKey", proto);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		arrow.compileKey(context, method, new Flags(), paramIType);
	}

}