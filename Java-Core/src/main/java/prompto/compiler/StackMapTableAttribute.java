package prompto.compiler;

import java.util.ArrayList;
import java.util.List;

public class StackMapTableAttribute implements IAttribute {

	Utf8Constant attributeName = new Utf8Constant("StackMapTable");
	StackState state = new StackState();
	LocalVariableTableAttribute locals;
	List<StackLabel> labels = new ArrayList<>();
	short currentStackSize = 0;
	short maxStackSize = 0;
	short currentLocalsCount = 0;
	short maxLocalsCount = 0;
	
	public StackMapTableAttribute(LocalVariableTableAttribute locals) {
		this.locals = locals;
	}

	public short getMaxStack() {
		return maxStackSize;
	}

	public short getMaxLocals() {
		return maxLocalsCount;
	}

	public void addLabel(StackLabel label) {
		labels.add(label);
	}

	public void push(StackEntry ... entries) {
		for(StackEntry e : entries)
			push(e);
	}
	
	public StackEntry push(StackEntry item) {
		currentStackSize += item.getType().size();
		if(currentStackSize>maxStackSize)
			maxStackSize = currentStackSize;
		return state.pushEntry(item);
	};
	
	public StackEntry[] pop(short popped) {
		StackEntry[] result = new StackEntry[popped];
		while(popped-->0)
			result[popped] = popEntry();
		return result;
	}
	
	public StackEntry popEntry() {
		StackEntry entry = state.popEntry();
		currentStackSize -= entry.getType().size();
		return entry;
	}

	private int labelsLength() {
		return (int)labels.stream().mapToInt((l)->l.length()).summaryStatistics().getSum(); 
	}

	@Override
	public void register(ConstantsPool pool) {
		attributeName.register(pool);
		labels.forEach((l)->
			l.register(pool));
	}

	public StackLocal registerLocal(StackLocal local) {
		StackLocal other = locals.registerLocal(local);
		if(other.getIndex()>maxLocalsCount)
			maxLocalsCount = other.getIndex();
		state.pushLocal(local);
		return other;
	}

	public StackLocal getRegisteredLocal(String name) {
		return locals.getRegisteredLocal(name);
	}
	
	@Override
	public int lengthWithoutHeader() {
		/*
		StackMapTable_attribute {
		    u2              attribute_name_index;
		    u4              attribute_length;
		    u2              number_of_entries;
		    stack_map_frame entries[number_of_entries];
		}
		*/
		return 2 + labelsLength();
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
		writer.writeU2(attributeName.getIndexInConstantPool());
		writer.writeU4(lengthWithoutHeader());
		writer.writeU2((short)labels.size());
		labels.forEach((l)->
			l.writeTo(writer));
	}

}
