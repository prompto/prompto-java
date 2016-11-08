package prompto.expression;

import java.lang.reflect.Type;
import java.util.function.Predicate;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.compiler.ResultInfo;
import prompto.compiler.Tags;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.Filterable;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.statement.ReturnStatement;
import prompto.type.BooleanType;
import prompto.type.ContainerType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IFilterable;
import prompto.value.IValue;

public class FilteredListExpression extends Section implements IExpression {

	Identifier itemName;
	IExpression source;
	IExpression predicate;
	
	public FilteredListExpression(Identifier itemName, IExpression source, IExpression predicate) {
		this.itemName = itemName;
		this.source = source;
		this.predicate = predicate;
	}
	
	public void setSource(IExpression source) {
		this.source = source;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case S:
			source.toDialect(writer);
			writer.append(" filtered with ");
			writer.append(itemName);
			writer.append(" where ");
			predicate.toDialect(writer);
			break;
		case O:
			writer.append("filtered (");
			source.toDialect(writer);
			writer.append(") with (");
			writer.append(itemName);
			writer.append(") where (");
			predicate.toDialect(writer);
			writer.append(")");
			break;
		}
	}
	
	@Override
	public IType check(Context context) {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof ContainerType))
			throw new SyntaxError("Expecting a list, set or tuple as data source !");
		Context local = context.newLocalContext();
		IType itemType = ((ContainerType)sourceType).getItemType();
		local.registerValue(new Variable(itemName, itemType));
		IType filterType = predicate.check(local);
		if(filterType!=BooleanType.instance())
			throw new SyntaxError("Filtering expression must return a boolean !");
		return new ListType(itemType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		// prepare context for expression evaluation
		IType sourceType = source.check(context);
		if(!(sourceType instanceof ContainerType))
			throw new InternalError("Illegal source type: " + sourceType.getTypeName());
		IType itemType = ((ContainerType)sourceType).getItemType();
		Context local = context.newChildContext();
		Variable item = new Variable(itemName, itemType);
		local.registerValue(item);
		// fetch and check source
		IValue src = source.interpret(context);
		if(src==null)
			throw new NullReferenceError();
		if(!(src instanceof IFilterable))
			throw new InternalError("Illegal fetch source: " + source);
		Filterable<IValue,IValue> filterable = ((IFilterable)src).getFilterable(context);
		try {
			return filterable.filter(new Predicate<IValue>() {
	
				@Override
				public boolean test(IValue value) {
					try {
						local.setValue(itemName, value);
						IValue test = predicate.interpret(local);
						if(!(test instanceof Boolean))
							throw new InternalError("Illegal test result: " + test);
						return ((Boolean)test).getValue();
					} catch(PromptoError e) {
						throw new InternalError(e);
					}
				}
			});
		} catch (InternalError e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		// create inner class for filter
		String innerClassName = compileInnerClass(context, method.getClassFile());
		// get iterable
		ResultInfo srcinfo = source.compile(context, method, flags);
		// instantiate filter
		ClassConstant innerClass = new ClassConstant(new PromptoType(innerClassName));
		method.addInstruction(Opcode.NEW, innerClass);
		method.addInstruction(Opcode.DUP);
		// call filter constructor
		Descriptor.Method proto = new Descriptor.Method(void.class);
		MethodConstant m = new MethodConstant(innerClass, "<init>", proto);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// invoke filter on source
		Descriptor.Method desc = new Descriptor.Method(Predicate.class, srcinfo.getType());
		if(srcinfo.isInterface()) {
			InterfaceConstant i = new InterfaceConstant(new ClassConstant(srcinfo.getType()), "filter",  desc);
			method.addInstruction(Opcode.INVOKEINTERFACE, i);
		} else {
			m = new MethodConstant(new ClassConstant(srcinfo.getType()), "filter",  desc);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		}
		return new ResultInfo(srcinfo.getType());
	}


	private String compileInnerClass(Context context, ClassFile parentClass) {
		int innerClassIndex = 1 + parentClass.getInnerClasses().size();
		String innerClassName = parentClass.getThisClass().getType().getTypeName() + '$' + innerClassIndex;
		ClassFile classFile = new ClassFile(new PromptoType(innerClassName));
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.addInterface(new ClassConstant(Predicate.class));
		CompilerUtils.compileEmptyConstructor(classFile);
		compileInnerClassExpression(context, classFile);
		parentClass.addInnerClass(classFile);;
		return innerClassName;
	}

	private void compileInnerClassExpression(Context context, ClassFile classFile) {
		IType paramIType = source.check(context).checkIterator(context);
		context = context.newChildContext();
		context.registerValue(new Variable(itemName, paramIType));
		Type paramType = paramIType.getJavaType(context);
		compileInnerClassBridgeMethod(classFile, paramType);
		compileInnerClassTestMethod(context, classFile, paramType);
	}

	private void compileInnerClassTestMethod(Context context, ClassFile classFile, Type paramType) {
		// create the "apply" method itself
		Descriptor.Method proto = new Descriptor.Method(paramType, boolean.class);
		MethodInfo method = classFile.newMethod("test", proto);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.registerLocal(itemName.toString(), VerifierType.ITEM_Object, new ClassConstant(paramType));
		ReturnStatement stmt = new ReturnStatement(predicate);
		stmt.compile(context, method, new Flags().withPrimitive(true));
	}

	private void compileInnerClassBridgeMethod(ClassFile classFile, Type paramType) {
		// create a bridge "apply" method to convert Object -> paramType
		Descriptor.Method proto = new Descriptor.Method(Object.class, boolean.class);
		MethodInfo method = classFile.newMethod("test", proto);
		method.addModifier(Tags.ACC_BRIDGE | Tags.ACC_SYNTHETIC);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.registerLocal(itemName.toString(), VerifierType.ITEM_Object, new ClassConstant(Object.class));
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(paramType));
		proto = new Descriptor.Method(paramType, boolean.class);
		MethodConstant c = new MethodConstant(classFile.getThisClass(), "test", proto);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		method.addInstruction(Opcode.IRETURN);
	}



}