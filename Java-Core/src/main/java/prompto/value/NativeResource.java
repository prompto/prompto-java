package prompto.value;

import java.io.IOException;

import prompto.declaration.NativeResourceDeclaration;
import prompto.error.SyntaxError;

public class NativeResource extends NativeInstance implements IResource {

	public NativeResource(NativeResourceDeclaration declaration) throws SyntaxError {
		super(declaration);
	}
	
	@Override
	public boolean isReadable() {
		return ((IResource)instance).isReadable();
	}
	
	@Override
	public boolean isWritable() {
		return ((IResource)instance).isWritable();
	}
	
	@Override
	public String readFully() throws IOException {
		return ((IResource)instance).readFully();
	}
	
	@Override
	public void writeFully(String data) throws IOException {
		((IResource)instance).writeFully(data);
	}
	
	@Override
	public void close() {
		((IResource)instance).close();
	}

}
