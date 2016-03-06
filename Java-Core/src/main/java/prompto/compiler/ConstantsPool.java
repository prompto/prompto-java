package prompto.compiler;

import java.util.LinkedList;

@SuppressWarnings("serial")
class ConstantsPool extends LinkedList<ConstantOperand> {

	int registerConstant(ConstantOperand c) {
		// 1 based index
		int idx = 1 + indexOf(c);
		if(idx==0) {
			add(c);
			idx = size(); 
		}
		return idx;
	}

	public void write(ByteWriter writer) throws CompilerException {
		writer.writeU2(size() + 1);
		this.forEach((c) -> c.writeTo(writer));
	}

}
