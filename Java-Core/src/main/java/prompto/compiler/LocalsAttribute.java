package prompto.compiler;

import java.util.HashMap;
import java.util.Map;

public class LocalsAttribute implements Attribute {

	Utf8Constant attributeName = new Utf8Constant("LocalVariableTable");
	Map<String, StackLocal> locals = new HashMap<>();
	short maxSize = 0;

	public short getMaxLocals() {
		return maxSize;
	}
	
	public StackLocal registerLocal(StackLocal local) {
		String name = local.getName();
		StackLocal current = locals.get(name);
		if(current!=null)
			return current;
		int idx = locals.size();
		local.setIndex(idx);
		locals.put(name, local);
		if(locals.size()>maxSize)
			maxSize = (short)locals.size();
		return local;
	}
		
	public StackLocal getRegisteredLocal(String name) {
		return locals.get(name);
	}
	
	@Override
	public void register(ConstantsPool pool) {
		throw new UnsupportedOperationException(); // TODO
	}
	
	@Override
	public int length() {
		throw new UnsupportedOperationException(); // TODO
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		throw new UnsupportedOperationException(); // TODO
	}


}
