package prompto.type;

import prompto.runtime.Context;
import prompto.value.Blob;

public class BlobType extends BinaryType { 

	static BlobType instance = new BlobType();
	
	public static BlobType instance() {
		return instance;
	}
	
	private BlobType() {
		super("Blob");
	}

	@Override
	public Class<?> toJavaClass() {
		return Blob.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof BlobType);
	}
	

}
