package prompto.compiler;

import java.lang.reflect.Type;

public class FieldConstant implements CodeConstant {

	ClassConstant className;
	NameAndTypeConstant fieldNameAndType;
	int index;
	
	public FieldConstant(Type className, String fieldName, Type fieldType) {
		this.className = new ClassConstant(className);
		this.fieldNameAndType = new NameAndTypeConstant(fieldName, new Descriptor.Field(fieldType));
	}
	
	public FieldConstant(ClassConstant className, String fieldName, Type fieldType) {
		this.className = className;
		this.fieldNameAndType = new NameAndTypeConstant(fieldName, new Descriptor.Field(fieldType));
	}

	public FieldConstant(ClassConstant className, NameAndTypeConstant fieldNameAndType) {
		this.className = className;
		this.fieldNameAndType = fieldNameAndType;
	}

	@Override
	public String toString() {
		return className.toString() + ':' + fieldNameAndType.toString();
	}
	
	public StackEntry toStackEntry() {
		Descriptor descriptor = fieldNameAndType.getDescriptor();
		IVerifierEntry.Type type = IVerifierEntry.Type.fromDescriptor(descriptor);
		StackEntry entry = type.newStackEntry(null);
		if(entry instanceof StackEntry.ObjectEntry)
			((StackEntry.ObjectEntry)entry).setClassName(new ClassConstant(fieldNameAndType.getDescriptor().getLastType()));
		return entry;
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
		fieldNameAndType.register(pool);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		CONSTANT_Fieldref_info {
		    u1 tag;
		    u2 class_index;
		    u2 name_and_type_index;
		}
		*/
		writer.writeU1(Tags.CONSTANT_Fieldref);
		writer.writeU2(className.getIndexInConstantPool());
		writer.writeU2(fieldNameAndType.getIndexInConstantPool());
	}

}
