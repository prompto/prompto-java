package presto.grammar;

import presto.utils.CodeWriter;

public enum EqOp {
	IS,
	IS_NOT,
	IS_A,
	IS_NOT_A,
	EQUALS("=","==","=="),
	NOT_EQUALS("<>","!=","!="),
	ROUGHLY("~","~=","~=");

	String e,o,p;
	
	EqOp() {	
	}
	
	EqOp(String e, String o, String p) {
		this.e = e;
		this.o = o;
		this.p = p;
	}
	
	public void toDialect(CodeWriter writer) {
		String s = null;
		
		switch(writer.getDialect()) {
		case E:
			s = e;
			break;
		case O:
			s = o;
			break;
		case P:
			s = p;
			break;
		}
		if(s==null)
			s = this.name().toLowerCase().replace("_", " ");
		writer.append(s);
	}
}
