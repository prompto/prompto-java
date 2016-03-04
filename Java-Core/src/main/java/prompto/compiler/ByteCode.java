package prompto.compiler;

import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ByteCode extends Attribute {
	
	List<Instruction> instructions = new LinkedList<>(); 
	StringConstant attributeName = new StringConstant("Code");
	int maxOperands = 0;
	int maxLocals = 0;
	int currentOperands = 0;
	int currentLocals = 0;
	
	public ByteCode(int numParameters, boolean isStatic) {
		maxLocals = numParameters + (isStatic ? 0 : 1); // 1 for 'this'
	}

	public void addInstruction(Instruction instruction) {
		instructions.add(instruction);
	}

	public void register(ConstantsPool pool) {
		instructions.forEach((i)->i.register(pool));
		attributeName.register(pool);
	}	
	
	void pushLocal() {
		if(++currentLocals>maxLocals)
			maxLocals = currentLocals;
	}
	
	void popLocal() {
		--currentLocals;
	}
	
	void pushOperands(int count) {
		if((currentOperands += count)>maxOperands)
			maxOperands = currentOperands;
	}
	
	void popOperands(int count) {
		currentOperands -= count;
	}
	
	byte[] createOpcodes() {
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		ByteWriter w = new ByteWriter(o);
		instructions.forEach((i)->i.writeTo(this, w));
		return o.toByteArray();
	}


	public void writeTo(ByteWriter writer) {
		/*
		Code_attribute {
		    u2 attribute_name_index;
		    u4 attribute_length;
		    u2 max_stack;
		    u2 max_locals;
		    u4 code_length;
		    u1 code[code_length];
		    u2 exception_table_length;
		    {   u2 start_pc;
		        u2 end_pc;
		        u2 handler_pc;
		        u2 catch_type;
		    } exception_table[exception_table_length];
		    u2 attributes_count;
		    attribute_info attributes[attributes_count];
		}	
		*/	
		byte[] opcodes = createOpcodes();
		int len = 2 + 2 + 4 + opcodes.length + 2 + 2;
		writer.writeU2(attributeName.index());
		writer.writeU4(len);
		writer.writeU2(maxOperands);
		writer.writeU2(maxLocals);
		writer.writeU4(opcodes.length);
		writer.writeBytes(opcodes);
		writer.writeU2(0); // TODO exceptions
		writer.writeU2(0); // TODO attributes
	}




}
