package prompto.compiler;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CodeAttribute implements Attribute {
	
	List<Instruction> instructions = new LinkedList<>(); 
	List<Attribute> attributes = new ArrayList<>();
	Utf8Constant attributeName = new Utf8Constant("Code");
	Map<String, Integer> locals = new HashMap<>();
	StackAttribute stack = new StackAttribute();
	int maxLocals = 0;
	
	public StackAttribute getStack() {
		return stack;
	}
	
	public void register(ConstantsPool pool) {
		instructions.forEach((i)->
			i.register(pool));
		attributeName.register(pool);
		attributes.forEach((a)->
			a.register(pool));
	}	
	
	public void addInstruction(Instruction instruction) {
		instructions.add(instruction);
	}

	public void registerLocal(String name) {
		if(!locals.containsKey(name)) {
			Integer idx = locals.size();
			locals.put(name, idx);
			if(locals.size()>maxLocals)
				maxLocals = locals.size();
		}
	}
	
	public void unregisterLocal(String name) {
		locals.remove(name);
	}
	
	public Integer getRegisteredLocal(String name) {
		return locals.get(name);
	}


	byte[] createOpcodes() {
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		ByteWriter w = new ByteWriter(o);
		instructions.forEach((i)->
			i.writeTo(this, w));
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
		writer.writeU2(stack.getMaxStack());
		writer.writeU2(maxLocals);
		writer.writeU4(opcodes.length);
		writer.writeBytes(opcodes);
		writer.writeU2(0); // TODO exceptions
		writer.writeU2(0); // TODO attributes
	}

}
