package prompto.type;

import java.lang.reflect.Type;



public class CodeType extends NativeType {

	static CodeType instance = new CodeType();
	
	public static CodeType instance() {
		return instance;
	}
	
	private CodeType() {
		super("Code");
	}
	
	@Override
	public Type getJavaType() {
		return null;
	}
}
