package prompto.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("serial")
public class StackAttribute extends Stack<StackEntry.Type> implements Attribute {

	Utf8Constant attributeName = new Utf8Constant("StackMapTable");
	LocalsAttribute locals = new LocalsAttribute();
	List<StackLabel> labels = new ArrayList<>();
	short currentSize = 0;
	short maxSize = 0;
	
	public short getMaxStack() {
		return maxSize;
	}

	public void addLabel(StackLabel label) {
		labels.add(label);
	}

	public void push(StackEntry.Type ... entries) {
		for(StackEntry.Type e : entries)
			push(e);
	}
	
	@Override
	public StackEntry.Type push(StackEntry.Type item) {
		currentSize += item.size();
		if(currentSize>maxSize)
			maxSize = currentSize;
		return super.push(item);
	};
	
	public StackEntry.Type[] pop(short popped) {
		StackEntry.Type[] result = new StackEntry.Type[popped];
		while(popped-->0)
			result[popped] = pop();
		return result;
	}
	
	@Override
	public StackEntry.Type pop() {
		StackEntry.Type entry = super.pop();
		currentSize -= entry.size();
		return entry;
	}

	public int length() {
		return 2 + labelsLength();
	}

	private int labelsLength() {
		return (int)labels.stream().mapToInt((l)->l.length()).summaryStatistics().getSum(); 
	}

	@Override
	public void register(ConstantsPool pool) {
		attributeName.register(pool);
	}

	public short getMaxLocals() {
		return locals.getMaxLocals();
	}

	public StackLocal registerLocal(StackLocal local) {
		return locals.registerLocal(local);
	}

	public StackLocal getRegisteredLocal(String name) {
		return locals.getRegisteredLocal(name);
	}
	
	@Override
	public void writeTo(ByteWriter writer) {
		/*
		StackMapTable_attribute {
		    u2              attribute_name_index;
		    u4              attribute_length;
		    u2              number_of_entries;
		    stack_map_frame entries[number_of_entries];
		}
		*/
		writer.writeU2(attributeName.index());
		writer.writeU4(length());
		writer.writeU2((short)labels.size());
		labels.forEach((l)->
			l.writeTo(writer));
	}

}
