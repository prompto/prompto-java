package prompto.compiler;

public class InterfaceConstant extends MethodConstant {

	public InterfaceConstant(Class<?> klass, String methodName, Class<?> ... params) {
		super(klass, methodName, params);
	}
	
	public InterfaceConstant(String className, String methodName, String proto) {
		super(className, methodName, proto);
	}

	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_InterfaceMethodref_info {
		    u1 tag;
		    u2 class_index;
		    u2 name_and_type_index;
		}	
		*/
		writer.writeU1(Tags.CONSTANT_InterfaceMethodref);
		writer.writeU2(className.getIndexInConstantPool());
		writer.writeU2(methodNameAndType.getIndexInConstantPool());
	}



}
