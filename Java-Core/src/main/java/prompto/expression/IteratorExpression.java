package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.compiler.ResultInfo;
import prompto.compiler.Tags;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLength;
import prompto.intrinsic.IteratorWithLength;
import prompto.intrinsic.PromptoIterable;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.statement.ReturnStatement;
import prompto.type.IType;
import prompto.type.IteratorType;
import prompto.utils.CodeWriter;
import prompto.value.IIterable;
import prompto.value.IValue;
import prompto.value.IteratorValue;

public class IteratorExpression implements IExpression {

	Identifier name;
	IExpression source;
	IExpression expression;
	
	public IteratorExpression(Identifier name, IExpression source, IExpression exp) {
		this.name = name;
		this.source = source;
		this.expression = exp;
	}

	@Override
	public IteratorType check(Context context) throws SyntaxError {
		IType paramType = source.check(context).checkIterator(context);
		Context child = context.newChildContext();
		child.registerValue(new Variable(name, paramType));
		IType resultType = expression.check(child);
		return new IteratorType(resultType);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IteratorType iterType = check(context);
		IType itemType = iterType.getItemType();
		IValue items = source.interpret(context);
		IteratorWithLength<IValue> iterator = getIterator(context, items);
		return new IteratorValue(context, name, itemType, iterator, expression);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		Type innerClassType = compileInnerClass(context, method.getClassFile());
		// instantiate inner class
		ClassConstant innerClass = new ClassConstant(innerClassType);
		method.addInstruction(Opcode.NEW, innerClass);
		method.addInstruction(Opcode.DUP);
		// get iterable
		ResultInfo srcinfo = source.compile(context, method, flags);
		// get the length
		method.addInstruction(Opcode.DUP);
		if(srcinfo.isInterface()) {
			InterfaceConstant c = new InterfaceConstant(srcinfo.getType(), "getNativeLength", long.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, c);
		} else {
			MethodConstant c = new MethodConstant(srcinfo.getType(), "getNativeLength", long.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		}
		// call the constructor
		Descriptor.Method proto = new Descriptor.Method(Iterable.class, long.class, void.class);
		MethodConstant m = new MethodConstant(innerClass, "<init>", proto);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// done
		return new ResultInfo(IterableWithLength.class);
	}

	private Type compileInnerClass(Context context, ClassFile parentClass) throws SyntaxError {
		int innerClassIndex = 1 + parentClass.getInnerClasses().size();
		String innerClassName = parentClass.getThisClass().getType().getTypeName() + '$' + innerClassIndex;
		Type innerClassType = new PromptoType(innerClassName); 
		ClassFile classFile = new ClassFile(innerClassType);
		classFile.setSuperClass(new ClassConstant(PromptoIterable.class));
		compileInnerClassConstructor(classFile);
		compileInnerClassExpression(context, classFile);
		parentClass.addInnerClass(classFile);;
		return innerClassType;
	}

	private MethodInfo compileInnerClassConstructor(ClassFile classFile) {
		Descriptor.Method proto = new Descriptor.Method(Iterable.class, long.class, void.class);
		MethodInfo method = classFile.newMethod("<init>", proto);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_UninitializedThis, classFile.getThisClass());
		method.registerLocal("iterable", IVerifierEntry.Type.ITEM_Object, new ClassConstant(Iterable.class));
		method.registerLocal("length", IVerifierEntry.Type.ITEM_Long, null);
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Iterable.class));
		method.addInstruction(Opcode.LLOAD_2, new ClassConstant(long.class));
		MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", proto);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		method.addInstruction(Opcode.RETURN);
		return method;
	}

	private void compileInnerClassExpression(Context context, ClassFile classFile) throws SyntaxError {
		IType paramIType = source.check(context).checkIterator(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, paramIType));
		Type paramType = paramIType.getJavaType();
		Type resultType = expression.check(context).getJavaType();
		compileInnerClassBridgeMethod(classFile, paramType, resultType);
		compileInnerClassApplyMethod(context, classFile, paramType, resultType);
	}

	private void compileInnerClassApplyMethod(Context context, ClassFile classFile, Type paramType, Type resultType) throws SyntaxError {
		// create the "apply" method itself
		Descriptor.Method proto = new Descriptor.Method(paramType, resultType);
		MethodInfo method = classFile.newMethod("apply", proto);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_Object, classFile.getThisClass());
		method.registerLocal(name.toString(), IVerifierEntry.Type.ITEM_Object, new ClassConstant(paramType));
		ReturnStatement stmt = new ReturnStatement(expression);
		stmt.compile(context, method, new Flags());
	}

	private void compileInnerClassBridgeMethod(ClassFile classFile, Type paramType, Type resultType) {
		// create a bridge "apply" method to convert Object -> paramType
		Descriptor.Method proto = new Descriptor.Method(Object.class, Object.class);
		MethodInfo method = classFile.newMethod("apply", proto);
		method.addModifier(Tags.ACC_BRIDGE | Tags.ACC_SYNTHETIC);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_Object, classFile.getThisClass());
		method.registerLocal(name.toString(), IVerifierEntry.Type.ITEM_Object, new ClassConstant(Object.class));
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
		proto = new Descriptor.Method(paramType, resultType);
		MethodConstant c = new MethodConstant(classFile.getThisClass(), "apply", proto);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		method.addInstruction(Opcode.ARETURN, new ClassConstant(resultType));
	}

	@SuppressWarnings("unchecked")
	private IteratorWithLength<IValue> getIterator(Context context, Object src) {
		if (src instanceof IIterable) 
			return ((IIterable<IValue>) src).getIterable(context).iterator();
		else if(src instanceof IterableWithLength)
			return ((IterableWithLength<IValue>)src).iterator();
		else
			throw new InternalError("Should never get there!");
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}

	private void toSDialect(CodeWriter writer) {
		expression.toDialect(writer);
		writer.append(" for ");
		writer.append(name.toString());
		writer.append(" in ");
		source.toDialect(writer);
	}

	private void toODialect(CodeWriter writer) {
		expression.toDialect(writer);
		writer.append(" for each ( ");
		writer.append(name.toString());
		writer.append(" in ");
		source.toDialect(writer);
		writer.append(" )");
	}

	private void toEDialect(CodeWriter writer) {
		expression.toDialect(writer);
		writer.append(" for each ");
		writer.append(name.toString());
		writer.append(" in ");
		source.toDialect(writer);
	}
	

}
