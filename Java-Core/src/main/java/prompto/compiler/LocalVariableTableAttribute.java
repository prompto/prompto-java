package prompto.compiler;

import java.util.HashMap;
import java.util.Map;

public class LocalVariableTableAttribute implements IAttribute {

	Utf8Constant attributeName = new Utf8Constant("LocalVariableTable");
	private Map<String, StackLocal> entries = new HashMap<>();

	public Map<String, StackLocal> getEntries() {
		return entries;
	}
	
	public StackLocal registerLocal(StackLocal local) {
		String name = local.getName();
		StackLocal current = entries.get(name);
		if(current!=null)
			return current;
		int idx = entries.size();
		local.setIndex((short)idx);
		entries.put(name, local);
		return local;
	}
		
	public StackLocal getRegisteredLocal(String name) {
		return entries.get(name);
	}
	
	@Override
	public void register(ConstantsPool pool) {
		throw new UnsupportedOperationException(); // TODO
	}
	
	@Override
	public int lengthWithoutHeader() {
		throw new UnsupportedOperationException(); // TODO
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		throw new UnsupportedOperationException(); // TODO
	}


}
