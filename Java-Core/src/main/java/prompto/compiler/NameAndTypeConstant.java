package prompto.compiler;

public class NameAndTypeConstant implements CodeConstant {

	Utf8Constant name;
	Utf8Constant type;
	int index;
	
	public NameAndTypeConstant(String name, String type) {
		this.name = new Utf8Constant(name);
		this.type = new Utf8Constant(type);
	}

	@Override
	public String toString() {
		return name.toString() + '/' + type.toString();
	}
	
	public Utf8Constant getName() {
		return name;
	}
	
	public Utf8Constant getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof NameAndTypeConstant
				&& name.equals(((NameAndTypeConstant)obj).name)
				&& type.equals(((NameAndTypeConstant)obj).type);
	}
	
	@Override
	public int getIndexInConstantPool() {
		if(index==-1)
			throw new UnsupportedOperationException();
		return index;
	}
	
	@Override
	public void register(ConstantsPool pool) {
		index = pool.registerConstant(this);
		name.register(pool);
		type.register(pool);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_NameAndType_info {
		    u1 tag;
		    u2 name_index;
		    u2 descriptor_index;
		}	
		*/	
		writer.writeU1(Tags.CONSTANT_NameAndType);
		writer.writeU2(name.getIndexInConstantPool());
		writer.writeU2(type.getIndexInConstantPool());
	}
}
