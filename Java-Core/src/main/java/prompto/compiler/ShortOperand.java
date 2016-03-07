package prompto.compiler;

public class ShortOperand implements InlineOperand {

	short value;
	
	public ShortOperand(short value) {
		this.value = value;
	}

	public short value() {
		return value;
	}
}
