package prompto.compiler;

interface Constant {

	void register(ConstantsPool pool);
	void writeTo(ByteWriter writer);
	int index();
}
