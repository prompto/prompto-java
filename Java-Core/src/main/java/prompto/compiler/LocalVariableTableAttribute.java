package prompto.compiler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LocalVariableTableAttribute implements IAttribute {

	Utf8Constant attributeName = new Utf8Constant("LocalVariableTable");
	private Map<String, StackLocal> entries = new HashMap<>();

	public Collection<StackLocal> getEntries() {
		return entries.values().stream()
				.sorted((a, b)->
					Short.compare(a.getIndex(), b.getIndex()))
				.collect(Collectors.toList());
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
		
	public void unregisterLocal(StackLocal local) {
		int index = local.getIndex();
		if(index!=entries.size()-1)
			throw new CompilerException("Can only unregister top local!");
		entries.remove(local.getName());
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
