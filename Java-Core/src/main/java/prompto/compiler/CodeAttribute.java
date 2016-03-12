package prompto.compiler;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class CodeAttribute implements IAttribute {
	
	static boolean DUMP = isDUMP();
	
	private static boolean isDUMP() {
		return false;
	}
	
	Utf8Constant attributeName = new Utf8Constant("Code");
	List<IInstruction> instructions = new LinkedList<>(); 
	List<IAttribute> attributes = new ArrayList<>();
	LocalVariableTableAttribute locals = new LocalVariableTableAttribute();
	StackMapTableAttribute stack = new StackMapTableAttribute(locals);
	{ attributes.add(stack); } // TODO add locals so they get stored
	byte[] opcodes = null;
	
	
	public StackMapTableAttribute getStack() {
		return stack;
	}
	

	static class CaptureStackState implements IInstruction {

		StackState state = new StackState();
		
		public StackState getState() {
			return state;
		}
		
		@Override
		public void rehearse(CodeAttribute code) {
			state.capture(code.getStack().getState());
		}
		
		@Override
		public void register(ConstantsPool pool) {
			state.register(pool);
		}
		
		@Override
		public void writeTo(ByteWriter writer) {
		}
		
	}
	
	public StackState captureStackState() {
		CaptureStackState capture = new CaptureStackState();
		instructions.add(capture);
		return capture.getState();
	}
	
	static class RestoreStackState implements IInstruction {

		StackState state;
		
		public RestoreStackState(StackState state) {
			this.state = state;
		}
		
		public StackState getState() {
			return state;
		}
		
		@Override
		public void rehearse(CodeAttribute code) {
			code.getStack().getState().capture(state);
			if(DUMP)
				System.err.println("restore: " + state.toString());
		}
		
		@Override
		public void register(ConstantsPool pool) {
		}
		
		@Override
		public void writeTo(ByteWriter writer) {
		}
		
	}
	
	public void restoreStackState(StackState state) {
		RestoreStackState restore = new RestoreStackState(state);
		instructions.add(restore);
	}
	
	static class PlaceLabelInstruction implements IInstruction {
		
		StackLabel label;
		
		public PlaceLabelInstruction(StackLabel label) {
			this.label = label;
		}
		
		@Override
		public void rehearse(CodeAttribute code) {
			code.getStack().addLabel(label);
		}
		
		@Override
		public void register(ConstantsPool pool) {
			label.register(pool);
		}
		
		@Override
		public void writeTo(ByteWriter writer) {
			label.setRealOffset(writer.length());
		}
	}
	
	public StackLabel placeLabel(StackState state) {
		StackLabel label = new StackLabel.FULL(state);
		instructions.add(new PlaceLabelInstruction(label));
		return label;
	}
	
	@Override
	public void register(ConstantsPool pool) {
		instructions.forEach((i)->
			i.rehearse(this));
		instructions.forEach((i)->
			i.register(pool));
		attributeName.register(pool);
		attributes.forEach((a)->
			a.register(pool));
	}	
	
	public IInstruction addInstruction(IInstruction instruction) {
		instructions.add(instruction);
		return instruction;
	}

	byte[] createOpcodes() {
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		ByteWriter w = new ByteWriter(o);
		instructions.forEach((i)-> {
			i.writeTo(w);
		});
		return o.toByteArray();
	}

	private int attributesLength() {
		return (int)attributes
				.stream()
					.flatMapToInt((a)->
						IntStream.of(a.lengthWithHeader()))
							.summaryStatistics().getSum();
	}

	@Override
	public int lengthWithoutHeader() {
		if(opcodes==null)
			opcodes = createOpcodes();
		return 2 + 2 + 4 + opcodes.length + 2 + 2 + attributesLength();
	}

	@Override
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
		writer.writeU2(attributeName.getIndexInConstantPool());
		writer.writeU4(lengthWithoutHeader());
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
