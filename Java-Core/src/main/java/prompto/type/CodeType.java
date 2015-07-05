package prompto.type;



public class CodeType extends NativeType {

	static CodeType instance = new CodeType();
	
	public static CodeType instance() {
		return instance;
	}
	
	private CodeType() {
		super("Code");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return null;
	}
}
