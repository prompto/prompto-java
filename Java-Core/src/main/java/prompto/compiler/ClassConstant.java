package prompto.compiler;

import java.lang.reflect.Type;


public class ClassConstant implements CodeConstant {

	Utf8Constant className;
	int index = -1;
	
	public ClassConstant(Type klass) {
		this(CompilerUtils.makeClassName(klass));
	}

	public ClassConstant(String className) {
		this.className = new Utf8Constant(className);
	}

	public Utf8Constant getClassName() {
		return className;
	}
	
	public String getSimpleName() {
		String fullName = className.getValue();
		return fullName.substring(fullName.lastIndexOf('/')+1);
	}

	public boolean isInterface() {
		return className.getValue().indexOf('$')<0;
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
