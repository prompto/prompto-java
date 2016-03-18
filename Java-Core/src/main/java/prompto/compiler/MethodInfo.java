package prompto.compiler;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import prompto.compiler.IVerifierEntry.Type;

public class MethodInfo {
	
	int accessFlags = Modifier.PUBLIC;
	Utf8Constant name;
	Utf8Constant proto;
	List<IAttribute> attributes = new LinkedList<>();
	CodeAttribute codeAttribute = null;
	
	public MethodInfo(String name, String proto) {
		this.name = new Utf8Constant(name);
		this.proto = new Utf8Constant(proto);
	}

	@Override
	public String toString() {
		return name.toString() + '/' + proto.toString();
	}
	
	public void addModifier(int modifier) {
		accessFlags |= modifier;
	}

	public IInstruction addInstruction(Opcode op, IOperand ... operands) {
		return addInstruction(new Instruction(op, operands));
	}
	
	public IInstruction addInstruction(IInstruction instruction) {
		createCodeAttribute();
		return codeAttribute.addInstruction(instruction);
	}

	public IInstructionListener addOffsetListener(IInstructionListener listener) {
		createCodeAttribute();
		return codeAttribute.addOffsetListener(listener);
	}
	
	public IInstruction activateOffsetListener(IInstructionListener listener) {
		return codeAttribute.activateOffsetListener(listener);
	}

	public IInstruction inhibitOffsetListener(IInstructionListener listener) {
		return codeAttribute.inhibitOffsetListener(listener);
	}

	public StackLocal registerLocal(String name, Type type, ClassConstant className) {
		StackLocal local = getRegisteredLocal(name);
		if(local!=null)
			return local;
		else
			return codeAttribute.getStack().registerLocal(type.newStackLocal(name, className));
	}
	
	public StackLocal getRegisteredLocal(String name) {
		createCodeAttribute();
		return codeAttribute.getStack().getRegisteredLocal(name);
	}

	void register(ConstantsPool pool) {
		name.register(pool);
		proto.register(pool);
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

	public void restoreStackState(StackState state) {
		codeAttribute.restoreStackState(state);
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
		writer.writeU2(proto.getIndexInConstantPool());
		writer.writeU2(attributes.size());
		attributes.forEach((a)->a.writeTo(writer));
	}


}
