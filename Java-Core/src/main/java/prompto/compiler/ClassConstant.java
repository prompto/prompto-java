package prompto.compiler;


public class ClassConstant implements CodeConstant {

	Utf8Constant className;
	int index = -1;
	
	public ClassConstant(Class<?> klass) {
		this(CompilerUtils.getClassName(klass));
	}

	public ClassConstant(String className) {
		this.className = new Utf8Constant(className);
	}

	public Utf8Constant getClassName() {
		return className;
	}
	
	@Override
	public String toString() {
		return this.className.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof ClassConstant
				&& className.equals(((ClassConstant)obj).className);
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
		writer.writeU2(className.getIndexInConstantPool());
	}


}
