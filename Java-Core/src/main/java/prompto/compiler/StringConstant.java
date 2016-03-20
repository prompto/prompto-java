package prompto.compiler;


public class StringConstant implements ValueConstant {
	
	Utf8Constant value;
	int index;
	
	public StringConstant(String value) {
		this.value = new Utf8Constant(value);
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public StackEntry toStackEntry() {
		return IVerifierEntry.Type.ITEM_Object.newStackEntry(new ClassConstant(String.class));
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof StringConstant 
				&& value.equals(((StringConstant)obj).value);
	}
	
	@Override
	public int getIndexInConstantPool() {
		return index;
	}
	
	@Override
	public void register(ConstantsPool pool) {
		index = pool.registerConstant(this);
		value.register(pool);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_String_info {
		    u1 tag;
		    u2 string_index;
		}
		*/
		writer.writeU1(Tags.CONSTANT_String);
		writer.writeU2(value.getIndexInConstantPool());
	}

}
