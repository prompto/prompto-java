package prompto.compiler;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import prompto.compiler.IVerifierEntry.VerifierType;

public class MethodInfo {
	
	int accessFlags = Modifier.PUBLIC;
	Utf8Constant name;
	Utf8Constant signature;
	List<IAttribute> attributes = new LinkedList<>();
	CodeAttribute codeAttribute = null;
	Descriptor descriptor;
	ClassFile classFile;
	
	MethodInfo(ClassFile classFile, String name, Descriptor descriptor) {
		this.classFile = classFile;
		this.descriptor = descriptor;
		this.name = new Utf8Constant(name);
		this.signature = new Utf8Constant(descriptor.toString());
	}
	
	public ClassFile getClassFile() {
		return classFile;
	}

	public Utf8Constant getName() {
		return name;
	}
	
	public Utf8Constant getSignature() {
		return signature;
	}
	
	public CodeAttribute getCodeAttribute() {
		return codeAttribute;
	}

	@Override
	public String toString() {
		return name.toString() + '/' + signature.toString();
	}
	
	public void addModifier(int modifier) {
		accessFlags |= modifier;
	}
	
	public boolean isStatic() {
		return (accessFlags & Modifier.STATIC) != 0;
	}


	public IInstruction addInstruction(Opcode op, IOperand ... operands) {
		return addInstruction(new Instruction(op, operands));
	}
	
	public <T extends IInstruction> T addInstruction(T instruction) {
		createCodeAttribute();
		return codeAttribute.addInstruction(instruction);
	}

	public <T extends IInstructionListener> T addOffsetListener(T listener) {
		createCodeAttribute();
		return codeAttribute.addOffsetListener(listener);
	}
	
	public IInstruction activateOffsetListener(IInstructionListener listener) {
		return codeAttribute.activateOffsetListener(listener);
	}

	public IInstruction inhibitOffsetListener(IInstructionListener listener) {
		return codeAttribute.inhibitOffsetListener(listener);
	}

	public StackLocal registerLocal(String name, VerifierType type, ClassConstant className) {
		createCodeAttribute();
		return codeAttribute.registerLocal(type.newStackLocal(name, className));
	}
	
	public StackLocal getRegisteredLocal(String name) {
		createCodeAttribute();
		return codeAttribute.getRegisteredLocal(name);
	}
	
	public void unregisterLocal(StackLocal local) {
		codeAttribute.unregisterLocal(local);
	}

	public ExceptionHandler registerExceptionHandler(java.lang.reflect.Type type) {
		createCodeAttribute();
		return codeAttribute.registerExceptionHandler(type);
	}

	public void placeExceptionHandler(ExceptionHandler handler) {
		codeAttribute.placeExceptionHandler(handler);
	}

	void register(ConstantsPool pool) {
		if(DumpLevel.current().ordinal()>0)
			System.err.println("Registering method: " + this.toString());
		name.register(pool);
		signature.register(pool);
		attributes.forEach((a)->
			a.register(pool));
	}

	public CodeAttribute createCodeAttribute() {
		if(codeAttribute==null) {
			codeAttribute = new CodeAttribute();
			attributes.add(codeAttribute);
		}
		return codeAttribute;
	}

	public StackState captureStackState() {
		createCodeAttribute();
		return codeAttribute.captureStackState();
	}

	public void restoreFullStackState(StackState state) {
		codeAttribute.restoreFullStackState(state);
	}
	
	public void restoreStackLocals(StackState state) {
		codeAttribute.restoreStackLocals(state);
	}

	public StackLabel placeLabel(StackState state) {
		createCodeAttribute();
		return codeAttribute.placeLabel(state);
	}


	void writeTo(ByteWriter writer) {
		/*
		method_info {
		    u2             access_flags;
		    u2             name_index;
		    u2             descriptor_index;
		    u2             attributes_count;
		    attribute_info attributes[attributes_count];
		}
		*/
		writer.writeU2(accessFlags);
		writer.writeU2(name.getIndexInConstantPool());
		writer.writeU2(signature.getIndexInConstantPool());
		writer.writeU2(attributes.size());
		attributes.forEach((a)->
			a.writeTo(writer));
	}


}
