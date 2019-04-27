package prompto.compiler.comparator;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.compiler.Tags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;

public abstract class ComparatorCompilerBase implements ComparatorCompiler {
	
	@Override
	public Type compile(Context context, ClassFile parentClass, IType itemType, IExpression key, boolean descending) {
		int innerClassIndex = 1 + parentClass.getInnerClasses().size();
		String innerClassName = parentClass.getThisClass().getType().getTypeName() + '$' + innerClassIndex;
		Type innerClassType = new PromptoType(innerClassName); 
		ClassFile classFile = new ClassFile(innerClassType);
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.addInterface(new ClassConstant(Comparator.class));
		CompilerUtils.compileEmptyConstructor(classFile);
		compileBridge(context, classFile, itemType.getJavaType(context), descending);
		compileMethods(context, classFile, itemType, key);
		parentClass.addInnerClass(classFile);
		return innerClassType;
	}

	private void compileCompareMethod(Context context, ClassFile classFile, IType paramIType, IExpression key) {
		Type paramType = paramIType.getJavaType(context);
		Descriptor.Method proto = new Descriptor.Method(paramType, paramType, int.class);
		MethodInfo method = classFile.newMethod("compare", proto);
		// use a dummy '$this', since we never use it, and we need 'this' for compiling expressions
		method.registerLocal("$this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.registerLocal("o1", VerifierType.ITEM_Object, new ClassConstant(paramType));
		method.registerLocal("o2", VerifierType.ITEM_Object, new ClassConstant(paramType));
		compileMethodBody(context, method, paramIType, key);
	}
	
	protected abstract void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key);

	protected void compileMethods(Context context, ClassFile classFile, IType paramIType, IExpression key) {
		compileCompareMethod(context, classFile, paramIType, key);
	}

	private void compileBridge(Context context, ClassFile classFile, Type paramType, boolean descending) {
		// create a bridge "compare" method to convert Object -> paramType
		Descriptor.Method proto = new Descriptor.Method(Object.class, Object.class, int.class);
		MethodInfo method = classFile.newMethod("compare", proto);
		method.addModifier(Tags.ACC_BRIDGE | Tags.ACC_SYNTHETIC);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.registerLocal("o1", VerifierType.ITEM_Object, new ClassConstant(Object.class));
		method.registerLocal("o2", VerifierType.ITEM_Object, new ClassConstant(Object.class));
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		if(descending) {
			method.addInstruction(Opcode.ALOAD_2, new ClassConstant(Object.class));
			method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
			method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
			method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
		} else {
			method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
			method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
			method.addInstruction(Opcode.ALOAD_2, new ClassConstant(Object.class));
			method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
		}
		proto = new Descriptor.Method(paramType, paramType, int.class);
		MethodConstant c = new MethodConstant(classFile.getThisClass(), "compare", proto);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		method.addInstruction(Opcode.IRETURN);
	}
}