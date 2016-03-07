package prompto.compiler;

public interface ConstantOperand extends Operand {

	void register(ConstantsPool pool);
	void writeTo(ByteWriter writer);
	int index();
	default int size() {
		return 1;
	};
}
