package prompto.compiler;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class CodeAttribute implements Attribute {
	
	List<Instruction> instructions = new LinkedList<>(); 
	List<Attribute> attributes = new ArrayList<>();
	Utf8Constant attributeName = new Utf8Constant("Code");
	StackAttribute stack = createStack();
	byte[] opcodes = null;
	
	public StackAttribute getStack() {
		return stack;
	}
	
	private StackAttribute createStack() {
		StackAttribute stack = new StackAttribute();
		attributes.add(stack);
		return stack;
	}

	public void register(ConstantsPool pool) {
		instructions.forEach((i)->
			i.register(pool));
		attributeName.register(pool);
		attributes.forEach((a)->
			a.register(pool));
	}	
	
	public Instruction addInstruction(Instruction instruction) {
		instructions.add(instruction);
		return instruction;
	}

	byte[] createOpcodes() {
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		ByteWriter w = new ByteWriter(o);
		instructions.forEach((i)-> {
			i.writeTo(this, w);
			StackLabel label = i.getStackLabel();
			if(label!=null) {
				label.setOffset(o.size());
				stack.addLabel(label);
			}
		});
		return o.toByteArray();
	}

	@Override
	public int length() {
		if(opcodes==null)
			opcodes = createOpcodes();
		return 2 + 2 + 4 + opcodes.length + 2 + 2 + attributesLength();
	}

	private int attributesLength() {
		return (int)attributes
				.stream()
					.flatMapToInt((a)->
						IntStream.of(6 + a.length()))
							.summaryStatistics().getSum();
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
		writer.writeU2(attributeName.index());
		writer.writeU4(length());
		writer.writeU2(stack.getMaxStack());
		writer.writeU2(stack.getMaxLocals());
		writer.writeU4(opcodes.length);
		writer.writeBytes(opcodes);
		writer.writeU2(0); // TODO exceptions
		writer.writeU2((short)attributes.size()); 
		attributes.forEach((a)->
			a.writeTo(writer));
	}

}
