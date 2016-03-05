package prompto.compiler;

public interface Constant {

	void register(ConstantsPool pool);
	void writeTo(ByteWriter writer);
	int index();
}
