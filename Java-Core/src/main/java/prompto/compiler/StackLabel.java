package prompto.compiler;

public abstract class StackLabel {

	int offset;

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public abstract int length();
	public abstract void writeTo(ByteWriter writer);

	
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
	/*
	public static class SAME_PLUS_1_STACK extends StackLabel {
		
	}

	public static class APPEND extends StackLabel {
		
		StackEntry[] entries;
		
		public APPEND(StackEntry[] entries) {
			this.entries = entries;
		}
	}
	*/


	
}
