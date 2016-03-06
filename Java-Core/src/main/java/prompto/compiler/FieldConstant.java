package prompto.compiler;

public class FieldConstant implements ConstantOperand {

	ClassConstant className;
	NameAndTypeConstant fieldNameAndType;
	int index;
	
	public FieldConstant(String className, String fieldName, String fieldType) {
		this.className = new ClassConstant(className);
		this.fieldNameAndType = new NameAndTypeConstant(fieldName, fieldType);
	}
	
	@Override
	public int index() {
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
		writer.writeU2(className.index());
		writer.writeU2(fieldNameAndType.index());
	}
}
