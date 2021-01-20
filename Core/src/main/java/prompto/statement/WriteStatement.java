package prompto.statement;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Consumer;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NamedType;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.Tags;
import prompto.error.InvalidResourceError;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.IExpression;
import prompto.grammar.ThenWith;
import prompto.runtime.Context;
import prompto.runtime.Context.ResourceContext;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.ResourceType;
import prompto.type.TextType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IResource;
import prompto.value.IValue;
import prompto.value.TextValue;

public class WriteStatement extends SimpleStatement {

	IExpression content;
	IExpression resource;
	ThenWith thenWith;
	
	public WriteStatement(IExpression content, IExpression resource, ThenWith thenWith) {
		this.content = content;
		this.resource = resource;
		this.thenWith = thenWith;
	}
	

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("write ");
		switch(writer.getDialect()) {
		case E:
		case M:
			content.toDialect(writer);
			break;
		case O:
			writer.append("(");
			content.toDialect(writer);
			writer.append(")");
			break;
		}
		writer.append(" to ");
		resource.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		if(context instanceof ResourceContext) {
			if(thenWith != null)
				context.getProblemListener().reportIllegalRemoteCall(this, "'then with' is only allowed when writing all at once");
		} else
			context = context.newResourceContext();
		IType resourceType = resource.check(context);
		if(!(resourceType instanceof ResourceType))
			context.getProblemListener().reportExpectingResource(this, resourceType);
		if(thenWith!=null)
			return thenWith.check(context, TextType.instance());
		else
			return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Context resContext = context instanceof ResourceContext ? context : context.newResourceContext();
		Object o = resource.interpret(resContext);
		if(o==null)
			throw new NullReferenceError();
		if(!(o instanceof IResource))
			throw new InternalError("Illegal write source: " + o);
		IResource res = (IResource)o;
		if(!res.isWritable())
			throw new InvalidResourceError("Not writable");
		try {
			String text = content.interpret(resContext).toString();
			if(context==resContext)
				res.writeLine(text);
			else if(thenWith != null)
				res.writeFully(text, result -> thenWith.interpret(context, new TextValue(result)));
			else
				res.writeFully(text);
			return null;
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		} finally {
			if(resContext!=context)
				res.close();
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		Context resContext = context instanceof ResourceContext ? context : context.newResourceContext();
		/*ResultInfo info = */resource.compile(resContext, method, flags);
		if(resContext!=context)
			method.addInstruction(Opcode.DUP);
		content.compile(resContext, method, flags);
		if(thenWith!=null) {
			Type consumerType = compileConsumerClass(context, method, flags);
			CompilerUtils.compileNewInstance(method, consumerType);
			InterfaceConstant c = new InterfaceConstant(IResource.class, "writeFully", String.class, Consumer.class, void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, c);
		} else {
			InterfaceConstant c = new InterfaceConstant(IResource.class, "writeFully", String.class, void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, c);
		}
		if(resContext!=context) {
			InterfaceConstant c = new InterfaceConstant(IResource.class, "close", void.class);
			method.addInstruction(Opcode.INVOKEINTERFACE, c);
		}
		return new ResultInfo(void.class);
	}
	
	private Type compileConsumerClass(Context context, MethodInfo method, Flags flags) {
		ClassFile parentClass = method.getClassFile();
		int innerClassIndex = 1 + parentClass.getInnerClasses().size();
		String innerClassName = parentClass.getThisClass().getType().getTypeName() + '$' + innerClassIndex;
		Type innerClassType = new NamedType(innerClassName); 
		ClassFile classFile = new ClassFile(innerClassType);
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.addInterface(new ClassConstant(Consumer.class));
		CompilerUtils.compileEmptyConstructor(classFile);
		compileConsumerBridge(context, classFile);
		compileConsumerMethods(context, classFile);
		parentClass.addInnerClass(classFile);
		return innerClassType;
	}


	private void compileConsumerMethods(Context context, ClassFile classFile) {
		compileConsumerAcceptMethod(context, classFile);
	}


	private void compileConsumerAcceptMethod(Context context, ClassFile classFile) {
		Descriptor.Method proto = new Descriptor.Method(String.class, void.class);
		MethodInfo method = classFile.newMethod("accept", proto);
		// use a dummy '$this', since we never use it, and we need 'this' for compiling expressions
		method.registerLocal("$this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.registerLocal(thenWith.getName().toString(), VerifierType.ITEM_Object, new ClassConstant(String.class));
		context = context.newLocalContext();
		context.registerValue(new Variable(thenWith.getName(), TextType.instance()));
		thenWith.getStatements().compile(context, method, new Flags());
		method.addInstruction(Opcode.RETURN);
	}


	private void compileConsumerBridge(Context context, ClassFile classFile) {
		// create a bridge "accept" method to convert Object -> Consumer
		Descriptor.Method proto = new Descriptor.Method(Object.class, void.class);
		MethodInfo method = classFile.newMethod("accept", proto);
		method.addModifier(Tags.ACC_BRIDGE | Tags.ACC_SYNTHETIC);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.registerLocal("o", VerifierType.ITEM_Object, new ClassConstant(Object.class));
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(String.class));
		proto = new Descriptor.Method(String.class, void.class);
		MethodConstant c = new MethodConstant(classFile.getThisClass(), "accept", proto);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		method.addInstruction(Opcode.RETURN);
	}


	@Override
	public void declare(Transpiler transpiler) {
	    if(!(transpiler.getContext() instanceof ResourceContext))
	        transpiler = transpiler.newResourceTranspiler();
	    this.resource.declare(transpiler);
	    this.content.declare(transpiler);
	    if(thenWith!=null)
	    	thenWith.declare(transpiler, TextType.instance());
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    if (transpiler.getContext() instanceof ResourceContext)
	        this.transpileLine(transpiler);
	    else
	        this.transpileFully(transpiler);
	    return false;
	}


	private void transpileFully(Transpiler transpiler) {
	    transpiler = transpiler.newResourceTranspiler();
	    transpiler.append("var $res = ");
	    this.resource.transpile(transpiler);
	    transpiler.append(";").newLine();
	    transpiler.append("try {").indent();
	    transpiler.append("$res.writeFully(");
	    this.content.transpile(transpiler);
	    if(thenWith!=null) {
	    	transpiler.append(", ");
	    	thenWith.transpile(transpiler, TextType.instance());
	    }
	    transpiler.append(");");
	    transpiler.dedent().append("} finally {").indent();
	    transpiler.append("$res.close();").newLine();
	    transpiler.dedent().append("}");
	    transpiler.flush();
	}


	private void transpileLine(Transpiler transpiler) {
	    this.resource.transpile(transpiler);
	    transpiler.append(".writeLine(");
	    this.content.transpile(transpiler);
	    transpiler.append(")");
	}
}
