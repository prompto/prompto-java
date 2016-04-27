package prompto.type;

import java.lang.reflect.Type;

import prompto.runtime.Context;
import prompto.value.Blob;

public class BlobType extends BinaryType { 

	static BlobType instance = new BlobType();
	
	public static BlobType instance() {
		return instance;
	}
	
	private BlobType() {
		super(Family.BLOB);
	}

	@Override
	public Type getJavaType(Context context) {
		return Blob.class;
	}
	
}
