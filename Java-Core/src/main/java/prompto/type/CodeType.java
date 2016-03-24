package prompto.type;

import java.lang.reflect.Type;



public class CodeType extends NativeType {

	static CodeType instance = new CodeType();
	
	public static CodeType instance() {
		return instance;
	}
	
	private CodeType() {
		super(Family.CODE);
	}
	
	@Override
	public Type getJavaType() {
		return null;
	}
}
