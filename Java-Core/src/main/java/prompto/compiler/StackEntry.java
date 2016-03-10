package prompto.compiler;

public class StackEntry {
	
	public static enum Type {
		ITEM_Top,
		ITEM_Integer,
		ITEM_Float,
		ITEM_Double(2),
		ITEM_Long(2),
		ITEM_Null,
		ITEM_UninitializedThis,
		ITEM_Object,
		ITEM_Uninitialized;
		
		final short size;
		
		private Type() {
			size = 1;
		}
		
		private Type(int size) {
			this.size = (short)size;
		}
	
		public byte byteValue() {
			return (byte)ordinal();
		}
		
		public short size() {
			return size;
		}
	
		public static Type fromDescriptor(String desc) {
			switch(desc.charAt(0)) {
			case 'Z': // boolean
			case 'B': // byte
			case 'S': // short
			case 'I': // int
			case 'C': // char
				return ITEM_Integer;
			case 'F': // float
				return ITEM_Float;
			case 'D': // double
				return ITEM_Double;
			case 'J':
				return ITEM_Long;
			case '[': // array
			case 'L':
				return ITEM_Object;
			case 'V':
				return null;
			default:
				throw new UnsupportedOperationException(desc);
			}
		}
	}
}
