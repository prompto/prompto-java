package prompto.value;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Consumer;

import prompto.declaration.NativeResourceDeclaration;
import prompto.intrinsic.IResource;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;

public class NativeResource extends NativeInstance<IResource> implements IResource {

	public NativeResource(Context context, NativeResourceDeclaration declaration) {
		super(context, declaration);
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
	public PromptoBinary readBlob() throws IOException {
		return ((IResource)instance).readBlob();
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
	public void writeFully(String data, Consumer<String> thenWith) throws IOException {
		((IResource)instance).writeFully(data, thenWith);
	}

	@Override
	public String readLine() throws IOException {
		return ((IResource)instance).readLine();
	}
	
	@Override
	public void writeLine(String data) throws IOException {
		((IResource)instance).writeLine(data);
	}
	
	@Override
	public void close() {
		((IResource)instance).close();
	}

	@Override
	public Reader asReader() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readFully(Consumer<String> thenWith) throws IOException {
		// TODO Auto-generated method stub
		
	}


}
