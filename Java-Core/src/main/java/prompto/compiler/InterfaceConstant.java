package prompto.compiler;

import java.lang.reflect.Type;

public class InterfaceConstant extends MethodConstant {

	public InterfaceConstant(Type klass, String methodName, Type ... params) {
		super(klass, methodName, params);
	}
	
	public InterfaceConstant(String className, String methodName, String proto) {
		super(className, methodName, proto);
	}


	public InterfaceConstant(Type klass, String methodName, String proto) {
		super(klass, methodName, proto);
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
