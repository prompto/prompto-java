package presto.javascript;

public class JavaScriptIntegerLiteral extends JavaScriptLiteral {

	Integer value;
	
	public JavaScriptIntegerLiteral(String text) {
		super(text);
		this.value = Integer.valueOf(text);
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
