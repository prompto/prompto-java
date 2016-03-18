package prompto.compiler;

public interface IVerifierEntry {
	
	Type getType();
	int length();
	default void register(ConstantsPool pool) {} // nothing to do
	void writeTo(ByteWriter writer);

	public static enum Type {
		ITEM_Top(NativeFactory.instance),
		ITEM_Integer(NativeFactory.instance),
		ITEM_Float(NativeFactory.instance),
		ITEM_Double(2, NativeFactory.instance),
		ITEM_Long(2, NativeFactory.instance),
		ITEM_Null(NativeFactory.instance),
		ITEM_UninitializedThis(NativeFactory.instance),
		ITEM_Object(ObjectFactory.instance),
		ITEM_Uninitialized(ObjectFactory.instance);
		
		static interface IFactory {
			StackEntry newStackEntry(Type type, ClassConstant className);
			StackLocal newStackLocal(Type type, String name, ClassConstant className);
		}
		
		static class NativeFactory implements IFactory {
			
			static NativeFactory instance = new NativeFactory();
			
			@Override
			public StackEntry newStackEntry(Type type, ClassConstant className) {
				return new StackEntry.NativeEntry(type);
			}
			
			@Override
			public StackLocal newStackLocal(Type type, String name, ClassConstant className) {
				return new StackLocal.NativeLocal(type, name);
			}
		};
	
		static class ObjectFactory implements IFactory {
			
			static ObjectFactory instance = new ObjectFactory();
			
			@Override
			public StackEntry newStackEntry(Type type, ClassConstant className) {
				return new StackEntry.ObjectEntry(type, className);
			}
			
			@Override
			public StackLocal newStackLocal(Type type, String name, ClassConstant className) {
				return new StackLocal.ObjectLocal(type, name, className);
			}
		};
	
		static class ThisFactory extends ObjectFactory {
			
			static ThisFactory instance = new ThisFactory();
			
			@Override
			public StackLocal newStackLocal(Type type, String name, ClassConstant className) {
				if(!"this".equals(name))
					throw new UnsupportedOperationException();
				return new StackLocal.ThisLocal();
			}
		};

		final short size;
		final IFactory entryFactory;
		
		private Type() {
			size = 1;
			entryFactory = null;
		}
		
		private Type(IFactory entryFactory) {
			size = 1;
			this.entryFactory = entryFactory;
		}

		private Type(int size, IFactory entryFactory) {
			this.size = (short)size;
			this.entryFactory = entryFactory;
		}
	
		public void writeTo(ByteWriter writer) {
			writer.writeU1(ordinal());
		}
		
		public short size() {
			return size;
		}
	
		public StackEntry newStackEntry(ClassConstant className) {
			if(entryFactory==null)
				throw new UnsupportedOperationException();
			return entryFactory.newStackEntry(this, className);
		}

		public StackLocal newStackLocal(String name, ClassConstant className) {
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
