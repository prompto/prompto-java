package presto.type;

import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.value.Document;

public class DocumentType extends NativeType {
	
	static DocumentType instance = new DocumentType();
	
	public static DocumentType instance() {
		return instance;
	}
	
	private DocumentType() {
		super("Document");
	}

	@Override
	public Class<?> toJavaClass() {
		return Document.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DocumentType) || (other instanceof AnyType);
	}
	
	@Override
	public IType checkMember(Context context, String name) throws SyntaxError {
		return AnyType.instance();
	}
	

}
