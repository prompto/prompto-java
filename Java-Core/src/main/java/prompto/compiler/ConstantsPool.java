package prompto.compiler;

import java.util.LinkedList;

@SuppressWarnings("serial")
class ConstantsPool extends LinkedList<ConstantOperand> {

	int nextIndex = 1; // 1 based index
	
	int registerConstant(ConstantOperand c) {
		int idx = indexOf(c);
		if(idx>=0)
			return get(idx).index();
		else {
			add(c);
			idx = nextIndex; 
			nextIndex += c.size();
			return idx;
		}
	}

	public void write(ByteWriter writer) throws CompilerException {
		writer.writeU2(nextIndex);
		this.forEach((c) -> 
			c.writeTo(writer));
	}

}
