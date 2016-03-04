package prompto.compiler;

public class ClassConstant implements Constant {

	StringConstant className;
	int index;
	
	public ClassConstant(String className) {
		this.className = new StringConstant(className);
	}

	@Override
	public int index() {
		return index;
	}
	
	@Override
	public void register(ConstantsPool pool) {
		index = pool.registerConstant(this);
		className.register(pool);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_Class_info {
		    u1 tag;
		    u2 name_index;
		}
		*/
		writer.writeU1(Tags.CONSTANT_Class);
		writer.writeU2(className.index());
	}


}
