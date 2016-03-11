package prompto.compiler;

public interface StackEntry {
	
	public static enum Type {
		ITEM_Top,
		ITEM_Integer(NativeFactory.instance),
		ITEM_Float(NativeFactory.instance),
		ITEM_Double(2, NativeFactory.instance),
		ITEM_Long(2, NativeFactory.instance),
		ITEM_Null(NativeFactory.instance),
		ITEM_UninitializedThis(),
		ITEM_Object(ObjectFactory.instance),
		ITEM_Uninitialized(ObjectFactory.instance);
		
		static interface Factory {
			StackLocal newStackLocal(Type type, String name, String className);
		}
		
		static class NativeFactory implements Factory {
			
			static NativeFactory instance = new NativeFactory();
			
			@Override
			public StackLocal newStackLocal(Type type, String name, String className) {
				return new StackLocal.NativeLocal(type, name);
			}
		};
	
		static class ObjectFactory implements Factory {
			
			static ObjectFactory instance = new ObjectFactory();
			
			@Override
			public StackLocal newStackLocal(Type type, String name, String className) {
				return new StackLocal.ObjectLocal(type, name, className);
			}
		};
	
		static class ThisFactory implements Factory {
			
			static ThisFactory instance = new ThisFactory();
			
			@Override
			public StackLocal newStackLocal(Type type, String name, String className) {
				if(!"this".equals(name))
					throw new UnsupportedOperationException();
				return new StackLocal.ThisLocal(className);
			}
		};

		final short size;
		final Factory entryFactory;
		
		private Type() {
			size = 1;
			entryFactory = null;
		}
		
		private Type(Factory entryFactory) {
			size = 1;
			this.entryFactory = entryFactory;
		}

		private Type(int size, Factory entryFactory) {
			this.size = (short)size;
			this.entryFactory = entryFactory;
		}
	
		public byte byteValue() {
			return (byte)ordinal();
		}
		
		public short size() {
			return size;
		}
	
		public StackLocal newStackLocal(String name, String className) {
			if(entryFactory==null)
				throw new UnsupportedOperationException();
			return entryFactory.newStackLocal(this, name, className);
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
