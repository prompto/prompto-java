package prompto.compiler;

import java.lang.reflect.Modifier;

public class InnerClassInfo {
	
	ClassConstant innerClass;
	ClassConstant outerClass;
	Utf8Constant simpleName;
	int accessFlags = Tags.ACC_SUPER | Modifier.PUBLIC | Modifier.STATIC;

	public InnerClassInfo(ClassConstant innerClass, ClassConstant outerClass) {
		this.innerClass = innerClass;
		this.outerClass = outerClass;
		this.simpleName = new Utf8Constant(innerClass.getSimpleName());
	}

	public void register(ConstantsPool pool) {
		innerClass.register(pool);
		outerClass.register(pool);
		simpleName.register(pool);
	}

	public void writeTo(ByteWriter writer) {
		/*
	    u2 inner_class_info_index;
        u2 outer_class_info_index;
        u2 inner_name_index;
        u2 inner_class_access_flags;
        */
		writer.writeU2(innerClass.getIndexInConstantPool());
		writer.writeU2(outerClass.getIndexInConstantPool());
		writer.writeU2(simpleName.getIndexInConstantPool());
		writer.writeU2(accessFlags);
	}
}
