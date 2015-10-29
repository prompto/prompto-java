package prompto.type;

import java.util.UUID;

public class UUIDType extends NativeType {

	static UUIDType instance = new UUIDType();
	
	public static UUIDType instance() {
		return instance;
	}
	
	private UUIDType() {
		super("UUID");
	}
	
	@Override
	public Class<?> toJavaClass() {
		return UUID.class;
	}
}