package prompto.compiler;

import java.lang.reflect.Type;

public class MethodConstant implements CodeConstant {

	ClassConstant className;
	NameAndTypeConstant methodNameAndType;
	int index;
	
	public MethodConstant(Type type, String methodName, Type ... params) {
		this(CompilerUtils.makeClassName(type), methodName, CompilerUtils.createProto(params));
	}
	
	public MethodConstant(Type type, String methodName, String proto) {
		this(CompilerUtils.makeClassName(type), methodName, proto);
	}

	public MethodConstant(String className, String methodName, String proto) {
		this(new ClassConstant(className), new NameAndTypeConstant(methodName, proto));
	}

	public MethodConstant(ClassConstant superClass, String methodName, Type ... params) {
		this(superClass, methodName, CompilerUtils.createProto(params));
	}

	public MethodConstant(ClassConstant superClass, String methodName, String proto) {
		this(superClass, new NameAndTypeConstant(methodName, proto));
	}
	
	public MethodConstant(ClassConstant className, NameAndTypeConstant nameAndType) {
		this.className = className;
		this.methodNameAndType = nameAndType;
	}



	public short getArgumentsCount(boolean isStatic) {
		String[] types = CompilerUtils.parseDescriptor(methodNameAndType.getType().getValue());
		return (short)(types.length - (isStatic ? 1 : 0));
	}

	public StackEntry resultToStackEntry() {
		String[] types = CompilerUtils.parseDescriptor(methodNameAndType.getType().getValue());
		String descriptor = types[types.length-1];
		if("V".equals(descriptor))
			return null;
		IVerifierEntry.Type type = IVerifierEntry.Type.fromDescriptor(descriptor);
		StackEntry entry = type.newStackEntry(null);
		if(entry instanceof StackEntry.ObjectEntry) {
			String className = descriptor.substring(1, descriptor.length()-1); // strip 'L' and ';'
			((StackEntry.ObjectEntry)entry).setClassName(new ClassConstant(className));
		}
		return entry;
	}

	@Override
	public String toString() {
		return className.toString() + ':' + methodNameAndType.toString();
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
		methodNameAndType.register(pool);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_Methodref_info {
		    u1 tag;
		    u2 class_index;
		    u2 name_and_type_index;
		}		
		*/
		writer.writeU1(Tags.CONSTANT_Methodref);
		writer.writeU2(className.getIndexInConstantPool());
		writer.writeU2(methodNameAndType.getIndexInConstantPool());
	}



}
