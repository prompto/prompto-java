package prompto.compiler;

import java.util.LinkedList;

@SuppressWarnings("serial")
class ConstantsPool extends LinkedList<Constant> {

	int registerConstant(Constant c) {
		int idx = indexOf(c);
		if(idx==-1) {
			add(c);
			idx = size(); // 1 based
		}
		return idx;
	}

	public void write(ByteWriter writer) throws CompilerException {
		writer.writeU2(size() + 1);
		this.forEach((c) -> c.writeTo(writer));
	}

}
