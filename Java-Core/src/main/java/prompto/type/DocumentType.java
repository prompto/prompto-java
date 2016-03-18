package prompto.type;

import java.lang.reflect.Type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.Document;

public class DocumentType extends NativeType {
	
	static DocumentType instance = new DocumentType();
	
	public static DocumentType instance() {
		return instance;
	}
	
	private DocumentType() {
		super("Document");
	}

	@Override
	public Type toJavaType() {
		return Document.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DocumentType) || (other instanceof AnyType);
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) throws SyntaxError {
		return AnyType.instance();
	}
	

}
