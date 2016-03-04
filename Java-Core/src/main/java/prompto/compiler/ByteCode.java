package prompto.compiler;

import java.io.ByteArrayOutputStream;

public class ByteCode extends Attribute {
	
	StringConstant attributeName;
	int maxStack = 0;
	int maxLocals = 0;
	int currentStack = 0;
	int currentLocals = 0;
	
	ByteArrayOutputStream opcodes = new ByteArrayOutputStream();
	ByteWriter writer = new ByteWriter(opcodes);
	
	public ByteCode(int numParameters, boolean isStatic) {
		maxLocals = numParameters + (isStatic ? 0 : 1); // 1 for 'this'
	}

	public void append(Opcode op) {
		writer.writeU1(op.opcode);
	}

	public void register(ConstantsPool pool) {
		attributeName = new StringConstant("Code");
		attributeName.register(pool);
	}	
	
	void pushLocal() {
		if(++currentLocals>maxLocals)
			maxLocals = currentLocals;
	}
	
	void popLocal() {
		--currentLocals;
	}
	
	void pushStack() {
		if(++currentStack>maxStack)
			maxStack = currentStack;
	}
	
	void popStack() {
		--currentStack;
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
		byte[] code = opcodes.toByteArray();
		int len = 2 + 2 + 4 + code.length + 2 + 2;
		writer.writeU2(attributeName.index());
		writer.writeU4(len);
		writer.writeU2(maxStack);
		writer.writeU2(maxLocals);
		writer.writeU4(code.length);
		writer.writeBytes(code);
		writer.writeU2(0); // TODO exceptions
		writer.writeU2(0); // TODO attributes
	}


}
