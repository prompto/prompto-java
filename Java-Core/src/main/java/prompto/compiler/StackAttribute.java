package prompto.compiler;

import java.util.Stack;

@SuppressWarnings("serial")
public class StackAttribute extends Stack<StackEntry> implements Attribute {

	short currentSize = 0;
	short maxSize = 0;
	
	public short getMaxStack() {
		return maxSize;
	}

	public void push(StackEntry ... entries) {
		for(StackEntry e : entries)
			push(e);
	}
	
	@Override
	public StackEntry push(StackEntry item) {
		currentSize += item.size();
		if(currentSize>maxSize)
			maxSize = currentSize;
		return super.push(item);
	};
	
	public StackEntry[] pop(short popped) {
		StackEntry[] result = new StackEntry[popped];
		while(popped-->0)
			result[popped] = pop();
		return result;
	}
	
	@Override
	public StackEntry pop() {
		StackEntry entry = super.pop();
		currentSize -= entry.size();
		return entry;
	}

	@Override
	public void register(ConstantsPool pool) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeTo(ByteWriter writer) {
		// TODO Auto-generated method stub

	}


}
