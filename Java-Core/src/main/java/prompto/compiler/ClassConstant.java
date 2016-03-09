package prompto.compiler;


public class ClassConstant implements ConstantOperand {

	Utf8Constant className;
	int index;
	
	public ClassConstant(Class<?> klass) {
		this(CompilerUtils.getClassName(klass));
	}

	public ClassConstant(String className) {
		this.className = new Utf8Constant(className);
	}


	@Override
	public boolean equals(Object obj) {
		return obj instanceof ClassConstant
				&& className.equals(((ClassConstant)obj).className);
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
