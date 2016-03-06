package prompto.compiler;

public class NameAndTypeConstant implements ConstantOperand {

	Utf8Constant name;
	Utf8Constant type;
	int index;
	
	public NameAndTypeConstant(String name, String type) {
		this.name = new Utf8Constant(name);
		this.type = new Utf8Constant(type);
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
	public int index() {
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
		writer.writeU2(name.index());
		writer.writeU2(type.index());
	}
}
