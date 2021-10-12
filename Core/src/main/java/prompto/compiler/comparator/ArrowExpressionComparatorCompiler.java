package prompto.compiler.comparator;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.ObjectUtils;

public class ArrowExpressionComparatorCompiler extends ComparatorCompilerBase {
	
	@Override
	protected void registerLocals(Context context, MethodInfo method, Type paramType, IExpression key) {
		ArrowExpression arrow = (ArrowExpression)key;
		switch(arrow.getArgs().size()) {
			case 1:
				super.registerLocals(context, method, paramType, key);
				break;
			case 2:
				method.registerLocal(arrow.getArgs().get(0).toString(), VerifierType.ITEM_Object, new ClassConstant(paramType));
				method.registerLocal(arrow.getArgs().get(1).toString(), VerifierType.ITEM_Object, new ClassConstant(paramType));
				break;
			default:
				throw new UnsupportedOperationException(); 
		}
	}

	@Override
	protected void compileMethods(Context context, ClassFile classFile, IType itemType, IExpression key) {
		super.compileMethods(context, classFile, itemType, key);
		ArrowExpression arrow = (ArrowExpression)key;
		if(arrow.getArgs().size()==1)
			arrow.compileGetKeyMethod(context, classFile, itemType);
	}

	
	@Override
	protected void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key) {
		ArrowExpression arrow = (ArrowExpression)key;
		switch(arrow.getArgs().size()) {
			case 1:
				compileMethodBody1Arg(context, method, paramIType, arrow);
				break;
			case 2:
				arrow.compileComparatorMethodBody(context, method, paramIType);
				break;
			default:
				throw new UnsupportedOperationException(); 
		}
	}
	
	
	private void compileMethodBody1Arg(Context context, MethodInfo method, IType paramIType, ArrowExpression arrow) {
		Type paramType = paramIType.toJavaType(context);
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
	
}