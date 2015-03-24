package presto.grammar;


public enum CmpOp {
	GT(">"),
	GTE(">="),
	LT("<"),
	LTE("<=");

	String token;
	
	CmpOp(String token) {
		this.token = token;
	}
	
	public String toString() {
		return token;
	}
}
