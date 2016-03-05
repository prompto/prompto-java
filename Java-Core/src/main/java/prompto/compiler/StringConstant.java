package prompto.compiler;

public class StringConstant implements Constant {
	
	Utf8Constant value;
	int index;
	
	public StringConstant(String value) {
		this.value = new Utf8Constant(value);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof StringConstant 
				&& value.equals(((StringConstant)obj).value);
	}
	
	@Override
	public int index() {
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
		writer.writeU2(value.index());
	}

}
