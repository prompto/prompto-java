package prompto.compiler;

public class MethodConstant implements Constant {

	ClassConstant className;
	NameAndTypeConstant methodNameAndType;
	int index;
	
	public MethodConstant(String className, String methodName, String methodProto) {
		this.className = new ClassConstant(className);
		this.methodNameAndType = new NameAndTypeConstant(methodName, methodProto);
	}
	
	@Override
	public int index() {
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
		writer.writeU2(className.index());
		writer.writeU2(methodNameAndType.index());
	}

	public int getParamsCount() {
		return Utils.getParamsCount(methodNameAndType.getType().getValue());
	}
}
