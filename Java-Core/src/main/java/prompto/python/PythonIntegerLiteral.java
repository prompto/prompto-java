package prompto.python;

public class PythonIntegerLiteral extends PythonLiteral {

	Integer value;
	
	public PythonIntegerLiteral(String text) {
		super(text);
		this.value = Integer.valueOf(text);
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
