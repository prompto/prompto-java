package presto.python;

import presto.utils.CodeWriter;
import presto.utils.ObjectList;

public class PythonArgumentList extends ObjectList<PythonArgument> {
	
	private static final long serialVersionUID = 1L;

	public PythonArgumentList() {
	}

	public PythonArgumentList(PythonArgument arg) {
		this.add(arg);
	}

	public void toDialect(CodeWriter writer) {
		if(this.size()>0) {
			for(PythonArgument arg : this) {
				arg.toDialect(writer);
				writer.append(", ");
			}
			writer.trimLast(2);
		}
	}

}
