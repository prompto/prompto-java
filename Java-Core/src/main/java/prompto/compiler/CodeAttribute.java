package prompto.compiler;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import prompto.compiler.IInstructionListener.Phase;

public class CodeAttribute implements IAttribute {
	
	Utf8Constant attributeName = new Utf8Constant("Code");
	List<IInstruction> instructions = new LinkedList<>(); 
	List<ExceptionHandler> handlers = new LinkedList<>(); 
	List<IAttribute> attributes = new ArrayList<>();
	LocalVariableTableAttribute locals = new LocalVariableTableAttribute();
	StackMapTableAttribute stackMapTable = new StackMapTableAttribute(locals);
	{ attributes.add(stackMapTable); } // TODO add locals so they get stored
	List<IInstructionListener> listeners = new ArrayList<>();
	byte[] opcodes = null;
	
	
	public StackMapTableAttribute getStackMapTable() {
		return stackMapTable;
	}
	

	static class CaptureStackState implements IInstruction {

		StackState state = new StackState();
		
		public StackState getState() {
			return state;
		}
		
		@Override
		public void rehearse(CodeAttribute code) {
			state.capture(code.getStackMapTable().getState());
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
	
	static class ListenerActivator implements IInstruction {

		Consumer<Phase> method;
		
		public ListenerActivator(Consumer<Phase> method) {
			this.method = method;
		}

		@Override public void rehearse(CodeAttribute code) { 
			method.accept(Phase.REHEARSE);
		}
		
		@Override public void register(ConstantsPool pool) { 
			method.accept(Phase.REGISTER);
		}
		
		@Override public void writeTo(ByteWriter writer) {
			method.accept(Phase.WRITE);
		}
		
	}
	
	public <T extends IInstructionListener> T addOffsetListener(T listener) {
		listeners.add(listener);
		return listener;
	}
	
	public IInstruction activateOffsetListener(IInstructionListener listener) {
		ListenerActivator activator = new ListenerActivator(listener::activate);
		instructions.add(activator);
		return activator;
	}

	public IInstruction inhibitOffsetListener(IInstructionListener listener) {
		ListenerActivator activator = new ListenerActivator(listener::inhibit);
		instructions.add(activator);
		return activator;
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
			code.getStackMapTable().getState().capture(state);
			if(DumpLevel.current().ordinal()>0) {
				System.err.println("Restore stack: " + state.toString());
				System.err.println();
			}
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
			code.getStackMapTable().addLabel(label);
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
	
	public ExceptionHandler registerExceptionHandler(java.lang.reflect.Type type) {
		ExceptionHandler handler = new ExceptionHandler(type);
		handler.setStackState(captureStackState());
		handlers.add(handler);
		listeners.add(handler);
		return handler;
	}

	public StackLabel placeExceptionHandler(ExceptionHandler handler) {
		StackState state = handler.getStackState();
		StackLabel label = new StackLabel.FULL(state);
		instructions.add(new PlaceLabelInstruction(label));
		handler.setLabel(label);
		restoreStackState(state);
		return label;
	}

	@Override
	public void register(ConstantsPool pool) {
		instructions.forEach((i)-> {
			listeners.forEach((l)->
				l.onBeforeRehearse(i));
			i.rehearse(this);
			listeners.forEach((l)->
				l.onAfterRehearse(i));
		});

		instructions.forEach((i)-> {
			listeners.forEach((l)->
				l.onBeforeRegister(i));
			i.register(pool);
			listeners.forEach((l)->
				l.onAfterRegister(i));
		});
		attributeName.register(pool);
		handlers.forEach((h)->
			h.register(pool));
		attributes.forEach((a)->
			a.register(pool));
	}	
	
	public <T extends IInstruction> T addInstruction(T instruction) {
		instructions.add(instruction);
		return instruction;
	}

	byte[] createOpcodes() {
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		ByteWriter w = new ByteWriter(o);
		instructions.forEach((i)-> {
			listeners.forEach((l)->
				l.onBeforeWriteTo(w, i));
			i.writeTo(w);
			listeners.forEach((l)->
				l.onAfterWriteTo(w, i));
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

	private int handlersLength() {
		return handlers.size() * 8;
	}

	@Override
	public int lengthWithoutHeader() {
		if(opcodes==null)
			opcodes = createOpcodes();
		return 2 + 2 + 4 + opcodes.length + 2 + handlersLength() + 2 + attributesLength();
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
		writer.writeU2(stackMapTable.getMaxStack());
		writer.writeU2(stackMapTable.getMaxLocals());
		writer.writeU4(opcodes.length);
		writer.writeBytes(opcodes);
		writer.writeU2((short)handlers.size());
		handlers.forEach((h)->
			h.writeTo(writer));
		writer.writeU2((short)attributes.size()); 
		attributes.forEach((a)->
			a.writeTo(writer));
	}


}
