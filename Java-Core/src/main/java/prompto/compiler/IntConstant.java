package prompto.compiler;

public class IntConstant implements ValueConstant {
	
	int value;
	int index;
	
	public IntConstant(int value) {
		this.value = value;
	}

	@Override
	public StackEntry toStackEntry() {
		return StackEntry.ITEM_Integer;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof IntConstant 
				&& value==((IntConstant)obj).value;
	}
	
	@Override
	public int index() {
		return index;
	}
	
	@Override
	public void register(ConstantsPool pool) {
		index = pool.registerConstant(this);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_Integer_info {
		    u1 tag;
		    u4 bytes;
		}		
		*/
		writer.writeU1(Tags.CONSTANT_Integer);
		writer.writeU4(value);
	}

}
