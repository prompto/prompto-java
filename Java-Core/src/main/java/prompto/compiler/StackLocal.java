package prompto.compiler;

public abstract class StackLocal implements IVerifierEntry {

	Type type;
	String name;
	short index = -1;
	
	public StackLocal(Type type, String name) {
		this.type = type;
		this.name = name;
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIndex(short index) {
		this.index = index;
	}

	public short getIndex() {
		if(index==-1)
			throw new CompilerException("Local not registered: " + name); 
		return index;
	}

	static class ObjectLocal extends StackLocal {

		ClassConstant className;
		
		public ObjectLocal(Type type, String name, ClassConstant className) {
			super(type, name);
			this.className = className;
		}

		@Override
		public void register(ConstantsPool pool) {
			super.register(pool);
			className.register(pool);
		}
		
		@Override
		public int length() {
			/*
			Object_variable_info {
			    u1 tag = ITEM_Object; // 7
			    u2 cpool_index;
			}
			*/
			return 3;
		}

		@Override
		public void writeTo(ByteWriter writer) {
			/*
			Object_variable_info {
			    u1 tag = ITEM_Object; // 7
			    u2 cpool_index;
			}
			*/
			type.writeTo(writer);
			writer.writeU2(className.getIndexInConstantPool());
		}
	}
	
	static class NativeLocal extends StackLocal{

		public NativeLocal(Type type, String name) {
			super(type, name);
		}
		
		@Override
		public int length() {
			/*
			union verification_type_info {
			    Top_variable_info;
			    Integer_variable_info;
			    Float_variable_info;
			    Long_variable_info;
			    Double_variable_info;
			    Null_variable_info;
			    UninitializedThis_variable_info;
			    Object_variable_info; // EXCLUDED
			    Uninitialized_variable_info; // EXCLUDED
			}
			*/
			return 1;
		}

		@Override
		public void writeTo(ByteWriter writer) {
			type.writeTo(writer);
		}
	}

	static class ThisLocal extends NativeLocal {

		public ThisLocal() {
			super(Type.ITEM_UninitializedThis, "this");
		}
		
	}


	
}
