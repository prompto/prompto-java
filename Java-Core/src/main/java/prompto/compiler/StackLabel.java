package prompto.compiler;

public abstract class StackLabel {

	int offset;

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public abstract int length();
	public abstract void writeTo(ByteWriter writer);

	public void register(ConstantsPool pool) {
		// by default nothing to do
	}
	
	
	public static class SAME extends StackLabel {
		
		@Override
		public int length() {
			return offset<64 ? 1 : 3;
		}
		
		@Override
		public void writeTo(ByteWriter writer) {
			if(offset<64)
				writeSAME(writer);
			else
				writeSAME_Extended(writer);
		}

		private void writeSAME_Extended(ByteWriter writer) {
			/*
			same_frame_extended {
			    u1 frame_type = SAME_FRAME_EXTENDED; // 251 
			    u2 offset_delta;
			}
			*/		
			writer.writeU1(251);
			writer.writeU2(offset);
		}

		private void writeSAME(ByteWriter writer) {
			/*
			same_frame {
		    u1 frame_type = SAME; // 0-63 
			*/
			writer.writeU1(offset);
		}
	}
	
	public static class FULL extends StackLabel {

		StackState state;
		
		public FULL(Instruction instruction) {
			state = instruction.recordState();
		}
		
		@Override
		public void register(ConstantsPool pool) {
			state.register(pool);
		}
		
		@Override
		public int length() {
			/*
			 full_frame {
			    u1 frame_type = FULL_FRAME; // 255 
			    u2 offset_delta;
			    u2 number_of_locals;
			    verification_type_info locals[number_of_locals];
			    u2 number_of_stack_items;
			    verification_type_info stack[number_of_stack_items];
			}
			*/
			return 1 + 2 + 2 + state.localsLength() + 2 + state.stackLength();
		}
		
		@Override
		public void writeTo(ByteWriter writer) {
			/*
			 full_frame {
			    u1 frame_type = FULL_FRAME; // 255 
			    u2 offset_delta;
			    u2 number_of_locals;
			    verification_type_info locals[number_of_locals];
			    u2 number_of_stack_items;
			    verification_type_info stack[number_of_stack_items];
			}
			*/
			writer.writeU1(255);
			writer.writeU2(offset);
			writer.writeU2(state.getLocals().size());
			state.getLocals().forEach((l)->
				l.writeTo(writer));
			writer.writeU2(state.getEntries().size());
			state.getEntries().forEach((e)->
				e.writeTo(writer));
		}

	}


}
