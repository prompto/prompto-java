package presto.csharp;



public class CSharpIntegerLiteral extends CSharpLiteral {

	Integer value;
	
	public CSharpIntegerLiteral(String text) {
		super(text);
		this.value = Integer.valueOf(text);
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
